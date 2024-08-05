<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ include file="../common/commonInclude.jsp"%>
<script type="text/javascript">
var datarange_list = {
	datarangeAppSelectOnChange : function()
	{
		$("#datarangeAppId").val($("#datarangeAppSelect").val());
		if($("#datarangeAppId").val()!="")
		{
			navTabSearch($("#datarangeListPagerForm"),"datarange_list");	
		}
	},
	deleteConfirmMsg : function(url, data){
		alertMsg.confirm("确认要删除所选择的记录吗！", {
			okCall: function(){
				$.post(url, { "datarangeId": $("#sid_datarange").val(), "application.applicationId" : $("#datarangeAppId").val() }, navTabAjaxDone, "json");
			}
		});
	},
	resetfunction : function(){
		$("#searchDatarangeName").val('');
		$("#searchDatarangeCode").val('');
		
	},
	customPageBreak : function(options) {
		var numPerPage= $("#datarange_list_numPerPage").val();
		var pageNum = options.data.pageNum;
		$("#datarangeListPagerForm #pageNum").val(pageNum);
		$("#datarangeListPagerForm #numPerPage").val(numPerPage);
		navTabSearch($("#datarangeListPagerForm"),"datarange_list");
	}
};

function customPageBreak(options) {
	var numPerPage= $("#datarange_list_numPerPage").val();
	var pageNum = options.data.pageNum;
	$("#datarangeListPagerForm #pageNum").val(pageNum);
	$("#datarangeListPagerForm #numPerPage").val(numPerPage);
	navTabSearch($("#datarangeListPagerForm"),"datarange_list");
}

$(document).ready( function() {
	$("#pageData_page_count").html("，共${pageData.page.count}条");
	$("#datarange_list_pagination").attr("totalCount",'${pageData.page.count}');
	$("#datarange_list_pagination").attr("numPerPage",'${pageData.page.length}');
	$("#datarange_list_pagination").attr("currentPage",'${pageData.page.current}');
	$("#datarange_list_numPerPage").val('${pageData.page.length}');
	$("#datarange_list_pagination").each(function(){
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
<form id="datarangeListPagerForm" method="post" action="../datarange/queryDatarangeInfo">
	<input type="hidden" id="pageNum" name="pageNum" value="1" />
	<!--【必须】value=1可以写死-->
	<input type="hidden" id="numPerPage" name="numPerPage" value="<s:property value='%{pageData.page.length}' />" />
	<!--【可选】每页显示多少条-->
	<input type="hidden" id="datarangeAppId" name="application.applicationId" value="${application.applicationId}" />
</form>
<div class="pageHeader">
	<form id="searchForm" rel="datarangeListPagerForm" onsubmit="return navTabSearch(this);" 
		action="../datarange/queryDatarangeInfo" method="post">
		
		<div class="searchBar">
			<table class="searchContent">
				<tr>
					<td><label>&nbsp;&nbsp;&nbsp;&nbsp;<s:text name="datarange.appSelect"/>&nbsp;&nbsp;&nbsp;&nbsp;</label></td>
					<td>
			    		<select id="datarangeAppSelect" name="application.applicationId" style="width: 220px" onchange="datarange_list.datarangeAppSelectOnChange()">
			    		<option value='0'></option>
							<c:forEach items="${applicationList}" var="item" varStatus="status">
								<option value="${item.applicationId}" <c:if test="${item.applicationId==application.applicationId}">selected</c:if>>${item.applicationName}</option>
							</c:forEach>
						</select>
					</td>				
					<td>
						<s:text name="datarange.datarangeName" />:<input 
							name="criteria_datarangeName" type="text" id="searchDatarangeName" class="textInput" value="<s:property  value='searchDatarangeName'/>"/>						
					</td>
					<td>
						<s:text name="datarange.datarangeCode" />:<input 
							name="criteria_datarangeCode" type="text" id="searchDatarangeCode" class="textInput" value="<s:property  value='searchDatarangeCode'/>"/>						
					</td>					
				</tr>
			</table>
		<div class="subBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit"><s:text name="global.search" /></button></div></div></li>
				<li><div class="buttonActive">	<div class="buttonContent"><button type="button" onclick="datarange_list.resetfunction();"><s:text name="global.reset" /></button></div></div></li>
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
									href="../datarange/displayDatarange?application.applicationId=${application.applicationId}"  
									mask="true" target="dialog" title="<s:text name="datarange.add" />" rel="add_datarange"
								</c:if>
								>
							   	<span><s:text name="datarange.add" /></span>
							    </a>
							 </li>
							<li>
								<a class="delete" 
								<c:if test="${application.applicationId==null || application.applicationId==0}">
									href="javascript:;"  onclick="alertMsg.info('请先选择应用系统！')"
								</c:if>
								<c:if test="${application.applicationId>0}">
									href="javascript:;" title="<s:text name="global.confirm.delete" />" 
								    onclick="datarange_list.deleteConfirmMsg('../datarange/deleteDatarange')"
								</c:if>
								><span><s:text name="global.delete" /></span></a>
							</li>
							<li><a class="edit"  
								<c:if test="${application.applicationId==null || application.applicationId==0}">
									href="javascript:;"  onclick="alertMsg.info('请先选择应用系统！')"
								</c:if>
								<c:if test="${application.applicationId>0}">
									mask="true" href="../datarange/displayDatarange?datarangeId={sid_datarange}" 
									target="dialog" title="<s:text name="datarange.edit" />"
								</c:if>
								><span><s:text name="global.update" /></span></a>
							</li>					
						</ul>
					</div>
					<table id="datarangeListTable_001" class="table" width="100%" layoutH="138">
						<thead>
							<tr>
								<th width="40"><s:text name="global.list.number" />
								</th>
								<th><s:text name="datarange.datarangeName" />
								</th>
								<th><s:text name="datarange.datarangeCode" />
								</th>
								<th><s:text name="datarange.datarangeValue" />
								</th>
								<th><s:text name="datarange.datarangeDescription" />
								</th>
								<th><s:text name="global.update.user" />
								</th>
								<th><s:text name="global.update.time" />
								</th>
							</tr>
						</thead>
						<tbody>
						<s:iterator value="pageData.dataList" status="status">
						<tr target="sid_datarange" rel="${datarangeId}">
							<td>${(pageData.page.current-1)*pageData.page.length+status.count}</td>
							<td><s:property value="datarangeName" /></td>
							<td><s:property value="datarangeCode" /></td>
							<td><s:property value="datarangeValue" /></td>
							<td><s:property value="datarangeDescription" /></td>
							<td><s:property value="@com.harry.uac.common.util.AuthUserUtils@getAuthUserNameByUserId(updateUserId)"/></td>
							<td><s:date name="updateTime" format="yyyy-MM-dd HH:mm" /></td>
						</tr>
						</s:iterator>
						</tbody>
					</table>
					<div class="panelBar">
					<div class="pages">
						<span>显示</span>
						<select onchange="datarange_list.customPageBreak({numPerPage:this.value,data:{pageNum:1}})" id="datarange_list_numPerPage">
							<option value="20">20</option>
							<option value="50">50</option>
							<option value="100">100</option>
							<option value="200">200</option>
						</select>
						<span>条</span><span id="pageData_page_count"></span>
					</div>
					<div class="panelBar">
				   <div class="custompagination" rel="datarange_list" id="datarange_list_pagination" targetType="navTab" totalCount="" numPerPage="" pageNumShown="10" currentPage=""></div>
				</div>
</div>

	
