<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<form id="auditLog_pagerForm" method="post" action="../systemmgt/queryAuditLogs">
    <input type="hidden" name="pageNum" value="1" /><!--【必须】value=1可以写死-->
    <input type="hidden" name="numPerPage" value="<s:property value='%{pageData.page.length}' />" /><!--【可选】每页显示多少条-->
</form>

<div class="pageHeader">
	<form id="auditLog_searchForm" rel="auditLog_pagerForm" onsubmit="return navTabSearch(this);" action="../systemmgt/queryAuditLogs" method="post">
<div class="searchBar">
		<table class="searchContent">
			<tr>
				<td>
					<s:text name="auditLog.label.operateObject"/>:
				</td>
				<td>
					<select class="combox" name="searchCriteria.operateObject">
						<s:iterator value="operateObjectCombo">
							<option value='<s:property value="value"/>'><s:property value="key"/></option>
						</s:iterator>
					</select>
				</td>
				<td>
					<s:text name="auditLog.label.operateType"/>:
				</td>
				<td>
					<select class="combox" name="searchCriteria.operateType">
						<s:iterator value="operateTypeCombo">
							<option value='<s:property value="value"/>'><s:property value="key"/></option>
						</s:iterator>
					</select>
				</td>
				<td>
					<s:text name="auditLog.label.operateLevel"/>:
				</td>
				<td>
					<select class="combox" name="searchCriteria.operateLevel">
						<s:iterator value="operateLevelCombo">
							<option value='<s:property value="value"/>'><s:property value="key"/></option>
						</s:iterator>
					</select>
				</td>
				<td>
					<s:text name="auditLog.label.fromTime"/>：
					<input type="text" class="date" readonly="true" name="searchCriteria.fromDate" />
				</td>
				<td>
					<s:text name="auditLog.label.toTime"/>：
					<input type="text" class="date" readonly="true" name="searchCriteria.toDate" />
				</td>
			</tr>
		</table>
		<div class="subBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit"><s:text name="auditLog.button.query"/></button></div></div></li>
			</ul>
		</div>
	</div>
	</form>
</div>
<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<li>
				<a class="delete" href="../systemmgt/deleteAuditLog?auditId={sid_auditLog}" target="ajaxTodo" title="<s:text name="global.confirm.delete" />">
				<span><s:text name="global.delete" /></span>
				</a>
			</li>
			<li class="line">line</li>
			<li><a class="icon" href="demo/common/dwz-team.xls" target="dwzExport" targetType="navTab" title="<s:text name="global.confirm.export" />"><span><s:text name="global.export.excel" /></span></a></li>
		</ul>
	</div>
	<table class="table" width="100%" layoutH="138">
		<thead>
			<tr>
				<th width="25px"><input type="checkbox" class="checkboxCtrl" group="checkedIDs" /></th>
				<th width="80px"><s:text name="auditlog.table.col.operateObject"></s:text></th>
				<th width="80px"><s:text name="auditlog.table.col.operateType"></s:text></th>
				<th width="50px"><s:text name="auditlog.table.col.operateLevel"></s:text></th>
				<th width="80px"><s:text name="auditlog.table.col.operateOperator"></s:text></th>
				<th width="150px"><s:text name="auditlog.table.col.operateDetail"></s:text></th>
				<th width="100px"><s:text name="auditlog.table.col.operateTime"></s:text></th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="pageData.dataList">
				<tr target="sid_auditLog" rel="<s:property value="auditId"/>">
					<td><input type="checkbox" name="checkedIDs" value="auditId" /></td>
					<td>
					<s:iterator value="operateObjectCombo">
						<s:if test="value==operateObject">
							<s:property value="key"/>
						</s:if>
					</s:iterator>
					</td>
					<td>
					<s:iterator value="operateTypeCombo">
						<s:if test="value==operateType">
							<s:property value="key"/>
						</s:if>
					</s:iterator>
					</td>
					<td>
					<s:iterator value="operateLevelCombo">
						<s:if test="value==operateLevel">
							<s:property value="key"/>
						</s:if>
					</s:iterator>
					</td>
					<td><s:property value="operator.userName"/></td>
					<td><s:property value="operateDetail"/></td>
					<td><s:date name="operateTime" format="yyyy-MM-dd HH:mm:ss" /></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
	<%@ include file="../common/pagination.jsp" %>
</div>
