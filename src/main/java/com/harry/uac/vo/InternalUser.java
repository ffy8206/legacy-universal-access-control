package com.harry.uac.vo;

import com.harry.uac.persistence.AbstractUser;

public class InternalUser extends AbstractUser {
    // must attribute
    private String employeeNumber;
    private String o;
    // may attribute
    private String AppAuthlevel;
    private String AppAuthlevelName;
    private String AppAuthcategory;
    private String AppAuthfunction;
    private String AppAuthdisplayOrder;
    private String AppAuthentryTime;
    private String AppAuthworkOrg;
    private String AppAuthduty;
    private String AppAuthpositionLevel;
    private String AppAuthemployeeType;

    public String getEmployeeNumber() {
	return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
	this.employeeNumber = employeeNumber;
    }

    public String getO() {
	return o;
    }

    public void setO(String o) {
	this.o = o;
    }

    public String getAppAuthlevel() {
	return AppAuthlevel;
    }

    public void setAppAuthlevel(String appAuthlevel) {
	AppAuthlevel = appAuthlevel;
    }

    public String getAppAuthlevelName() {
	return AppAuthlevelName;
    }

    public void setAppAuthlevelName(String appAuthlevelName) {
	AppAuthlevelName = appAuthlevelName;
    }

    public String getAppAuthcategory() {
	return AppAuthcategory;
    }

    public void setAppAuthcategory(String appAuthcategory) {
	AppAuthcategory = appAuthcategory;
    }

    public String getAppAuthfunction() {
	return AppAuthfunction;
    }

    public void setAppAuthfunction(String appAuthfunction) {
	AppAuthfunction = appAuthfunction;
    }

    public String getAppAuthdisplayOrder() {
	return AppAuthdisplayOrder;
    }

    public void setAppAuthdisplayOrder(String appAuthdisplayOrder) {
	AppAuthdisplayOrder = appAuthdisplayOrder;
    }

    public String getAppAuthentryTime() {
	return AppAuthentryTime;
    }

    public void setAppAuthentryTime(String appAuthentryTime) {
	AppAuthentryTime = appAuthentryTime;
    }

    public String getAppAuthworkOrg() {
	return AppAuthworkOrg;
    }

    public void setAppAuthworkOrg(String appAuthworkOrg) {
	AppAuthworkOrg = appAuthworkOrg;
    }

    public String getAppAuthduty() {
	return AppAuthduty;
    }

    public void setAppAuthduty(String appAuthduty) {
	AppAuthduty = appAuthduty;
    }

    public String getAppAuthpositionLevel() {
	return AppAuthpositionLevel;
    }

    public void setAppAuthpositionLevel(String appAuthpositionLevel) {
	AppAuthpositionLevel = appAuthpositionLevel;
    }

    public String getAppAuthemployeeType() {
	return AppAuthemployeeType;
    }

    public void setAppAuthemployeeType(String appAuthemployeeType) {
	AppAuthemployeeType = appAuthemployeeType;
    }

    public InternalUser() {

    }

}
