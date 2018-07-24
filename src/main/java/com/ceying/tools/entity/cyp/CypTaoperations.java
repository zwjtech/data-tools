package com.ceying.tools.entity.cyp;

import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "T_TAOPERATIONS")
public class CypTaoperations implements Serializable {
    private String urid;

    private String tripartiteagreementid;

    private String operator;

    private String operateorgid;

    private Date operatedate;

    private String operateflag;

    private String signature;

    private String createdby;

    private Date createdon;

    private String lastmodifiedby;

    private Date lastmodifiedon;

    private Integer rowversion;

    private String description;

    private String relateoperateid;

    private String blockchainaddress;

    private static final long serialVersionUID = 1L;

    public String getUrid() {
        return urid;
    }

    public void setUrid(String urid) {
        this.urid = urid == null ? null : urid.trim();
    }

    public String getTripartiteagreementid() {
        return tripartiteagreementid;
    }

    public void setTripartiteagreementid(String tripartiteagreementid) {
        this.tripartiteagreementid = tripartiteagreementid == null ? null : tripartiteagreementid.trim();
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

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby == null ? null : createdby.trim();
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    public String getLastmodifiedby() {
        return lastmodifiedby;
    }

    public void setLastmodifiedby(String lastmodifiedby) {
        this.lastmodifiedby = lastmodifiedby == null ? null : lastmodifiedby.trim();
    }

    public Date getLastmodifiedon() {
        return lastmodifiedon;
    }

    public void setLastmodifiedon(Date lastmodifiedon) {
        this.lastmodifiedon = lastmodifiedon;
    }

    public Integer getRowversion() {
        return rowversion;
    }

    public void setRowversion(Integer rowversion) {
        this.rowversion = rowversion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getRelateoperateid() {
        return relateoperateid;
    }

    public void setRelateoperateid(String relateoperateid) {
        this.relateoperateid = relateoperateid == null ? null : relateoperateid.trim();
    }

    public String getBlockchainaddress() {
        return blockchainaddress;
    }

    public void setBlockchainaddress(String blockchainaddress) {
        this.blockchainaddress = blockchainaddress == null ? null : blockchainaddress.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", urid=").append(urid);
        sb.append(", tripartiteagreementid=").append(tripartiteagreementid);
        sb.append(", operator=").append(operator);
        sb.append(", operateorgid=").append(operateorgid);
        sb.append(", operatedate=").append(operatedate);
        sb.append(", operateflag=").append(operateflag);
        sb.append(", signature=").append(signature);
        sb.append(", createdby=").append(createdby);
        sb.append(", createdon=").append(createdon);
        sb.append(", lastmodifiedby=").append(lastmodifiedby);
        sb.append(", lastmodifiedon=").append(lastmodifiedon);
        sb.append(", rowversion=").append(rowversion);
        sb.append(", description=").append(description);
        sb.append(", relateoperateid=").append(relateoperateid);
        sb.append(", blockchainaddress=").append(blockchainaddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}