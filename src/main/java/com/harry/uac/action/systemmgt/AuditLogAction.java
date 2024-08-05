package com.harry.uac.action.systemmgt;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import com.harry.uac.action.ActionBase;
import com.harry.uac.common.Consts;
import com.harry.uac.common.util.OnePage;
import com.harry.uac.common.util.Page;
import com.harry.uac.persistence.AuditLog;
import com.harry.uac.persistence.AuditLogExample;
import com.harry.uac.service.IAuditLogService;
import com.harry.uac.vo.AjaxDone;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * provides security audit function for UUM admin
 * 
 * @author xm
 * 
 */
public class AuditLogAction extends ActionBase {
    private OnePage<AuditLog> pageData;
    
    @Autowired
    private IAuditLogService auditLogService;
    private Map<String, Short> operateTypeCombo = new LinkedHashMap<String, Short>();
    private Map<String, Short> operateObjectCombo = new LinkedHashMap<String, Short>();
    private Map<String, Short> operateLevelCombo = new LinkedHashMap<String, Short>();
    private AuditLogSearchCriteria searchCriteria = new AuditLogSearchCriteria();

    // private SearchCriteria sCriteria;

    @Action(value = "queryAuditLogs", results = { @Result(name = "queryAuditLogs", location = "auditLog.jsp") })
    public String queryAuditLogs() {
	loadSelect();
	AuditLogExample criteria = searchCondition();
	pageData = auditLogService.onePageAuditLog(criteria);
	return "queryAuditLogs";
    }

    @Action(value = "deleteAuditLog")
    public String deleteAuditLog() {
	if (getParameterValue("auditId") == null) {
	    AjaxDone errorAjaxDone = new AjaxDone.Builder(Consts.AJAX_ERROR, getText("global.request.error")).build();
	    return ajaxForward(errorAjaxDone);
	}
	String auditId = (String) getParameterValue("auditId");
	auditLogService.deleteByPrimaryKey(Long.parseLong(auditId));
	AjaxDone parameAjaxDone = new AjaxDone.Builder(Consts.AJAX_OK, getText("global.delete.success")).navTabId(
	                "securityAudit").build();
	return ajaxForward(parameAjaxDone);
    }

    private AuditLogExample searchCondition() {
	AuditLogExample criteria = new AuditLogExample();
	// initialize search condition
	AuditLogExample.Criteria c = criteria.createCriteria();
	if (searchCriteria != null) {
	    if (searchCriteria.getOperateObject() != -1)
		c.andOperateObjectEqualTo(searchCriteria.getOperateObject());
	    if (searchCriteria.getOperateType() != -1)
		c.andOperateTypeEqualTo(searchCriteria.getOperateType());
	    if (searchCriteria.getOperateLevel() != -1)
		c.andOperateLevelEqualTo(searchCriteria.getOperateLevel());
	    if (searchCriteria.getFromDate() != null)
		c.andOperateTimeGreaterThanOrEqualTo(searchCriteria.getFromDate());
	    if (searchCriteria.getToDate() != null)
		c.andOperateTimeLessThanOrEqualTo(searchCriteria.getToDate());
	}

	// initialize pagination parameter
	int pageNum = 1, numPerPage = 20;
	if (getParameterValue("pageNum") != null) {
	    pageNum = Integer.valueOf((String) getParameterValue("pageNum"));
	    numPerPage = Integer.valueOf((String) getParameterValue("numPerPage"));
	}
	Page page = new Page((pageNum - 1) * numPerPage + 1, numPerPage);
	criteria.setPage(page);
	return criteria;
    }

