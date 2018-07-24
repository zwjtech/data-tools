package com.ceying.tools.entity.scyp.biz;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TradeTransActions implements Serializable {
    private String urid;

    private String tradeaccountsid;

    private BigDecimal ledgeramount;

    private Date postdatetime;

    private BigDecimal balance;

    private String createdby;

    private Date createdon;

    private String lastmodifiedby;

    private Date lastmodifiedon;

    private Integer rowversion;

    private String description;

    private String operateflag;

    private String approvestate;

    private String ordernumber;

    private String businessnumber;

    private static final long serialVersionUID = 1L;

    public String getUrid() {
        return urid;
    }

    public void setUrid(String urid) {
        this.urid = urid == null ? null : urid.trim();
    }

    public String getTradeaccountsid() {
        return tradeaccountsid;
    }

    public void setTradeaccountsid(String tradeaccountsid) {
        this.tradeaccountsid = tradeaccountsid == null ? null : tradeaccountsid.trim();
    }

    public BigDecimal getLedgeramount() {
        return ledgeramount;
    }

    public void setLedgeramount(BigDecimal ledgeramount) {
        this.ledgeramount = ledgeramount;
    }

    public Date getPostdatetime() {
        return postdatetime;
    }

    public void setPostdatetime(Date postdatetime) {
        this.postdatetime = postdatetime;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
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

    public String getOperateflag() {
        return operateflag;
    }

    public void setOperateflag(String operateflag) {
        this.operateflag = operateflag == null ? null : operateflag.trim();
    }

    public String getApprovestate() {
        return approvestate;
    }

    public void setApprovestate(String approvestate) {
        this.approvestate = approvestate == null ? null : approvestate.trim();
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber == null ? null : ordernumber.trim();
    }

    public String getBusinessnumber() {
        return businessnumber;
    }

    public void setBusinessnumber(String businessnumber) {
        this.businessnumber = businessnumber == null ? null : businessnumber.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", urid=").append(urid);
        sb.append(", tradeaccountsid=").append(tradeaccountsid);
        sb.append(", ledgeramount=").append(ledgeramount);
        sb.append(", postdatetime=").append(postdatetime);
        sb.append(", balance=").append(balance);
        sb.append(", createdby=").append(createdby);
        sb.append(", createdon=").append(createdon);
        sb.append(", lastmodifiedby=").append(lastmodifiedby);
        sb.append(", lastmodifiedon=").append(lastmodifiedon);
        sb.append(", rowversion=").append(rowversion);
        sb.append(", description=").append(description);
        sb.append(", operateflag=").append(operateflag);
        sb.append(", approvestate=").append(approvestate);
        sb.append(", ordernumber=").append(ordernumber);
        sb.append(", businessnumber=").append(businessnumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}