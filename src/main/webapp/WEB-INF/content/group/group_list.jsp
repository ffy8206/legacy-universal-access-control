<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ include file="../common/commonInclude.jsp"%>
<script type="text/javascript">
<!--
var group_list = {
	groupAppSelectOnChange : function() {
		$("#groupListPagerForm #groupAppId").val($("#group_list_groupAppSelect").val());
		if($("#groupListPagerForm #groupAppId").val()!="")
		{
			group_list.queryGroupInfo();
			
		}
		$("#sid_group").val("");
		$("#group_list_groupUserSetTable tr").each(function(i){
			if(i>0)$(this).remove();
		});
		group_list.clearGroupRoleSetTable();
	},
	queryGroupInfo : function() {
		$.ajax({
			type:'GET',
			url:'../group/queryApplicationGroupInfo',
			data:{"application.applicationId":$("#groupListPagerForm #groupAppId").val()},
			dataType:'json',
			timeout: 50000,
			cache: false,
			async: false,
			success: function(json){
				$("#group_list_applicationGroupTable tr").each(function(i){
					if(i>0)$(this).remove();
				})
				var json = eval("(" + json.jsonResult + ")");
					var listNumber = 0;
					$.each(json.pageData.dataList,function(k1,v1){
						var aRow = "<tr target='sid_group' rel='"+v1.groupId+"' onclick=\"group_list.groupSelect("+v1.groupId+",'"+v1.groupName+"')\">"+
						"<td>"+(++listNumber)+"</td><td>"+v1.groupName+"</td></tr>";
						$("#group_list_applicationGroupTable").append(aRow);
					});
				$("#group_list_applicationGroupTable").cssTable();
			}
		});
	},
	groupSelect : function(g_id,g_name) {
		group_list.queryGroupRoleInfo(g_id,g_name);
		if($("#group_list_group_userOrgTree>li").length==0) {
			group_list_ztree.bindTree();
			$.fn.zTree.init($("#group_list_group_userOrgTree"), group_list_ztree.setting, group_list_ztree.zNodes);
			var treeObj = $.fn.zTree.getZTreeObj("group_list_group_userOrgTree");
			var nodes = treeObj.getNodes();
			if (nodes.length>0) {
				eval(nodes[0].click);
				treeObj.selectNode(nodes[0]);
			}
		}
		group_list.queryGroupUserInfo(null,null,g_id);
	},
	checkApplicationState : function () {
		if($("#groupListPagerForm #groupAppId").val()=="")
		{
			alertMsg.info('请先选择应用系统！');
			return true;
		}
		return false;
	},
	addGroup : function() {
		if(group_list.checkApplicationState()){return;}
		var url = "../group/displayGroup?application.applicationId="+$("#groupListPagerForm #groupAppId").val();
		var rel = "datarangeSet";
		var title = "用户组增加";
		var options = {width:600,height:350,max:false,mask:true,maxable:true,minable:false,fresh:true,resizable:true,drawable:false,close:""};
		$.pdialog.open(url, rel, title, options);
	},
	editGroup : function () {
		if(group_list.checkApplicationState()){return;}
		if(group_list.checkGroupState($("#sid_group").val())){return;}
		var url = "../group/displayGroup?application.applicationId="+$("#groupListPagerForm #groupAppId").val()+"&groupId="+$("#sid_group").val();
		var rel = "datarangeSet";
		var title = "用户组修改";
		var options = {width:600,height:350,max:false,mask:true,maxable:true,minable:false,fresh:true,resizable:true,drawable:false,close:""};
		$.pdialog.open(url, rel, title, options);
	},
	deleteConfirmMsg : function(url, data) {
		if(group_list.checkApplicationState()){return;}
		if(group_list.checkGroupState($("#sid_group").val())){return;}
		alertMsg.confirm("确认要删除所选择的记录吗！", {
			okCall: function(){
				$.ajax({
					type:'GET',
					url:url,
					data:{"groupId":$("#sid_group").val()},
					dataType:'json',
					timeout: 50000,
					cache: false,
					async: false,
					success: function(json){
						var json = eval("(" + json.jsonResult + ")");
						if(json.delCount==0)
						{
							alertMsg.info('删除失败！');
						}else{
							alertMsg.info('删除成功！');
						}
						group_list.queryGroupInfo();
					}
				});
			}
		});
	},
	queryGroupRoleInfo : function(g_id,g_name) {
		var groupId = g_id==null?$("#sid_group").val():g_id;
		if(group_list.checkGroupState(groupId)){return;}
		if(g_name!=null)
		{
			$("#group_list_roleSetSpan").html("-<font style='color:red'>["+g_name+"]</font> ");
		}
		$.ajax({
			type:'GET',
			url:'../group/queryGroupRoleInfo',
			data:{"groupId":groupId,"applicationId":$("#groupListPagerForm #groupAppId").val(),"roleSetStatus":$("#group_list_roleSetStatus").val()},
			dataType:'json',
			timeout: 50000,
			cache: false,
			async: false,
			success: function(json){
				group_list.clearGroupRoleSetTable();
				$("#rolecheckAll").attr("checked",false);
				var json = eval("(" + json.jsonResult + ")");
				var listNumber = 0;
				$.each(json.existingRolesList,function(k1,v1){								
					var datarangeSet = v1.datarangeCount>=0?v1.datarangeCount:"";
					var datarangeOperation = "<a href=\"javascript:;\" onclick='group_list.groupRoleDatarangeSet("+v1.applicationId+","+v1.roleId+","+v1.groupId+")'><span><s:text name="role.datarange.set"/></span></a>"									
					var aRow = "<tr target='sid_role' rel='"+v1.roleId+"'><td>"+(++listNumber)+"</td><td>"+
					"<input name='roleSelStatus' type='checkbox' checked='true' value="+v1.roleId+">"
					+"</td><td>"+v1.roleName+"</td><td>"+v1.roleDescription+"</td><td nowrap='nowrap'>"+datarangeSet+"</td><td nowrap='nowrap' align='center'>"+datarangeOperation+"</td></tr>";
					group_list.groupRoleSetTableAddRow(aRow);
				});
				$.each(json.remainingRolesList,function(k1,v1){								
					var aRow = "<tr target='sid_role' rel='"+v1.roleId+"'><td>"+(++listNumber)+"</td><td>"+
					"<input name='roleSelStatus' type='checkbox' value="+v1.roleId+">"
					+"</td><td>"+v1.roleName+"</td><td>"+v1.roleDescription+"</td><td nowrap='nowrap'>&nbsp;-&nbsp;-</td><td nowrap='nowrap'>&nbsp;-&nbsp;-</td></tr>";
					group_list.groupRoleSetTableAddRow(aRow);
				});
				$("#group_list_groupRoleSetTable").cssTable();
			}
		});
	},
	checkGroupState : function(groupId) {
		if(groupId==null || groupId=="")
		{
			alertMsg.info('请先选择用户组！');
			return true;
		}
		return false;
	},
	saveGroupRoleInfo : function(g_id) {
		var groupId = g_id==null?$("#sid_group").val():g_id;
		if(group_list.checkGroupState(groupId)){return;}
		var roles_sel = "";
		var roles_del = "";
		 $("#group_list_groupRoleSetTable input:checkbox[name=roleSelStatus]").each(function(index){                        
	        if(this.checked)
	        {
	        	roles_sel += this.value+",";
	        }
	        else
	        {
	        	roles_del += this.value+",";
	        }
	     });
		 roles_sel = roles_sel.length>0?roles_sel.substring(0,roles_sel.length-1):"";
		 roles_del = roles_del.length>0?roles_del.substring(0,roles_del.length-1):"";
		 $.ajax({
				type:'GET',
				url:'../group/saveGroupRoleInfo',
				data:{"groupId":groupId,"roles_sel":roles_sel,"roles_del":roles_del,"applicationId":$("#groupListPagerForm #groupAppId").val()},
				dataType:'json',
				contentType: "application/x-www-form-urlencoded; charset=utf-8", 
				timeout: 50000,
				cache: false,
				async: false,
				success: function(json){
					alertMsg.correct('保存成功！')
				}
		});
		 group_list.queryGroupRoleInfo(groupId);
	},
	groupRoleSetTableAddRow : function(aRow){
		$("#group_list_groupRoleSetTable").append(aRow);
	},
	clearGroupRoleSetTable : function() {
		$("#group_list_groupRoleSetTable tr").each(function(i){
			if(i>1)$(this).remove();
		});
	},
	groupRoleDatarangeSet : function(appId,roleId,groupId) {
		var url = "../group/toSetDatarange?application.applicationId="+appId+"&role.roleId="+roleId+"&group.groupId="+groupId;
		var rel = "datarangeSet";
		var title = "数据范围设置";
		var options = {width:600,height:400,max:false,mask:true,maxable:true,minable:false,fresh:true,resizable:true,drawable:false,close:""};
		$.pdialog.open(url, rel, title, options);
	},
	queryGroupUserInfo : function(numPerPage,pageNum,g_id) {
		var groupId = g_id==null?$("#sid_group").val():g_id;
		if(group_list.checkGroupState(groupId)){return;}
		if($("#groupListPagerForm #org_orgLayerCode").val()=="")
		{
			alertMsg.info('请选择组织！');
			return;
		}
		numPerPage = (numPerPage==null || numPerPage=="undefined") ? $("#groupuser_list_numPerPage").val():numPerPage;
		pageNum = (pageNum==null || pageNum=="undefined") ? 1:pageNum;
		$.ajax({
			type:'POST',
			url:'../group/queryGroupUserInfo',
			data:{"user.userName":$("#group_list_user_userName").val(),
				"user.userUid":$("#group_list_user_userUid").val(),
				"org.orgLayerCode":$("#groupListPagerForm #org_orgLayerCode").val(),
				"group.groupId":groupId,
				"numPerPage":numPerPage,
				"pageNum":pageNum,
				"userSetStatus":$("#group_list_userSetStatus").val()
				},
			dataType:'json',
			contentType: "application/x-www-form-urlencoded; charset=utf-8", 
			timeout: 50000,
			cache: false,
			async: false,
			success: function(json){
				$("#group_list_groupUserSetTable tr").each(function(i){
					if(i>0)$(this).remove();
				});
				var json = eval("(" + json.jsonResult + ")");
				var listNumber = 0;
				var pageCurrent = json.pageUserData.page.current;
				var pageLength = json.pageUserData.page.length;
				var chkState = ($("#group_list_userSetStatus").val()=="user-existing")? " checked " :"";
				$.each(json.pageUserData.dataList,function(k1,v1){	
					var aRow = "<tr><td>"+((pageCurrent-1)*pageLength+(++listNumber))+"</td><td><input name='userSelStatus' type='checkbox' "+chkState+" value="+v1.userId+"></td><td>"+v1.userName+"</td><td>"+v1.userUid+
					"</td><td>"+v1.userTelephoneNumber+
					"</td><td>"+v1.userPreferredMobile+"</td><td>"+v1.orgName+"</td></tr>";
					$("#group_list_groupUserSetTable").append(aRow);
				});
				$("#group_list_groupUserSetTable").cssTable();
				$("#groupuser_pageData_page_count").html("，共"+json.pageUserData.page.count+"条");
				$("#groupuser_list_pagination").attr("totalCount",json.pageUserData.page.count);
				$("#groupuser_list_pagination").attr("numPerPage",json.pageUserData.page.length);
				$("#groupuser_list_pagination").attr("currentPage",json.pageUserData.page.current);
				$("#groupuser_list_numPerPage").val(json.pageUserData.page.length);
				$("#groupuser_list_pagination").each(function(){
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
		var numPerPage= $("#groupuser_list_numPerPage").val();
		var pageNum = options.data.pageNum;
		group_list.queryGroupUserInfo(numPerPage,pageNum);
	},
	saveGroupUserInfo : function(g_id) {
		var groupId = g_id==null?$("#sid_group").val():g_id;
		if(group_list.checkGroupState(groupId)){return;}
		var users_del = "";
		var users_sel = "";
		 $("#group_list_groupUserSetTable input:checkbox[name=userSelStatus]").each(function(index){                        
			 if(this.checked)
		        {
		        	users_sel += this.value+",";
		        }
		        else
		        {
		        	users_del += this.value+",";
		        }
		     });
		 users_sel = users_sel.length>0?users_sel.substring(0,users_sel.length-1):"";
		 users_del = users_del.length>0?users_del.substring(0,users_del.length-1):"";
		 $.ajax({
				type:'GET',
				url:'../group/saveGroupUserInfo',
				data:{"groupId":groupId,"users_del":users_del,"users_sel":users_sel,"applicationId":$("#groupListPagerForm #groupAppId").val()},
				dataType:'json',
				contentType: "application/x-www-form-urlencoded; charset=utf-8", 
				timeout: 50000,
				cache: false,
				async: false,
				success: function(json){
					alertMsg.correct('保存成功！');
				}
		});
		 group_list.queryGroupUserInfo();
	}
};

function customPageBreak(options) {
	var numPerPage= $("#groupuser_list_numPerPage").val();
	var pageNum = options.data.pageNum;
	group_list.queryGroupUserInfo(numPerPage,pageNum);
}

var group_list_ztree = {
	zNodes : {},
	setting : {
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
				group_list_ztree.zNodes = eval("[" + json.orgTreeData + "]");
				$.each(group_list_ztree.zNodes, function(k,v){
					v.click = "group_list_ztree." + v.click;
				});
			}
		});
	},
	orgTreeNodeSel : function(oId,oName,oLayerCode) {
		$("#groupListPagerForm #user_orgSel").attr("value", oName);
		$("#groupListPagerForm #org_orgId").val(oId);
		$("#groupListPagerForm #org_orgLayerCode").val(oLayerCode);
		if ($("#sid_group").val() != undefined) {
			group_list.queryGroupUserInfo();
		}
	},
};

//-->
</script>

<div id="mainDiv" style="padding:5px">
<!-- top start -->
	<div class="panel" defH="30">
		<h1><s:text name="group.app"/></h1>
		<div class="unit" style="display:block;"> 
			<table border="0">
				<tr>
				<td><label>&nbsp;&nbsp;&nbsp;&nbsp;<s:text name="group.appSelect"/>&nbsp;&nbsp;&nbsp;&nbsp;</label></td>
				<td>
				    <select id="group_list_groupAppSelect" name="groupAppSelect" style="width: 220px" onchange="group_list.groupAppSelectOnChange()">
				    <option value='0'></option>
					<c:forEach items="${applicationList}" var="item" varStatus="status">
						<option value="${item.applicationId}" <c:if test="${item.applicationId==application.applicationId}">selected</c:if>>${item.applicationName}</option>
					</c:forEach>
					</select>
				</td>
				</tr>
			</table>
		</div>
	</div>
	<div class="divider"></div>
<!-- top end -->
<!-- left start -->
<div class="pageContent"  style="float:left; overflow:auto;height:100%; width:230px; background:#fff">
	<div class="tabs">
		<div class="tabsHeader">
			<div class="tabsHeaderContent">
				<ul>
					<li><a href="javascript:;"><span><s:text name="group.groupInfo"/></span></a></li>
				</ul>
			</div>
		</div>
		<div class="tabsContent">
			<div  layoutH="120" style="height:100%;">
				<!-- tab content start -->
					<div class="panelBar">
						<ul class="toolBar">
						    <li>
								<a class="add" href="javascript:;" title="<s:text name="group.add" />" mask="true" onclick="group_list.addGroup()"><span><s:text name="global.add" /></span></a>
							 </li>
							<li>
								<a class="delete" href="javascript:;" title="<s:text name="global.confirm.delete" />" mask="true" onclick="group_list.deleteConfirmMsg('../group/deleteGroups')"><span><s:text name="global.delete" /></span></a>
							</li>
							<li>
								<a class="edit" href="javascript:;" title="<s:text name="group.edit" />" mask="true" onclick="group_list.editGroup()"><span><s:text name="global.update" /></span></a>
							</li>
						</ul>
					</div>
					<table id="group_list_applicationGroupTable" class="list" width="100%">
						<thead>
							<tr>
								<th width="40"><s:text name="global.list.number" />
								</th>
								<th><s:text name="group.groupName" />
								</th>
							</tr>
						</thead>
						<tbody></tbody>
					</table>
				<!-- tab content end -->
			</div>
		</div>
		<div class="tabsFooter">
			<div class="tabsFooterContent"></div>
		</div>
	</div>
</div>
<!-- left end -->
<!-- right start -->
<div class="pageContent"  style="background:#fff">
	<div class="tabs">
		<div class="tabsHeader">
			<div class="tabsHeaderContent">
				<ul>
					<li><a href="javascript:;"><span>用户组成员管理</span></a></li>
					<li><a href="javascript:;"><span>角色分配</span></a></li>
				</ul>
			</div>
		</div>
		<div class="tabsContent">
			<div  layoutH="120" style="height:100%;">
				<!-- tab content start -->
					<div id="group_list_menuContent" layoutH="118" class="menuContent" style="float:left; display:block;">
						<ul id="group_list_group_userOrgTree" class="ztree" style="margin-top:0;width:230px;overflow-x:hidden;height:97%;"></ul>
					</div>
					<div class="searchBar">
						<table class="searchContent">
							<tbody><tr>
								<td>
									选择状态：
									<select id="group_list_userSetStatus" name="userSetStatus" style="width:70px;">
									<option value="user-existing">已选择</option>
									<option value="user-noset">未选择</option>
									</select>
								</td>
								<td>
									姓名：<input type="text" id="group_list_user_userName" value="" name="user.userName" class="textInput" style="width:70px;"/>
								</td>
								<td>
									登录ID：<input type="text" id="group_list_user_userUid" value="" name="user.userUid" class="textInput" style="width:70px;"/>
								</td>
								<td nowrap="nowrap" align="left"><div class="buttonActive"><div class="buttonContent">
								<button onclick="group_list.queryGroupUserInfo()"><s:text name="global.search" /></button></div></div>
								<div class="buttonActive"><div class="buttonContent">
								<button onclick="group_list.saveGroupUserInfo()"><s:text name="global.save" /></button></div></div>
								</td>
							</tr>
						</tbody></table>
					</div>
					<div style="overflow-y:scroll;overflow-x:hidden;height:88%;">
						<table id="group_list_groupUserSetTable" width="100%" class="list">
							<thead>
								<tr>
									<th width="40"><s:text name="global.list.number" />
									</th>
									<th width="40" nowrap="nowrap"><input type="checkbox" class="checkboxCtrl" id="usercheckAll" group="userSelStatus" />
									</th>
									<th nowrap="nowrap"><s:text name="user.name" /></th>
									<th nowrap="nowrap"><s:text name="user.uid" /></th>
									<th nowrap="nowrap"><s:text name="user.telephoneNumber" /></th>
									<th nowrap="nowrap"><s:text name="user.mobile" /></th>
									<th nowrap="nowrap"><s:text name="org.orgName" /></th>
								</tr>
							</thead>
							<tbody></tbody>
						</table>
					</div>
					<div class="panelBar">
						<div class="pages">
							<span>显示</span>
							<select onchange="group_list.customPageBreak({numPerPage:this.value,data:{pageNum:1}})" id="groupuser_list_numPerPage">
								<option value="20">20</option>
								<option value="50">50</option>
								<option value="100">100</option>
								<option value="200">200</option>
							</select>
							<span>条</span><span id="groupuser_pageData_page_count"></span>
						</div>
					    <div class="pagination" id="groupuser_list_pagination" targetType="navTab" totalCount="" numPerPage="" pageNumShown="10" currentPage=""></div>
					</div>
				<!-- tab content end -->
			</div>
			<div  layoutH="120" style="height:100%;">
				<!-- tab content start -->
					<div class="searchBar">
							<table class="searchContent">
								<tbody><tr>
									<td>
										角色分配状态：
										<select id="group_list_roleSetStatus" name="roleSetStatus" style="width:80px;">
										<option value="role-all">全部</option>
										<option value="role-existing">已分配</option>
										<option value="role-noset">未分配</option>
										</select>
									</td>
									<td nowrap="nowrap"><div class="buttonActive"><div class="buttonContent">
									<button onclick="group_list.queryGroupRoleInfo()"><s:text name="global.search" /></button></div></div>
									<div class="buttonActive"><div class="buttonContent">
									<button onclick="group_list.saveGroupRoleInfo()"><s:text name="global.save" /></button></div></div>
									</td>
								</tr>
							</tbody></table>
						</div>
					<div style="overflow-y:scroll;overflow-x:hidden;height:88%;">
						<table id="group_list_groupRoleSetTable" width="100%" class="list">
						<thead>
							<tr>
								<th colspan="4">角色信息<span id="group_list_roleSetSpan"></span></th>
								<th colspan="2">数据范围信息</th>
							</tr>
							<tr>
								<th width="40"><s:text name="global.list.number" />
								</th>
								<th width="40" nowrap="nowrap"><input type="checkbox" class="checkboxCtrl" id="rolecheckAll" group="roleSelStatus" />
								</th>
								<th nowrap="nowrap"><s:text name="role.roleName" />
								</th>
								<th nowrap="nowrap"><s:text name="role.roleDescription" />
								</th>
								<th  nowrap="nowrap" width="60"><s:text name="role.datarange.count" />
								</th>
								<th  nowrap="nowrap" width="60"><s:text name="role.datarange.operation" />
								</th>
							</tr>
						</thead>
						<tbody></tbody>
					</table>
					</div>
				<!-- tab content end -->
			</div>
		</div>
		<div class="tabsFooter">
			<div class="tabsFooterContent"></div>
		</div>
	</div>
</div>
<!-- right end -->

</div>	
 <form id="groupListPagerForm" method="post" action="../group/queryGroupInfo">
    <input type="hidden" name="parentOrgId" value="1"/>
	<input type="hidden" name="pageNum" value="1" />
	<!--【必须】value=1可以写死-->
	<input type="hidden" name="numPerPage" value="<s:property value='%{pageData.page.length}' />" />
	<!--【可选】每页显示多少条-->
	<input type="hidden" id="groupAppId" name="application.applicationId" value="${application.applicationId}" />
	<input type="hidden" id="org_orgId" name="org.orgId" value="${org.orgId}" />
	<input type="hidden" id="org_orgLayerCode" name="org.orgLayerCode" value="${org.orgLayerCode}" />
	<input id="user_orgSel" type="hidden" value=""/>
</form>