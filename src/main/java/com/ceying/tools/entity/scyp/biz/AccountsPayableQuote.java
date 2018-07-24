package com.ceying.tools.entity.scyp.biz;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AccountsPayableQuote implements Serializable {
    private String urid;

    private String tenantid;

    private String tatemplateid;

    private String accountspayableid;

    private String bankid;

    private String supplieraccountid;

    private BigDecimal financingamount;

    private Date financingdate;

    private String isrecourse;

    private BigDecimal recourseinterestrate;

    private BigDecimal nonrecourseinterestrate;

    private BigDecimal recoursediscount;

    private BigDecimal nonrecoursediscount;

    private String isactive;

    private String createdby;

    private Date createdon;

    private String lastmodifiedby;

    private Date lastmodifiedon;

    private Integer rowversion;

    private String description;

    private Date estimatereturndate;

    private String isfirstquote;

    private String lastoperationflag;

    private BigDecimal financingcost;

    private byte[] signaturecontent;

    private static final long serialVersionUID = 1L;

    public String getUrid() {
        return urid;
    }

    public void setUrid(String urid) {
        this.urid = urid == null ? null : urid.trim();
    }

    public String getTenantid() {
        return tenantid;
    }

    public void setTenantid(String tenantid) {
        this.tenantid = tenantid == null ? null : tenantid.trim();
    }

    public String getTatemplateid() {
        return tatemplateid;
    }

    public void setTatemplateid(String tatemplateid) {
        this.tatemplateid = tatemplateid == null ? null : tatemplateid.trim();
    }

    public String getAccountspayableid() {
        return accountspayableid;
    }

    public void setAccountspayableid(String accountspayableid) {
        this.accountspayableid = accountspayableid == null ? null : accountspayableid.trim();
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid == null ? null : bankid.trim();
    }

    public String getSupplieraccountid() {
        return supplieraccountid;
    }

    public void setSupplieraccountid(String supplieraccountid) {
        this.supplieraccountid = supplieraccountid == null ? null : supplieraccountid.trim();
    }

    public BigDecimal getFinancingamount() {
        return financingamount;
    }

    public void setFinancingamount(BigDecimal financingamount) {
        this.financingamount = financingamount;
    }

    public Date getFinancingdate() {
        return financingdate;
    }

    public void setFinancingdate(Date financingdate) {
        this.financingdate = financingdate;
    }

    public String getIsrecourse() {
        return isrecourse;
    }

    public void setIsrecourse(String isrecourse) {
        this.isrecourse = isrecourse == null ? null : isrecourse.trim();
    }

    public BigDecimal getRecourseinterestrate() {
        return recourseinterestrate;
    }

    public void setRecourseinterestrate(BigDecimal recourseinterestrate) {
        this.recourseinterestrate = recourseinterestrate;
    }

    public BigDecimal getNonrecourseinterestrate() {
        return nonrecourseinterestrate;
    }

    public void setNonrecourseinterestrate(BigDecimal nonrecourseinterestrate) {
        this.nonrecourseinterestrate = nonrecourseinterestrate;
    }

    public BigDecimal getRecoursediscount() {
        return recoursediscount;
    }

    public void setRecoursediscount(BigDecimal recoursediscount) {
        this.recoursediscount = recoursediscount;
    }

    public BigDecimal getNonrecoursediscount() {
        return nonrecoursediscount;
    }

    public void setNonrecoursediscount(BigDecimal nonrecoursediscount) {
        this.nonrecoursediscount = nonrecoursediscount;
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive == null ? null : isactive.trim();
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

    public Date getEstimatereturndate() {
        return estimatereturndate;
    }

    public void setEstimatereturndate(Date estimatereturndate) {
        this.estimatereturndate = estimatereturndate;
    }

    public String getIsfirstquote() {
        return isfirstquote;
    }

    public void setIsfirstquote(String isfirstquote) {
        this.isfirstquote = isfirstquote == null ? null : isfirstquote.trim();
    }

    public String getLastoperationflag() {
        return lastoperationflag;
    }

    public void setLastoperationflag(String lastoperationflag) {
        this.lastoperationflag = lastoperationflag == null ? null : lastoperationflag.trim();
    }

    public BigDecimal getFinancingcost() {
        return financingcost;
    }

    public void setFinancingcost(BigDecimal financingcost) {
        this.financingcost = financingcost;
    }

    public byte[] getSignaturecontent() {
        return signaturecontent;
    }

    public void setSignaturecontent(byte[] signaturecontent) {
        this.signaturecontent = signaturecontent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", urid=").append(urid);
        sb.append(", tenantid=").append(tenantid);
        sb.append(", tatemplateid=").append(tatemplateid);
        sb.append(", accountspayableid=").append(accountspayableid);
        sb.append(", bankid=").append(bankid);
        sb.append(", supplieraccountid=").append(supplieraccountid);
        sb.append(", financingamount=").append(financingamount);
        sb.append(", financingdate=").append(financingdate);
        sb.append(", isrecourse=").append(isrecourse);
        sb.append(", recourseinterestrate=").append(recourseinterestrate);
        sb.append(", nonrecourseinterestrate=").append(nonrecourseinterestrate);
        sb.append(", recoursediscount=").append(recoursediscount);
        sb.append(", nonrecoursediscount=").append(nonrecoursediscount);
        sb.append(", isactive=").append(isactive);
        sb.append(", createdby=").append(createdby);
        sb.append(", createdon=").append(createdon);
        sb.append(", lastmodifiedby=").append(lastmodifiedby);
        sb.append(", lastmodifiedon=").append(lastmodifiedon);
        sb.append(", rowversion=").append(rowversion);
        sb.append(", description=").append(description);
        sb.append(", estimatereturndate=").append(estimatereturndate);
        sb.append(", isfirstquote=").append(isfirstquote);
        sb.append(", lastoperationflag=").append(lastoperationflag);
        sb.append(", financingcost=").append(financingcost);
        sb.append(", signaturecontent=").append(signaturecontent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}