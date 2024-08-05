package com.harry.uac.common.exception;

/**
 * bussiness exception
 * 
 * @author wangsg
 * 
 */
public class BusinessException extends AppException {

    private static final long serialVersionUID = -9021188530320536641L;

    public BusinessException(String message) {
	super(message);
    }

    public BusinessException(String message, Throwable cause) {
	super(message, cause);
    }

    public BusinessException(Throwable cause) {
	super(cause);
    }

    public BusinessException(String message, Throwable cause, String errorCode) {
	super(message, cause, errorCode);
    }

    public BusinessException(String message, String errorCode) {
	super(message, errorCode);
    }

}
