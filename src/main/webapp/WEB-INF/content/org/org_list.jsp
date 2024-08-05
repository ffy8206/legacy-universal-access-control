<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../common/commonInclude.jsp"%>

<form id="org_list_pagerForm" method="post" action="../org/queryOrgInfo">
    <input type="hidden" name="pageNum" value="1" /><!--【必须】value=1可以写死-->
    <input type="hidden" name="numPerPage" value="<s:property value='%{pageData.page.length}' />" /><!--【可选】每页显示多少条-->
</form>

<div class="pageHeader">
	<form id="org_list_searchForm" rel="org_list_pagerForm" onsubmit="return navTabSearch(this);" action="../org/queryOrgInfo" method="post">
	<div class="searchBar">
		<table class="searchContent">
			<tr>
				<td>
					<s:text name="org.orgCode" />:<input name="criteria_orgCode" type="text" class="textInput" />
				</td>
				<td>
					<s:text name="org.displayName" />:<input name="criteria_orgName" type="text" class="textInput" />
				</td>
				<td>
					<s:text name="org.status" />:
								<select id="org_list_criteria_orgStatus" name="criteria_orgStatus" >
											<option value=""></option>
											<option value="0"><s:text name="org.status.noraml" /></option>
											<option value="1"><s:text name="org.status.stop" /></option>
								</select>
				</td>
				<td>
					<s:text name="org.manager" />:<input name="criteria_orgManager" type="text" class="textInput" />
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
				<a class="add" href="../org/displayOrg" target="navTab" title="<s:text name="org.add" />" rel="add_org">
			   	<span><s:text name="global.add" /></span>
			    </a>
			 </li>
			<li>
				<a class="delete" href="../org/deleteOrgs?oid={sid_org}" target="ajaxTodo" title="<s:text name="global.confirm.delete" />">
				<span><s:text name="global.delete" /></span>
				</a>
			</li>
			<li>
				<a class="edit" href="../org/displayOrg?oid={sid_org}" target="navTab" title="<s:text name="org.edit" />"  rel="edit_org">
				<span><s:text name="global.update" /></span>
				</a>
			</li>
			<li class="line">line</li>
			<li><a class="icon" href="demo/common/dwz-team.xls" target="dwzExport" targetType="navTab" title="<s:text name="global.confirm.export" />"><span><s:text name="global.export.excel" /></span></a></li>
		</ul>
	</div>
	<table class="table" width="100%" layoutH="138">
		<thead>
			<tr>
				<th width="30"></th>
				<th width="120"><s:text name="org.orgCode" /></th>
				<th><s:text name="org.displayName" /></th>
				<th width="100"><s:text name="org.initials" /></th>
				<th width="150"><s:text name="org.style" /></th>
				<th width="80" align="center"><s:text name="org.status" /></th>
				<th width="80"><s:text name="org.parent.id" /></th>
				<th width="80"><s:text name="org.manager" /></th>
			</tr>
		</thead>
		<tbody>
		<s:iterator value="pageData.dataList">
			<tr target="sid_org" rel="<s:property value="orgId" />">
				<td><s:property value="orgId" /></td>
				<td><s:property value="orgCode" /></td>
				<td><s:property value="orgName" /></td>
				<td><s:property value="orgInitials" /></td>

				<td>
					<s:iterator value="orgStyleCombox" >
						<s:if test="orgStyle==key">
							<s:property value="value"/>
						</s:if>
					</s:iterator>
				</td>
				<td>
					<s:iterator value="orgStatusCombox" >
						<s:if test="orgStatus==key">
							<s:property value="value"/>
						</s:if>
					</s:iterator>
				</td>
				<td><s:property value="orgParentId" /></td>
				<td><s:property value="orgManagerUid" /></td>
			</tr>
		</s:iterator>
		</tbody>
	</table>
	<%@ include file="../common/pagination.jsp" %>
</div>
