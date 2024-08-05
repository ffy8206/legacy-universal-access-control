<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../common/commonInclude.jsp"%>
<script type="text/javascript">
<!--
var user_setrole= {
	clearUserRoleSetTable : function() {
		$("#userRoleSetTable tr").each(function(i){
			if(i>1)$(this).remove();
		});
	},
	queryUserRoleInfo : function () {
		if($("#application_applicationId").val()=="")
		{
			alertMsg.info('请先选择应用系统！');
			return;
		}
		$.ajax({
			type:'GET',
			url:'../user/queryUserRoleInfo',
			data:{"application.applicationId":$("#application_applicationId").val(),"roleSetStatus":$("#roleSetStatus").val(),"user.userId":"${user.userId}"},
			dataType:'json',
			timeout: 50000,
			cache: false,
			async: false,
			success: function(json){
				user_setrole.clearUserRoleSetTable();
				$("#rolecheckAll").attr("checked",false);
				var json = eval("(" + json.jsonResult + ")");
				var listNumber = 0;
				$.each(json.existingRolesList,function(k1,v1){						
					var datarangeSet = v1.datarangeCount>=0?v1.datarangeCount:"";
					var datarangeOperation = "<a href=\"javascript:;\" onclick='user_setrole.userRoleDatarangeSet("+v1.applicationId+","+v1.roleId+","+v1.userId+")'><span><s:text name="role.datarange.set"/></span></a>"									
					var aRow = "<tr target='sid_role' rel='"+v1.roleId+"'><td>"+(++listNumber)+"</td><td>"+
					"<input name='roleSelStatus' type='checkbox' checked='true' value="+v1.roleId+">"
					+"</td><td>"+v1.roleName+"</td><td>"+v1.roleDescription+"</td><td nowrap='nowrap'>"+datarangeSet+"</td><td nowrap='nowrap' align='center'>"+datarangeOperation+"</td></tr>";
					$("#userRoleSetTable").append(aRow);
				});
				$.each(json.remainingRolesList,function(k1,v1){								
					var aRow = "<tr target='sid_role' rel='"+v1.roleId+"'><td>"+(++listNumber)+"</td><td>"+
					"<input name='roleSelStatus' type='checkbox' value="+v1.roleId+">"
					+"</td><td>"+v1.roleName+"</td><td>"+v1.roleDescription+"</td><td nowrap='nowrap'>&nbsp;-&nbsp;-</td><td nowrap='nowrap'>&nbsp;-&nbsp;-</td></tr>";
					$("#userRoleSetTable").append(aRow);
				});
				$("#userRoleSetTable").cssTable();
			}
		});
	},
	userRoleDatarangeSet : function(appId,roleId,userId) {
		var url = "../user/toSetDatarange?application.applicationId="+appId+"&role.roleId="+roleId+"&user.userId="+userId;
		var rel = "datarangeSet";
		var title = "数据范围设置";
		var options = {width:600,height:400,max:false,mask:true,maxable:true,minable:false,fresh:true,resizable:true,drawable:false,close:""};
		$.pdialog.open(url, rel, title, options);
	},
	saveUserRoleInfo : function (){
		if($("#application_applicationId").val()=="")
		{
			alertMsg.info('请先选择应用系统！');
			return;
		}
		var roles_sel = "";
		var roles_del = "";
		 $("#userRoleSetTable input:checkbox[name=roleSelStatus]").each(function(index){                        
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
				url:'../user/saveUserRoleInfo',
				data:{"user.userId":"${user.userId}","roles_sel":roles_sel,"roles_del":roles_del,"applicationId":$("#application_applicationId").val()},
				dataType:'json',
				contentType: "application/x-www-form-urlencoded; charset=utf-8", 
				timeout: 50000,
				cache: false,
				async: false,
				success: function(json){
					alertMsg.correct('保存成功！')
				}
		});
		 user_setrole.queryUserRoleInfo();
	},
	directsearch : function(){
		user_setrole.queryUserRoleInfo();
	}
};
var user_setrole_ztree={
	zAppTreeNodes:{},
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
		$("#application_applicationId").val(appId);
		$("#application_applicationName").val(appName);
		if(appId!="")
		{
			user_setrole.queryUserRoleInfo();	
		}else
		{
			user_setrole.clearUserRoleSetTable();
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
				user_setrole_ztree.zAppTreeNodes = eval("[" + json.treeData + "]");
				$.each(user_setrole_ztree.zAppTreeNodes, function(k,v){
					v.click = "user_setrole_ztree." + v.click;
				});
			}
		});
	}
};

