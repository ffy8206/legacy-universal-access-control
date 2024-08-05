package com.harry.uac.action.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.harry.uac.action.ActionBase;
import com.harry.uac.common.Consts;
import com.harry.uac.common.context.AppContextHolder;
import com.harry.uac.persistence.AuthUser;
import com.harry.uac.persistence.UserPrivilege;
import com.harry.uac.service.IUserHelpService;
import com.harry.uac.vo.AjaxDone;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

public class UserHelpAction extends ActionBase {

    @Autowired
    private IUserHelpService userHelpService;

    private AuthUser user;

    private String rel;

    private String user_confirm_password;

    private String msgTrigger;

    private List<UserPrivilege> privilegeList;

    @Action(value = "viewUser", results = { @Result(name = "success", location = "view_user.jsp") })
    public String viewUser() {
	Long userId = AppContextHolder.getContext().getUser().getUserId();
	user = userHelpService.findUser(userId);
	return SUCCESS;
    }

    @Action(value = "changePassword", results = { @Result(name = "success", location = "change_password.jsp") })
    public String changePassword() {
	this.rel = "change_password";
	return SUCCESS;
    }

    @Action(value = "forceChangePassword", results = { @Result(name = "success", location = "change_password.jsp") })
    public String forceChangePassword() {
	this.rel = "force_change_password";
	return SUCCESS;
    }

    @Action(value = "savePassword")
    public String savePassword() {
	String navTab = (String) getParameterValue("navTabId");
	user.setUserId(AppContextHolder.getContext().getUser().getUserId());
	AjaxDone parameAjaxDone = null;
	if (userHelpService.savePassword(user)) {
	    parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, getText("global.update.success")).navTabId(navTab)
		            .build();
	} else {
	    parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_ERROR, getText("error.userhelp.password.wrong"))
		            .build();
	}
	return ajaxForward(parameAjaxDone);
    }

    @Action(value = "appPrivilege", results = { @Result(name = "success", location = "user_app_privilege.jsp") })
    public String appPrivilege() {
	// msgTrigger = userHelpService.getTrigger();
	privilegeList = userHelpService.findUserApplicationPrivileges();
	return SUCCESS;
    }

    @Action(value = "saveMessageTrigger")
    public String saveMessageTrigger() {
	String value = null;
	if (getParameterValue("messageTrigger") != null) {
	    value = Consts.USER_MESSAGE_ON;
	} else {
	    value = Consts.USER_MESSAGE_OFF;
	}

	Map<String, String> valMap = new HashMap<String, String>();
	valMap.put("messge_trigger", value);
	AjaxDone parameAjaxDone = null;
	// if (userHelpService.saveTrigger(valMap)) {
	// parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, getText("global.update.success"))
	// .navTabId("org_list").build();
	// } else {
	// parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_ERROR, getText("global.update.fail"))
	// .navTabId("org_list").build();
	// }
	return ajaxForward(parameAjaxDone);
    }

    /**
	 * 
	 */
    private static final long serialVersionUID = -2766780811955988658L;

    public AuthUser getUser() {
	return user;
    }

    public void setUser(AuthUser user) {
	this.user = user;
    }

    public String getRel() {
	return rel;
    }

    public void setRel(String rel) {
	this.rel = rel;
    }

    public String getUser_confirm_password() {
	return user_confirm_password;
    }

    public void setUser_confirm_password(String user_confirm_password) {
	this.user_confirm_password = user_confirm_password;
    }

    public String getMsgTrigger() {
	return msgTrigger;
    }

    public void setMsgTrigger(String msgTrigger) {
	this.msgTrigger = msgTrigger;
    }

    public List<UserPrivilege> getPrivilegeList() {
	return privilegeList;
    }

    public void setPrivilegeList(List<UserPrivilege> privilegeList) {
	this.privilegeList = privilegeList;
    }

}
