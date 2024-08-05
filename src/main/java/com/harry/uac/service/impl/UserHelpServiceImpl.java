package com.harry.uac.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.harry.uac.persistence.AuthApplication;
import com.harry.uac.persistence.AuthUser;
import com.harry.uac.persistence.UserPrivilege;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springside.modules.security.utils.Digests;
import org.springside.modules.utils.Encodes;

import com.harry.uac.common.Consts;
import com.harry.uac.common.context.AppContextHolder;
import com.harry.uac.common.util.CommonUtil;
import com.harry.uac.common.util.EncryptUtil;
import com.harry.uac.dao.AuthApplicationMapper;
import com.harry.uac.dao.AuthOrgUserMapper;
import com.harry.uac.dao.AuthUserGroupMapper;
import com.harry.uac.dao.AuthUserMapper;
import com.harry.uac.dao.AuthUserRoleMapper;
import com.harry.uac.service.AuthCommonService;
import com.harry.uac.service.IUserHelpService;

@Service("userHelpService")
public class UserHelpServiceImpl implements IUserHelpService {

    @Autowired
    private AuthUserMapper userDAO;
    @Autowired
    private AuthUserGroupMapper userGroupDAO;
    @Autowired
    private AuthOrgUserMapper orgUserDAO;
    @Autowired
    private AuthUserRoleMapper userRoleDAO;
    @Autowired
    private AuthApplicationMapper applicationDAO;

    @Override
    public AuthUser findUser(Long userId) {
	AuthUser user = userDAO.selectByPrimaryKey(userId);
	user.setUserGroupList(userGroupDAO.selectByUserId(userId));
	user.setUserRoleList(userRoleDAO.selectByUserId(userId));
	user.setOrgUserList(orgUserDAO.selectByUserId(userId));
	return user;
    }

    @Override
    public boolean savePassword(AuthUser user) {
	boolean ret = false;
	AuthUser data = userDAO.selectByPrimaryKey(user.getUserId());
	if (data.getPasswordMofidyFlag() == 0 || data.getUserPassword().equals(EncryptUtil.decryptPassword(user.getUserPassword(), data.getUserSalt()))) {
	    EncryptUtil.encryptPassword(user, user.getNewPassword());
	    user.setUserPwdModifiedDate(new Date());
	    user.setUpdateTime(new Date());
	    user.setUpdateUserId(AppContextHolder.getContext().getUser().getUserId());
	    user.setPasswordMofidyFlag(1);// set the flag to 1, if the password was changed by user self
	    userDAO.updateByPrimaryKeySelective(user);
	    ret = true;
	    CommonUtil.generateAuditInfo(Consts.AUDIT_TYPE_UPDATE, Consts.AUDIT_LEVEL_NORMAL, "用户更新密码成功！");
	} else {
	    CommonUtil.generateAuditInfo(Consts.AUDIT_TYPE_UPDATE, Consts.AUDIT_LEVEL_ERROR, "用户更新密码失败！");
	}
	return ret;
    }

    @Override
    public List<UserPrivilege> findUserApplicationPrivileges() {
	List<UserPrivilege> ret = new ArrayList<UserPrivilege>();
	List<AuthApplication> appList = applicationDAO.selectByExample(null);
	for (AuthApplication app: appList) {
	    List<UserPrivilege> tmp = AuthCommonService.selectApplictionPrivilegesForUser(app.getApplicationId(),
		            AppContextHolder.getContext().getUser().getUserId());
	    ret.addAll(tmp);
	}
	return ret;
    }

}
