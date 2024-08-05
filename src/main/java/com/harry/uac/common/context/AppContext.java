package com.harry.uac.common.context;

import com.harry.uac.persistence.AuthGroup;
import com.harry.uac.persistence.AuthOrg;
import com.harry.uac.persistence.AuthRole;
import com.harry.uac.persistence.AuthUser;

/**
 * an interface for application context which stores global context data
 * @author xm
 *
 */
public interface AppContext {
	public AuthUser getUser();
	public void setUser(AuthUser user);
	public AuthOrg getOrg();
	public void setOrg(AuthOrg org);
	public AuthRole getRole();
	public void setRole(AuthRole role);
	public AuthGroup getGroup();
	public void setGroup(AuthGroup group);
}
