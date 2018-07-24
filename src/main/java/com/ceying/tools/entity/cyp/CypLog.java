package com.ceying.tools.entity.cyp;

import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Table(name = "TSYS_LOG")
public class CypLog implements Serializable {
    private String logId;

    private String orgId;

    private String orgName;

    private String userId;

    private String userName;

    private Integer accessDate;

    private Integer accessTime;

    private String subTransCode;

    private String transCode;

    private String operContents;

    private String ipAdd;

    private String hostName;

    private Integer tenantId;

    private static final long serialVersionUID = 1L;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId == null ? null : logId.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getSubTransCode() {
        return subTransCode;
    }

    public void setSubTransCode(String subTransCode) {
        this.subTransCode = subTransCode == null ? null : subTransCode.trim();
    }

    public String getTransCode() {
        return transCode;
    }

    public void setTransCode(String transCode) {
        this.transCode = transCode == null ? null : transCode.trim();
    }

    public String getOperContents() {
        return operContents;
    }

    public void setOperContents(String operContents) {
        this.operContents = operContents == null ? null : operContents.trim();
    }

    public String getIpAdd() {
        return ipAdd;
    }

    public void setIpAdd(String ipAdd) {
        this.ipAdd = ipAdd == null ? null : ipAdd.trim();
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName == null ? null : hostName.trim();
    }

    public Integer getAccessDate() {
        return accessDate;
    }

    public void setAccessDate(Integer accessDate) {
        this.accessDate = accessDate;
    }

    public Integer getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(Integer accessTime) {
        this.accessTime = accessTime;
    }

    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logId=").append(logId);
        sb.append(", orgId=").append(orgId);
        sb.append(", orgName=").append(orgName);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", accessDate=").append(accessDate);
        sb.append(", accessTime=").append(accessTime);
        sb.append(", subTransCode=").append(subTransCode);
        sb.append(", transCode=").append(transCode);
        sb.append(", operContents=").append(operContents);
        sb.append(", ipAdd=").append(ipAdd);
        sb.append(", hostName=").append(hostName);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}