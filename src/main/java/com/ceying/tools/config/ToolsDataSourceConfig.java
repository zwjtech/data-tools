package com.ceying.tools.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;

@Configuration
// 扫描 Mapper 接口并容器管理
@MapperScan(basePackages = ToolsDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "toolsSqlSessionFactory")
public class ToolsDataSourceConfig {

    // 精确到 cluster 目录，以便跟其他数据源隔离
    static final String PACKAGE = "com.ceying.tools.dao.scyp.tools";
    static final String MAPPER_LOCATION = "classpath:mapper/scyp/tools/*.xml";

    @Value("${spring.datasource.tools.url}")
    private String url;

    @Value("${spring.datasource.tools.username}")
    private String user;

    @Value("${spring.datasource.tools.password}")
    private String password;

    @Value("${spring.datasource.tools.driverClassName}")
    private String driverClass;

    @Bean(name = "toolsDataSource")
    public DataSource toolsDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean(name = "toolsTransactionManager")
    public DataSourceTransactionManager toolsTransactionManager() {
        return new DataSourceTransactionManager(toolsDataSource());
    }

    @Bean(name = "toolsSqlSessionFactory")
    public SqlSessionFactory toolsSqlSessionFactory(@Qualifier("toolsDataSource") DataSource toolsDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(toolsDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(ToolsDataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}