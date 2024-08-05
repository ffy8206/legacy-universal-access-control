package com.harry.uac.service.impl;

import java.util.List;

import com.harry.uac.dao.ViewAuthOrgUserMapper;
import com.harry.uac.persistence.ViewAuthOrgUser;
import com.harry.uac.persistence.ViewAuthOrgUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harry.uac.common.util.OnePage;
import com.harry.uac.service.IViewAuthOrgUserService;

@Service("viewAuthOrgUserService")
public class ViewAuthOrgUserServiceImpl implements IViewAuthOrgUserService {
    @Autowired
    private ViewAuthOrgUserMapper vDao;

    @Override
    public OnePage<ViewAuthOrgUser> onePageUsersForGroup(ViewAuthOrgUserExample example) {
	int count = vDao.countUsersForGroupByExample(example);
	List<ViewAuthOrgUser> data = vDao.selectPaginationUsersForGroupByExample(example);
	OnePage<ViewAuthOrgUser> onepage = new OnePage<ViewAuthOrgUser>();
	example.getPage().setCount(count);
	onepage.setPage(example.getPage());
	onepage.setDataList(data);
	return onepage;
    }

    @Override
    public OnePage<ViewAuthOrgUser> onePageRemainingUsersForGroup(ViewAuthOrgUserExample example) {
	int count = vDao.countRemainingUsersForGroupByExample(example);
	List<ViewAuthOrgUser> data = vDao.selectPaginationRemainingUsersForGroupByExample(example);
	OnePage<ViewAuthOrgUser> onepage = new OnePage<ViewAuthOrgUser>();
	example.getPage().setCount(count);
	onepage.setPage(example.getPage());
	onepage.setDataList(data);
	return onepage;
    }

}
