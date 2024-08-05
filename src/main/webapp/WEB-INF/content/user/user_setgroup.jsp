<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ include file="../common/commonInclude.jsp"%>
<script type="text/javascript">
<!--
var user_setgroup = {
	queryGroupUserInfo : function() {
		if($("#user_setgroup_app_appId").val()=="")
		{
			alertMsg.info('请先选择应用系统！');
			return;
		}
		$.ajax({
			type:'POST',
			url:'../user/queryUserGroupInfo',
			data:{"application.applicationId":$("#user_setgroup_app_appId").val(), "user.userId":"${user.userId}", "groupSetStatus":$("#user_setgroup_groupSetStatus").val()},
			dataType:'json',
			timeout: 50000,
			cache: false,
			async: false,
			success: function(json){
				user_setgroup.clearUserGroupSetTable();
				$("#user_setgroup_groupcheckAll").attr("checked",false);
				var json = eval("(" + json.jsonResult + ")");
				var listNumber = 0;
				$.each(json.existingGroupsList,function(k1,v1){						
					var aRow = "<tr target='sid_group' rel='"+v1.groupId+"'><td>"+(++listNumber)+"</td><td>"+
					"<input name='groupSelStatus' type='checkbox' checked='true' value="+v1.groupId+">"
					+"</td><td>"+v1.groupName+"</td><td>"+v1.groupDescription+"</td></tr>";
					$("#user_setgroup_groupUserSetTable").append(aRow);
				});
				$.each(json.remainingGroupsList,function(k1,v1){								
					var aRow = "<tr target='sid_group' rel='"+v1.groupId+"'><td>"+(++listNumber)+"</td><td>"+
					"<input name='groupSelStatus' type='checkbox' value="+v1.groupId+">"
					+"</td><td>"+v1.groupName+"</td><td>"+v1.groupDescription+"</td></tr>";
					$("#user_setgroup_groupUserSetTable").append(aRow);
				});
				$("#user_setgroup_groupUserSetTable").cssTable();
			}
		});
	},
	saveGroupUserInfo : function() {
		if($("#user_setgroup_app_appId").val()=="")
		{
			alertMsg.info('请先选择应用系统！');
			return;
		}
		var groups_del = "";
		var groups_sel = "";
		 $("#user_setgroup_groupUserSetTable input:checkbox[name=groupSelStatus]").each(function(index){                        
			 if(this.checked)
		        {
				 groups_sel += this.value+",";
		        }
		        else
		        {
		        	groups_del += this.value+",";
		        }
		     });
		 groups_sel = groups_sel.length>0?groups_sel.substring(0,groups_sel.length-1):"";
		 groups_del = groups_del.length>0?groups_del.substring(0,groups_del.length-1):"";
		 $.ajax({
				type:'GET',
				url:'../user/saveUserSetGroupInfo',
				data:{"userId":"${user.userId}","groups_del":groups_del,"groups_sel":groups_sel,"application.applicationId":$("#user_setgroup_app_appId").val()},
				dataType:'json',
				//contentType: "application/x-www-form-urlencoded; charset=utf-8", 
				timeout: 50000,
				cache: false,
				async: false,
				success: function(json){
					alertMsg.correct('保存成功！');
				}
		});
		user_setgroup.queryGroupUserInfo();
	},
	clearUserGroupSetTable : function() {
		$("#user_setgroup_groupUserSetTable tr").each(function(i){
			if(i>0)$(this).remove();
		});
	},
	directsearch : function (){
		user_setgroup.queryGroupUserInfo();
	}	
};
var user_setgroup_ztree = {
	zAppTreeNodes : {},
	appTreeSetting : {
		view: {
			dblClickExpand: false
		},
		data: {
			simpleData: {
				enable: true
			}
		}
	},
	appTreeNodeSel : function(appId,appName) {
		$("#user_setgroup_app_appId").val(appId);
		$("#user_setgroup_app_appName").val(appName);
		if(appId!="")
		{
			user_setgroup.queryGroupUserInfo();	
		}else
		{
			user_setgroup.clearUserGroupSetTable();
		}
	},
	bindTree : function() {
		$.ajax({
			type:'GET',
			url:'../common/getAppZTreeJsonData',
			data:{},
			dataType:'json',
			timeout: 50000,
			cache: false,
			async: false,
			success: function(json){
				user_setgroup_ztree.zAppTreeNodes = eval("[" + json.treeData + "]");
				$.each(user_setgroup_ztree.zAppTreeNodes, function(k,v){
					v.click = "user_setgroup_ztree." + v.click;
				});
			}
		});
	}
};

