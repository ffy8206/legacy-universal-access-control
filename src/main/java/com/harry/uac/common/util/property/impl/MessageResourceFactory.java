package com.harry.uac.common.util.property.impl;

import com.harry.uac.common.util.property.MessageResource;

/**
 * Property message factory class
 * 
 * @author Z002VUAT
 *
 */
public class MessageResourceFactory {
    private static MessageResource wsExceptionInstance;

    private MessageResourceFactory() {
    }

    public synchronized static MessageResource getMessageResource() {
	if (wsExceptionInstance == null) {
	    wsExceptionInstance = new WebServiceExceptionMessageResource();
	}
	return wsExceptionInstance;
    }
}
