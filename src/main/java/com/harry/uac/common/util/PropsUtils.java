package com.harry.uac.common.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

import com.harry.uac.common.exception.AppException;

/**
 * load properties
 * 
 * @author wangsg
 * 
 */
public class PropsUtils {
    private PropsUtils() {
    }

    /**
     * Load a properties file from the classpath
     * 
     * @param propsName
     * @return Properties
     * @throws Exception
     */
    public static Properties load(String propsName) throws Exception {
	Properties props = new Properties();
	URL url = ClassLoader.getSystemResource(propsName);
	props.load(url.openStream());
	return props;
    }

    /**
     * Load a Properties File
     * 
     * @param propsFile
     * @return Properties
     * @throws IOException
     */
    public static Properties load(File propsFile) throws AppException {
	Properties props = new Properties();
	try {
	    FileInputStream fis = new FileInputStream(propsFile);
	    props.load(fis);
	    fis.close();
	} catch (FileNotFoundException e) {
	    throw new AppException(e);
	} catch (IOException e) {
	    throw new AppException(e);
	}
	return props;
    }

    /**
     * load a properties from inputStream
     * 
     * @param propsStream
     * @return
     * @throws Exception
     */
    public static Properties load(InputStream propsStream) throws AppException {
	Properties props = new Properties();
	try {
	    props.load(propsStream);
	} catch (IOException e) {
	    throw new AppException(e);
	}
	return props;
    }
}