    private void loadSelect() {
	loadPerPage();
	// operate Object Combo
	this.operateObjectCombo.put(getText("auditLog.combo.default"), (short) (-1));
	this.operateObjectCombo.put(getText("auditLog.operate.object.user"), Consts.AUDIT_OBJECT_USER);
	this.operateObjectCombo.put(getText("auditLog.operate.object.group"), Consts.AUDIT_OBJECT_GROUP);
	this.operateObjectCombo.put(getText("auditLog.operate.object.org"), Consts.AUDIT_OBJECT_ORG);
	this.operateObjectCombo.put(getText("auditLog.operate.object.role"), Consts.AUDIT_OBJECT_ROLE);
	this.operateObjectCombo.put(getText("auditLog.operate.object.app"), Consts.AUDIT_OBJECT_APPLICATION);
	this.operateObjectCombo.put(getText("auditLog.operate.object.privilege"), Consts.AUDIT_OBJECT_PRIVILEGE);
	this.operateObjectCombo.put(getText("auditLog.operate.object.datarange"), Consts.AUDIT_OBJECT_DATARANGE);

	// operate Type Combo
	this.operateTypeCombo.put(getText("auditLog.combo.default"), (short) (-1));
	this.operateTypeCombo.put(getText("auditLog.operate.type.insert"), Consts.AUDIT_TYPE_INSERT);
	this.operateTypeCombo.put(getText("auditLog.operate.type.update"), Consts.AUDIT_TYPE_UPDATE);
	this.operateTypeCombo.put(getText("auditLog.operate.type.delete"), Consts.AUDIT_TYPE_DELETE);
	this.operateTypeCombo.put(getText("auditLog.operate.type.lock"), Consts.AUDIT_TYPE_LOCK);

	// operate Level Combo
	this.operateLevelCombo.put(getText("auditLog.combo.default"), (short) (-1));
	this.operateLevelCombo.put(getText("auditLog.operate.level.normal"), Consts.AUDIT_LEVEL_NORMAL);
	this.operateLevelCombo.put(getText("auditLog.operate.level.warning"), Consts.AUDIT_LEVEL_WARN);
	this.operateLevelCombo.put(getText("auditLog.operate.level.error"), Consts.AUDIT_LEVEL_ERROR);
    }

    public void setPageData(OnePage<AuditLog> pageData) {
	this.pageData = pageData;
    }

    public OnePage<AuditLog> getPageData() {
	return pageData;
    }

    public Map<String, Short> getOperateTypeCombo() {
	return operateTypeCombo;
    }

    public void setOperateTypeCombo(Map<String, Short> operateTypeCombo) {
	this.operateTypeCombo = operateTypeCombo;
    }

    public Map<String, Short> getOperateObjectCombo() {
	return operateObjectCombo;
    }

    public void setOperateObjectCombo(Map<String, Short> operateObjectCombo) {
	this.operateObjectCombo = operateObjectCombo;
    }

    public Map<String, Short> getOperateLevelCombo() {
	return operateLevelCombo;
    }

    public void setOperateLevelCombo(Map<String, Short> operateLevelCombo) {
	this.operateLevelCombo = operateLevelCombo;
    }

    public AuditLogSearchCriteria getSearchCriteria() {
	return searchCriteria;
    }

    public void setSearchCriteria(AuditLogSearchCriteria searchCriteria) {
	this.searchCriteria = searchCriteria;
    }

    

    // public void setsCriteria(SearchCriteria sCriteria) {
    // this.sCriteria = sCriteria;
    // }
    //
    // public SearchCriteria getsCriteria() {
    // return sCriteria;
    // }

    /**
	 * 
	 */
    private static final long serialVersionUID = -5499912011578251639L;

    class AuditLogSearchCriteria {
	private short operateObject = -1;
	private short operateType = -1;
	private short operateLevel = -1;
	private Date fromDate;
	private Date toDate;

	public AuditLogSearchCriteria() {

	}

	public short getOperateObject() {
	    return operateObject;
	}

	public void setOperateObject(short operateObject) {
	    this.operateObject = operateObject;
	}

	public short getOperateType() {
	    return operateType;
	}

	public void setOperateType(short operateType) {
	    this.operateType = operateType;
	}

	public short getOperateLevel() {
	    return operateLevel;
	}

	public void setOperateLevel(short operateLevel) {
	    this.operateLevel = operateLevel;
	}

	public Date getFromDate() {
	    return fromDate;
	}

	public void setFromDate(Date fromDate) {
	    this.fromDate = fromDate;
	}

	public Date getToDate() {
	    return toDate;
	}

	public void setToDate(Date toDate) {
	    this.toDate = toDate;
	}
    }

}
