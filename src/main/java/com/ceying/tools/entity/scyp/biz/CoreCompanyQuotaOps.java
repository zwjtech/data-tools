package com.ceying.tools.entity.scyp.biz;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CoreCompanyQuotaOps implements Serializable {
    private String urid;

    private String corequotaid;

    private BigDecimal operateamount;

    private String operator;

    private String operateorgid;

    private Date operatedate;

    private String operateflag;

    private String signature;

    private String description;

    private static final long serialVersionUID = 1L;

    public String getUrid() {
        return urid;
    }

    public void setUrid(String urid) {
        this.urid = urid == null ? null : urid.trim();
    }

    public String getCorequotaid() {
        return corequotaid;
    }

    public void setCorequotaid(String corequotaid) {
        this.corequotaid = corequotaid == null ? null : corequotaid.trim();
    }

    public BigDecimal getOperateamount() {
        return operateamount;
    }

    public void setOperateamount(BigDecimal operateamount) {
        this.operateamount = operateamount;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getOperateorgid() {
        return operateorgid;
    }

    public void setOperateorgid(String operateorgid) {
        this.operateorgid = operateorgid == null ? null : operateorgid.trim();
    }

    public Date getOperatedate() {
        return operatedate;
    }

    public void setOperatedate(Date operatedate) {
        this.operatedate = operatedate;
    }

    public String getOperateflag() {
        return operateflag;
    }

    public void setOperateflag(String operateflag) {
        this.operateflag = operateflag == null ? null : operateflag.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", urid=").append(urid);
        sb.append(", corequotaid=").append(corequotaid);
        sb.append(", operateamount=").append(operateamount);
        sb.append(", operator=").append(operator);
        sb.append(", operateorgid=").append(operateorgid);
        sb.append(", operatedate=").append(operatedate);
        sb.append(", operateflag=").append(operateflag);
        sb.append(", signature=").append(signature);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}