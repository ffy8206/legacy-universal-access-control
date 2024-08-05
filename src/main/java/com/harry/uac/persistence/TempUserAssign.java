package com.harry.uac.persistence;

import java.util.Date;

public class TempUserAssign {
    private Long id;

    private String orgCode;

    private String employeeNumber;

    private String jobCode;

    private String jobName;

    private String positionCode;

    private String positionName;

    private Date startDate;

    private Long assId;

    private Long createUserId;

    private Date createTime;

    private Long updateUserId;

    private Date updateTime;

    private Short dataSyncType;

    private Short dataSource;

    private String dataFile;

    private Short dataIsSynced;

    private Short userSyncStatus;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Long getAssId() {
        return assId;
    }

    public void setAssId(Long assId) {
        this.assId = assId;
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

    public Short getDataSyncType() {
        return dataSyncType;
    }

    public void setDataSyncType(Short dataSyncType) {
        this.dataSyncType = dataSyncType;
    }

    public Short getDataSource() {
        return dataSource;
    }

    public void setDataSource(Short dataSource) {
        this.dataSource = dataSource;
    }

    public String getDataFile() {
        return dataFile;
    }

    public void setDataFile(String dataFile) {
        this.dataFile = dataFile;
    }

    public Short getDataIsSynced() {
        return dataIsSynced;
    }

    public void setDataIsSynced(Short dataIsSynced) {
        this.dataIsSynced = dataIsSynced;
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
        TempUserAssign other = (TempUserAssign) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrgCode() == null ? other.getOrgCode() == null : this.getOrgCode().equals(other.getOrgCode()))
            && (this.getEmployeeNumber() == null ? other.getEmployeeNumber() == null : this.getEmployeeNumber().equals(other.getEmployeeNumber()))
            && (this.getJobCode() == null ? other.getJobCode() == null : this.getJobCode().equals(other.getJobCode()))
            && (this.getJobName() == null ? other.getJobName() == null : this.getJobName().equals(other.getJobName()))
            && (this.getPositionCode() == null ? other.getPositionCode() == null : this.getPositionCode().equals(other.getPositionCode()))
            && (this.getPositionName() == null ? other.getPositionName() == null : this.getPositionName().equals(other.getPositionName()))
            && (this.getStartDate() == null ? other.getStartDate() == null : this.getStartDate().equals(other.getStartDate()))
            && (this.getAssId() == null ? other.getAssId() == null : this.getAssId().equals(other.getAssId()))
            && (this.getCreateUserId() == null ? other.getCreateUserId() == null : this.getCreateUserId().equals(other.getCreateUserId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateUserId() == null ? other.getUpdateUserId() == null : this.getUpdateUserId().equals(other.getUpdateUserId()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getDataSyncType() == null ? other.getDataSyncType() == null : this.getDataSyncType().equals(other.getDataSyncType()))
            && (this.getDataSource() == null ? other.getDataSource() == null : this.getDataSource().equals(other.getDataSource()))
            && (this.getDataFile() == null ? other.getDataFile() == null : this.getDataFile().equals(other.getDataFile()))
            && (this.getDataIsSynced() == null ? other.getDataIsSynced() == null : this.getDataIsSynced().equals(other.getDataIsSynced()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrgCode() == null) ? 0 : getOrgCode().hashCode());
        result = prime * result + ((getEmployeeNumber() == null) ? 0 : getEmployeeNumber().hashCode());
        result = prime * result + ((getJobCode() == null) ? 0 : getJobCode().hashCode());
        result = prime * result + ((getJobName() == null) ? 0 : getJobName().hashCode());
        result = prime * result + ((getPositionCode() == null) ? 0 : getPositionCode().hashCode());
        result = prime * result + ((getPositionName() == null) ? 0 : getPositionName().hashCode());
        result = prime * result + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        result = prime * result + ((getAssId() == null) ? 0 : getAssId().hashCode());
        result = prime * result + ((getCreateUserId() == null) ? 0 : getCreateUserId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateUserId() == null) ? 0 : getUpdateUserId().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getDataSyncType() == null) ? 0 : getDataSyncType().hashCode());
        result = prime * result + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        result = prime * result + ((getDataFile() == null) ? 0 : getDataFile().hashCode());
        result = prime * result + ((getDataIsSynced() == null) ? 0 : getDataIsSynced().hashCode());
        return result;
    }

	public Short getUserSyncStatus() {
		return userSyncStatus;
	}

	public void setUserSyncStatus(Short userSyncStatus) {
		this.userSyncStatus = userSyncStatus;
	}
}