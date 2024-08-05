package com.harry.uac.common.util.property;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.DefaultPropertiesPersister;
import org.springframework.util.PropertiesPersister;

/**
 * Properties Utilities for loading properties files.
 * 
 * @author Z002VUAT
 */
public class PropertiesUtils {

    private static final String DEFAULT_ENCODING = "UTF-8";

    private static Logger logger = LoggerFactory.getLogger(PropertiesUtils.class);

    private static PropertiesPersister propertiesPersister = new DefaultPropertiesPersister();
    private static ResourceLoader resourceLoader = new DefaultResourceLoader();

    /**
     * load Multiple properties file, The same attribute in the final load file will cover the value before load. file
     * path use Spring Resource format, code style use UTF-8.
     * 
     * @see org.springframework.beans.factory.config.PropertyPlaceholderConfigurer
     */
    public static Properties loadProperties(String... resourcesPaths) throws IOException {
	Properties props = new Properties();

	for (String location: resourcesPaths) {

	    logger.debug("Loading properties file from:" + location);

	    InputStream is = null;
	    try {
		Resource resource = resourceLoader.getResource(location);
		is = resource.getInputStream();
		propertiesPersister.load(props, new InputStreamReader(is, DEFAULT_ENCODING));
	    } catch (IOException ex) {
		logger.info("Could not load properties from classpath:" + location + ": " + ex.getMessage());
	    } finally {
		if (is != null) {
		    is.close();
		}
	    }
	}
	return props;
    }
}
