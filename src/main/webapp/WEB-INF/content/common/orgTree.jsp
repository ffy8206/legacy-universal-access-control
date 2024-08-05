<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../common/commonInclude.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link href="../themes/css/orgTree.css" rel="stylesheet" type="text/css" />
<script type='text/javascript' src='../js/orgTree.js'></script>

<form id="orgTree_pagerForm" action="../common/queryOrgInfo" method="post">
 <input type="hidden" name="pageNum" value="1" /><!--【必须】value=1可以写死-->
 <input type="hidden" name="numPerPage" value="<s:property value='%{pageData.page.length}' />" /><!--【可选】每页显示多少条-->
</form>
<div class="pagePanel">
<div class="leftPanel">
<div>
<ul class="tree treeFolder treeCheck collapse" id="orgTree"></ul>
</div>
</div>
<div class="rightPanel">
<div>
<form rel="orgTree_pagerForm" method="post" action="../common/queryOrgInfo"
	onsubmit="return divSearch(this, 'orgTree_refreshArea', ajaxDialogSearchDone);">
	 <input type="hidden" name="parentOrgId" value="<s:property value='%{parentOrgId}'/>"/>
<div class="searchBar">
<ul class="searchInput">
	<li><s:text name="orgTree.org.displayname"></s:text> <input
		class="textInput" name="criteria_orgName" type="text"></li>
</ul>
<div class="subBar">
<ul>
	<li>
	<div class="buttonActive">
	<div class="buttonContent">
	<button type="submit"><s:text name="orgTree.button.query"></s:text></button>
	</div>
	</div>
	</li>
</ul>
</div>
</div>
</form>
</div>
<div>
<table class="table" layoutH="118" targetType="dialog" width="100%" style="overflow: a">
	<thead>
		<tr>
			<th width="30"><input type="checkbox" class="checkboxCtrl" group="orgId" /></th>
			<th width="120"><s:text name="orgTree.org.orgCode" /></th>
			<th><s:text name="orgTree.org.displayname" /></th>
			<th width="80"><s:text name="orgTree.org.admin" /></th>
			<th width="100"><s:text name="orgTree.org.creator" /></th>
		</tr>
	</thead>
	<tbody id="orgTree_refreshArea">
	</tbody>
</table>

</div>

</div>
<div id="orgTree_confirmBtn" class="buttonActive">
	<div class="buttonContent">
	<button class="button"></button>
	<button type="button" multLookup="orgId" warn="<s:text name="global.orgTree.noselect.warning"/>"><s:text name="orgTree.button.confirm"/></button>
	</div>
</div>
<div id="orgTree_cancelBtn" class="buttonActive">
	<div class="buttonContent">
	<button class="close"><s:text name="orgTree.button.cancel"/></button>
	</div>
</div>
</div>
