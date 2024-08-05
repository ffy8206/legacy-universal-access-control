package com.harry.uac.common.exception;

/**
 * system exception
 * 
 * @author wangsg
 * 
 */
public class AppException extends RuntimeException {

    private static final long serialVersionUID = 6383414800763090242L;
    
    private String errorCode;

    public String getErrorCode() {
        return errorCode;
    }

    public AppException(String message) {
	super(message);
    }

    public AppException(String message, Throwable cause) {
	super(message, cause);
    }

    public AppException(Throwable cause) {
	super(cause);
    }
    
    public AppException(String message, Throwable cause, String errorCode) {
	super(message, cause);
	this.errorCode = errorCode;
    }
    
    public AppException(String message, String errorCode) {
	super(message);
	this.errorCode = errorCode;
    }
}
