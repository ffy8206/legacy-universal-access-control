package com.harry.uac.persistence;

import java.util.Date;

public class ExtendData {
    private Long extendDataId;

    private Long extendDataTypeId;

    private Long extendDataSourceid;

    private String extendDataValue;

    private Integer extendDataDisplayOrder;

    private String extendDataRemark;

    private Long createUserId;

    private Date createTime;

    private Long updateUserId;

    private Date updateTime;

    public Long getExtendDataId() {
        return extendDataId;
    }

    public void setExtendDataId(Long extendDataId) {
        this.extendDataId = extendDataId;
    }

    public Long getExtendDataTypeId() {
        return extendDataTypeId;
    }

    public void setExtendDataTypeId(Long extendDataTypeId) {
        this.extendDataTypeId = extendDataTypeId;
    }

    public Long getExtendDataSourceid() {
        return extendDataSourceid;
    }

    public void setExtendDataSourceid(Long extendDataSourceid) {
        this.extendDataSourceid = extendDataSourceid;
    }

    public String getExtendDataValue() {
        return extendDataValue;
    }

    public void setExtendDataValue(String extendDataValue) {
        this.extendDataValue = extendDataValue;
    }

    public Integer getExtendDataDisplayOrder() {
        return extendDataDisplayOrder;
    }

    public void setExtendDataDisplayOrder(Integer extendDataDisplayOrder) {
        this.extendDataDisplayOrder = extendDataDisplayOrder;
    }

    public String getExtendDataRemark() {
        return extendDataRemark;
    }

    public void setExtendDataRemark(String extendDataRemark) {
        this.extendDataRemark = extendDataRemark;
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
        ExtendData other = (ExtendData) that;
        return (this.getExtendDataId() == null ? other.getExtendDataId() == null : this.getExtendDataId().equals(other.getExtendDataId()))
            && (this.getExtendDataTypeId() == null ? other.getExtendDataTypeId() == null : this.getExtendDataTypeId().equals(other.getExtendDataTypeId()))
            && (this.getExtendDataSourceid() == null ? other.getExtendDataSourceid() == null : this.getExtendDataSourceid().equals(other.getExtendDataSourceid()))
            && (this.getExtendDataValue() == null ? other.getExtendDataValue() == null : this.getExtendDataValue().equals(other.getExtendDataValue()))
            && (this.getExtendDataDisplayOrder() == null ? other.getExtendDataDisplayOrder() == null : this.getExtendDataDisplayOrder().equals(other.getExtendDataDisplayOrder()))
            && (this.getExtendDataRemark() == null ? other.getExtendDataRemark() == null : this.getExtendDataRemark().equals(other.getExtendDataRemark()))
            && (this.getCreateUserId() == null ? other.getCreateUserId() == null : this.getCreateUserId().equals(other.getCreateUserId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateUserId() == null ? other.getUpdateUserId() == null : this.getUpdateUserId().equals(other.getUpdateUserId()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getExtendDataId() == null) ? 0 : getExtendDataId().hashCode());
        result = prime * result + ((getExtendDataTypeId() == null) ? 0 : getExtendDataTypeId().hashCode());
        result = prime * result + ((getExtendDataSourceid() == null) ? 0 : getExtendDataSourceid().hashCode());
        result = prime * result + ((getExtendDataValue() == null) ? 0 : getExtendDataValue().hashCode());
        result = prime * result + ((getExtendDataDisplayOrder() == null) ? 0 : getExtendDataDisplayOrder().hashCode());
        result = prime * result + ((getExtendDataRemark() == null) ? 0 : getExtendDataRemark().hashCode());
        result = prime * result + ((getCreateUserId() == null) ? 0 : getCreateUserId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateUserId() == null) ? 0 : getUpdateUserId().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}