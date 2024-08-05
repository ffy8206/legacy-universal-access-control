package com.harry.uac.common.context;

import com.harry.uac.persistence.AuthGroup;
import com.harry.uac.persistence.AuthOrg;
import com.harry.uac.persistence.AuthRole;
import com.harry.uac.persistence.AuthUser;


/**
 * A default implementation for application context
 * @author xm
 *
 */
public class DefaultAppContext implements AppContext{
	
	private AuthUser user = null;
	private AuthOrg org = null;
	private AuthRole role = null;
	private AuthGroup group = null;
	
	public DefaultAppContext() {
		
	}
	
	public DefaultAppContext(AuthUser user) {
		this.user = user;
	}
	
	public DefaultAppContext(AuthGroup group) {
		this.group = group;
	}
	
	@Override
	public AuthUser getUser() {
		// TODO Auto-generated method stub
		return user;
	}

	@Override
	public void setUser(AuthUser user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AuthOrg getOrg() {
		// TODO Auto-generated method stub
		return this.org;
	}

	@Override
	public void setOrg(AuthOrg org) {
		// TODO Auto-generated method stub
		this.org = org;
	}

	@Override
	public AuthRole getRole() {
		// TODO Auto-generated method stub
		return this.role;
	}

	@Override
	public void setRole(AuthRole role) {
		// TODO Auto-generated method stub
		this.role = role;
	}

	@Override
	public AuthGroup getGroup() {
		// TODO Auto-generated method stub
		return this.group;
	}

	@Override
	public void setGroup(AuthGroup group) {
		// TODO Auto-generated method stub
		this.group = group;
	}

}
