<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../common/commonInclude.jsp"%>
<script type="text/javascript">
var user_list = {
	addUser : function() {
		if($("#user_list_org_orgId").val() == "") {
			alertMsg.info('请先选择组织！');	
		} else {
			navTab.openTab("add","../user/displayUser?orgId="+$("#user_list_org_orgId").val(),{title:"添加"});
		}
	},
	resetfunction : function(){
		$("#user_list_user_uesrName").val('');
		$('#user_list_user_userUid').val('');
		
	},
	queryOrgUserInfo : function(numPerPage,pageNum){
		numPerPage = (numPerPage==null || numPerPage=="undefined") ? $("#user_list_numPerPage").val():numPerPage;
		pageNum = (pageNum==null || pageNum=="undefined") ? 1:pageNum;
		$.ajax({
			type:'POST',
			url:'../user/queryUserOrgInfo',
			data:{"criteria_orgName":$("#user_list_org_orgName").val(),
				"org.orgLayerCode":$("#user_list_org_orgLayerCode").val(),
				"org.orgId":$("#user_list_org_orgId").val(),
				"user.uesrName":$("#user_list_user_uesrName").val(),
				"user.userUid":$("#user_list_user_userUid").val(),
				"user.userStatus":$("#user_list_user_userStatus").val(),
				"user.userUsertype":$("#user_list_user_userUsertype").val(),
				"user.userGender":$("#user_list_user_userGender").val(),
				"numPerPage":numPerPage,
				"pageNum":pageNum
				},
			dataType:'json',
			contentType: "application/x-www-form-urlencoded; charset=utf-8", 
			timeout: 50000,
			cache: false,
			async: false,
			success: function(json){
				$("#user_list_orgUserSetTable tr").each(function(i){
					if(i>0)$(this).remove();
				});
				var json = eval("(" + json.jsonResult + ")");
				var listNumber = 0;
				var pageCurrent = json.pageData.page.current;
				var pageLength = json.pageData.page.length;
				$.each(json.pageData.dataList,function(k1,v1){
					var operation = "<a href=\"javascript:;\" onclick=\"user_list.userRoleSet("+v1.userId+",'"+v1.userName+"')\"><span>角色</span></a>&nbsp;&nbsp;<a href=\"javascript:;\" onclick=\"user_list.userGroupSet("+v1.userId+",'"+v1.userName+"')\"><span>用户组</span></a>"
					var aRow = "<tr target='sid_user' rel='"+v1.userId+"' onclick='user_list.getOrgUserKey("+v1.orgId+","+v1.userId+")'><td>"+((pageCurrent-1)*pageLength+(++listNumber))+"</td><td>"+v1.userName+"</td><td>"+v1.userUid+
					"</td><td>"+v1.userTelephoneNumber+
					"</td><td>"+v1.userPreferredMobile+"</td><td>"+v1.userStatus+"</td><td>"+v1.orgName+"</td><td>"+operation+"</td></tr>";
					$("#user_list_orgUserSetTable").append(aRow);
				});
				$("#user_list_orgUserSetTable").cssTable();
				$("#user_list_pageData_page_count").html("，共"+json.pageData.page.count+"条");
				$("#user_list_pagination").attr("totalCount",json.pageData.page.count);
				$("#user_list_pagination").attr("numPerPage",json.pageData.page.length);
				$("#user_list_pagination").attr("currentPage",json.pageData.page.current);
				$("#user_list_numPerPage").val(json.pageData.page.length);
				$("#user_list_pagination").each(function(){
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
			}
		});
	},
	customPageBreak : function(options) {
		var numPerPage= $("#user_list_numPerPage").val();
		var pageNum = options.data.pageNum;
		user_list.queryOrgUserInfo(numPerPage,pageNum);
	},
	deleteConfirmMsg : function (url, data){
		//if(checkApplicationState()){return;}
		if(user_list.checkGroupState($("#sid_user").val())){return;}
		alertMsg.confirm("确认要更新所选择的记录吗！", {
			okCall: function(){
				$.ajax({
					type:'GET',
					url:url,
					data:{"userId":$("#sid_user").val()},
					dataType:'json',
					timeout: 50000,
					cache: false,
					async: false,
					success: function(json){
						var json = eval("(" + json.jsonResult + ")");
						if(json.delCount==0)
						{
							alertMsg.info('无法更新！');
						}else{
							alertMsg.info('更新成功！');
						}
						user_list.queryOrgUserInfo();
					}
				});
			}
		});
	},
	deletePhysicallyConfirmMsg : function (url, data){
		//if(checkApplicationState()){return;}
		if(user_list.checkGroupState($("#sid_user").val())){return;}
		alertMsg.confirm("确认要删除所选择的记录吗！", {
			okCall: function(){
				$.ajax({
					type:'GET',
					url:url,
					data:{"userId":$("#sid_user").val()},
					dataType:'json',
					timeout: 50000,
					cache: false,
					async: false,
					success: function(json){
						var json = eval("(" + json.jsonResult + ")");
						if(json.delCount==0)
						{
							alertMsg.info('无法更新！');
						}else{
							alertMsg.info('更新成功！');
						}
						user_list.queryOrgUserInfo();
					}
				});
			}
		});
	},
	checkGroupState : function(userId) {
		if(userId==null || userId=="")
		{
			alertMsg.info('请先选择用户！');
			return true;
		}
		return false;
	},
	getOrgUserKey : function (o_id,u_id) { 
			$("#user_list_edit_orgUser").attr("href","../user/displayUser?userId={sid_user}&orgId="+o_id);
	},
	userRoleSet : function(userId,userName) {
		navTab.openTab("user-role","../user/userSetRole!userSetRole?user.userId="+userId,{title:userName+"-角色维护"});
	},
	userGroupSet : function (userId,userName) {
		navTab.openTab("user-group","../user/userSetGroup!userSetGroup?user.userId="+userId,{title:userName+"-用户组维护"});
	},
	directsearchUserStatus : function(){
		user_list.queryOrgUserInfo();
	},
	directsearchUserType : function(){
		user_list.queryOrgUserInfo();
	},
	directsearchUserGender : function(){
		user_list.queryOrgUserInfo();
	}
};

function customPageBreak(options) {
	var numPerPage= $("#user_list_numPerPage").val();
	var pageNum = options.data.pageNum;
	user_list.queryOrgUserInfo(numPerPage,pageNum);
}

var user_list_ztree = {
	zUserMgrTreeNodes : {},
	userMgrTreeSetting : {
		view: {
			dblClickExpand: false
		},
		data: {
			simpleData: {
				enable: true
			}
		}
	},
	bindTree : function() {
		$.ajax({
			type:'GET',
			url:'../common/getOrgZTreeJsonData',
			data:{"parentOrgId":$("input[name='parentOrgId']").val()},
			dataType:'json',
			timeout: 50000,
			cache: false,
			async: false,
			success: function(json){
				user_list_ztree.zUserMgrTreeNodes = eval("[" + json.orgTreeData + "]");
				$.each(user_list_ztree.zUserMgrTreeNodes, function(k,v){
					v.click = "user_list_ztree." + v.click;
				});
			}
		});
	},
	orgTreeNodeSel: function(oId,oName,oLayerCode) {
		$("#user_list_org_orgId").val(oId);
		$("#user_list_org_orgName").val(oName);
		$("#user_list_org_orgLayerCode").val(oLayerCode);
		user_list.queryOrgUserInfo();
		
	}
};

$(document).ready( function() {
	user_list_ztree.bindTree();
	$.fn.zTree.init($("#userMgr_OrgTree"), user_list_ztree.userMgrTreeSetting, user_list_ztree.zUserMgrTreeNodes);
	var treeObj = $.fn.zTree.getZTreeObj("userMgr_OrgTree");
	var nodes = treeObj.getNodes();
	if (nodes.length>0) {
		eval(nodes[0].click);
		treeObj.selectNode(nodes[0]);
	}
	user_list.queryOrgUserInfo();
});
</script>
<div class="pageContent" style="padding:5px;">
<form id="orgUserListPagerForm" method="post" action="../user/queryUserOrgInfo">
    <input type="hidden" name="parentOrgId" value=""/>
</form>
	<div class="tabs" style="width:254px;float:left; display:block;overflow:auto;">
		<div class="tabsHeader">
			<div class="tabsHeaderContent">
				<ul>
					<li><a href="javascript:;"><span>组织结构树</span></a></li>
				</ul>
			</div>
		</div>
		<div class="tabsContent" style="height:92%">
			<div>
				<div>
					<ul id="userMgr_OrgTree" class="ztree" style="margin-top:0; width:220px;height:97%"></ul>
				</div>
				<div id="jbsxBox" class="unitBox" style="margin-left:246px;">
					<!--#include virtual="list1.html" -->
				</div>
	
			</div>
		</div>
		
		<div class="tabsFooter">
			<div class="tabsFooterContent"></div>
		</div>
	</div>
	<!-- ------ -->
	    <div class="tabs">
		<div class="tabsHeader">
			<div class="tabsHeaderContent">
				<ul>
					<li><a href="javascript:;"><span>用户管理</span></a></li>
				</ul>
			</div>
		</div>
		<div class="tabsContent" style="height:92%">
			<div>
				<div layoutH="80" style="float:left; display:block; overflow:auto; width:100%; border:solid 1px #CCC; line-height:21px; background:#fff">
					<div class="unitBox" id="jbsxBox">
					<div class="pageHeader">
						<div class="searchBar">
							<form id="orgUserSearchForm" rel="orgUserListPagerForm" onsubmit="return navTabSearch(this);" action="../user/queryUserOrgInfo" method="post">
							<input type="hidden" id="user_list_org_orgId" name="org.orgId" value=""/>
							<input type="hidden" id="user_list_org_orgLayerCode" name="org.orgLayerCode" value=""/>
							<!--   <input type="hidden" name="user.userId" id="user_userId" value="${user.userId}">-->
							<table class="searchContent">
								<tbody><tr>
									<td>
										组织名称：<input type="text" readonly="true" id="user_list_org_orgName" name="criteria_orgName" class="textInput readonly"  value=''/>
									</td>
									<td>
										姓名：<input type="text" id="user_list_user_uesrName" name="user.uesrName" class="textInput" style="width:80px;" value=''/>
									</td>
									<td>
										登录ID：<input type="text" id="user_list_user_userUid" name="user.userUid" class="textInput" style="width:80px;" value=''/>
									</td>
									</tr>
									<tr>
									<td>
										账号状态：
										<select id="user_list_user_userStatus" name="user.userStatus" style="width:80px;" value='' onchange="user_list.directsearchUserStatus()">
											<option value="2">全部</option>
											<option value="0">使用中</option>
											<option value="1">锁定</option>
										</select>
									</td>
									<td>
										用户类型：
										<select id="user_list_user_userUsertype" name="user.userUsertype" style="width:80px;" value='' onchange="user_list.directsearchUserType()">
											<option value="">全部</option>
											<option value="0">内部用户</option>
											<option value="1">外部用户</option>
										</select>
									</td>
									<td>
								      	性别：
								      	<select id="user_list_user_userGender" name="user.userGender" style="width: 80px" value='' onchange="user_list.directsearchUserGender()">
								      	    <option value="4">全部</option>
								      	    <option value="1">男</option>
								      	    <option value="2">女</option>
								      	    <option value="3">未知</option>
								      	</select>
									</td>
									<td><div class="buttonActive">
										<div class="buttonContent">
											<button type="button" onclick="user_list.queryOrgUserInfo();" ><s:text name="global.search" /></button>
										</div>
										</div>
									</td>
									<td><div class="buttonActive">	
									    <div class="buttonContent">
									    <button type="button" onclick="user_list.resetfunction();"><s:text name="global.reset" /></button>
									    </div>
									    </div>
									</td>
								</tr>
								</tbody></table>
							</form>
						</div>
					</div>
					<div class="panelBar">
						<ul class="toolBar">
							<li class=""><a onclick="user_list.addUser();" class="add" mask="true"><span><s:text name="global.add" /></span></a></li>
			                <li>
								<a class="delete" href="javascript:;" title="<s:text name="global.confirm.delete" />" mask="true" onclick="user_list.deleteConfirmMsg('../user/deleteUser')"><span><s:text name="global.delete" /></span></a>
							</li>
							<li><a id="user_list_edit_orgUser" target="navTab" href="../user/displayUser?userId={sid_user}&orgId=" class="edit"><span><s:text name="global.update" /></span></a></li>
							<li>
								<a class="delete" href="javascript:;" title="<s:text name="彻底删除" />" mask="true" onclick="user_list.deletePhysicallyConfirmMsg('../user/deleteUserPhysically')"><span><s:text name="彻底删除" /></span></a>
							</li>
						</ul>
					</div>
					<table id="user_list_orgUserSetTable" width="100%" class="list">
						<thead>
							<tr>
								<th width="40"><s:text name="global.list.number" />
								</th>
								<th><s:text name="user.name" /></th>
								<th><s:text name="user.uid" /></th>
								<th><s:text name="user.telephoneNumber" /></th>
								<th><s:text name="user.mobile" /></th>
								<th><s:text name="user.status" /></th>
								<th>组织</th>
								<th>操作</th>
							</tr>
						</thead>
					</table>
				</div>
				</div>
				<div id="jbsxBox" class="unitBox" style="float:left; display:block; overflow:auto; width:100%; border:solid 1px #CCC; line-height:21px; background:#fff">
					<div class="panelBar">
					<div class="pages">
						<span>显示</span>
						<select onchange="user_list.customPageBreak({numPerPage:this.value,data:{pageNum:1}})" id="user_list_numPerPage">
							<option value="20">20</option>
							<option value="50">50</option>
							<option value="100">100</option>
							<option value="200">200</option>
						</select>
						<span>条</span><span id="user_list_pageData_page_count"></span>
					</div>
				   <div class="pagination" id="user_list_pagination" targetType="navTab" totalCount="" numPerPage="" pageNumShown="10" currentPage=""></div>
				</div>
				</div>
			</div>
		</div>
		<div class="tabsFooter">
			<div class="tabsFooterContent"></div>
		</div>
	</div>
</div>