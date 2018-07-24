package com.ceying.tools.entity.scyp.tools;

import javax.persistence.Entity;

/**
 * @author : Meow
 * @date : 2018-6-7
 * @description : 表信息实体
 */
public class TableInformation {
    private String tableName;
    private String tableComment;
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableComment() {
        return tableComment;
    }

    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }
}
