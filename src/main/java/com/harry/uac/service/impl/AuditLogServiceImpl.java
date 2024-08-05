package com.harry.uac.service.impl;

import java.util.List;

import com.harry.uac.dao.AuditLogMapper;
import com.harry.uac.persistence.AuditLog;
import com.harry.uac.persistence.AuditLogExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harry.uac.common.util.OnePage;
import com.harry.uac.service.IAuditLogService;

/**
 * query and delete query logs implementation
 * 
 * @author xm
 * 
 */
@Service("auditLogService")
public class AuditLogServiceImpl implements IAuditLogService {
    
    @Autowired
    private AuditLogMapper auditLogDAO;

    @Override
    public List<AuditLog> queryAuditLogs(AuditLogExample creteria) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void deleteAuditLog(List<AuditLog> auditLogs) {
	// TODO Auto-generated method stub

    }

    public void deleteByPrimaryKey(long auditId) {
	auditLogDAO.deleteByPrimaryKey(auditId);
    }

    @Override
    public OnePage<AuditLog> onePageAuditLog(AuditLogExample criteria) {
	// TODO Auto-generated method stub
	int count = auditLogDAO.countByExample(criteria);
	List<AuditLog> data = auditLogDAO.selectPaginationByExample(criteria);
	OnePage<AuditLog> onepage = new OnePage<AuditLog>();
	criteria.getPage().setCount(count);
	onepage.setPage(criteria.getPage());
	onepage.setDataList(data);
	return onepage;
    }

}