$(document).ready( function() {
	user_setgroup_ztree.bindTree();
	$.fn.zTree.init($("#userMgr_appTree"), user_setgroup_ztree.appTreeSetting, user_setgroup_ztree.zAppTreeNodes);
	var treeObj = $.fn.zTree.getZTreeObj("userMgr_appTree");
	var nodes = treeObj.getNodes();
	if (nodes.length>0) {
		eval(nodes[0].click);
		treeObj.selectNode(nodes[0]);
	}
});
//-->
</script>
<div class="pageContent" style="padding:5px;">
<form id="groupUserListPagerForm" method="post" action="../user/queryUserGroupInfo">
    <input type="hidden" id="user_setgroup_app_appId" name="application.applicationId" value=""/>
	<input type="hidden" id="user_setgroup_app_appName" name="application.applicationName" value=""/>
</form>
	<div class="tabs" style="width:254px;float:left; display:block;overflow:auto;">
		<div class="tabsHeader">
			<div class="tabsHeaderContent">
				<ul>
					<li><a href="javascript:;"><span>应用系统树</span></a></li>
				</ul>
			</div>
		</div>
		<div class="tabsContent" style="height:92%">
			<div>
				<div>
					<ul id="userMgr_appTree" class="ztree" style="margin-top:0; width:220px;height:97%"></ul>
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
					<li><a href="javascript:;"><span>用户-用户组维护</span></a></li>
				</ul>
			</div>
		</div>
		<div class="tabsContent" style="height:92%">
			<div>
				<div layoutH="80" style="float:left; display:block; overflow:auto; width:100%; border:solid 1px #CCC; line-height:21px; background:#fff">
					<div class="unitBox" id="jbsxBox">
					<div class="pageHeader">
						<div class="searchBar">
						   <!--  <input type="hidden" name="user.userId" id="user_userId" value="">-->
							<table class="searchContent">
								<tbody>
									<tr>
									<td>
										用户组分配状态：
										<select id="user_setgroup_groupSetStatus" name="groupSetStatus" style="width:80px;" onchange="user_setgroup.directsearch()">
										<option value="group-all">全部</option>
										<option value="group-existing">已分配</option>
										<option value="group-noset">未分配</option>
										</select>
									</td>
									<td><div class="buttonActive">
										<div class="buttonContent">
											<button type="button" onclick="user_setgroup.queryGroupUserInfo();" ><s:text name="global.search" /></button>
										</div>
										</div>
									</td>
									<td><div class="buttonActive">	
									    <div class="buttonContent">
									    <button type="button" onclick="user_setgroup.saveGroupUserInfo();"><s:text name="global.save" /></button>
									    </div>
									    </div>
									</td>
								</tr>
								</tbody></table>
						</div>
					
					<!--  <table id="orgUserSetTable" width="100%" class="list">
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
					</table>-->
		           <div style="overflow-y:scroll;overflow-x:hidden;height:85%;">
					<table id="user_setgroup_groupUserSetTable" width="100%" class="list">
						<thead>
						<tr>
							<th width="40"><s:text name="global.list.number" />
							</th>
							<th width="40" nowrap="nowrap"><input type="checkbox" class="checkboxCtrl" id="user_setgroup_groupcheckAll" group="groupSelStatus" />
							</th>
							<th><s:text name="group.groupName" /></th>
							<th><s:text name="group.groupDescription" />
							</th>
						</tr>
						</thead>
						<tbody></tbody>
					</table>
					</div>
					<!-- <div class="panelBar">
					<div class="pages">
						<span>显示</span>
						<select onchange="customPageBreak({numPerPage:this.value,data:{pageNum:1}})" id="group_user_list_numPerPage">
							<option value="20">20</option>
							<option value="50">50</option>
							<option value="100">100</option>
							<option value="200">200</option>
						</select>
						<span>条</span><span id="user_group_pageData_page_count"></span>
					</div>
				   <div class="pagination" id="user_group_list_pagination" targetType="navTab" totalCount="" numPerPage="" pageNumShown="10" currentPage=""></div>
				</div> -->
				</div>
				<div id="jbsxBox" class="unitBox" style="margin-left:246px;">
				</div>
			</div>
		</div>
		<div class="tabsFooter">
			<div class="tabsFooterContent"></div>
		</div>
	</div>
</div>