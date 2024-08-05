package com.harry.uac.common.util;

import com.harry.uac.dao.AuthUserMapper;
import com.harry.uac.persistence.AuthUser;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * user util
 * 
 * @author
 * 
 */
@Component("authUserUtils")
public class AuthUserUtils implements ApplicationContextAware {
    private static ApplicationContext context = null;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	context = applicationContext;
    }

    /**
     * get username by userid
     * 
     * @param userId
     * @return
     */
    public static String getAuthUserNameByUserId(Long userId) {
	String userName = "";
	AuthUserMapper userDAO = (AuthUserMapper) context.getBean("authUserMapper");
	AuthUser user = userDAO.selectByPrimaryKey(userId);
	if (user != null) {
	    userName = user.getUserName();
	}
	return userName;
    }
}
