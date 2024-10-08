package com.harry.uac.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextRegister implements ApplicationContextAware {
    
    private static Logger logger = LoggerFactory.getLogger(ApplicationContextRegister.class);

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	ContextUtils.setApplicationContext(applicationContext);
	logger.debug("ApplicationContext registed");
    }

}
