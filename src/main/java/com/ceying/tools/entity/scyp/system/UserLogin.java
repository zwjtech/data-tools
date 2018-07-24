package com.ceying.tools.entity.scyp.system;

import java.io.Serializable;
import java.util.Date;

public class UserLogin implements Serializable {
    private String userId;

    private Date lastLoginDate;

    private String lastLoginIp;

    private Integer loginFailTimes;

    private Date lastFailDate;

    private String extField;

    private String tenantId;

    private String orgId;

    private String userName;

    private String tenantCnshortname;

    private String tenantShortname;

    private String mobile;

    private String cCredentials;

    private static final long serialVersionUID = 1L;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    public Integer getLoginFailTimes() {
        return loginFailTimes;
    }

    public void setLoginFailTimes(Integer loginFailTimes) {
        this.loginFailTimes = loginFailTimes;
    }

    public Date getLastFailDate() {
        return lastFailDate;
    }

    public void setLastFailDate(Date lastFailDate) {
        this.lastFailDate = lastFailDate;
    }

    public String getExtField() {
        return extField;
    }

    public void setExtField(String extField) {
        this.extField = extField == null ? null : extField.trim();
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getTenantCnshortname() {
        return tenantCnshortname;
    }

    public void setTenantCnshortname(String tenantCnshortname) {
        this.tenantCnshortname = tenantCnshortname == null ? null : tenantCnshortname.trim();
    }

    public String getTenantShortname() {
        return tenantShortname;
    }

    public void setTenantShortname(String tenantShortname) {
        this.tenantShortname = tenantShortname == null ? null : tenantShortname.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getcCredentials() {
        return cCredentials;
    }

    public void setcCredentials(String cCredentials) {
        this.cCredentials = cCredentials == null ? null : cCredentials.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", lastLoginDate=").append(lastLoginDate);
        sb.append(", lastLoginIp=").append(lastLoginIp);
        sb.append(", loginFailTimes=").append(loginFailTimes);
        sb.append(", lastFailDate=").append(lastFailDate);
        sb.append(", extField=").append(extField);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", orgId=").append(orgId);
        sb.append(", userName=").append(userName);
        sb.append(", tenantCnshortname=").append(tenantCnshortname);
        sb.append(", tenantShortname=").append(tenantShortname);
        sb.append(", mobile=").append(mobile);
        sb.append(", cCredentials=").append(cCredentials);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}