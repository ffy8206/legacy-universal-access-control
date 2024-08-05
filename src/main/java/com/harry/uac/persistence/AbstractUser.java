package com.harry.uac.persistence;

public class AbstractUser {
    // must attribute
    private String uid;
    private String cn;
    // may attribute
    private String email;
    private String userPassword;
    private String AppAuthnation;
    private String AppAuthgender;
    private String AppAuthbirthday;
    private String c;
    private String AppAuthreligion;
    private String AppAuthpreferredMobile;
    private String AppAuthstartTime;
    private String AppAuthstatus;
    private String AppAuthpasswordModifieddate;
    private String AppAuthidCardNumber;
    private String AppAuthmemberOf;
    private String AppAuthRole;
    private String AppAuthreserve1;
    private String AppAuthreserve2;
    private String AppAuthreserve3;
    private String AppAuthreserve4;
    private String AppAuthreserve5;
    private String AppAuthTag;

    public String getUid() {
	return uid;
    }

    public void setUid(String uid) {
	this.uid = uid;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getAppAuthnation() {
	return AppAuthnation;
    }

    public void setAppAuthnation(String appAuthnation) {
	AppAuthnation = appAuthnation;
    }

    public String getAppAuthgender() {
	return AppAuthgender;
    }

    public void setAppAuthgender(String appAuthgender) {
	AppAuthgender = appAuthgender;
    }

    public String getAppAuthbirthday() {
	return AppAuthbirthday;
    }

    public void setAppAuthbirthday(String appAuthbirthday) {
	AppAuthbirthday = appAuthbirthday;
    }

    public String getCn() {
	return cn;
    }

    public void setCn(String cn) {
	this.cn = cn;
    }

    public String getC() {
	return c;
    }

    public void setC(String c) {
	this.c = c;
    }

    public String getAppAuthreligion() {
	return AppAuthreligion;
    }

    public void setAppAuthreligion(String appAuthreligion) {
	AppAuthreligion = appAuthreligion;
    }

    public String getAppAuthpreferredMobile() {
	return AppAuthpreferredMobile;
    }

    public void setAppAuthpreferredMobile(String appAuthpreferredMobile) {
	AppAuthpreferredMobile = appAuthpreferredMobile;
    }

    public String getAppAuthstartTime() {
	return AppAuthstartTime;
    }

    public void setAppAuthstartTime(String appAuthstartTime) {
	AppAuthstartTime = appAuthstartTime;
    }

    public String getAppAuthstatus() {
	return AppAuthstatus;
    }

    public void setAppAuthstatus(String appAuthstatus) {
	AppAuthstatus = appAuthstatus;
    }

    public String getAppAuthpasswordModifieddate() {
	return AppAuthpasswordModifieddate;
    }

    public void setAppAuthpasswordModifieddate(String appAuthpasswordModifieddate) {
	AppAuthpasswordModifieddate = appAuthpasswordModifieddate;
    }

    public String getAppAuthidCardNumber() {
	return AppAuthidCardNumber;
    }

    public void setAppAuthidCardNumber(String appAuthidCardNumber) {
	AppAuthidCardNumber = appAuthidCardNumber;
    }

    public String getAppAuthmemberOf() {
	return AppAuthmemberOf;
    }

    public void setAppAuthmemberOf(String appAuthmemberOf) {
	AppAuthmemberOf = appAuthmemberOf;
    }

    public String getAppAuthRole() {
	return AppAuthRole;
    }

    public void setAppAuthRole(String appAuthRole) {
	AppAuthRole = appAuthRole;
    }

    public String getAppAuthreserve1() {
	return AppAuthreserve1;
    }

    public void setAppAuthreserve1(String appAuthreserve1) {
	AppAuthreserve1 = appAuthreserve1;
    }

    public String getAppAuthreserve2() {
	return AppAuthreserve2;
    }

    public void setAppAuthreserve2(String appAuthreserve2) {
	AppAuthreserve2 = appAuthreserve2;
    }

    public String getAppAuthreserve3() {
	return AppAuthreserve3;
    }

    public void setAppAuthreserve3(String appAuthreserve3) {
	AppAuthreserve3 = appAuthreserve3;
    }

    public String getAppAuthreserve4() {
	return AppAuthreserve4;
    }

    public void setAppAuthreserve4(String appAuthreserve4) {
	AppAuthreserve4 = appAuthreserve4;
    }

    public String getAppAuthreserve5() {
	return AppAuthreserve5;
    }

    public void setAppAuthreserve5(String appAuthreserve5) {
	AppAuthreserve5 = appAuthreserve5;
    }

    public String getAppAuthTag() {
	return AppAuthTag;
    }

    public void setAppAuthTag(String appAuthTag) {
	AppAuthTag = appAuthTag;
    }

    public String getUserPassword() {
	return userPassword;
    }

    public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
    }

    public AbstractUser() {

    }

    public AbstractUser(String uid, String cn) {
	super();
	this.uid = uid;
	this.cn = cn;
    }
}
