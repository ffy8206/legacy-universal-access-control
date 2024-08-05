package com.harry.uac.service.impl;

import java.util.Date;
import java.util.List;

import com.harry.uac.dao.AuthGroupMapper;
import com.harry.uac.persistence.AuthGroup;
import com.harry.uac.persistence.AuthGroupExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harry.uac.common.context.AppContextHolder;
import com.harry.uac.common.util.OnePage;
import com.harry.uac.service.IGroupService;

@Service("groupService")
public class GroupServiceImpl implements IGroupService {

    @Autowired
    private AuthGroupMapper groupDAO;

    @Override
    public void insertGroup(AuthGroup groupInfo) {
	// TODO: delete test data
	groupInfo.setCreateUserId(AppContextHolder.getContext().getUser().getUserId());
	groupInfo.setCreateTime(new Date());
	groupInfo.setUpdateUserId(AppContextHolder.getContext().getUser().getUserId());
	groupInfo.setUpdateTime(new Date());
	groupDAO.insert(groupInfo);
    }

    @Override
    public void deleteGroup(Long groupId) {
	groupDAO.deleteByPrimaryKey(groupId);
    }

    @Override
    public void updateGroup(AuthGroup groupInfo) {
	groupInfo.setUpdateUserId(AppContextHolder.getContext().getUser().getUserId());
	groupInfo.setUpdateTime(new Date());
	groupDAO.updateByPrimaryKey(groupInfo);
    }

    @Override
    public OnePage<AuthGroup> onePageGroup(AuthGroupExample criteria) {
	int count = groupDAO.countByExample(criteria);
	List<AuthGroup> data = groupDAO.selectPaginationByExample(criteria);
	OnePage<AuthGroup> onepage = new OnePage<AuthGroup>();
	criteria.getPage().setCount(count);
	onepage.setPage(criteria.getPage());
	onepage.setDataList(data);
	return onepage;
    }

    @Override
    public AuthGroup findSingleGroup(Long groupId) {
	return groupDAO.selectByPrimaryKey(groupId);
    }

    @Override
    public int deleteGroupWithValidator(Long groupId) {
	return groupDAO.deleteByPrimaryKeyWithValidator(groupId);
    }

}
