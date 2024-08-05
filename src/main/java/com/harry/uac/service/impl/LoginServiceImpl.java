package com.harry.uac.service.impl;

import java.util.List;

import com.harry.uac.dao.AuthUserMapper;
import com.harry.uac.persistence.AuthUser;
import com.harry.uac.persistence.AuthUserExample;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harry.uac.common.exception.AppException;
import com.harry.uac.common.exception.BusinessException;
import com.harry.uac.common.util.EncryptUtil;
import com.harry.uac.service.ILoginService;

@Service("loginService")
public class LoginServiceImpl implements ILoginService {

    @Autowired
    private AuthUserMapper userDAO;

    @Override
    public AuthUser checkUserPassword(String uid, String pwd) throws AppException {
	AuthUserExample criteria = new AuthUserExample();
	AuthUserExample.Criteria cri = criteria.createCriteria();
	cri.andUserUidEqualTo(uid);
	AuthUser user = null;
	List<AuthUser> authUsers = userDAO.selectByExample(criteria);
	if (authUsers.size() > 0) {
	    user = authUsers.get(0);
	    // user added by administrator, password is plain
	    if (StringUtils.isBlank(user.getUserSalt())) {
		if (pwd.equals(user.getUserPassword())) {
		    return user;
		} else {
		    throw new BusinessException("Invalid username or password", "502");
		}
	    } else {
		if (EncryptUtil.decryptPassword(pwd, user.getUserSalt()).equals(user.getUserPassword())) {
		    return user;
		} else {
		    throw new BusinessException("Invalid username or password", "502");
		}
	    }
	} else {
	    throw new BusinessException("User does not exsit.", "501");
	}
    }

}
