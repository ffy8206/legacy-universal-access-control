package com.harry.uac.persistence;

import java.text.ParseException;
import java.util.Date;

import com.harry.uac.common.Consts;

public class SyncDisplayInfo {

    private String tempUserId;

    private String employeeNumber;

    private String employeeName;

    private String userUpdate;

    private String userSyncType;

    private String userCreateTime;

    private String assUpdate;

    private String assCreateTime;

    public String getTempUserId() {
	return tempUserId;
    }

    public void setTempUserId(String tempUserId) {
	this.tempUserId = tempUserId;
    }

    public String getEmployeeNumber() {
	return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
	this.employeeNumber = employeeNumber;
    }

    public String getEmployeeName() {
	return employeeName;
    }

    public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
    }

    public String getUserUpdate() {
	String ret = "";
	if (userUpdate != null) {
	    ret = Consts.SYNC_CONSTS_YES;
	} else {
	    ret = Consts.SYNC_CONSTS_NO;
	}
	return ret;
    }

    public void setUserUpdate(String userUpdate) {
	this.userUpdate = userUpdate;
    }

    public String getUserSyncType() {
	return Consts.SYNC_CONSTS_TYPE_MAP.get(userSyncType);
    }

    public void setUserSyncType(String userSyncType) {
	this.userSyncType = userSyncType;
    }

    public String getUserCreateTime() {
	try {
	    boolean res = false;
	    if (userCreateTime != null && assCreateTime != null) {
		Date u = Consts.sFormat.parse(userCreateTime);
		Date a = Consts.sFormat.parse(assCreateTime);
		if (u.compareTo(a) < 0) {
		    res = true;
		}
	    }

	    if (userCreateTime == null || res) {
		userCreateTime = assCreateTime;
	    }
	} catch (ParseException e) {
	}

	return userCreateTime;
    }

    public void setUserCreateTime(String userCreateTime) {
	this.userCreateTime = userCreateTime;
    }

    public String getAssUpdate() {
	String ret = "";
	if (assUpdate != null) {
	    ret = Consts.SYNC_CONSTS_YES;
	} else {
	    ret = Consts.SYNC_CONSTS_NO;
	}
	return ret;
    }

    public void setAssUpdate(String assUpdate) {
	this.assUpdate = assUpdate;
    }

    public String getAssCreateTime() {
	return assCreateTime;
    }

    public void setAssCreateTime(String assCreateTime) {
	this.assCreateTime = assCreateTime;
    }
}
