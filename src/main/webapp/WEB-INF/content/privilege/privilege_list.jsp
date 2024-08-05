<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ include file="../common/commonInclude.jsp"%>
<script type="text/javascript">
var privilege_list = {
	privilegeAppSelectOnChange : function() {
		$("#privilege_list_privilegeAppId").val($("#privilege_list_privilegeAppSelect").val());
		if($("#privilege_list_privilegeAppId").val()!="")
		{
			navTabSearch($("#privilegeListPagerForm"),"privilege_list");	
		}
	},
	deleteConfirmMsg : function(url, data) {
		alertMsg.confirm("确认要删除所选择的记录吗！", {
			okCall: function(){
				$.post(url, { "privilegeId": $("#sid_privilege").val(), "application.applicationId" : $("#privilege_list_privilegeAppId").val() }, navTabAjaxDone, "json");
			}
		});
	},
	resetfunction : function() {
		$("#privilege_list_searchPrivilegeName").val('');
		$("#privilege_list_searchPrivilegeCode").val('');
		
	},
	customPageBreak : function(options) {
		var numPerPage= $("#privilege_list_numPerPage").val();
		var pageNum = options.data.pageNum;
		$("#privilegeListPagerForm #pageNum").val(pageNum);
		$("#privilegeListPagerForm #numPerPage").val(numPerPage);
		navTabSearch($("#privilegeListPagerForm"),"privilege_list");
	}
};

function customPageBreak(options) {
	var numPerPage= $("#privilege_list_numPerPage").val();
	var pageNum = options.data.pageNum;
	$("#privilegeListPagerForm #pageNum").val(pageNum);
	$("#privilegeListPagerForm #numPerPage").val(numPerPage);
	navTabSearch($("#privilegeListPagerForm"),"privilege_list");
}

$(document).ready( function() {
	$("#pageData_page_count").html("，共${pageData.page.count}条");
	$("#privilege_list_pagination").attr("totalCount",'${pageData.page.count}');
	$("#privilege_list_pagination").attr("numPerPage",'${pageData.page.length}');
	$("#privilege_list_pagination").attr("currentPage",'${pageData.page.current}');
	$("#privilege_list_numPerPage").val('${pageData.page.length}');
	$("#privilege_list_pagination").each(function(){
		var $this = $(this);
		$this.custompagination({
			targetType:$this.attr("targetType"),
			rel:$this.attr("rel"),
			totalCount:$this.attr("totalCount"),
			numPerPage:$this.attr("numPerPage"),
			pageNumShown:$this.attr("pageNumShown"),
			currentPage:$this.attr("currentPage")
		});
	});
});

</script>
<form id="privilegeListPagerForm" method="post" action="../privilege/queryPrivilegeInfo">
	<input type="hidden" id="pageNum" name="pageNum" value="1" />
	<!--【必须】value=1可以写死-->
	<input type="hidden" id="numPerPage" name="numPerPage" value="<s:property value='%{pageData.page.length}' />" />
	<!--【可选】每页显示多少条-->
	<input type="hidden" id="privilege_list_privilegeAppId" name="application.applicationId" value="${application.applicationId}" />
</form>
<div class="pageHeader">
	<form id="privilege_list_searchForm" rel="privilegeListPagerForm" onsubmit="return navTabSearch(this);" 
		action="../privilege/queryPrivilegeInfo" method="post">
		
		<div class="searchBar">
			<table class="searchContent">
				<tr>
					<td><label>&nbsp;&nbsp;&nbsp;&nbsp;<s:text name="privilege.appSelect"/>&nbsp;&nbsp;&nbsp;&nbsp;</label></td>
					<td>
			    		<select id="privilege_list_privilegeAppSelect" name="application.applicationId" style="width: 220px"  onchange="privilege_list.privilegeAppSelectOnChange()">
			    		<option value='0'></option>
							<c:forEach items="${applicationList}" var="item" varStatus="status">
								<option value="${item.applicationId}" <c:if test="${item.applicationId==application.applicationId}">selected</c:if>>${item.applicationName}</option>
							</c:forEach>
						</select>
					</td>				
					<td>
						<s:text name="privilege.privilegeName" />:<input 
							name="criteria_privilegeName" type="text" id="privilege_list_searchPrivilegeName" class="textInput" value="<s:property  value='searchPrivilegeName'/>" />						
					</td>
					<td>
						<s:text name="privilege.privilegeCode" />:<input 
							name="criteria_privilegeCode" type="text" id="privilege_list_searchPrivilegeCode" class="textInput" value="<s:property value='searchPrivilegeCode'/>"/>						
					</td>					
				</tr>
			</table>
		<div class="subBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit"><s:text name="global.search" /></button></div></div></li>
				<li><div class="buttonActive">	<div class="buttonContent"><button type="button" onclick="privilege_list.resetfunction();"><s:text name="global.reset" /></button></div></div></li>
				<!-- <li><a class="button" href="#" target="dialog" mask="true" title="TODO:"><span><s:text name="global.advance.search" /></span></a></li> -->
			</ul>
		</div>
		</div>
	</form>
