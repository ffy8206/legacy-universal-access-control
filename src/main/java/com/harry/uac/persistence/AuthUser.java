package com.harry.uac.persistence;

import java.util.Date;
import java.util.List;

public class AuthUser {
    private Long userId;

    private String userName;
    
    private String userFirstname;
    
    private String userLastname;

    private String userUid;

    private String userPassword;
    
    private String userSalt;

    private String userSurname;

    private String userDescription;

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

    private String userFaxNumber;

    private Date userStarttime;

    private Date userEndtime;

    private Integer userStatus;

    private Date userPwdModifiedDate;

    private String userIdCardNumber;

    private String userUsertype;

    private String userEmployeeNumber;

    private Integer userLevelDict;

    private Integer userCategory;

    private Date userEntrytime;

    private Integer userPositionLevelDict;

    private String userLocation;

    private String userRemark;

    private Long createUserId;

    private Date createTime;

    private Long updateUserId;
    
    private String userEmployeetype;

    private Date updateTime;

    private byte[] userPhoto;
    
    private Date lastLoginTime;   
    
    /**
     * 0:系统生成的密码（初始化或密码重置产生）
     * 1:用户自助修改的密码
     */
    private int passwordModifyFlag;
    
    private String tag;
    
    //add by wangsg
    private List<AuthUserRole> userRoleList;
    
    private List<AuthUserGroup> userGroupList;
    
    private List<AuthOrgUser> orgUserList;
    
    private String newPassword;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getUserFirstname() {
        return userFirstname;
    }

    public void setUserFirstname(String userFirstname) {
        this.userFirstname = userFirstname;
    }

    public String getUserLastname() {
        return userLastname;
    }

    public void setUserLastname(String userLastname) {
        this.userLastname = userLastname;
    }

    public String getUserUid() {
        return userUid;
    }

