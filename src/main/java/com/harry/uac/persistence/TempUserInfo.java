package com.harry.uac.persistence;

import java.util.Date;
import java.util.List;

public class TempUserInfo {
    private Long id;

    private String userName;

    private String userEmail;

    private Integer userNationDict;

    private Integer userGender;

    private Date userBirthday;

    private String userNationality;

    private Integer userReligionDict;

    private String userTelephoneNumber;

    private String userPreferredMobile;

    private String userPostalAddress;

    private String userPostalCode;

    private Date userStarttime;

    private Date userEndtime;

    private String userIdCardNumber;

    private String userEmployeetype;

    private String userEmployeeNumber;

    private Date userEntrytime;

    private String userLocation;

    private Long createUserId;

    private Date createTime;

    private Long updateUserId;

    private Date updateTime;

    private Short dataSyncType;

    private Short userSyncStatus;

    private Short dataSource;

    private String dataFile;

    private Short dataIsSynced;
    
    private List<TempUserAssign> tempUserAssigns;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Integer getUserNationDict() {
        return userNationDict;
    }

    public void setUserNationDict(Integer userNationDict) {
        this.userNationDict = userNationDict;
    }

    public Integer getUserGender() {
        return userGender;
    }

    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserNationality() {
        return userNationality;
    }

    public void setUserNationality(String userNationality) {
        this.userNationality = userNationality;
    }

    public Integer getUserReligionDict() {
        return userReligionDict;
    }

    public void setUserReligionDict(Integer userReligionDict) {
        this.userReligionDict = userReligionDict;
    }

    public String getUserTelephoneNumber() {
        return userTelephoneNumber;
    }

    public void setUserTelephoneNumber(String userTelephoneNumber) {
        this.userTelephoneNumber = userTelephoneNumber;
    }

    public String getUserPreferredMobile() {
        return userPreferredMobile;
    }

    public void setUserPreferredMobile(String userPreferredMobile) {
        this.userPreferredMobile = userPreferredMobile;
    }

    public String getUserPostalAddress() {
        return userPostalAddress;
    }

    public void setUserPostalAddress(String userPostalAddress) {
        this.userPostalAddress = userPostalAddress;
    }

    public String getUserPostalCode() {
        return userPostalCode;
    }

    public void setUserPostalCode(String userPostalCode) {
        this.userPostalCode = userPostalCode;
    }

    public Date getUserStarttime() {
        return userStarttime;
    }

    public void setUserStarttime(Date userStarttime) {
        this.userStarttime = userStarttime;
    }

    public Date getUserEndtime() {
        return userEndtime;
    }

    public void setUserEndtime(Date userEndtime) {
        this.userEndtime = userEndtime;
    }

    public String getUserIdCardNumber() {
        return userIdCardNumber;
    }

    public void setUserIdCardNumber(String userIdCardNumber) {
        this.userIdCardNumber = userIdCardNumber;
    }

    public String getUserEmployeeNumber() {
        return userEmployeeNumber;
    }

    public void setUserEmployeeNumber(String userEmployeeNumber) {
        this.userEmployeeNumber = userEmployeeNumber;
    }

    public Date getUserEntrytime() {
        return userEntrytime;
    }

    public void setUserEntrytime(Date userEntrytime) {
        this.userEntrytime = userEntrytime;
    }

    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
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

    public Short getUserSyncStatus() {
        return userSyncStatus;
    }

