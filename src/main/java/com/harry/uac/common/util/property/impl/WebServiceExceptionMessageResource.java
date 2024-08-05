package com.harry.uac.common.util.property.impl;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.harry.uac.common.util.property.MessageResource;
import com.harry.uac.common.util.property.PropertiesUtils;

public class WebServiceExceptionMessageResource implements MessageResource {
    
    private static Logger logger = LoggerFactory.getLogger(WebServiceExceptionMessageResource.class);
		    
    private static Properties properties;

    private static final String RESOURCE_PATH = "classpath:/webservice-exception.properties";

    WebServiceExceptionMessageResource() {
	try {
	    properties = PropertiesUtils.loadProperties(RESOURCE_PATH);
        } catch (IOException e) {
	    logger.error(e.getMessage(), e);
        }
    }

    public String getMessage(String msgId) {
	return properties.getProperty(msgId);
    }

    public String getMessage(String msgId, String Parameter) {
	return MessageFormat.format(properties.getProperty(msgId), Parameter);
    }

    public String getMessage(String msgId, String[] bindList) {
	return MessageFormat.format(properties.getProperty(msgId), (Object[]) bindList);
    }

}