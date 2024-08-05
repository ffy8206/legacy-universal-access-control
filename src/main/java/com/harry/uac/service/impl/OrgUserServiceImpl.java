package com.harry.uac.service.impl;

import java.util.Date;
import java.util.List;

import com.harry.uac.dao.AuthOrgUserMapper;
import com.harry.uac.dao.ViewAuthOrgUserMapper;
import com.harry.uac.persistence.AuthOrgUser;
import com.harry.uac.persistence.AuthOrgUserKey;
import com.harry.uac.persistence.ViewAuthOrgUser;
import com.harry.uac.persistence.ViewAuthOrgUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harry.uac.common.context.AppContextHolder;
import com.harry.uac.common.util.OnePage;
import com.harry.uac.service.IOrgUserService;

@Service("orgUserService")
public class OrgUserServiceImpl implements IOrgUserService {

    @Autowired
    private ViewAuthOrgUserMapper viewDAO;

    @Autowired
    private AuthOrgUserMapper orgUserDAO;

    @Override
    public OnePage<ViewAuthOrgUser> onePageOrgUser(ViewAuthOrgUserExample criteria) {
	int count = viewDAO.countByExample(criteria);
	List<ViewAuthOrgUser> data = viewDAO.selectPaginationByExample(criteria);
	OnePage<ViewAuthOrgUser> onepage = new OnePage<ViewAuthOrgUser>();
	// page.setTotalCnt(count);
	criteria.getPage().setCount(count);
	onepage.setPage(criteria.getPage());
	onepage.setDataList(data);
	return onepage;
    }

    @Override
    public void insertOrgUser(AuthOrgUser orgUserInfo) {
	// TODO: delete test data
	orgUserInfo.setCreateUserId(AppContextHolder.getContext().getUser().getUserId());
	orgUserInfo.setCreateTime(new Date());
	orgUserDAO.insert(orgUserInfo);
    }

    @Override
    public void deleteOrgUser(AuthOrgUserKey orgUserKey) {
	orgUserDAO.deleteByPrimaryKey(orgUserKey);
    }

    @Override
    public void updateOrgUser(AuthOrgUser orgUserInfo) {
	// TODO: delete test data
	orgUserDAO.updateByPrimaryKeySelective(orgUserInfo);
    }

    @Override
    public AuthOrgUser findSingleOrgUser(AuthOrgUserKey orgUserKey) {
	return orgUserDAO.selectByPrimaryKey(orgUserKey);
    }
}
