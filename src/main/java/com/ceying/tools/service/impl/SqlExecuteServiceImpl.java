package com.ceying.tools.service.impl;

import com.ceying.tools.entity.scyp.tools.DatasourceConfigEntity;
import com.ceying.tools.service.DatasourceConfigService;
import com.ceying.tools.service.SqlExecuteService;
import com.ceying.tools.util.websocket.WebSocketService;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author : Meow
 * @date : 2018-7-5
 * @description : TODO
 */
@Service
public class SqlExecuteServiceImpl implements SqlExecuteService {

    @Autowired
    private WebSocketService webSocketService;

    @Autowired
    private DatasourceConfigService datasourceConfigService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void executeSql(List<Map<String, String>> list) {
        Connection conn = null;
        for (Map<String, String> map : list) {
            String database = map.get("database");
            String filePath = map.get("filePath");
            File file = new File(filePath);
            if (file.exists() && file.isFile()) {
                DatasourceConfigEntity entity = new DatasourceConfigEntity();
                entity.setName(database);
                List<DatasourceConfigEntity> datasourceConfigList = datasourceConfigService.getDatasourceConfig(entity);
                for (DatasourceConfigEntity datasourceConfig : datasourceConfigList) {
                    try {
                        boolean isProcedure = false;
                        boolean isComments = false;
                        boolean isSql = true;
                        DataSource dataSource = getDataSource(datasourceConfig);
                        conn = dataSource.getConnection();
                        Statement statement = conn.createStatement();
                        //构造一个BufferedReader类来读取文件
                        BufferedReader br = new BufferedReader(new FileReader(file));
                        String s;
                        //使用readLine方法，一次读一行
                        StringBuilder comments = new StringBuilder();
                        StringBuilder procedure = new StringBuilder();
                        StringBuilder sql = new StringBuilder();
                        while ((s = br.readLine()) != null) {
                            if (StringUtils.isNotBlank(s)) {
                                String line = System.lineSeparator() + s;
                                if (s.startsWith("--")) {
                                    continue;
                                }
                                if (s.startsWith("#CommentsStart")) {
                                    isComments = true;
                                    continue;
                                }
                                if (isComments) {
                                    if (s.startsWith("#CommentsEnd")) {
                                        webSocketService.sendComments(comments.toString());
                                        isComments = false;
                                        comments.delete(0, comments.length());
                                    } else {
                                        comments.append(line);
                                    }
                                    continue;
                                }

                                if (s.startsWith("#ProcedureStart")) {
                                    isProcedure = true;
                                    continue;
                                }
                                if (isProcedure) {
                                    if (s.startsWith("#ProcedureEnd")) {
                                        webSocketService.sendSuccess(procedure.toString());
                                        webSocketService.sendSuccess("受影响的行："+String.valueOf(statement.executeUpdate(procedure.toString())));
                                        procedure.delete(0, procedure.length());
                                        isProcedure = false;
                                    } else {
                                        procedure.append(line);
                                    }
                                    continue;
                                }

                                if (s.endsWith(";")) {
                                    if (!isSql) {
                                        sql.append(line);
                                        webSocketService.sendSuccess(sql.toString());
                                        webSocketService.sendSuccess("受影响的行："+String.valueOf(statement.executeUpdate(sql.toString())));
                                        isSql = true;
                                        sql.delete(0, sql.length());
                                        continue;
                                    }
                                    webSocketService.sendSuccess(line);
                                    webSocketService.sendSuccess("受影响的行："+String.valueOf(statement.executeUpdate(line)));
                                } else {
                                    sql.append(System.lineSeparator() + s);
                                    isSql = false;
                                }
                            }
                        }
                        br.close();
                        statement.close();
                        conn.close();
                        file.delete();
                    } catch (SQLException | IOException e) {
                        e.printStackTrace();
                        webSocketService.sendError("脚本执行失败，失败原因：" + e.getMessage());
                    } finally {
                        file.delete();
                        close(conn);
                    }
                }
            }

        }
    }

    private Properties build(DatasourceConfigEntity datasourceConfig) {

        Properties prop = new Properties();
        prop.put("url", datasourceConfig.getAddress());
        prop.put("username", datasourceConfig.getAccount());
        prop.put("password", datasourceConfig.getPassword());
        prop.put("driverClassName", datasourceConfig.getDriver());
        return prop;
    }

    public DataSource getDataSource(DatasourceConfigEntity datasourceConfig) {
        AtomikosDataSourceBean ds = new AtomikosDataSourceBean();
        Properties prop = build(datasourceConfig);
        ds.setXaDataSourceClassName("com.alibaba.druid.pool.xa.DruidXADataSource");
        ds.setUniqueResourceName(datasourceConfig.getName() + "DataSource");
        ds.setPoolSize(5);
        ds.setXaProperties(prop);
        return ds;
    }

    private static void close(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            if (conn != null) {
                conn = null;
            }
        }
    }
}