</div>
<div class="pageContent" >
 
				  	<div class="panelBar">
						<ul class="toolBar">
						    <li>
								<a class="add"
								<c:if test="${application.applicationId==null || application.applicationId==0}">
									href="javascript:;"  onclick="alertMsg.info('请先选择应用系统！')"
								</c:if>
								<c:if test="${application.applicationId>0}">
									href="../privilege/displayPrivilege?application.applicationId=${application.applicationId}"  
									mask="true" target="dialog" title="<s:text name="privilege.add" />" rel="add_privilege"
								</c:if>
								>
							   	<span><s:text name="privilege.add" /></span>
							    </a>
							 </li>
							<li>
								<a class="delete" 
								<c:if test="${application.applicationId==null || application.applicationId==0}">
									href="javascript:;"  onclick="alertMsg.info('请先选择应用系统！')"
								</c:if>
								<c:if test="${application.applicationId>0}">
									href="javascript:;" title="<s:text name="global.confirm.delete" />" 
								    onclick="privilege_list.deleteConfirmMsg('../privilege/deletePrivilege')"
								</c:if>
								><span><s:text name="global.delete" /></span></a>
							</li>
							<li><a class="edit"  
								<c:if test="${application.applicationId==null || application.applicationId==0}">
									href="javascript:;"  onclick="alertMsg.info('请先选择应用系统！')"
								</c:if>
								<c:if test="${application.applicationId>0}">
									mask="true" href="../privilege/displayPrivilege?privilegeId={sid_privilege}" 
									target="dialog" title="<s:text name="privilege.edit" />"
								</c:if>
								><span><s:text name="global.update" /></span></a>
							</li>						
						</ul>
					</div>
					<table id="privilege_list_privilegeListTable_001" class="table" width="100%" layoutH="138">
						<thead>
							<tr>
								<th width="40"><s:text name="global.list.number" />
								</th>
								<th><s:text name="privilege.privilegeName" />
								</th>
								<th><s:text name="privilege.privilegeCode" />
								</th>
								<th><s:text name="privilege.privilegeDescription" />
								</th>
								<th width="120"><s:text name="privilege.privilegeRemark" />
								</th>
								<th><s:text name="global.update.user" />
								</th>
								<th><s:text name="global.update.time" />
								</th>
							</tr>
						</thead>
						<tbody>
						<s:iterator value="pageData.dataList" status="status">
						<tr target="sid_privilege" rel="${privilegeId}">
							<td>${(pageData.page.current-1)*pageData.page.length+status.count}</td>
							<td><s:property value="privilegeName" /></td>
							<td><s:property value="privilegeCode" /></td>
							<td><s:property value="privilegeDescription" /></td>
							<td><s:property value="privilegeRemark" /></td>
							<td><s:property value="@com.harry.uac.common.util.AuthUserUtils@getAuthUserNameByUserId(updateUserId)"/></td>
							<td><s:date name="updateTime" format="yyyy-MM-dd HH:mm" /></td>							
						</tr>
						</s:iterator>
						</tbody>
					</table>
					<div class="panelBar">
					<div class="pages">
						<span>显示</span>
						<select onchange="privilege_list.customPageBreak({numPerPage:this.value,data:{pageNum:1}})" id="privilege_list_numPerPage">
							<option value="20">20</option>
							<option value="50">50</option>
							<option value="100">100</option>
							<option value="200">200</option>
						</select>
						<span>条</span><span id="pageData_page_count"></span>
					</div>
				   <div class="custompagination" rel="privilege_list" id="privilege_list_pagination" targetType="navTab" totalCount="" numPerPage="" pageNumShown="10" currentPage=""></div>
				</div>
</div>

	
