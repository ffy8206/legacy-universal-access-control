package com.harry.uac.common.interceptor;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.harry.uac.persistence.AuthUser;
import com.harry.uac.service.IUserService;
import org.apache.log4j.Logger;
import org.apache.struts2.StrutsStatics;
import org.springframework.dao.DataAccessException;

import com.harry.uac.common.Consts;
import com.harry.uac.common.context.AppContext;
import com.harry.uac.common.context.AppContextHolder;
import com.harry.uac.common.context.DefaultAppContext;
import com.harry.uac.common.exception.BusinessException;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * login interceptor to check user login
 * 
 * @author wangsg
 * 
 */
public class LoginInterceptor extends AbstractInterceptor {

    private IUserService userService;

    private Logger logger = Logger.getLogger(LoginInterceptor.class);

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
	ActionContext actionContext = ActionContext.getContext();
	Map<String, Object> session = actionContext.getSession();
	AuthUser user = (AuthUser) session.get(Consts.USER_SESSION_KEY);

	try {

	    // 外部系统用户树(对话框)测试，若请求action为"queryUser4External"，跳过检验.
	    if (actionContext.getName().equals("queryUser4External") || actionContext.getName().equals("queryJsonData")
		            || actionContext.getName().equals("uploadFile")) // 请求uploadFile的action时，session数据丢失，暂时跳过，以后处理
		return invocation.invoke();

	    if (user == null && !Consts.LOGIN.equals(actionContext.getName())
		            && !Consts.LOGIN_SHOW_DIALOG.equals(actionContext.getName())
		            && !Consts.LOGIN_FROM_DIALOG.equals(actionContext.getName())) {
		// setGoingToURL(session, invocation);

		/**
		 * session失效，进行SSO检查 SSO票据检查
		 */
		/*
	         * XAuth2Client client = null; String sessionData =
	         * ServletActionContext.getRequest().getParameter("sessionData"); if (sessionData != null) { try {
	         * client = XAuth2Client.getInstance(SsoLogUtil.getLocalAppId(), SsoLogUtil.getAuthenticateUrl());
	         * 
	         * if (client != null) { TicketBall tb = client.accessApplication(sessionData); String uid =
	         * tb.getTicket().getUid(); // TODO user = userService.selectAuthUserByUid(uid); } // 根据user
	         * session状态，设置相应appcontext内容:为null，需对应清除 setAppContextData(user);
	         * 
	         * if (user != null) {// 如果SSO登录票据有效，则新增对应session，并保持登录状态
	         * actionContext.getSession().put(Consts.USER_SESSION_KEY, user); return invocation.invoke(); } } catch
	         * (Exception e) { logger.warn("soo couldnt getInstance.."); } }
	         */
		HttpServletRequest request = (HttpServletRequest) actionContext.get(StrutsStatics.HTTP_REQUEST);
		if (isAjax(request)) {
		    return Consts.LOGIN;
		} else {
		    return Consts.LOGIN_INDEX;
		}
	    } else {// session仍然有效或者请求的是登录action
		    // 根据user状态，设置相应appcontext内容
		setAppContextData(user);
		return invocation.invoke();
	    }
	} catch (DataAccessException ex) {
	    throw new BusinessException("数据库操作失败！");
	} catch (NullPointerException ex) {
	    throw new BusinessException("调用了未经初始化的对象或者是不存在的对象！");
	} catch (IOException ex) {
	    throw new BusinessException("IO异常！");
	} catch (ClassNotFoundException ex) {
	    throw new BusinessException("指定的类不存在！");
	} catch (ArithmeticException ex) {
	    throw new BusinessException("数学运算异常！");
	} catch (ArrayIndexOutOfBoundsException ex) {
	    throw new BusinessException("数组下标越界!");
	} catch (IllegalArgumentException ex) {
	    throw new BusinessException("方法的参数错误！");
	} catch (ClassCastException ex) {
	    throw new BusinessException("类型强制转换错误！");
	} catch (SecurityException ex) {
	    throw new BusinessException("违背安全原则异常！");
	} catch (SQLException ex) {
	    throw new BusinessException("操作数据库异常！");
	} catch (NoSuchMethodError ex) {
	    throw new BusinessException("方法末找到异常！");
	} catch (InternalError ex) {
	    throw new BusinessException("Java虚拟机发生了内部错误");
	} catch (Exception ex) {
	    throw new BusinessException("程序内部错误，操作失败！");
	}
    }

    /**
     * @param request
     * @return
     */
    private boolean isAjax(HttpServletRequest request) {
	if (request != null && "XMLHttpRequest".equalsIgnoreCase(request.getHeader("X-Requested-With")))
	    return true;
	return false;
    }

    /**
     * 根据session状态设置appcontext数据
     * 
     * @param user
     */
    private void setAppContextData(AuthUser user) {
	// if user doesnt login,redirect to user login page
	if (user == null) {
	    AppContextHolder.clear();
	} else {
	    AppContext context = AppContextHolder.getContext();
	    if (context == null) {
		context = new DefaultAppContext(user);
		AppContextHolder.setContext(context);
	    } else {
		context.setUser(user);
	    }
	}
    }

    /**
     * save the request action, for redirect
     * 
     * @param session
     * @param invocation
     */
    // private void setGoingToURL(Map<String, Object> session, ActionInvocation
    // invocation){
    // ActionContext actionContext = ActionContext.getContext();
    // //request url
    // StringBuilder strURL = new StringBuilder();
    // String namespace = invocation.getProxy().getNamespace();
    // if (StringUtils.isNotBlank(namespace) && !namespace.equals("/")){
    // strURL.append(namespace);
    // }
    // String actionName = actionContext.getName();
    // if (StringUtils.isNotBlank(actionName)){
    // strURL.append("/").append(actionName);
    // }
    // //request parameters
    // Map<String, Object> parameters = actionContext.getParameters();
    // int index = 0;
    // //format params like this ?abc=xxx&def=yyy&ghi=zzz
    // for (Map.Entry<String, Object> entry : parameters.entrySet()) {
    // if (index == 0) {
    // strURL.append("?");
    // }
    // String [] vals = (String []) entry.getValue();
    // for (int j=0; j<vals.length; j++)
    // {
    // strURL.append(entry.getKey()).append("=").append(vals[j]);
    // if (j < vals.length-1) {
    // strURL.append("&");
    // }
    // }
    //
    // if (index < parameters.size() - 1) {
    // strURL.append("&");
    // }
    // index++;
    // }
    // if (strURL.length() > 0) {
    // //remove first /, unless there will be //xxx/xx-ccc
    // session.put(Consts.GOING_TO_URL, strURL.substring(1));
    // }
    // }

    private static final long serialVersionUID = -6192945684935211029L;

}
