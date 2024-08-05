package com.harry.uac.ws.server.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.harry.uac.common.exception.AppException;
import com.harry.uac.common.util.property.impl.MessageResourceFactory;

public class WebServiceExceptionHandler {

    private static Logger logger = LoggerFactory.getLogger(WebServiceExceptionHandler.class);

    public static <T extends WSResult> T handleParameterError(T result, Exception e, String message) {
	logger.error(message, e.getMessage());
	result.setError(WSResult.PARAMETER_ERROR, message);
	return result;
    }

    public static <T extends WSResult> T handleParameterError(T result, Exception e) {
	logger.error(e.getMessage());
	result.setError(WSResult.PARAMETER_ERROR, e.getMessage());
	return result;
    }

    public static <T extends WSResult> T handleBusinessError(T result, AppException e, String errorCode) {
	logger.error(e.getMessage());
	result.setError(errorCode, MessageResourceFactory.getMessageResource().getMessage(errorCode));
	return result;
    }

    public static <T extends WSResult> T handleBusinessError(T result, AppException e) {
	logger.error(e.getMessage());
	result.setError(e.getErrorCode(), e.getMessage());
	return result;
    }

    public static <T extends WSResult> T handleGeneralError(T result, Exception e) {
	logger.error(e.getMessage());
	result.setDefaultError();
	return result;
    }
}