    public void setUserUid(String userUid) {
        this.userUid = userUid;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    
    public String getUserSalt() {
        return userSalt;
    }

    public void setUserSalt(String userSalt) {
        this.userSalt = userSalt;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription;
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

    public String getUserFaxNumber() {
        return userFaxNumber;
    }

    public void setUserFaxNumber(String userFaxNumber) {
        this.userFaxNumber = userFaxNumber;
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

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public Date getUserPwdModifiedDate() {
        return userPwdModifiedDate;
    }

    public void setUserPwdModifiedDate(Date userPwdModifiedDate) {
        this.userPwdModifiedDate = userPwdModifiedDate;
    }

    public String getUserIdCardNumber() {
        return userIdCardNumber;
    }

    public void setUserIdCardNumber(String userIdCardNumber) {
        this.userIdCardNumber = userIdCardNumber;
    }

    public String getUserUsertype() {
        return userUsertype;
    }

    public void setUserUsertype(String userUsertype) {
        this.userUsertype = userUsertype;
    }

    public String getUserEmployeeNumber() {
        return userEmployeeNumber;
    }

    public void setUserEmployeeNumber(String userEmployeeNumber) {
        this.userEmployeeNumber = userEmployeeNumber;
    }

    public Integer getUserLevelDict() {
        return userLevelDict;
    }

    public void setUserLevelDict(Integer userLevelDict) {
        this.userLevelDict = userLevelDict;
    }

    public Integer getUserCategory() {
        return userCategory;
    }

    public void setUserCategory(Integer userCategory) {
        this.userCategory = userCategory;
    }

    public Date getUserEntrytime() {
        return userEntrytime;
    }

    public void setUserEntrytime(Date userEntrytime) {
        this.userEntrytime = userEntrytime;
    }

    public Integer getUserPositionLevelDict() {
        return userPositionLevelDict;
    }

    public void setUserPositionLevelDict(Integer userPositionLevelDict) {
        this.userPositionLevelDict = userPositionLevelDict;
    }

    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    public String getUserRemark() {
        return userRemark;
    }

    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark;
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

    public byte[] getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(byte[] userPhoto) {
        this.userPhoto = userPhoto;
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
        AuthUser other = (AuthUser) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserFirstname() == null ? other.getUserFirstname() == null : this.getUserFirstname().equals(other.getUserFirstname()))
            && (this.getUserLastname() == null ? other.getUserLastname() == null : this.getUserLastname().equals(other.getUserLastname()))
            && (this.getUserUid() == null ? other.getUserUid() == null : this.getUserUid().equals(other.getUserUid()))
            && (this.getUserPassword() == null ? other.getUserPassword() == null : this.getUserPassword().equals(other.getUserPassword()))
            && (this.getUserSurname() == null ? other.getUserSurname() == null : this.getUserSurname().equals(other.getUserSurname()))
            && (this.getUserDescription() == null ? other.getUserDescription() == null : this.getUserDescription().equals(other.getUserDescription()))
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
            && (this.getUserFaxNumber() == null ? other.getUserFaxNumber() == null : this.getUserFaxNumber().equals(other.getUserFaxNumber()))
            && (this.getUserStarttime() == null ? other.getUserStarttime() == null : this.getUserStarttime().equals(other.getUserStarttime()))
            && (this.getUserEndtime() == null ? other.getUserEndtime() == null : this.getUserEndtime().equals(other.getUserEndtime()))
            && (this.getUserStatus() == null ? other.getUserStatus() == null : this.getUserStatus().equals(other.getUserStatus()))
            && (this.getUserPwdModifiedDate() == null ? other.getUserPwdModifiedDate() == null : this.getUserPwdModifiedDate().equals(other.getUserPwdModifiedDate()))
            && (this.getUserIdCardNumber() == null ? other.getUserIdCardNumber() == null : this.getUserIdCardNumber().equals(other.getUserIdCardNumber()))
            && (this.getUserUsertype() == null ? other.getUserUsertype() == null : this.getUserUsertype().equals(other.getUserUsertype()))
            && (this.getUserEmployeeNumber() == null ? other.getUserEmployeeNumber() == null : this.getUserEmployeeNumber().equals(other.getUserEmployeeNumber()))
            && (this.getUserLevelDict() == null ? other.getUserLevelDict() == null : this.getUserLevelDict().equals(other.getUserLevelDict()))
            && (this.getUserCategory() == null ? other.getUserCategory() == null : this.getUserCategory().equals(other.getUserCategory()))
            && (this.getUserEntrytime() == null ? other.getUserEntrytime() == null : this.getUserEntrytime().equals(other.getUserEntrytime()))
            && (this.getUserPositionLevelDict() == null ? other.getUserPositionLevelDict() == null : this.getUserPositionLevelDict().equals(other.getUserPositionLevelDict()))
            && (this.getUserLocation() == null ? other.getUserLocation() == null : this.getUserLocation().equals(other.getUserLocation()))
            && (this.getUserRemark() == null ? other.getUserRemark() == null : this.getUserRemark().equals(other.getUserRemark()))
            && (this.getCreateUserId() == null ? other.getCreateUserId() == null : this.getCreateUserId().equals(other.getCreateUserId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateUserId() == null ? other.getUpdateUserId() == null : this.getUpdateUserId().equals(other.getUpdateUserId()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUserPhoto() == null ? other.getUserPhoto() == null : this.getUserPhoto().equals(other.getUserPhoto()))
        	&& (this.getLastLoginTime() == null ? other.getLastLoginTime() == null : this.getLastLoginTime().equals(other.getLastLoginTime()))
        	&& (this.getPasswordMofidyFlag() == other.getPasswordMofidyFlag());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserFirstname() == null) ? 0 : getUserFirstname().hashCode());
        result = prime * result + ((getUserLastname() == null) ? 0 : getUserLastname().hashCode());
        result = prime * result + ((getUserUid() == null) ? 0 : getUserUid().hashCode());
        result = prime * result + ((getUserPassword() == null) ? 0 : getUserPassword().hashCode());
        result = prime * result + ((getUserSurname() == null) ? 0 : getUserSurname().hashCode());
        result = prime * result + ((getUserDescription() == null) ? 0 : getUserDescription().hashCode());
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
        result = prime * result + ((getUserFaxNumber() == null) ? 0 : getUserFaxNumber().hashCode());
        result = prime * result + ((getUserStarttime() == null) ? 0 : getUserStarttime().hashCode());
        result = prime * result + ((getUserEndtime() == null) ? 0 : getUserEndtime().hashCode());
        result = prime * result + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode());
        result = prime * result + ((getUserPwdModifiedDate() == null) ? 0 : getUserPwdModifiedDate().hashCode());
        result = prime * result + ((getUserIdCardNumber() == null) ? 0 : getUserIdCardNumber().hashCode());
        result = prime * result + ((getUserUsertype() == null) ? 0 : getUserUsertype().hashCode());
        result = prime * result + ((getUserEmployeeNumber() == null) ? 0 : getUserEmployeeNumber().hashCode());
        result = prime * result + ((getUserLevelDict() == null) ? 0 : getUserLevelDict().hashCode());
        result = prime * result + ((getUserCategory() == null) ? 0 : getUserCategory().hashCode());
        result = prime * result + ((getUserEntrytime() == null) ? 0 : getUserEntrytime().hashCode());
        result = prime * result + ((getUserPositionLevelDict() == null) ? 0 : getUserPositionLevelDict().hashCode());
        result = prime * result + ((getUserLocation() == null) ? 0 : getUserLocation().hashCode());
        result = prime * result + ((getUserRemark() == null) ? 0 : getUserRemark().hashCode());
        result = prime * result + ((getCreateUserId() == null) ? 0 : getCreateUserId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateUserId() == null) ? 0 : getUpdateUserId().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUserPhoto() == null) ? 0 : getUserPhoto().hashCode());
        result = prime * result + ((getLastLoginTime() == null) ? 0 : getLastLoginTime().hashCode());
        result = prime * result + (Integer.valueOf(getPasswordMofidyFlag()).hashCode());
        return result;
    }

	public String getUserEmployeetype() {
		return userEmployeetype;
	}

	public void setUserEmployeetype(String userEmployeetype) {
		this.userEmployeetype = userEmployeetype;
	}

	public List<AuthUserRole> getUserRoleList() {
		return userRoleList;
	}

	public void setUserRoleList(List<AuthUserRole> userRoleList) {
		this.userRoleList = userRoleList;
	}

	public List<AuthUserGroup> getUserGroupList() {
		return userGroupList;
	}

	public void setUserGroupList(List<AuthUserGroup> userGroupList) {
		this.userGroupList = userGroupList;
	}

	public List<AuthOrgUser> getOrgUserList() {
		return orgUserList;
	}

	public void setOrgUserList(List<AuthOrgUser> orgUserList) {
		this.orgUserList = orgUserList;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setPasswordMofidyFlag(int passwordMofidyFlag) {
		this.passwordModifyFlag = passwordMofidyFlag;
	}

	public int getPasswordMofidyFlag() {
		return passwordModifyFlag;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
	
	
}