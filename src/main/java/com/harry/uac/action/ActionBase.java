package com.harry.uac.action;

import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.StrutsStatics;

import com.harry.uac.vo.AjaxDone;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * base action. encapsulate some function
 * 
 * @author wangsg
 * 
 */
public class ActionBase extends ActionSupport {

    private Map<String, Integer> perPageCombox = new ConcurrentHashMap<String, Integer>();;

    // ajax done class. for display ajax message
    private AjaxDone ajaxDone;

    /**
     * 获得当前Http Servlet Request
     */
    public HttpServletRequest getHttpServletRequest() {
	return (HttpServletRequest) ActionContext.getContext().get(StrutsStatics.HTTP_REQUEST);
    }

    /**
     * 获得 Http Servlet Response
     */
    public HttpServletResponse getHttpServletResponse() {
	return (HttpServletResponse) ActionContext.getContext().get(StrutsStatics.HTTP_RESPONSE);
    }

    /**
     * 获得当前Session
     */
    public Map<String, Object> getSession() {
	return ActionContext.getContext().getSession();
    }

    /**
     * 根据指定的页面参数名称，获取页面传递来的参数值
     * 
     * @param parameter
     * @return 单个对象
     */
    protected Object getParameterValue(String parameter) {
	Object[] parameterArray = getParamenterArray(parameter);
	if (parameterArray != null && parameterArray.length == 1) {
	    return parameterArray[0];
	} else {
	    return getHttpServletRequest().getAttribute(parameter);
	}
    }

    /**
     * 根据指定的页面参数名称，获取页面传递来的参数值
     * 
     * @param parameter
     * @return 数组对象
     */
    protected Object[] getParamenterArray(String parameter) {
	return (Object[]) (ActionContext.getContext().getParameters().get(parameter));
    }

    /**
     * 向request对象添加attribute
     * 
     * @param key
     * @param value
     */
    public void setRequestAttribute(String key, Object value) {
	getHttpServletRequest().setAttribute(key, value);
    }

    /**
     * 从session中取得相应的值
     * 
     * @param key
     * @return
     */
    public Object getSessionObj(Object key) {
	return getSession().get(key);
    }

    /**
     * set current session
     * 
     * @param key
     * @param value
     */
    public void setSessionObj(String key, Object value) {
	getSession().put(key, value);
    }

    /**
     * remove current session
     * 
     * @param key
     */
    public void removeSessionObj(String key) {
	getSession().remove(key);
    }

    /**
     * 获得项目rootDir
     * 
     * @return
     */
    protected String getRootDir() {
	String workDir = getHttpServletRequest().getSession().getServletContext().getRealPath("login.jsp");

	int len = workDir.indexOf("login.jsp");
	workDir = workDir.substring(0, len);

	StringBuffer sb = new StringBuffer();
	sb.append(workDir).append("upload").append(File.separator);

	return sb.toString();
    }

    /**
     * 获得web应用根目录路径
     * 
     * @return web directory
     */
    protected String getWebRootDir() {
	String workDir = getHttpServletRequest().getSession().getServletContext().getRealPath("index.jsp");

	int len = workDir.indexOf("index.jsp");
	workDir = workDir.substring(0, len);

	StringBuffer sb = new StringBuffer();
	sb.append(workDir);

	return sb.toString();
    }

    public String ajaxForward(AjaxDone ajaxDone) {
	setAjaxDone(ajaxDone);
	return "ajaxDone";
    }

    private static final long serialVersionUID = 880335894810890434L;

    public AjaxDone getAjaxDone() {
	return ajaxDone;
    }

    public void setAjaxDone(AjaxDone ajaxDone) {
	this.ajaxDone = ajaxDone;
    }

    protected void loadPerPage() {
	if (perPageCombox != null) {
	    perPageCombox.put("20", 20);
	    perPageCombox.put("50", 50);
	    perPageCombox.put("100", 100);
	    perPageCombox.put("200", 200);
	}
    }

    public Map<String, Integer> getPerPageCombox() {
	return perPageCombox;
    }

    public void setPerPageCombox(Map<String, Integer> perPageCombox) {
	this.perPageCombox = perPageCombox;
    }
}
