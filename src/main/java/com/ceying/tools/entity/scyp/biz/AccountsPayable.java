package com.ceying.tools.entity.scyp.biz;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AccountsPayable implements Serializable {
    private String urid;

    private String tenantid;

    private String contractid;

    private String supplierid;

    private String corecompanyid;

    private String bankid;

    private Date billdate;

    private BigDecimal amount;

    private Date payabledate;

    private String createdby;

    private Date createdon;

    private String lastmodifiedby;

    private Date lastmodifiedon;

    private Integer rowversion;

    private String description;

    private String lastoperationflag;

    private BigDecimal financingamount;

    private Date financingdate;

    private String attribute1;

    private String attribute2;

    private String isactive;

    private String payableno;

    private BigDecimal freezeamount;

    private BigDecimal corecompanysupplierrate;

    private String isfirstfinance;

    private BigDecimal securitydeposit;

    private String invoicenumber;

    private Date expiringdate;

    private String businesstype;

    private BigDecimal supplierrate;

    private BigDecimal suppliercorerate;

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

    public String getContractid() {
        return contractid;
    }

    public void setContractid(String contractid) {
        this.contractid = contractid == null ? null : contractid.trim();
    }

    public String getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid == null ? null : supplierid.trim();
    }

    public String getCorecompanyid() {
        return corecompanyid;
    }

    public void setCorecompanyid(String corecompanyid) {
        this.corecompanyid = corecompanyid == null ? null : corecompanyid.trim();
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid == null ? null : bankid.trim();
    }

    public Date getBilldate() {
        return billdate;
    }

    public void setBilldate(Date billdate) {
        this.billdate = billdate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getPayabledate() {
        return payabledate;
    }

    public void setPayabledate(Date payabledate) {
        this.payabledate = payabledate;
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

    public String getLastoperationflag() {
        return lastoperationflag;
    }

    public void setLastoperationflag(String lastoperationflag) {
        this.lastoperationflag = lastoperationflag == null ? null : lastoperationflag.trim();
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

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1 == null ? null : attribute1.trim();
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2 == null ? null : attribute2.trim();
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive == null ? null : isactive.trim();
    }

    public String getPayableno() {
        return payableno;
    }

    public void setPayableno(String payableno) {
        this.payableno = payableno == null ? null : payableno.trim();
    }

    public BigDecimal getFreezeamount() {
        return freezeamount;
    }

    public void setFreezeamount(BigDecimal freezeamount) {
        this.freezeamount = freezeamount;
    }

    public BigDecimal getCorecompanysupplierrate() {
        return corecompanysupplierrate;
    }

    public void setCorecompanysupplierrate(BigDecimal corecompanysupplierrate) {
        this.corecompanysupplierrate = corecompanysupplierrate;
    }

    public String getIsfirstfinance() {
        return isfirstfinance;
    }

    public void setIsfirstfinance(String isfirstfinance) {
        this.isfirstfinance = isfirstfinance == null ? null : isfirstfinance.trim();
    }

    public BigDecimal getSecuritydeposit() {
        return securitydeposit;
    }

    public void setSecuritydeposit(BigDecimal securitydeposit) {
        this.securitydeposit = securitydeposit;
    }

    public String getInvoicenumber() {
        return invoicenumber;
    }

    public void setInvoicenumber(String invoicenumber) {
        this.invoicenumber = invoicenumber == null ? null : invoicenumber.trim();
    }

    public Date getExpiringdate() {
        return expiringdate;
    }

    public void setExpiringdate(Date expiringdate) {
        this.expiringdate = expiringdate;
    }

    public String getBusinesstype() {
        return businesstype;
    }

    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype == null ? null : businesstype.trim();
    }

    public BigDecimal getSupplierrate() {
        return supplierrate;
    }

    public void setSupplierrate(BigDecimal supplierrate) {
        this.supplierrate = supplierrate;
    }

    public BigDecimal getSuppliercorerate() {
        return suppliercorerate;
    }

    public void setSuppliercorerate(BigDecimal suppliercorerate) {
        this.suppliercorerate = suppliercorerate;
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
        sb.append(", contractid=").append(contractid);
        sb.append(", supplierid=").append(supplierid);
        sb.append(", corecompanyid=").append(corecompanyid);
        sb.append(", bankid=").append(bankid);
        sb.append(", billdate=").append(billdate);
        sb.append(", amount=").append(amount);
        sb.append(", payabledate=").append(payabledate);
        sb.append(", createdby=").append(createdby);
        sb.append(", createdon=").append(createdon);
        sb.append(", lastmodifiedby=").append(lastmodifiedby);
        sb.append(", lastmodifiedon=").append(lastmodifiedon);
        sb.append(", rowversion=").append(rowversion);
        sb.append(", description=").append(description);
        sb.append(", lastoperationflag=").append(lastoperationflag);
        sb.append(", financingamount=").append(financingamount);
        sb.append(", financingdate=").append(financingdate);
        sb.append(", attribute1=").append(attribute1);
        sb.append(", attribute2=").append(attribute2);
        sb.append(", isactive=").append(isactive);
        sb.append(", payableno=").append(payableno);
        sb.append(", freezeamount=").append(freezeamount);
        sb.append(", corecompanysupplierrate=").append(corecompanysupplierrate);
        sb.append(", isfirstfinance=").append(isfirstfinance);
        sb.append(", securitydeposit=").append(securitydeposit);
        sb.append(", invoicenumber=").append(invoicenumber);
        sb.append(", expiringdate=").append(expiringdate);
        sb.append(", businesstype=").append(businesstype);
        sb.append(", supplierrate=").append(supplierrate);
        sb.append(", suppliercorerate=").append(suppliercorerate);
        sb.append(", signaturecontent=").append(signaturecontent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}