package com.harry.uac.persistence;

import java.util.Date;

public class AuthOrg {
    private Long orgId;

    private String orgName;

    private String orgCode;

    private String orgInitials;

    private String orgDescription;

    private Integer orgStyle;

    private Integer orgStatus;

    private String orgParentId;

    private String orgLayerCode;

    private Integer orgLevelDict;

    private Integer orgDisplayOrder;

    private String orgSupervisorUid;

    private String orgManagerUid;

    private String orgViceManagerUid;

    private String orgAdminUid;

    private String orgManageOrgId;

    private String orgPostalAddress;

    private String orgPostalCode;

    private String orgTelephoneNumber;

    private String orgFaxNumber;

    private Date orgStarttime;

    private Date orgEndtime;

    private String orgErpId;

    private String orgLocation;

    private String orgRemark;

    private Long createUserId;

    private Date createTime;

    private Long updateUserId;

    private Date updateTime;
    
    private String tag;
    
    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getOrgInitials() {
        return orgInitials;
    }

    public void setOrgInitials(String orgInitials) {
        this.orgInitials = orgInitials;
    }

    public String getOrgDescription() {
        return orgDescription;
    }

    public void setOrgDescription(String orgDescription) {
        this.orgDescription = orgDescription;
    }

    public Integer getOrgStyle() {
        return orgStyle;
    }

    public void setOrgStyle(Integer orgStyle) {
        this.orgStyle = orgStyle;
    }

    public Integer getOrgStatus() {
        return orgStatus;
    }

    public void setOrgStatus(Integer orgStatus) {
        this.orgStatus = orgStatus;
    }

    public String getOrgParentId() {
        return orgParentId;
    }

    public void setOrgParentId(String orgParentId) {
        this.orgParentId = orgParentId;
    }

    public String getOrgLayerCode() {
        return orgLayerCode;
    }

    public void setOrgLayerCode(String orgLayerCode) {
        this.orgLayerCode = orgLayerCode;
    }

    public Integer getOrgLevelDict() {
        return orgLevelDict;
    }

    public void setOrgLevelDict(Integer orgLevelDict) {
        this.orgLevelDict = orgLevelDict;
    }

    public Integer getOrgDisplayOrder() {
        return orgDisplayOrder;
    }

    public void setOrgDisplayOrder(Integer orgDisplayOrder) {
        this.orgDisplayOrder = orgDisplayOrder;
    }

    public String getOrgSupervisorUid() {
        return orgSupervisorUid;
    }

    public void setOrgSupervisorUid(String orgSupervisorUid) {
        this.orgSupervisorUid = orgSupervisorUid;
    }

    public String getOrgManagerUid() {
        return orgManagerUid;
    }

    public void setOrgManagerUid(String orgManagerUid) {
        this.orgManagerUid = orgManagerUid;
    }

    public String getOrgViceManagerUid() {
        return orgViceManagerUid;
    }

    public void setOrgViceManagerUid(String orgViceManagerUid) {
        this.orgViceManagerUid = orgViceManagerUid;
    }

    public String getOrgAdminUid() {
        return orgAdminUid;
    }

    public void setOrgAdminUid(String orgAdminUid) {
        this.orgAdminUid = orgAdminUid;
    }

    public String getOrgManageOrgId() {
        return orgManageOrgId;
    }

    public void setOrgManageOrgId(String orgManageOrgId) {
        this.orgManageOrgId = orgManageOrgId;
    }

    public String getOrgPostalAddress() {
        return orgPostalAddress;
    }

    public void setOrgPostalAddress(String orgPostalAddress) {
        this.orgPostalAddress = orgPostalAddress;
    }

    public String getOrgPostalCode() {
        return orgPostalCode;
    }

    public void setOrgPostalCode(String orgPostalCode) {
        this.orgPostalCode = orgPostalCode;
    }

    public String getOrgTelephoneNumber() {
        return orgTelephoneNumber;
    }

