<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../common/commonInclude.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
<form id="statisticsAppSync_pagerForm" method="post" action="../statistics/getAppSyncStatistics">
<input type="hidden" name="pageNum" value="1" /><!--【必须】value=1可以写死-->
<input type="hidden" name="numPerPage"
	value="<s:property value='%{pageData.page.length}' />" /><!--【可选】每页显示多少条-->
</form>

<div class="pageHeader">
<form id="statisticsAppSync_searchForm" rel="statisticsAppSync_pagerForm"
	onsubmit="return navTabSearch(this);"
	action="../statistics/getAppSyncStatistics" method="post">
<div class="searchBar">
<table class="searchContent">
	<tr>
		<td><s:text name="statisticsReport.label.fromTime" /> <input
			type="text" class="date" readonly="true"
			name="searchCriteria.fromDate" /></td>
		<td><s:text name="statisticsReport.label.toTime" /> <input
			type="text" class="date" readonly="true" name="searchCriteria.toDate" />
		</td>
	</tr>
</table>
<div class="subBar">
<ul>
	<li>
	<div class="buttonActive">
	<div class="buttonContent">
	<button type="submit"><s:text
		name="statisticsReport.button.query" /></button>
	</div>
	</div>
	</li>
</ul>
</div>
</div>
</form>
</div>
<div class="pageContent">
<div class="panelBar">
<ul class="toolBar">
	<li><a class="delete"
		href=""
		target="ajaxTodo" title="<s:text name="global.confirm.delete" />">
	<span><s:text name="global.delete" /></span> </a></li>
	<li class="line">line</li>
	<li><a class="icon" href="demo/common/dwz-team.xls"
		target="dwzExport" targetType="navTab"
		title="<s:text name="global.confirm.export" />"><span><s:text
		name="global.export.excel" /></span></a></li>
</ul>
</div>
<table class="table" width="100%" layoutH="138">
	<thead>
		<tr>
			<th width="25px"><input type="checkbox" class="checkboxCtrl"
				group="checkedIDs" /></th>
			<th width="80px"><s:text name="table.headers.appsync.applicationName"></s:text></th>
			<th width="80px"><s:text name="table.headers.appsync.syncStatus"></s:text></th>
			<th width="80px"><s:text name="table.headers.appsync.syncSuccessDetails"></s:text></th>
			<th width="50px"><s:text name="table.headers.appsync.syncFailDetails"></s:text></th>
			<th width="80px"><s:text
				name="table.headers.appsync.createTime"></s:text></th>
		</tr>
	</thead>
	<tbody>
		<s:iterator value="pageData.dataList">
			<tr target="sid_auditLog" rel="<s:property value="id"/>">
				<td><input type="checkbox" name="checkedIDs" value="id" /></td>
				<td><s:property value="application.applicationName"/></td>
				<td><s:property value="syncStatus"/></td>
				<td><s:property value="syncSuccessDetails"/></td>
				<td><s:property value="syncFailDetails"/></td>
				<td><s:date name="createDate" format="yyyy-MM-dd HH:mm:ss" /></td>
			</tr>
		</s:iterator>
	</tbody>
</table>
<%@ include file="../common/pagination.jsp"%></div>
</body>
</html>