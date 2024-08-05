/**
 * 
 */
package com.harry.uac.common.util.property;

/**
 * Message Resource
 * 
 * @author wangding
 * 
 */
public interface MessageResource {
    abstract public String getMessage(String msgId);

    abstract public String getMessage(String msgId, String Parameter);

    abstract public String getMessage(String msgId, String[] bindList);
}
