package com.harry.uac.persistence;

import java.util.Date;

public class AuthApplication {
    private Long applicationId;

    private String applicationName;

    private String applicationUrl;

    private String applicationContact;

    private String applicationContactPhone;

    private Long applicationSyncFields;

    private String applicationRemark;

    private Long createUserId;

    private Date createTime;

    private Long updateUserId;

    private Date updateTime;
    
    private String tag;

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName == null ? null : applicationName.trim();
    }

    public String getApplicationUrl() {
        return applicationUrl;
    }

    public void setApplicationUrl(String applicationUrl) {
        this.applicationUrl = applicationUrl == null ? null : applicationUrl.trim();
    }

    public String getApplicationContact() {
        return applicationContact;
    }

    public void setApplicationContact(String applicationContact) {
        this.applicationContact = applicationContact == null ? null : applicationContact.trim();
    }

    public String getApplicationContactPhone() {
        return applicationContactPhone;
    }

    public void setApplicationContactPhone(String applicationContactPhone) {
        this.applicationContactPhone = applicationContactPhone == null ? null : applicationContactPhone.trim();
    }

    public Long getApplicationSyncFields() {
        return applicationSyncFields;
    }

    public void setApplicationSyncFields(Long applicationSyncFields) {
        this.applicationSyncFields = applicationSyncFields;
    }

    public String getApplicationRemark() {
        return applicationRemark;
    }

    public void setApplicationRemark(String applicationRemark) {
        this.applicationRemark = applicationRemark == null ? null : applicationRemark.trim();
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

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
    
    
}