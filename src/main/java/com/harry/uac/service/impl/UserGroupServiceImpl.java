package com.harry.uac.service.impl;

import java.util.Date;

import com.harry.uac.dao.AuthUserGroupMapper;
import com.harry.uac.persistence.AuthUserGroup;
import com.harry.uac.persistence.AuthUserGroupExample;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harry.uac.common.context.AppContextHolder;
import com.harry.uac.service.IUserGroupService;

@Service("userGroupService")
public class UserGroupServiceImpl implements IUserGroupService {

    @Autowired
    private AuthUserGroupMapper userGroupDAO;

    @Override
    public void saveUserGroupInfo(Long groupId, String users_sel, String users_del) {
	// save
	if (StringUtils.isNotEmpty(users_sel)) {
	    // 已选择的角色
	    String[] selArray = users_sel.split(",");
	    for (int i = 0; i < selArray.length; i++) {
		// 判断是否存在，不存在时新增
		AuthUserGroupExample example = new AuthUserGroupExample();
		AuthUserGroupExample.Criteria criteria = example.createCriteria();
		criteria.andGroupIdEqualTo(groupId);
		criteria.andUserIdEqualTo(Long.parseLong(selArray[i]));
		int rsCount = userGroupDAO.countByExample(example);
		if (rsCount <= 0) {
		    AuthUserGroup groupRole = new AuthUserGroup();
		    groupRole.setGroupId(groupId);
		    groupRole.setUserId(Long.parseLong(selArray[i]));
		    groupRole.setCreateUserId(AppContextHolder.getContext().getUser().getUserId());
		    groupRole.setCreateTime(new Date());
		    userGroupDAO.insert(groupRole);
		}
	    }
	}
	// del
	if (StringUtils.isNotEmpty(users_del)) {
	    String[] delArray = users_del.split(",");
	    // 未选择的角色
	    for (int i = 0; i < delArray.length; i++) {
		// 判断是否存在，存在时删除
		AuthUserGroupExample example = new AuthUserGroupExample();
		AuthUserGroupExample.Criteria criteria = example.createCriteria();
		criteria.andGroupIdEqualTo(groupId);
		criteria.andUserIdEqualTo(Long.parseLong(delArray[i]));
		int rsCount = userGroupDAO.countByExample(example);
		if (rsCount >= 1) {
		    AuthUserGroup groupRole = new AuthUserGroup();
		    groupRole.setGroupId(groupId);
		    groupRole.setUserId(Long.parseLong(delArray[i]));
		    userGroupDAO.deleteByExample(example);
		}
	    }
	}
    }

    @Override
    public void saveUserSetGroupInfo(Long userId, String groups_sel, String groups_del) {
	// save
	if (StringUtils.isNotEmpty(groups_sel)) {
	    // 已选择的角色
	    String[] selArray = groups_sel.split(",");
	    for (int i = 0; i < selArray.length; i++) {
		// 判断是否存在，不存在时新增
		AuthUserGroupExample example = new AuthUserGroupExample();
		AuthUserGroupExample.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		criteria.andGroupIdEqualTo(Long.parseLong(selArray[i]));
		int rsCount = userGroupDAO.countByExample(example);
		if (rsCount <= 0) {
		    AuthUserGroup userGroup = new AuthUserGroup();
		    userGroup.setUserId(userId);
		    userGroup.setGroupId(Long.parseLong(selArray[i]));
		    userGroup.setCreateUserId(AppContextHolder.getContext().getUser().getUserId());
		    userGroup.setCreateTime(new Date());
		    userGroupDAO.insert(userGroup);
		}
	    }
	}
	// del
	if (StringUtils.isNotEmpty(groups_del)) {
	    String[] delArray = groups_del.split(",");
	    // 未选择的角色
	    for (int i = 0; i < delArray.length; i++) {
		// 判断是否存在，存在时删除
		AuthUserGroupExample example = new AuthUserGroupExample();
		AuthUserGroupExample.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		criteria.andGroupIdEqualTo(Long.parseLong(delArray[i]));
		int rsCount = userGroupDAO.countByExample(example);
		if (rsCount >= 1) {
		    AuthUserGroup userGroup = new AuthUserGroup();
		    userGroup.setUserId(userId);
		    userGroup.setGroupId(Long.parseLong(delArray[i]));
		    userGroupDAO.deleteByExample(example);
		}
	    }
	}

    }
}
