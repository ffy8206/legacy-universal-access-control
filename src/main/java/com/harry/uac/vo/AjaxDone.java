package com.harry.uac.vo;

/**
 * AjaxDone class use builder Pattern status, message must input
 * 
 * @author wangsg
 * 
 */
public class AjaxDone {
    private final int statusCode;
    private final String message;
    private final String navTabId;
    private final String forwardUrl;
    private final String callbackType;

    public static class Builder {
	private final int statusCode;
	private final String message;
	private String navTabId;
	private String forwardUrl;
	private String callbackType;

	public Builder(int statusCode, String message) {
	    this.statusCode = statusCode;
	    this.message = message;
	}

	public Builder navTabId(String val) {
	    this.navTabId = val;
	    return this;
	}

	public Builder forwardUrl(String val) {
	    this.forwardUrl = val;
	    return this;
	}

	public Builder callBackType(String val) {
	    this.callbackType = val;
	    return this;
	}

	public AjaxDone build() {
	    return new AjaxDone(this);
	}
    }

    private AjaxDone(Builder builder) {
	this.statusCode = builder.statusCode;
	this.message = builder.message;
	this.navTabId = builder.navTabId;
	this.forwardUrl = builder.forwardUrl;
	this.callbackType = builder.callbackType;
    }

    public int getStatusCode() {
	return statusCode;
    }

    public String getMessage() {
	return message;
    }

    public String getNavTabId() {
	return navTabId;
    }

    public String getForwardUrl() {
	return forwardUrl;
    }

    public String getCallbackType() {
	return callbackType;
    }
}
