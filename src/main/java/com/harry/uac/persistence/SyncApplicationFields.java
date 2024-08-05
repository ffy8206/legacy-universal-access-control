package com.harry.uac.persistence;

import java.util.Date;

public class SyncApplicationFields {
    private Long applicationId;

    private String syncField;

    private String syncTable;

    private Long createUserId;

    private Date createTime;

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public String getSyncField() {
        return syncField;
    }

    public void setSyncField(String syncField) {
        this.syncField = syncField;
    }

    public String getSyncTable() {
        return syncTable;
    }

    public void setSyncTable(String syncTable) {
        this.syncTable = syncTable;
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
        SyncApplicationFields other = (SyncApplicationFields) that;
        return (this.getApplicationId() == null ? other.getApplicationId() == null : this.getApplicationId().equals(other.getApplicationId()))
            && (this.getSyncField() == null ? other.getSyncField() == null : this.getSyncField().equals(other.getSyncField()))
            && (this.getSyncTable() == null ? other.getSyncTable() == null : this.getSyncTable().equals(other.getSyncTable()))
            && (this.getCreateUserId() == null ? other.getCreateUserId() == null : this.getCreateUserId().equals(other.getCreateUserId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        result = prime * result + ((getSyncField() == null) ? 0 : getSyncField().hashCode());
        result = prime * result + ((getSyncTable() == null) ? 0 : getSyncTable().hashCode());
        result = prime * result + ((getCreateUserId() == null) ? 0 : getCreateUserId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}