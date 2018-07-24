package com.ceying.tools.controller;

import com.ceying.tools.dao.scyp.tools.ExportTableStructureDao;
import com.ceying.tools.entity.scyp.tools.ColumnInformation;
import com.ceying.tools.entity.scyp.tools.TableInformation;
import com.ceying.tools.util.excel.ExcelData;
import com.ceying.tools.util.excel.ExportToExcelUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/export/tableStructure")
/**
 * @description 导出表结构
 *
 * @author Meow
 * @date 2018-6-7
 */
public class ExportTableStructureController {

    /**
     * 日志对象
     */
    private Logger LOGGER = LoggerFactory.getLogger(getClass());

    @Autowired
    private ExportTableStructureDao exportTableStructureDao;

    /**
     * @param [request, response]
     * @return void
     * @description 导出excel
     * @author Meow
     * @date 2018-6-7
     */
    @RequestMapping(value = "/excel", method = RequestMethod.GET)
    @Transactional(readOnly = true, rollbackFor = Exception.class)
    public void exportTableStructure(HttpServletRequest request, HttpServletResponse response, String tableSchema) throws Exception {
        String sql = "select table_name,table_comment from information_schema.tables where table_schema= '" + tableSchema + "' and table_type='base table'";
        List<TableInformation> informationList = exportTableStructureDao.listTableInformation(sql);

        ExcelData data = new ExcelData();
        data.setName(tableSchema + "表结构");
        List<String> titles = new ArrayList();
        titles.add("表名");
        titles.add("字段名");
        titles.add("字段类型");
        titles.add("默认值");
        titles.add("能否为空");
        titles.add("描述");
        titles.add("主键");
        data.setTitles(titles);
        List<List<Object>> rows = new ArrayList();

        List<Object> nullObject = new ArrayList<>();

        for (TableInformation tableInformation : informationList) {
            String tableName = tableInformation.getTableName();
            String tableComment = tableInformation.getTableComment();
            String sql2 = "select table_name,column_name,column_type,column_default,is_nullable,column_comment,column_key from information_schema.columns where table_schema = '" + tableSchema + "' and table_name = '" + tableName + "'";
            List<ColumnInformation> columnInformationList = exportTableStructureDao.listColumnInformation(sql2);
            for (int i = 0; i < columnInformationList.size(); i++) {
                ColumnInformation columnInformation = columnInformationList.get(i);
                List<Object> row = new ArrayList<>();
                if (i == 0) {
                    row.add(tableComment + ":" + columnInformation.getTableName());
                } else {
                    row.add("");
                }
                row.add(columnInformation.getColumnName());
                row.add(columnInformation.getColumnType());
                row.add(columnInformation.getColumnDefault());
                row.add(columnInformation.getIsNullable());
                row.add(columnInformation.getColumnComment());
                row.add(columnInformation.getColumnKey());
                rows.add(row);
            }
            rows.add(nullObject);
            rows.add(nullObject);
            rows.add(nullObject);
            rows.add(nullObject);
            rows.add(nullObject);
        }
        data.setRows(rows);
        String fileName = "数据库表结构(" + tableSchema + ").xlsx";
        ExportToExcelUtil.exportExcel(response, fileName, data, request);

    }

}
