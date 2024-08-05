package com.harry.uac.persistence;

import java.util.Date;

public class AuthDatarange {
    private Long datarangeId;

    private Long applicationId;

    private String datarangeCode;

    private String datarangeName;

    private String datarangeValue;

    private String datarangeDescription;

    private Long createUserId;

    private Date createTime;

    private Long updateUserId;

    private Date updateTime;

    public Long getDatarangeId() {
        return datarangeId;
    }

    public void setDatarangeId(Long datarangeId) {
        this.datarangeId = datarangeId;
    }

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public String getDatarangeCode() {
        return datarangeCode;
    }

    public void setDatarangeCode(String datarangeCode) {
        this.datarangeCode = datarangeCode == null ? null : datarangeCode.trim();
    }

    public String getDatarangeName() {
        return datarangeName;
    }

    public void setDatarangeName(String datarangeName) {
        this.datarangeName = datarangeName == null ? null : datarangeName.trim();
    }

    public String getDatarangeValue() {
        return datarangeValue;
    }

    public void setDatarangeValue(String datarangeValue) {
        this.datarangeValue = datarangeValue == null ? null : datarangeValue.trim();
    }

    public String getDatarangeDescription() {
        return datarangeDescription;
    }

    public void setDatarangeDescription(String datarangeDescription) {
        this.datarangeDescription = datarangeDescription == null ? null : datarangeDescription.trim();
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
}