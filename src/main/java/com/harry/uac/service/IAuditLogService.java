package com.harry.uac.service;

import java.util.List;

import com.harry.uac.common.util.OnePage;
import com.harry.uac.persistence.AuditLog;
import com.harry.uac.persistence.AuditLogExample;

/**
 * Query and delete audit logs service
 * 
 * @author xm
 * 
 */
public interface IAuditLogService {
    public List<AuditLog> queryAuditLogs(AuditLogExample creteria);

    public void deleteAuditLog(List<AuditLog> auditLogs);

    public void deleteByPrimaryKey(long auditId);

    public OnePage<AuditLog> onePageAuditLog(AuditLogExample criteria);
}