$(document).ready( function() {
	user_setrole_ztree.bindTree();
	$.fn.zTree.init($("#userMgr_appTree"), user_setrole_ztree.appTreeSetting, user_setrole_ztree.zAppTreeNodes);
	var treeObj = $.fn.zTree.getZTreeObj("userMgr_appTree");
	var nodes = treeObj.getNodes();
	if (nodes.length>0) {
		//eval(nodes[0].click);
		treeObj.selectNode(nodes[0]);
	}
});
//-->
</script>
<div class="pageContent" style="padding:5px;">
<form id="orgUserListPagerForm" method="post" action="../user/queryUserOrgInfo">
    <input type="hidden" id="application_applicationId" name=application.applicationId value=""/>
	<input type="hidden" id="application_applicationName" name="application.applicationName" value=""/>
</form>
	<div class="tabs" style="width:254px;float:left; display:block;overflow:auto;">
		<div class="tabsHeader">
			<div class="tabsHeaderContent">
				<ul>
					<li><a href="javascript:;"><span>应用系统</span></a></li>
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
					<li><a href="javascript:;"><span>用户-角色维护</span></a></li>
				</ul>
			</div>
		</div>
		<div class="tabsContent" style="height:92%">
			<div>
				<div layoutH="80" style="float:left; display:block; overflow:auto; width:100%; border:solid 1px #CCC; line-height:21px; background:#fff">
					<div class="unitBox" id="jbsxBox">
					<div class="pageHeader">
						<div class="searchBar">
							<!--   <input type="hidden" name="user.userId" id="user_userId" value="${user.userId}">-->
							<table class="searchContent">
								<tbody><tr>
									<td>
										角色分配状态：
										<select id="roleSetStatus" name="roleSetStatus" style="width:80px;" onchange="user_setrole.directsearch()">
										<option value="role-all">全部</option>
										<option value="role-existing">已分配</option>
										<option value="role-noset">未分配</option>
										</select>
									</td>
									<td><div class="buttonActive"><div class="buttonContent">
									<button onclick="user_setrole.queryUserRoleInfo()"><s:text name="global.search" /></button></div></div>
									<div class="buttonActive"><div class="buttonContent">
									<button onclick="user_setrole.saveUserRoleInfo()"><s:text name="global.save" /></button></div></div>
									</td>
								</tr>
							</tbody></table>
						</div>
					</div>
					<table id="userRoleSetTable" width="100%" class="list">
						<thead>
							<tr>
								<th colspan="4">角色信息<span id="roleSetSpan"></span></th>
								<th colspan="2">数据范围信息</th>
							</tr>
							<tr>
								<th width="40"><s:text name="global.list.number" />
								</th>
								<th width="40" nowrap="nowrap"><input type="checkbox" class="checkboxCtrl" id="rolecheckAll" group="roleSelStatus" />
								</th>
								<th><s:text name="role.roleName" />
								</th>
								<th><s:text name="role.roleDescription" />
								</th>
								<th width="60"><s:text name="role.datarange.count" />
								</th>
								<th width="60"><s:text name="role.datarange.operation" />
								</th>
							</tr>
						</thead>
						<tbody></tbody>
					</table>
				</div>
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