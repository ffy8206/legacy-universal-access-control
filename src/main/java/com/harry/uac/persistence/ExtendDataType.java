package com.harry.uac.persistence;

import java.util.Date;

public class ExtendDataType {
    private Long extendDataTypeId;

    private String extendDataTypeName;

    private String extendDataTypeSource;

    private String extendDataTypeCode;

    private Integer extendDataTypeStyle;

    private String extendDataTypeDescription;

    private String extendDataRemark;

    private Long createUserId;

    private Date createTime;

    private Long updateUserId;

    private Date updateTime;

    public Long getExtendDataTypeId() {
        return extendDataTypeId;
    }

    public void setExtendDataTypeId(Long extendDataTypeId) {
        this.extendDataTypeId = extendDataTypeId;
    }

    public String getExtendDataTypeName() {
        return extendDataTypeName;
    }

    public void setExtendDataTypeName(String extendDataTypeName) {
        this.extendDataTypeName = extendDataTypeName;
    }

    public String getExtendDataTypeSource() {
        return extendDataTypeSource;
    }

    public void setExtendDataTypeSource(String extendDataTypeSource) {
        this.extendDataTypeSource = extendDataTypeSource;
    }

    public String getExtendDataTypeCode() {
        return extendDataTypeCode;
    }

    public void setExtendDataTypeCode(String extendDataTypeCode) {
        this.extendDataTypeCode = extendDataTypeCode;
    }

    public Integer getExtendDataTypeStyle() {
        return extendDataTypeStyle;
    }

    public void setExtendDataTypeStyle(Integer extendDataTypeStyle) {
        this.extendDataTypeStyle = extendDataTypeStyle;
    }

    public String getExtendDataTypeDescription() {
        return extendDataTypeDescription;
    }

    public void setExtendDataTypeDescription(String extendDataTypeDescription) {
        this.extendDataTypeDescription = extendDataTypeDescription;
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
        ExtendDataType other = (ExtendDataType) that;
        return (this.getExtendDataTypeId() == null ? other.getExtendDataTypeId() == null : this.getExtendDataTypeId().equals(other.getExtendDataTypeId()))
            && (this.getExtendDataTypeName() == null ? other.getExtendDataTypeName() == null : this.getExtendDataTypeName().equals(other.getExtendDataTypeName()))
            && (this.getExtendDataTypeSource() == null ? other.getExtendDataTypeSource() == null : this.getExtendDataTypeSource().equals(other.getExtendDataTypeSource()))
            && (this.getExtendDataTypeCode() == null ? other.getExtendDataTypeCode() == null : this.getExtendDataTypeCode().equals(other.getExtendDataTypeCode()))
            && (this.getExtendDataTypeStyle() == null ? other.getExtendDataTypeStyle() == null : this.getExtendDataTypeStyle().equals(other.getExtendDataTypeStyle()))
            && (this.getExtendDataTypeDescription() == null ? other.getExtendDataTypeDescription() == null : this.getExtendDataTypeDescription().equals(other.getExtendDataTypeDescription()))
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
        result = prime * result + ((getExtendDataTypeId() == null) ? 0 : getExtendDataTypeId().hashCode());
        result = prime * result + ((getExtendDataTypeName() == null) ? 0 : getExtendDataTypeName().hashCode());
        result = prime * result + ((getExtendDataTypeSource() == null) ? 0 : getExtendDataTypeSource().hashCode());
        result = prime * result + ((getExtendDataTypeCode() == null) ? 0 : getExtendDataTypeCode().hashCode());
        result = prime * result + ((getExtendDataTypeStyle() == null) ? 0 : getExtendDataTypeStyle().hashCode());
        result = prime * result + ((getExtendDataTypeDescription() == null) ? 0 : getExtendDataTypeDescription().hashCode());
        result = prime * result + ((getExtendDataRemark() == null) ? 0 : getExtendDataRemark().hashCode());
        result = prime * result + ((getCreateUserId() == null) ? 0 : getCreateUserId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateUserId() == null) ? 0 : getUpdateUserId().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}