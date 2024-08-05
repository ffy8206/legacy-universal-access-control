<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../common/commonInclude.jsp"%>
<script type="text/javascript">
var application_list = {
	resetfunction :  function() {
		$("#searchValue").val('');
	}
};
</script>
<form id="pagerForm" method="post" action="../application/queryApplicationInfo">
	<input type="hidden" name="pageNum" value="1" />
	<!--【必须】value=1可以写死-->
	<input type="hidden" name="numPerPage" value="<s:property value='%{pageData.page.length}' />" />
	<!--【可选】每页显示多少条-->
</form>

<div class="pageHeader">
	<form id="searchForm" rel="pagerForm" onsubmit="return navTabSearch(this);" action="../application/queryApplicationInfo" method="post">
		<div class="searchBar">
			<table class="searchContent">
				<tr>
					<td><s:text name="application.applicationName" />:
						<input type="text" name="criteria_applicationName" id="searchValue" class="textInput" value="<s:property  value='searchApplicationName'/>" />
			        </td>
				</tr>
			</table>
			<div class="subBar">
				<ul>
					<li><div class="buttonActive">	<div class="buttonContent"><button type="submit"><s:text name="global.search" /></button></div></div></li>
					<li><div class="buttonActive">	<div class="buttonContent"><button type="button" onclick="application_list.resetfunction();"><s:text name="global.reset" /></button></div></div></li>
				</ul>
			</div>
		</div>
	</form>
</div>
<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
		    <li>
				<a class="add" href="../application/displayApplication" target="navTab"  mask="true" title="<s:text name="application.add" />" rel="add_application">
			   	<span><s:text name="global.add" /></span>
			    </a>
			 </li>
			<li>
				<a class="delete" href="../application/deleteApplications?applicationId={sid_application}"  target="ajaxTodo" title="<s:text name="global.confirm.delete" />">
				<span><s:text name="global.delete" /></span>
				</a>
			</li>
			<li><a class="edit" href="../application/displayApplication?applicationId={sid_application}" 
				target="navTab"  mask="true"title="<s:text name="application.edit" />"><span><s:text
							name="global.update" />
				</span>
			</a>
			</li>
		</ul>
	</div>
	<table class="table" width="100%" layoutH="138">
		<thead>
			<tr>
				<th width="120"><s:text name="global.list.number" />
				</th>
				<th><s:text name="application.applicationName" />
				</th>
				<th width="100"><s:text name="application.applicationContact" />
				</th>
				<th width="150"><s:text name="application.applicationContactPhone" />
				</th>
				<th width="80"><s:text name="global.update.user" />
				</th>
				<th width="80"><s:text name="global.update.time" />
				</th>
			</tr>
		</thead>
		<tbody>
		<s:iterator value="pageData.dataList" status="status">
			<tr target="sid_application" rel="${applicationId}">
				<td>${(pageData.page.current-1)*pageData.page.length+status.count}</td>
				<td>${applicationName}</td>
				<td>${applicationContact}</td>
				<td>${applicationContactPhone}</td>
				<td><s:property value="@com.harry.uac.common.util.AuthUserUtils@getAuthUserNameByUserId(updateUserId)"/></td>
				<td><s:date name="updateTime" format="yyyy-MM-dd" /></td>
			</tr>
		</s:iterator>
		</tbody>
	</table>
	<%@ include file="../common/pagination.jsp" %>
</div>
