<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../common/commonInclude.jsp"%>
<form id="sync_user_list_pagerForm" method="post" action="../sync/querySyncUserInfo">
    <input type="hidden" name="pageNum" value="1" /><!--【必须】value=1可以写死-->
    <input type="hidden" name="numPerPage" value="<s:property value='%{pageData.page.length}' />" /><!--【可选】每页显示多少条-->
</form>
<div class="pageHeader">
	<form id="sync_user_list_searchForm" rel="sync_user_list_pagerForm" onsubmit="return navTabSearch(this);" action="../org/queryOrgInfo" method="post">
	<div class="searchBar">
		<table class="searchContent">
			<tr>
				<td>
					<s:text name="sync.employ.number" />:<input name="criteria_orgName" type="text" class="textInput" />
				</td>
			</tr>
		</table>
		<div class="subBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit"><s:text name="global.search" /></button></div></div></li>
				<!-- <li><a class="button" href="#" target="dialog" mask="true" title="TODO:"><span><s:text name="global.advance.search" /></span></a></li> -->
			</ul>
		</div>
	</div>
	</form>
</div>
<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<li>
				<a class="add" href="../sync/confirmSyncUser?empId={empNumber}&&syncTime={syncTime}" target="navTab">
			   	<span><s:text name="sync.import" /></span>
			    </a>
			 </li>
			<li>
				<a class="delete" href="../sync/disableSyncUser" rel="syncId" target="selectedTodo">
				<span><s:text name="sync.disable" /></span>
				</a>
			</li>
		</ul>
	</div>
	<table class="table" width="100%" layoutH="138">
		<thead>
			<tr>
			    <th width="30"><input type="checkbox" class="checkboxCtrl" group="syncId" /></th>
				<th width="80"><s:text name="sync.employ.number" /></th>
				<th width="120"><s:text name="sync.username" /></th>
				<th width="100"><s:text name="sync.basic.update" /></th>
				<th width="150"><s:text name="sync.basic.type" /></th>
				<th width="180"><s:text name="sync.assign.update" /></th>
				<th width="80" align="center"><s:text name="sync.basic.time" /></th>
				
				<!-- <th width="80"><s:text name="sync.assign.time" /></th> -->
				
			</tr>
		</thead>
		<tbody>
		<s:iterator value="pageData.dataList">
			<tr muliTarget="empNumber,syncTime" muliRel="<s:property value="employeeNumber" />,<s:property value="userCreateTime" />">
				<td><input type="checkbox" name="syncId"  value="<s:property value="id" />"/></td>
				<td><s:property value="employeeNumber" /></td>
				<td><s:property value="employeeName" /></td>
				<td><s:property value="userUpdate" /></td>
				<td><s:property value="userSyncType" /></td>
				<td><s:property value="assUpdate" /></td>
				<td><s:property value="userCreateTime" /></td>
				
				<!-- <td><s:property value="assCreateTime" /></td>-->
			</tr>
		</s:iterator>
		</tbody>
	</table>
	<%@ include file="../common/pagination.jsp" %>
</div>
