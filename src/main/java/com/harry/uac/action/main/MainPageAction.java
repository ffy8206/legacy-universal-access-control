package com.harry.uac.action.main;

import com.harry.uac.action.ActionBase;
import com.harry.uac.common.Consts;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.sun.tools.javac.util.List;

/**
 * main page display current Org person information
 * 
 * @author wangsg
 * 
 */
@Results({ @Result(name = "success", location = "baseLayout", type = "tiles"), })
public class MainPageAction extends ActionBase {
    private List<String> menuDisplay;
    private List<String> menuNotDisplay;
    private Boolean ifChangePassword;

    @Override
    public void validate() {
    }

    @Override
    public String execute() throws Exception {
	ifChangePassword = false;
	if (this.getSession().get(Consts.USER_SESSION_FORCE_CHANGEPWD_KEY) != null
	                && (Boolean) this.getSession().get(Consts.USER_SESSION_FORCE_CHANGEPWD_KEY) == true)
	    this.ifChangePassword = true;
	return SUCCESS;
    }

    /**
     * check if a menu should be displayed based on user`s role
     * 
     * @param menuId
     * @return
     */
    public boolean isMenuDisplay(String menuId) {
	if (this.menuDisplay.size() > 0) {
	    if (menuId == null || menuId.equals(""))
		return false;
	    return this.menuDisplay.contains(menuId);
	} else if (this.menuNotDisplay.size() > 0) {
	    if (menuId == null || menuId.equals(""))
		return true;
	    return !this.menuNotDisplay.contains(menuId);
	}
	return true;
    }

    public void setMenuDisplay(List<String> menuDisplay) {
	this.menuDisplay = menuDisplay;
    }

    public List<String> getMenuDisplay() {
	return menuDisplay;
    }

    public void setMenuNotDisplay(List<String> menuNotDisplay) {
	this.menuNotDisplay = menuNotDisplay;
    }

    public List<String> getMenuNotDisplay() {
	return menuNotDisplay;
    }

    public void setIfChangePassword(Boolean ifChangePassword) {
	this.ifChangePassword = ifChangePassword;
    }

    public Boolean getIfChangePassword() {
	return ifChangePassword;
    }

    private static final long serialVersionUID = -1646286012449868900L;
}
