package com.harry.uac.common.interceptor;

import java.util.Map;

import com.harry.uac.common.Consts;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * check the authority of user, just display right page to right person
 * 
 * @author wangsg
 * 
 */
public class AuthorityInterceptor extends AbstractInterceptor {

    @Override
    public String intercept(ActionInvocation arg0) throws Exception {
	ActionContext actionContext = ActionContext.getContext();
	String retAction = Consts.TO_NORIGHTS_PAGE;
	Map<String, Object> session = (Map<String, Object>) actionContext.getSession();
	// AbstractUser user = (AbstractUser) session.get(Consts.USER_SESSION_KEY);
	// if (user != null && "admin".equals(user.getCn())) {
	// retAction = arg0.invoke();
	// }
	return retAction;
    }

    private static final long serialVersionUID = 7224545677679020012L;
}
