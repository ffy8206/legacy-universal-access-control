/**
 * 
 */
package com.harry.uac.action;

import java.util.Date;

import com.harry.uac.common.Consts;
import com.harry.uac.common.context.AppContextHolder;
import com.harry.uac.common.exception.AppException;
import com.harry.uac.persistence.AuthUser;
import com.harry.uac.service.ILoginService;
import com.harry.uac.service.IUserService;
import com.harry.uac.vo.AjaxDone;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springside.modules.utils.Encodes;

/**
 * @author wangsg
 * 
 */
public class LoginAction extends ActionBase {

    @Autowired
    private ILoginService loginService;

    @Autowired
    private IUserService userService;

    private AuthUser user;
    private String gotoUrl = Consts.DEFAULT_LOGIN_DISPLAY_PAGE;

    @Override
    public void validate() {
	// if (null != user) {
	// if (null == user.getName()
	// || "".equals(user.getName().trim())) {
	// this.addFieldError("user.name", "UserName is required!");
	// }
	// if (null == user.getPassword()
	// || "".equals(user.getPassword().trim())) {
	// this.addFieldError("user.password", "Password is required!");
	// }
	// } else {
	// this.addFieldError("user.error", "user binding error");
	// }
    }

    @Action(value = "login", results = { @Result(name = "success", location = "${gotoUrl}", type = "redirectAction") })
    public String loginFromPage() throws AppException {
	if (userLogin()) {
	    if (this.user.getPasswordMofidyFlag() == 0)
		setSessionObj(Consts.USER_SESSION_FORCE_CHANGEPWD_KEY, true);
	    return SUCCESS;
	}
	this.addFieldError("user.userUid", getText("error.usr.pas.wrong"));
	return INPUT;
    }

    @Action(value = "showlogindialog", results = { @Result(name = "showlogindialog", location = "../content/global/login_dialog.jsp") })
    public String showLoginDialog() {
	return "showlogindialog";
    }

    @Action(value = "loginfromdialog")
    public String loginFromDialog() throws AppException {
	AjaxDone parameAjaxDone = null;

	if (userLogin()) {
	    parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, getText("login.success")).navTabId(
		            (String) getParameterValue("navTabId")).build();
	} else {
	    parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_ERROR, getText("login.fail")).navTabId(
		            (String) getParameterValue("navTabId")).build();
	}

	return ajaxForward(parameAjaxDone);
    }

    @Action(value = "logout", results = { @Result(name = "success", location = "login.jsp") })
    public String logout() {
	this.getSession().clear();
	AppContextHolder.clear();
	return SUCCESS;
    }

    @Action(value = "forgetPassword", interceptorRefs = { @InterceptorRef(value = "defaultStack") }, results = { @Result(name = "success", location = "change_password.jsp") })
    public String forgetPassword() {
	return SUCCESS;
    }

    private boolean userLogin() {
	try {
	    AuthUser loggedUser = loginService.checkUserPassword(user.getUserUid(), user.getUserPassword());
	    if (null != loggedUser) {
		// set usr last login time
		loggedUser.setLastLoginTime(new Date());
		userService.updateByPrimaryKey(loggedUser);
		this.user = loggedUser;
		setSessionObj(Consts.USER_SESSION_KEY, loggedUser);
		// AppContext context = new DefaultAppContext();
		// context.setUser(user);
		// AppContextHolder.setContext(context);
		return true;
	    }
	    return false;
	} catch (AppException e) {
	    return false;
	}
    }

    private static final long serialVersionUID = 2463316215591191842L;

    public AuthUser getUser() {
	return user;
    }

    public void setUser(AuthUser user) {
	this.user = user;
    }

    public String getGotoUrl() {
	return gotoUrl;
    }

    public void setGotoUrl(String gotoUrl) {
	this.gotoUrl = gotoUrl;
    }

}