    public void setUserSyncStatus(Short userSyncStatus) {
        this.userSyncStatus = userSyncStatus;
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
        TempUserInfo other = (TempUserInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserEmail() == null ? other.getUserEmail() == null : this.getUserEmail().equals(other.getUserEmail()))
            && (this.getUserNationDict() == null ? other.getUserNationDict() == null : this.getUserNationDict().equals(other.getUserNationDict()))
            && (this.getUserGender() == null ? other.getUserGender() == null : this.getUserGender().equals(other.getUserGender()))
            && (this.getUserBirthday() == null ? other.getUserBirthday() == null : this.getUserBirthday().equals(other.getUserBirthday()))
            && (this.getUserNationality() == null ? other.getUserNationality() == null : this.getUserNationality().equals(other.getUserNationality()))
            && (this.getUserReligionDict() == null ? other.getUserReligionDict() == null : this.getUserReligionDict().equals(other.getUserReligionDict()))
            && (this.getUserTelephoneNumber() == null ? other.getUserTelephoneNumber() == null : this.getUserTelephoneNumber().equals(other.getUserTelephoneNumber()))
            && (this.getUserPreferredMobile() == null ? other.getUserPreferredMobile() == null : this.getUserPreferredMobile().equals(other.getUserPreferredMobile()))
            && (this.getUserPostalAddress() == null ? other.getUserPostalAddress() == null : this.getUserPostalAddress().equals(other.getUserPostalAddress()))
            && (this.getUserPostalCode() == null ? other.getUserPostalCode() == null : this.getUserPostalCode().equals(other.getUserPostalCode()))
            && (this.getUserStarttime() == null ? other.getUserStarttime() == null : this.getUserStarttime().equals(other.getUserStarttime()))
            && (this.getUserEndtime() == null ? other.getUserEndtime() == null : this.getUserEndtime().equals(other.getUserEndtime()))
            && (this.getUserIdCardNumber() == null ? other.getUserIdCardNumber() == null : this.getUserIdCardNumber().equals(other.getUserIdCardNumber()))
            && (this.getUserEmployeetype() == null ? other.getUserEmployeetype() == null : this.getUserEmployeetype().equals(other.getUserEmployeetype()))
            && (this.getUserEmployeeNumber() == null ? other.getUserEmployeeNumber() == null : this.getUserEmployeeNumber().equals(other.getUserEmployeeNumber()))
            && (this.getUserEntrytime() == null ? other.getUserEntrytime() == null : this.getUserEntrytime().equals(other.getUserEntrytime()))
            && (this.getUserLocation() == null ? other.getUserLocation() == null : this.getUserLocation().equals(other.getUserLocation()))
            && (this.getCreateUserId() == null ? other.getCreateUserId() == null : this.getCreateUserId().equals(other.getCreateUserId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateUserId() == null ? other.getUpdateUserId() == null : this.getUpdateUserId().equals(other.getUpdateUserId()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getDataSyncType() == null ? other.getDataSyncType() == null : this.getDataSyncType().equals(other.getDataSyncType()))
            && (this.getUserSyncStatus() == null ? other.getUserSyncStatus() == null : this.getUserSyncStatus().equals(other.getUserSyncStatus()))
            && (this.getDataSource() == null ? other.getDataSource() == null : this.getDataSource().equals(other.getDataSource()))
            && (this.getDataFile() == null ? other.getDataFile() == null : this.getDataFile().equals(other.getDataFile()))
            && (this.getDataIsSynced() == null ? other.getDataIsSynced() == null : this.getDataIsSynced().equals(other.getDataIsSynced()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserEmail() == null) ? 0 : getUserEmail().hashCode());
        result = prime * result + ((getUserNationDict() == null) ? 0 : getUserNationDict().hashCode());
        result = prime * result + ((getUserGender() == null) ? 0 : getUserGender().hashCode());
        result = prime * result + ((getUserBirthday() == null) ? 0 : getUserBirthday().hashCode());
        result = prime * result + ((getUserNationality() == null) ? 0 : getUserNationality().hashCode());
        result = prime * result + ((getUserReligionDict() == null) ? 0 : getUserReligionDict().hashCode());
        result = prime * result + ((getUserTelephoneNumber() == null) ? 0 : getUserTelephoneNumber().hashCode());
        result = prime * result + ((getUserPreferredMobile() == null) ? 0 : getUserPreferredMobile().hashCode());
        result = prime * result + ((getUserPostalAddress() == null) ? 0 : getUserPostalAddress().hashCode());
        result = prime * result + ((getUserPostalCode() == null) ? 0 : getUserPostalCode().hashCode());
        result = prime * result + ((getUserStarttime() == null) ? 0 : getUserStarttime().hashCode());
        result = prime * result + ((getUserEndtime() == null) ? 0 : getUserEndtime().hashCode());
        result = prime * result + ((getUserIdCardNumber() == null) ? 0 : getUserIdCardNumber().hashCode());
        result = prime * result + ((getUserEmployeetype() == null) ? 0 : getUserEmployeetype().hashCode());
        result = prime * result + ((getUserEmployeeNumber() == null) ? 0 : getUserEmployeeNumber().hashCode());
        result = prime * result + ((getUserEntrytime() == null) ? 0 : getUserEntrytime().hashCode());
        result = prime * result + ((getUserLocation() == null) ? 0 : getUserLocation().hashCode());
        result = prime * result + ((getCreateUserId() == null) ? 0 : getCreateUserId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateUserId() == null) ? 0 : getUpdateUserId().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getDataSyncType() == null) ? 0 : getDataSyncType().hashCode());
        result = prime * result + ((getUserSyncStatus() == null) ? 0 : getUserSyncStatus().hashCode());
        result = prime * result + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        result = prime * result + ((getDataFile() == null) ? 0 : getDataFile().hashCode());
        result = prime * result + ((getDataIsSynced() == null) ? 0 : getDataIsSynced().hashCode());
        return result;
    }

	public String getUserEmployeetype() {
		return userEmployeetype;
	}

	public void setUserEmployeetype(String userEmployeetype) {
		this.userEmployeetype = userEmployeetype;
	}

	public void setTempUserAssigns(List<TempUserAssign> tempUserAssigns) {
		this.tempUserAssigns = tempUserAssigns;
	}

	public List<TempUserAssign> getTempUserAssigns() {
		return tempUserAssigns;
	}
}