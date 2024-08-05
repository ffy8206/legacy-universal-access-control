package com.harry.uac.common.exception;

/**
 * database exception
 * 
 * @author wangsg
 * 
 */
public class DatabaseException extends AppException {

    private static final long serialVersionUID = -2396439102363822700L;

    public DatabaseException(String message) {
	super(message);
    }

    public DatabaseException(String message, Throwable cause) {
	super(message, cause);
    }

    public DatabaseException(Throwable cause) {
	super(cause);
    }
}
