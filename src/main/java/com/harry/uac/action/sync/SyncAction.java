package com.harry.uac.action.sync;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;

import com.harry.uac.action.ActionBase;
import com.harry.uac.common.Consts;
import com.harry.uac.common.exception.BusinessException;
import com.harry.uac.common.util.OnePage;
import com.harry.uac.common.util.Page;
import com.harry.uac.persistence.SyncDisplayInfo;
import com.harry.uac.persistence.TempUserInfoExample;
import com.harry.uac.service.ISyncUserService;
import com.harry.uac.vo.AjaxDone;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

public class SyncAction extends ActionBase {

    @Autowired
    private ISyncUserService syncService;

    OnePage<SyncDisplayInfo> pageData;

    @Action(value = "querySyncUserInfo", results = { @Result(name = "success", location = "sync_user_list.jsp") })
    public String querySyncUserInfo() {
	loadPerPage();
	TempUserInfoExample criteria = searchCondition();
	pageData = syncService.onePageTempUser(criteria);
	return SUCCESS;
    }

    @Action(value = "confirmSyncUser", results = { @Result(name = "success", location = "../user/user_add.jsp") })
    public String confirmSyncUser() {
	if (getParameterValue("empId") != null && getParameterValue("syncTime") != null) {
	    String employeeNumber = (String) getParameterValue("empId");
	    String syncDate = (String) getParameterValue("syncTime");
	    Date sDate = null;
	    try {
		sDate = Consts.sFormat.parse(syncDate);
	    } catch (ParseException e) {
		throw new BusinessException("时间格式异常", e);
	    }
	    syncService.syncTempUsers(employeeNumber, sDate);

	    syncService.syncTempUserAssign(employeeNumber, sDate);
	}
	return SUCCESS;
    }

    @Action(value = "disableSyncUser")
    public String disableSyncUser() {
	String[] syncArr = (String[]) getParamenterArray("syncId");
	syncService.syncDisableUsers(Arrays.asList(syncArr));
	AjaxDone parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, getText("global.save.success")).build();
	return ajaxForward(parameAjaxDone);
    }

    /**
	 * 
	 */
    private TempUserInfoExample searchCondition() {
	TempUserInfoExample criteria = new TempUserInfoExample();
	// initialize search condition
	TempUserInfoExample.Criteria c = criteria.createCriteria();
	c.andDataIsSyncedNotEqualTo(Consts.TEMP_USER_SYNCED);

	if (getParameterValue("criteria_userName") != null) {
	    c.andUserNameEqualTo((String) getParameterValue("criteria_userName"));
	}

	// initialize pagination parameter
	int pageNum = 1, numPerPage = 20;
	if (getParameterValue("pageNum") != null) {
	    pageNum = Integer.valueOf((String) getParameterValue("pageNum"));
	    numPerPage = Integer.valueOf((String) getParameterValue("numPerPage"));
	}
	Page page = new Page((pageNum - 1) * numPerPage + 1, numPerPage);
	criteria.setPage(page);
	return criteria;
    }

    private static final long serialVersionUID = -6621391575222956537L;

    public OnePage<SyncDisplayInfo> getPageData() {
	return pageData;
    }

    public void setPageData(OnePage<SyncDisplayInfo> pageData) {
	this.pageData = pageData;
    }

}
