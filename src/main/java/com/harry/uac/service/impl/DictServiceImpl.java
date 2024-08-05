package com.harry.uac.service.impl;

import java.util.List;

import com.harry.uac.dao.DictMapper;
import com.harry.uac.persistence.Dict;
import com.harry.uac.persistence.DictExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harry.uac.common.Consts;
import com.harry.uac.common.util.CommonUtil;
import com.harry.uac.service.IDictService;

@Service("dictService")
public class DictServiceImpl implements IDictService {

    @Autowired
    private DictMapper dictDAO;

    @Override
    public List<Dict> findAllDict(DictExample criteria, String optTable) {
	return dictDAO.selectByExample(criteria, optTable);
    }

    @Override
    public Dict findDict(String code, String optTable) {
	return dictDAO.selectByPrimaryKey(code, optTable);
    }

    @Override
    public void addDict(Dict dict, String optTable) {
	dictDAO.insert(dict, optTable);
	CommonUtil.generateAuditInfo(Consts.AUDIT_TYPE_INSERT, Consts.AUDIT_LEVEL_NORMAL, "新增字典信息成功！");
    }

    @Override
    public void deleteDict(String code, String optTable) {
	dictDAO.deleteByPrimaryKey(code, optTable);
	CommonUtil.generateAuditInfo(Consts.AUDIT_TYPE_UPDATE, Consts.AUDIT_LEVEL_NORMAL, "删除字典信息成功！");
    }

    @Override
    public void updateDict(Dict dict, String optTable) {
	dictDAO.updateByPrimaryKey(dict, optTable);
	CommonUtil.generateAuditInfo(Consts.AUDIT_TYPE_UPDATE, Consts.AUDIT_LEVEL_NORMAL, "更新字典信息成功！");
    }

}