    public void setOrgTelephoneNumber(String orgTelephoneNumber) {
        this.orgTelephoneNumber = orgTelephoneNumber;
    }

    public String getOrgFaxNumber() {
        return orgFaxNumber;
    }

    public void setOrgFaxNumber(String orgFaxNumber) {
        this.orgFaxNumber = orgFaxNumber;
    }

    public Date getOrgStarttime() {
        return orgStarttime;
    }

    public void setOrgStarttime(Date orgStarttime) {
        this.orgStarttime = orgStarttime;
    }

    public Date getOrgEndtime() {
        return orgEndtime;
    }

    public void setOrgEndtime(Date orgEndtime) {
        this.orgEndtime = orgEndtime;
    }

    public String getOrgErpId() {
        return orgErpId;
    }

    public void setOrgErpId(String orgErpId) {
        this.orgErpId = orgErpId;
    }

    public String getOrgLocation() {
        return orgLocation;
    }

    public void setOrgLocation(String orgLocation) {
        this.orgLocation = orgLocation;
    }

    public String getOrgRemark() {
        return orgRemark;
    }

    public void setOrgRemark(String orgRemark) {
        this.orgRemark = orgRemark;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AuthOrg other = (AuthOrg) that;
        return (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()))
            && (this.getOrgName() == null ? other.getOrgName() == null : this.getOrgName().equals(other.getOrgName()))
            && (this.getOrgCode() == null ? other.getOrgCode() == null : this.getOrgCode().equals(other.getOrgCode()))
            && (this.getOrgInitials() == null ? other.getOrgInitials() == null : this.getOrgInitials().equals(other.getOrgInitials()))
            && (this.getOrgDescription() == null ? other.getOrgDescription() == null : this.getOrgDescription().equals(other.getOrgDescription()))
            && (this.getOrgStyle() == null ? other.getOrgStyle() == null : this.getOrgStyle().equals(other.getOrgStyle()))
            && (this.getOrgStatus() == null ? other.getOrgStatus() == null : this.getOrgStatus().equals(other.getOrgStatus()))
            && (this.getOrgParentId() == null ? other.getOrgParentId() == null : this.getOrgParentId().equals(other.getOrgParentId()))
            && (this.getOrgLayerCode() == null ? other.getOrgLayerCode() == null : this.getOrgLayerCode().equals(other.getOrgLayerCode()))
            && (this.getOrgLevelDict() == null ? other.getOrgLevelDict() == null : this.getOrgLevelDict().equals(other.getOrgLevelDict()))
            && (this.getOrgDisplayOrder() == null ? other.getOrgDisplayOrder() == null : this.getOrgDisplayOrder().equals(other.getOrgDisplayOrder()))
            && (this.getOrgSupervisorUid() == null ? other.getOrgSupervisorUid() == null : this.getOrgSupervisorUid().equals(other.getOrgSupervisorUid()))
            && (this.getOrgManagerUid() == null ? other.getOrgManagerUid() == null : this.getOrgManagerUid().equals(other.getOrgManagerUid()))
            && (this.getOrgViceManagerUid() == null ? other.getOrgViceManagerUid() == null : this.getOrgViceManagerUid().equals(other.getOrgViceManagerUid()))
            && (this.getOrgAdminUid() == null ? other.getOrgAdminUid() == null : this.getOrgAdminUid().equals(other.getOrgAdminUid()))
            && (this.getOrgManageOrgId() == null ? other.getOrgManageOrgId() == null : this.getOrgManageOrgId().equals(other.getOrgManageOrgId()))
            && (this.getOrgPostalAddress() == null ? other.getOrgPostalAddress() == null : this.getOrgPostalAddress().equals(other.getOrgPostalAddress()))
            && (this.getOrgPostalCode() == null ? other.getOrgPostalCode() == null : this.getOrgPostalCode().equals(other.getOrgPostalCode()))
            && (this.getOrgTelephoneNumber() == null ? other.getOrgTelephoneNumber() == null : this.getOrgTelephoneNumber().equals(other.getOrgTelephoneNumber()))
            && (this.getOrgFaxNumber() == null ? other.getOrgFaxNumber() == null : this.getOrgFaxNumber().equals(other.getOrgFaxNumber()))
            && (this.getOrgStarttime() == null ? other.getOrgStarttime() == null : this.getOrgStarttime().equals(other.getOrgStarttime()))
            && (this.getOrgEndtime() == null ? other.getOrgEndtime() == null : this.getOrgEndtime().equals(other.getOrgEndtime()))
            && (this.getOrgErpId() == null ? other.getOrgErpId() == null : this.getOrgErpId().equals(other.getOrgErpId()))
            && (this.getOrgLocation() == null ? other.getOrgLocation() == null : this.getOrgLocation().equals(other.getOrgLocation()))
            && (this.getOrgRemark() == null ? other.getOrgRemark() == null : this.getOrgRemark().equals(other.getOrgRemark()))
            && (this.getCreateUserId() == null ? other.getCreateUserId() == null : this.getCreateUserId().equals(other.getCreateUserId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateUserId() == null ? other.getUpdateUserId() == null : this.getUpdateUserId().equals(other.getUpdateUserId()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        result = prime * result + ((getOrgName() == null) ? 0 : getOrgName().hashCode());
        result = prime * result + ((getOrgCode() == null) ? 0 : getOrgCode().hashCode());
        result = prime * result + ((getOrgInitials() == null) ? 0 : getOrgInitials().hashCode());
        result = prime * result + ((getOrgDescription() == null) ? 0 : getOrgDescription().hashCode());
        result = prime * result + ((getOrgStyle() == null) ? 0 : getOrgStyle().hashCode());
        result = prime * result + ((getOrgStatus() == null) ? 0 : getOrgStatus().hashCode());
        result = prime * result + ((getOrgParentId() == null) ? 0 : getOrgParentId().hashCode());
        result = prime * result + ((getOrgLayerCode() == null) ? 0 : getOrgLayerCode().hashCode());
        result = prime * result + ((getOrgLevelDict() == null) ? 0 : getOrgLevelDict().hashCode());
        result = prime * result + ((getOrgDisplayOrder() == null) ? 0 : getOrgDisplayOrder().hashCode());
        result = prime * result + ((getOrgSupervisorUid() == null) ? 0 : getOrgSupervisorUid().hashCode());
        result = prime * result + ((getOrgManagerUid() == null) ? 0 : getOrgManagerUid().hashCode());
        result = prime * result + ((getOrgViceManagerUid() == null) ? 0 : getOrgViceManagerUid().hashCode());
        result = prime * result + ((getOrgAdminUid() == null) ? 0 : getOrgAdminUid().hashCode());
        result = prime * result + ((getOrgManageOrgId() == null) ? 0 : getOrgManageOrgId().hashCode());
        result = prime * result + ((getOrgPostalAddress() == null) ? 0 : getOrgPostalAddress().hashCode());
        result = prime * result + ((getOrgPostalCode() == null) ? 0 : getOrgPostalCode().hashCode());
        result = prime * result + ((getOrgTelephoneNumber() == null) ? 0 : getOrgTelephoneNumber().hashCode());
        result = prime * result + ((getOrgFaxNumber() == null) ? 0 : getOrgFaxNumber().hashCode());
        result = prime * result + ((getOrgStarttime() == null) ? 0 : getOrgStarttime().hashCode());
        result = prime * result + ((getOrgEndtime() == null) ? 0 : getOrgEndtime().hashCode());
        result = prime * result + ((getOrgErpId() == null) ? 0 : getOrgErpId().hashCode());
        result = prime * result + ((getOrgLocation() == null) ? 0 : getOrgLocation().hashCode());
        result = prime * result + ((getOrgRemark() == null) ? 0 : getOrgRemark().hashCode());
        result = prime * result + ((getCreateUserId() == null) ? 0 : getCreateUserId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateUserId() == null) ? 0 : getUpdateUserId().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

}