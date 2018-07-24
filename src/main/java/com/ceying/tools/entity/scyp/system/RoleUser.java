package com.ceying.tools.entity.scyp.system;

import java.io.Serializable;

public class RoleUser implements Serializable {
    private String userCode;

    private String roleCode;

    private String rightFlag;

    private String tenantId;

    private static final long serialVersionUID = 1L;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    public String getRightFlag() {
        return rightFlag;
    }

    public void setRightFlag(String rightFlag) {
        this.rightFlag = rightFlag == null ? null : rightFlag.trim();
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userCode=").append(userCode);
        sb.append(", roleCode=").append(roleCode);
        sb.append(", rightFlag=").append(rightFlag);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}