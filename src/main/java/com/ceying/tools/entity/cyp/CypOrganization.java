package com.ceying.tools.entity.cyp;

import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Table(name = "TSYS_ORGANIZATION")
public class CypOrganization implements Serializable {
    private String orgId;

    private String dimension;

    private String orgCode;

    private String orgName;

    private String parentId;

    private String manageId;

    private String positionCode;

    private String orgCate;

    private String orgLevel;

    private Integer orgOrder;

    private String orgPath;

    private String ssoOrgCode;

    private String ssoParentCode;

    private String extId;

    private String remark;

    private Integer status;

    private Integer tenantId;

    private String shortorgname;

    private String createdate;

    private String lastmodifiedon;

    private BigDecimal platformsupplierrate;

    private BigDecimal corecompanyrate;

    private String areaid;

    private Integer financenumber;

    private String address;

    private String legalperson;

    private static final long serialVersionUID = 1L;

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension == null ? null : dimension.trim();
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }


    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getManageId() {
        return manageId;
    }

    public void setManageId(String manageId) {
        this.manageId = manageId == null ? null : manageId.trim();
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode == null ? null : positionCode.trim();
    }

    public String getOrgCate() {
        return orgCate;
    }

    public void setOrgCate(String orgCate) {
        this.orgCate = orgCate == null ? null : orgCate.trim();
    }

    public String getOrgLevel() {
        return orgLevel;
    }

    public void setOrgLevel(String orgLevel) {
        this.orgLevel = orgLevel == null ? null : orgLevel.trim();
    }

    public String getOrgPath() {
        return orgPath;
    }

    public void setOrgPath(String orgPath) {
        this.orgPath = orgPath == null ? null : orgPath.trim();
    }

    public String getSsoOrgCode() {
        return ssoOrgCode;
    }

    public void setSsoOrgCode(String ssoOrgCode) {
        this.ssoOrgCode = ssoOrgCode == null ? null : ssoOrgCode.trim();
    }

    public String getSsoParentCode() {
        return ssoParentCode;
    }

    public void setSsoParentCode(String ssoParentCode) {
        this.ssoParentCode = ssoParentCode == null ? null : ssoParentCode.trim();
    }

    public String getExtId() {
        return extId;
    }

    public void setExtId(String extId) {
        this.extId = extId == null ? null : extId.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getShortorgname() {
        return shortorgname;
    }

    public void setShortorgname(String shortorgname) {
        this.shortorgname = shortorgname == null ? null : shortorgname.trim();
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate == null ? null : createdate.trim();
    }

    public String getLastmodifiedon() {
        return lastmodifiedon;
    }

    public void setLastmodifiedon(String lastmodifiedon) {
        this.lastmodifiedon = lastmodifiedon == null ? null : lastmodifiedon.trim();
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid == null ? null : areaid.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getLegalperson() {
        return legalperson;
    }

    public void setLegalperson(String legalperson) {
        this.legalperson = legalperson == null ? null : legalperson.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public Integer getOrgOrder() {
        return orgOrder;
    }

    public void setOrgOrder(Integer orgOrder) {
        this.orgOrder = orgOrder;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    public BigDecimal getPlatformsupplierrate() {
        return platformsupplierrate;
    }

    public void setPlatformsupplierrate(BigDecimal platformsupplierrate) {
        this.platformsupplierrate = platformsupplierrate;
    }

    public BigDecimal getCorecompanyrate() {
        return corecompanyrate;
    }

    public void setCorecompanyrate(BigDecimal corecompanyrate) {
        this.corecompanyrate = corecompanyrate;
    }

    public Integer getFinancenumber() {
        return financenumber;
    }

    public void setFinancenumber(Integer financenumber) {
        this.financenumber = financenumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orgId=").append(orgId);
        sb.append(", dimension=").append(dimension);
        sb.append(", orgCode=").append(orgCode);
        sb.append(", orgName=").append(orgName);
        sb.append(", parentId=").append(parentId);
        sb.append(", manageId=").append(manageId);
        sb.append(", positionCode=").append(positionCode);
        sb.append(", orgCate=").append(orgCate);
        sb.append(", orgLevel=").append(orgLevel);
        sb.append(", orgOrder=").append(orgOrder);
        sb.append(", orgPath=").append(orgPath);
        sb.append(", ssoOrgCode=").append(ssoOrgCode);
        sb.append(", ssoParentCode=").append(ssoParentCode);
        sb.append(", extId=").append(extId);
        sb.append(", remark=").append(remark);
        sb.append(", status=").append(status);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", shortorgname=").append(shortorgname);
        sb.append(", createdate=").append(createdate);
        sb.append(", lastmodifiedon=").append(lastmodifiedon);
        sb.append(", platformsupplierrate=").append(platformsupplierrate);
        sb.append(", corecompanyrate=").append(corecompanyrate);
        sb.append(", areaid=").append(areaid);
        sb.append(", financenumber=").append(financenumber);
        sb.append(", address=").append(address);
        sb.append(", legalperson=").append(legalperson);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}