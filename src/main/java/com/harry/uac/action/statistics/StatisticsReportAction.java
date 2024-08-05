package com.harry.uac.action.statistics;

import java.util.Date;

import com.harry.uac.action.ActionBase;
import com.harry.uac.common.util.OnePage;
import com.harry.uac.common.util.Page;
import com.harry.uac.persistence.SyncIncStatus;
import com.harry.uac.persistence.SyncIncStatusExample;
import com.harry.uac.service.IStatisticReportService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

public class StatisticsReportAction extends ActionBase {
    private int flag;
    private SearchCriteria searchCriteria = new SearchCriteria();

    private OnePage<SyncIncStatus> pageData;
    
    @Autowired
    private IStatisticReportService statisticReportService;

    @Action(value = "disPlayStatisticsReport", results = {
	    @Result(name = "userImportExport", location = "statisticsUserIE.jsp"),
	    @Result(name = "appSync", location = "statisticsAppSync.jsp"),
	    @Result(name = "baseDataUpdate", location = "statisticsBaseDataUpdate.jsp") })
    public String disPlayStatisticsReport() {
	if (getParameterValue("flag") != null)
	    this.flag = Integer.parseInt(getParameterValue("flag").toString());

	if (this.flag == 0)
	    return "userImportExport";
	else if (this.flag == 1)
	    return "appSync";
	else if (this.flag == 2)
	    return "baseDataUpdate";
	return ERROR;
    }

    @Action(value = "getUserImportExportStatistics", results = { @Result(name = "success", location = "statisticsUserIE.jsp") })
    public String getUserImportExportStatistics() {
	return SUCCESS;
    }

    @Action(value = "getAppSyncStatistics", results = { @Result(name = "success", location = "statisticsAppSync.jsp") })
    public String getAppSyncStatistics() {
	SyncIncStatusExample example = searchCondition();
	pageData = statisticReportService.selectPaginationOnePageSyncStatus(example);
	return SUCCESS;
    }

    private SyncIncStatusExample searchCondition() {
	loadPerPage();
	SyncIncStatusExample example = new SyncIncStatusExample();
	SyncIncStatusExample.Criteria criteria = example.createCriteria();
	if (this.searchCriteria.getFromDate() != null)
	    criteria.andCreateDateGreaterThanOrEqualTo((this.searchCriteria.getFromDate()));
	if (this.searchCriteria.getToDate() != null)
	    criteria.andCreateDateLessThanOrEqualTo((this.searchCriteria.getToDate()));

	// initialize pagination parameter
	int pageNum = 1, numPerPage = 20;
	if (getParameterValue("pageNum") != null) {
	    pageNum = Integer.valueOf((String) getParameterValue("pageNum"));
	    numPerPage = Integer.valueOf((String) getParameterValue("numPerPage"));
	}
	Page page = new Page((pageNum - 1) * numPerPage + 1, numPerPage);
	example.setPage(page);
	return example;
    }

    @Action(value = "getBaseDataUpdateStatistics", results = { @Result(name = "success", location = "statisticsBaseDataUpdate.jsp") })
    public String getBaseDataUpdateStatistics() {
	return SUCCESS;
    }

    public void setFlag(int flag) {
	this.flag = flag;
    }

    public int getFlag() {
	return flag;
    }

    public void setPageData(OnePage<SyncIncStatus> pageData) {
	this.pageData = pageData;
    }

    public OnePage<SyncIncStatus> getPageData() {
	return pageData;
    }

    public SearchCriteria getSearchCriteria() {
	return searchCriteria;
    }

    public void setSearchCriteria(SearchCriteria searchCriteria) {
	this.searchCriteria = searchCriteria;
    }

    /**
	 * 
	 */
    private static final long serialVersionUID = -7246940988205169249L;

    class SearchCriteria {

	private Date fromDate;
	private Date toDate;

	public SearchCriteria() {

	}

	public void setFromDate(Date fromDate) {
	    this.fromDate = fromDate;
	}

	public Date getFromDate() {
	    return fromDate;
	}

	public void setToDate(Date toDate) {
	    this.toDate = toDate;
	}

	public Date getToDate() {
	    return toDate;
	}
    }

}
