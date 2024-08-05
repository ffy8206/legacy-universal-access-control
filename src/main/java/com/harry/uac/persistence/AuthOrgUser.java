package com.harry.uac.persistence;

import java.util.Date;

public class AuthOrgUser extends AuthOrgUserKey {
    private String userOrgworkType;

    private Integer userDisplayOrder;

    private Integer userOrgdutyDict;

    private Long createUserId;

    private Date createTime;
    
    private AuthOrg orgInfo;

    public String getUserOrgworkType() {
        return userOrgworkType;
    }

    public void setUserOrgworkType(String userOrgworkType) {
        this.userOrgworkType = userOrgworkType;
    }

    public Integer getUserDisplayOrder() {
        return userDisplayOrder;
    }

    public void setUserDisplayOrder(Integer userDisplayOrder) {
        this.userDisplayOrder = userDisplayOrder;
    }

    public Integer getUserOrgdutyDict() {
        return userOrgdutyDict;
    }

    public void setUserOrgdutyDict(Integer userOrgdutyDict) {
        this.userOrgdutyDict = userOrgdutyDict;
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
        AuthOrgUser other = (AuthOrgUser) that;
        return (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserOrgworkType() == null ? other.getUserOrgworkType() == null : this.getUserOrgworkType().equals(other.getUserOrgworkType()))
            && (this.getUserDisplayOrder() == null ? other.getUserDisplayOrder() == null : this.getUserDisplayOrder().equals(other.getUserDisplayOrder()))
            && (this.getUserOrgdutyDict() == null ? other.getUserOrgdutyDict() == null : this.getUserOrgdutyDict().equals(other.getUserOrgdutyDict()))
            && (this.getCreateUserId() == null ? other.getCreateUserId() == null : this.getCreateUserId().equals(other.getCreateUserId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserOrgworkType() == null) ? 0 : getUserOrgworkType().hashCode());
        result = prime * result + ((getUserDisplayOrder() == null) ? 0 : getUserDisplayOrder().hashCode());
        result = prime * result + ((getUserOrgdutyDict() == null) ? 0 : getUserOrgdutyDict().hashCode());
        result = prime * result + ((getCreateUserId() == null) ? 0 : getCreateUserId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

	public AuthOrg getOrgInfo() {
		return orgInfo;
	}

	public void setOrgInfo(AuthOrg orgInfo) {
		this.orgInfo = orgInfo;
	}
}