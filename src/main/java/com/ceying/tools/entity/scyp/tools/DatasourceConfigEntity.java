package com.ceying.tools.entity.scyp.tools;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 功能说明: 数据源配置实体类<br>
 * 系统版本: 1.0 <br>
 * 开发人员: yangxh
 * 开发时间: 2018/6/13<br>
 * <br>
 */
@Table(name = "t_tools_datasourceconfig")
public class DatasourceConfigEntity implements Serializable{

    @Id
    private  String urid;  //主键

    private String name;  //数据源名称

    private String address;  //数据源地址

    private String account;  //账户

    private String password;  //密码

    private String description;  //描述

    private String driver;

    public String getUrid() {
        return urid;
    }

    public void setUrid(String urid) {
        this.urid = urid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
}
