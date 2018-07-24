package com.ceying.tools.entity.cyp;

import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Table(name = "TSYS_USER")
public class CypUser implements Serializable {
    private String userId;

    private String userName;

    private String userPwd;

    private String orgId;

    private String userType;

    private String userStatus;

    private String lockStatus;

    private Integer createDate;

    private Integer modifyDate;

    private Integer passModifyDate;

    private String mobile;

    private String email;

    private String extFlag;

    private String remark;

    private String extField_1;

    private String extField_2;

    private String extField_3;

    private String extField_4;

    private String extField_5;

    private Integer userOrder;

    private String cIdentitytype;

    private String cIdentityno;

    private String cCredentials;

    private Integer createTime;

    private Integer modifyTime;

    private Integer tenantId;

    private static final long serialVersionUID = 1L;

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
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus == null ? null : userStatus.trim();
    }

    public String getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(String lockStatus) {
        this.lockStatus = lockStatus == null ? null : lockStatus.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getExtFlag() {
        return extFlag;
    }

    public void setExtFlag(String extFlag) {
        this.extFlag = extFlag == null ? null : extFlag.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getExtField_1() {
        return extField_1;
    }

    public void setExtField_1(String extField_1) {
        this.extField_1 = extField_1;
    }

    public String getExtField_2() {
        return extField_2;
    }

    public void setExtField_2(String extField_2) {
        this.extField_2 = extField_2;
    }

    public String getExtField_3() {
        return extField_3;
    }

    public void setExtField_3(String extField_3) {
        this.extField_3 = extField_3;
    }

    public String getExtField_4() {
        return extField_4;
    }

    public void setExtField_4(String extField_4) {
        this.extField_4 = extField_4;
    }

    public String getExtField_5() {
        return extField_5;
    }

    public void setExtField_5(String extField_5) {
        this.extField_5 = extField_5;
    }

    public String getcIdentitytype() {
        return cIdentitytype;
    }

    public void setcIdentitytype(String cIdentitytype) {
        this.cIdentitytype = cIdentitytype == null ? null : cIdentitytype.trim();
    }

    public String getcIdentityno() {
        return cIdentityno;
    }

    public void setcIdentityno(String cIdentityno) {
        this.cIdentityno = cIdentityno == null ? null : cIdentityno.trim();
    }

    public String getcCredentials() {
        return cCredentials;
    }

    public void setcCredentials(String cCredentials) {
        this.cCredentials = cCredentials == null ? null : cCredentials.trim();
    }

    public Integer getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Integer createDate) {
        this.createDate = createDate;
    }

    public Integer getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Integer modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getPassModifyDate() {
        return passModifyDate;
    }

    public void setPassModifyDate(Integer passModifyDate) {
        this.passModifyDate = passModifyDate;
    }

    public Integer getUserOrder() {
        return userOrder;
    }

    public void setUserOrder(Integer userOrder) {
        this.userOrder = userOrder;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Integer modifyTime) {
        this.modifyTime = modifyTime;
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
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userPwd=").append(userPwd);
        sb.append(", orgId=").append(orgId);
        sb.append(", userType=").append(userType);
        sb.append(", userStatus=").append(userStatus);
        sb.append(", lockStatus=").append(lockStatus);
        sb.append(", createDate=").append(createDate);
        sb.append(", modifyDate=").append(modifyDate);
        sb.append(", passModifyDate=").append(passModifyDate);
        sb.append(", mobile=").append(mobile);
        sb.append(", email=").append(email);
        sb.append(", extFlag=").append(extFlag);
        sb.append(", remark=").append(remark);
        sb.append(", extField_1=").append(extField_1);
        sb.append(", extField_2=").append(extField_2);
        sb.append(", extField_3=").append(extField_3);
        sb.append(", extField_4=").append(extField_4);
        sb.append(", extField_5=").append(extField_5);
        sb.append(", userOrder=").append(userOrder);
        sb.append(", cIdentitytype=").append(cIdentitytype);
        sb.append(", cIdentityno=").append(cIdentityno);
        sb.append(", cCredentials=").append(cCredentials);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}