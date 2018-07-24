package com.ceying.tools.entity.cyp;

import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Table(name = "TSYS_ROLE_USER")
public class CypRoleUser implements Serializable {
    private String userCode;

    private String roleCode;

    private String rightFlag;

    private Integer tenantId;

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
        sb.append(", userCode=").append(userCode);
        sb.append(", roleCode=").append(roleCode);
        sb.append(", rightFlag=").append(rightFlag);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}