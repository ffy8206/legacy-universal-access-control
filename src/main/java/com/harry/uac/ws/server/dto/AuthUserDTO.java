package com.harry.uac.ws.server.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.harry.uac.ws.server.WsConstants;

/**
 * Web Service User DTO.
 * 
 * Only transfer properties that external interface needed. uses JAXB 2.0 annotation to mark JAVA-XML mapping.
 * 
 * @author wangding
 */
@XmlRootElement
@XmlType(name = "AuthUser", namespace = WsConstants.NS)
public class AuthUserDTO {

    private String userName;

    private String userFirstname;

    private String userLastname;

    private String userUid;

    private String userPassword;

    private String userEmail;

    private Integer userGender;

    private String userGenderDisp;

    private Date userBirthday;

    private String userTelephoneNumber;

    private Integer userPositionLevelDict;

    private String userPositionLevelDisp;
    
    private byte[] userPhoto;

    private AuthOrgDTO userOrg;
    
    private String userRemark;
    
    private String userDescription;
    
    // 附加属性
    private String userNationality;

    private Integer userReligionDict;

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

    private String userLocation;

    public String getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription;
    }

    public String getUserRemark() {
        return userRemark;
    }

    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark;
    }

    public String getUserGenderDisp() {
        return userGenderDisp;
    }

    public void setUserGenderDisp(String userGenderDisp) {
        this.userGenderDisp = userGenderDisp;
    }

    public String getUserTelephoneNumber() {
        return userTelephoneNumber;
    }

    public void setUserTelephoneNumber(String userTelephoneNumber) {
        this.userTelephoneNumber = userTelephoneNumber;
    }

    public Integer getUserPositionLevelDict() {
        return userPositionLevelDict;
    }

    public void setUserPositionLevelDict(Integer userPositionLevelDict) {
        this.userPositionLevelDict = userPositionLevelDict;
    }

    public String getUserPositionLevelDisp() {
        return userPositionLevelDisp;
    }

    public void setUserPositionLevelDisp(String userPositionLevelDisp) {
        this.userPositionLevelDisp = userPositionLevelDisp;
    }

    public AuthOrgDTO getUserOrg() {
        return userOrg;
    }

    public void setUserOrg(AuthOrgDTO userOrg) {
        this.userOrg = userOrg;
    }

    public String getUserPassword() {
	return userPassword;
    }

    public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
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

    public String getUserEmail() {
	return userEmail;
    }

    public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
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
    
    public byte[] getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(byte[] userPhoto) {
        this.userPhoto = userPhoto;
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

    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    /**
     * for log output
     */
    @Override
    public String toString() {
	return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((userUid == null) ? 0: userUid.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	AuthUserDTO other = (AuthUserDTO) obj;
	if (userUid == null) {
	    if (other.userUid != null)
		return false;
	} else if (!userUid.equals(other.userUid))
	    return false;
	return true;
    }

}
