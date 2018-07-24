package com.ceying.tools.entity.cyp;

import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "T_TRIPARTITEAGREEMENT")
public class CypTripartiteAgreement implements Serializable {
    private String urid;

    private Integer tenantid;

    private String tatemplateid;

    private String accountspayableid;

    private String tacontractid;

    private String bankid;

    private String corecompanyid;

    private String supplierid;

    private String supplieraccountid;

    private BigDecimal financingamount;

    private Date financingdate;

    private String isrecourse;

    private BigDecimal interestrate;

    private Date lendingdate;

    private Date returndate;

    private BigDecimal supplierrate;

    private BigDecimal corecompanyrate;

    private String isactive;

    private String createdby;

    private Date createdon;

    private String lastmodifiedby;

    private Date lastmodifiedon;

    private Integer rowversion;

    private String description;

    private String supplastoperateflag;

    private String corelastoperateflag;

    private String banklastoperateflag;

    private String approvestate;

    private Date estimatereturndate;

    private String accountspayablequoteid;

    private String lendingafterflag;

    private String aftersignflag;

    private byte[] signaturecontent;

    private static final long serialVersionUID = 1L;

    public String getUrid() {
        return urid;
    }

    public void setUrid(String urid) {
        this.urid = urid == null ? null : urid.trim();
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

    public String getTacontractid() {
        return tacontractid;
    }

    public void setTacontractid(String tacontractid) {
        this.tacontractid = tacontractid == null ? null : tacontractid.trim();
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid == null ? null : bankid.trim();
    }

    public String getCorecompanyid() {
        return corecompanyid;
    }

    public void setCorecompanyid(String corecompanyid) {
        this.corecompanyid = corecompanyid == null ? null : corecompanyid.trim();
    }

    public String getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid == null ? null : supplierid.trim();
    }

    public String getSupplieraccountid() {
        return supplieraccountid;
    }

    public void setSupplieraccountid(String supplieraccountid) {
        this.supplieraccountid = supplieraccountid == null ? null : supplieraccountid.trim();
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

    public Date getLendingdate() {
        return lendingdate;
    }

    public void setLendingdate(Date lendingdate) {
        this.lendingdate = lendingdate;
    }

    public Date getReturndate() {
        return returndate;
    }

    public void setReturndate(Date returndate) {
        this.returndate = returndate;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getSupplastoperateflag() {
        return supplastoperateflag;
    }

    public void setSupplastoperateflag(String supplastoperateflag) {
        this.supplastoperateflag = supplastoperateflag == null ? null : supplastoperateflag.trim();
    }

    public String getCorelastoperateflag() {
        return corelastoperateflag;
    }

    public void setCorelastoperateflag(String corelastoperateflag) {
        this.corelastoperateflag = corelastoperateflag == null ? null : corelastoperateflag.trim();
    }

    public String getBanklastoperateflag() {
        return banklastoperateflag;
    }

    public void setBanklastoperateflag(String banklastoperateflag) {
        this.banklastoperateflag = banklastoperateflag == null ? null : banklastoperateflag.trim();
    }

    public String getApprovestate() {
        return approvestate;
    }

    public void setApprovestate(String approvestate) {
        this.approvestate = approvestate == null ? null : approvestate.trim();
    }

    public Date getEstimatereturndate() {
        return estimatereturndate;
    }

    public void setEstimatereturndate(Date estimatereturndate) {
        this.estimatereturndate = estimatereturndate;
    }

    public String getAccountspayablequoteid() {
        return accountspayablequoteid;
    }

    public void setAccountspayablequoteid(String accountspayablequoteid) {
        this.accountspayablequoteid = accountspayablequoteid == null ? null : accountspayablequoteid.trim();
    }

    public String getLendingafterflag() {
        return lendingafterflag;
    }

    public void setLendingafterflag(String lendingafterflag) {
        this.lendingafterflag = lendingafterflag == null ? null : lendingafterflag.trim();
    }

    public String getAftersignflag() {
        return aftersignflag;
    }

    public void setAftersignflag(String aftersignflag) {
        this.aftersignflag = aftersignflag == null ? null : aftersignflag.trim();
    }

    public byte[] getSignaturecontent() {
        return signaturecontent;
    }

    public void setSignaturecontent(byte[] signaturecontent) {
        this.signaturecontent = signaturecontent;
    }

    public Integer getTenantid() {
        return tenantid;
    }

    public void setTenantid(Integer tenantid) {
        this.tenantid = tenantid;
    }

    public BigDecimal getFinancingamount() {
        return financingamount;
    }

    public void setFinancingamount(BigDecimal financingamount) {
        this.financingamount = financingamount;
    }

    public BigDecimal getInterestrate() {
        return interestrate;
    }

    public void setInterestrate(BigDecimal interestrate) {
        this.interestrate = interestrate;
    }

    public BigDecimal getSupplierrate() {
        return supplierrate;
    }

    public void setSupplierrate(BigDecimal supplierrate) {
        this.supplierrate = supplierrate;
    }

    public BigDecimal getCorecompanyrate() {
        return corecompanyrate;
    }

    public void setCorecompanyrate(BigDecimal corecompanyrate) {
        this.corecompanyrate = corecompanyrate;
    }

    public Integer getRowversion() {
        return rowversion;
    }

    public void setRowversion(Integer rowversion) {
        this.rowversion = rowversion;
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
        sb.append(", tacontractid=").append(tacontractid);
        sb.append(", bankid=").append(bankid);
        sb.append(", corecompanyid=").append(corecompanyid);
        sb.append(", supplierid=").append(supplierid);
        sb.append(", supplieraccountid=").append(supplieraccountid);
        sb.append(", financingamount=").append(financingamount);
        sb.append(", financingdate=").append(financingdate);
        sb.append(", isrecourse=").append(isrecourse);
        sb.append(", interestrate=").append(interestrate);
        sb.append(", lendingdate=").append(lendingdate);
        sb.append(", returndate=").append(returndate);
        sb.append(", supplierrate=").append(supplierrate);
        sb.append(", corecompanyrate=").append(corecompanyrate);
        sb.append(", isactive=").append(isactive);
        sb.append(", createdby=").append(createdby);
        sb.append(", createdon=").append(createdon);
        sb.append(", lastmodifiedby=").append(lastmodifiedby);
        sb.append(", lastmodifiedon=").append(lastmodifiedon);
        sb.append(", rowversion=").append(rowversion);
        sb.append(", description=").append(description);
        sb.append(", supplastoperateflag=").append(supplastoperateflag);
        sb.append(", corelastoperateflag=").append(corelastoperateflag);
        sb.append(", banklastoperateflag=").append(banklastoperateflag);
        sb.append(", approvestate=").append(approvestate);
        sb.append(", estimatereturndate=").append(estimatereturndate);
        sb.append(", accountspayablequoteid=").append(accountspayablequoteid);
        sb.append(", lendingafterflag=").append(lendingafterflag);
        sb.append(", aftersignflag=").append(aftersignflag);
        sb.append(", signaturecontent=").append(signaturecontent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}