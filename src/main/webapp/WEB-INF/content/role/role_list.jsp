<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../common/commonInclude.jsp"%>
<script type="text/javascript">
var role_list = {
	roleAppSelectOnChange : function() {
		$("#role_list_roleAppId").val($("#role_list_roleAppSelect").val());
		if($("#role_list_roleAppId").val()!="")
		{
			navTabSearch($("#roleListPagerForm"),"role_list");	
		}
	},
	deleteConfirmMsg : function(url){
		alertMsg.confirm("确认要删除所选择的记录吗！", {
			okCall: function(){
				$.post(url, { "roleId": $("#sid_role").val(), "application.applicationId" : $("#role_list_roleAppId").val() }, navTabAjaxDone, "json");
			}
		});
	},
	//添加Option
	addSelectedOption : function(selObj,optionText,optionValue){
		selObj.options[selObj.length]= new Option(optionText,optionValue,false,false);
	},
	//清空
	clearAllOption : function(selObj){
		try{ 
			if(selObj.options.length==0){
				return;
			}
			for(var i = 0;i < selObj.options.length; i++){ 
				var e = selObj.options[i];
				selObj.remove(i); 
				i = i - 1; 
			}
		}catch(e){}	
	},
	//添加
	privilegesMove : function(){
		var left=$("#allPrivilege");
		var right=$("#selectedPrivilege");
		var select_html="";
		if(left.find("option:selected").size()>0){
	        left.find("option:selected").each(function(i){
	        	select_html+="<option value='"+left.find("option:selected").eq(i).attr("value")+"'>"+left.find("option:selected").eq(i).html()+"</option>";              
	    	});
	        right.append(select_html);
	        left.find("option:selected").remove();
	    }
	},
	//删除
	privilegesReMove : function (){
		var left=$("#allPrivilege");
		var right=$("#selectedPrivilege");
		var select_html="";
		if(right.find("option:selected").size()>0){
	        right.find("option:selected").each(function(i){
	        	select_html+="<option value='"+right.find("option:selected").eq(i).attr("value")+"'>"+right.find("option:selected").eq(i).html()+"</option>";              
	    	});
	        left.append(select_html);
	        right.find("option:selected").remove();
	    }
	},
	//添加全部
	privilegesMoveAll : function(){
		var left=$("#allPrivilege")[0];
		var right=$("#selectedPrivilege")[0];
		if(left.options.length==0){
			return;
		}
		for(var i = 0;i <left.options.length; i++){
			var e = left.options[i];
			right.options.add(new Option(e.text, e.value));
		}
		role_list.clearAllOption($("#allPrivilege")[0]);
	},
	//移除全部
	privilegesReMoveAll : function(){
		var left=$("#allPrivilege")[0];
		var right=$("#selectedPrivilege")[0];
		if(right.options.length==0){
			return;
		}
		for(var i = 0;i <right.options.length; i++){
			var e = right.options[i];
			left.options.add(new Option(e.text, e.value));
		}
		role_list.clearAllOption($("#selectedPrivilege")[0]);
	},
	rolePrivilegeSet : function(roleId,roleName) {
		$.ajax({
			type:'GET',
			url:'../role/queryRolePrivileges',
			data:{"roleId":roleId},
			dataType:'json',
			timeout: 50000,
			cache: false,
			async: false,
			success: function(json){
				var json = eval("(" + json.jsonResult + ")");
				role_list.clearAllOption($("#selectedPrivilege")[0]);
				role_list.clearAllOption($("#allPrivilege")[0]);
				$.each(json,function(k1,v1){
					if(k1=='existingPrivileges')
					{
						$.each(v1,function(k2,v2){
							role_list.addSelectedOption($("#selectedPrivilege")[0],v2.privilegeName+"("+v2.privilegeCode+")",v2.privilegeId);
						});
					}
					if(k1=='otherPrivileges')
					{
						$.each(v1,function(k2,v2){
							role_list.addSelectedOption($("#allPrivilege")[0],v2.privilegeName+"("+v2.privilegeCode+")",v2.privilegeId);
						});
					}
				});
			}
		});
		$("#role_list_privilegeTbl").css("display","");
		$("#role_list_currentRole").html("<font style='color:red'>["+roleName+"]</font> 已分配权限");
	},
	savePrivileges : function() {
		var right=$("#selectedPrivilege");
		var s = right.find("option").size();
		var select_id="";
		if(s>0)
		{
			right.find("option").each(function(i){
				select_id+=right.find("option").eq(i).attr("value")+",";              
	    	});
			select_id = select_id.substring(0,select_id.length-1);
		}
		$.ajax({
			type:'GET',
			url:'../role/saveRolePrivileges',
			data:{"roleId":$("#sid_role").val(),"privilegesId":select_id},
			dataType:'json',
			timeout: 50000,
			cache: false,
			async: false,
			success: function(json){
				alertMsg.correct('保存成功！')
			}
		});
	}
};
</script>
<div id="mainDiv" style="padding:5px">
<!-- top start -->
	<div class="panel" defH="30">
		<h1><s:text name="role.app"/></h1>
		<div class="unit" style="display:block;"> 
			<table border="0">
			<tr>
			<td><label>&nbsp;&nbsp;&nbsp;&nbsp;<s:text name="role.appSelect"/>&nbsp;&nbsp;&nbsp;&nbsp;</label></td>
			<td>
			    <select id="role_list_roleAppSelect" name="roleAppSelect"  style="width:220px;" onchange="role_list.roleAppSelectOnChange()">
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
<div class="pageContent"  style="float:left; overflow:auto;height:100%; width:390px; background:#fff">
	<div class="tabs">
		<div class="tabsHeader">
			<div class="tabsHeaderContent">
				<ul>
					<li><a href="javascript:;"><span><s:text name="role.roleInfo"/></span></a></li>
				</ul>
			</div>
		</div>
		<div class="tabsContent">
			<div  layoutH="120" style="height:100%;">
				<!-- tab content start -->
					<div class="panelBar">
						<ul class="toolBar">
						   <li>
								<a class="add"
								<c:if test="${application.applicationId==null || application.applicationId==0}">
									href="javascript:;"  onclick="alertMsg.info('请先选择应用系统！')"
								</c:if>
								<c:if test="${application.applicationId>0}">
									href="../role/displayRole?application.applicationId=${application.applicationId}"  
									mask="true" target="dialog" title="<s:text name="role.add" />" rel="add_role"
								</c:if>
								>
							   	<span><s:text name="global.add" /></span>
							    </a>
							 </li>
							<li>
								<a class="delete" 
								<c:if test="${application.applicationId==null || application.applicationId==0}">
									href="javascript:;"  onclick="alertMsg.info('请先选择应用系统！')"
								</c:if>
								<c:if test="${application.applicationId>0}">
									href="javascript:;" title="<s:text name="global.confirm.delete" />" 
								    onclick="role_list.deleteConfirmMsg('../role/deleteRole')"
								</c:if>
								><span><s:text name="global.delete" /></span></a>
							</li>
							<li><a class="edit"  
								<c:if test="${application.applicationId==null || application.applicationId==0}">
									href="javascript:;"  onclick="alertMsg.info('请先选择应用系统！')"
								</c:if>
								<c:if test="${application.applicationId>0}">
									mask="true" href="../role/displayRole?roleId={sid_role}"
									target="dialog" title="<s:text name="role.edit" />"
								</c:if>
								><span><s:text name="global.update" /></span></a>
							</li>
						</ul>
					</div>
					<table id="roleListTable_001" class="table" width="100%">
						<thead>
							<tr>
								<th width="40"><s:text name="global.list.number" />
								</th>
								<th><s:text name="role.roleName" />
								</th>
								<th><s:text name="role.roleDescription" />
								</th>
							</tr>
						</thead>
						<tbody>
						<s:iterator value="pageData.dataList" status="status">
						<tr target="sid_role" rel="${roleId}"  onclick="role_list.rolePrivilegeSet(${roleId},'${roleName}')">
							<td>${(pageData.page.current-1)*pageData.page.length+status.count}</td>
							<td><s:property value="roleName" /></td>
							<td><s:property value="roleDescription" /></td>
						</tr>
						</s:iterator>
						</tbody>
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
					<li><a href="javascript:;"><span>权限分配</span></a></li>
				</ul>
			</div>
		</div>
		<div class="tabsContent">
			<div  layoutH="120" style="height:100%;">
				<!-- tab content start -->
					<table width="100%" id="role_list_privilegeTbl" style="display:none;"  height="100%" border="0" cellpadding="0" cellspacing="0"  align="center">
							<tr>
							    <td colspan="5">
									
								</td>
							</tr>
							<tr align="center">
							    <td style="width:5px;">
									&nbsp;
								</td>
								<td width="45%" align="right" valign="top">
									<fieldset style="width:93%;height:80%;">
										<legend>系统权限</legend>
										<select	id="allPrivilege" name="allPrivilege"	size="3" style="width:100%;height:100%;" Multiple>
										</select>
									</fieldset>
								</td>
								<td align="center" valign="middle" style="width:90px" nowrap="nowrap">
									<div class="button" style="height:40px"><div class="buttonContent"><button onclick="role_list.privilegesMove()">&nbsp;&nbsp;添&nbsp;&nbsp;加&nbsp;&nbsp;</button></div></div>
									<div class="button" style="height:40px"><div class="buttonContent"><button onclick="role_list.privilegesReMove()">&nbsp;&nbsp;删&nbsp;&nbsp;除&nbsp;&nbsp;</button></div></div>
									<div class="button" style="height:40px"><div class="buttonContent"><button onclick="role_list.privilegesMoveAll()">添加全部</button></div></div>
									<div class="button" style="height:40px"><div class="buttonContent"><button onclick="role_list.privilegesReMoveAll()">删除全部</button></div></div>
									<div class="button" style="height:40px"><div class="buttonContent"><button onclick="role_list.savePrivileges()">&nbsp;&nbsp;保&nbsp;&nbsp;存&nbsp;&nbsp;</button></div></div>
								</td>
								<td width="45%" align="left" valign="top">
									<fieldset style="width:93%;height:80%;">
										<legend id="role_list_currentRole">已分配权限</legend>
										<select	id="selectedPrivilege" name="selectedPrivilege" size="3" style="width: 100%;height:100%;" Multiple>
										</select>
									</fieldset>
								</td>
								<td style="width:5px;">
									&nbsp;
								</td>
							</tr>
							<tr>
							    <td colspan="5" align="center" >
								</td>
							</tr>
						</table>
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

<form id="roleListPagerForm" method="post" action="../role/queryRoleInfo">
	<input type="hidden" name="pageNum" value="1" />
	<!--【必须】value=1可以写死-->
	<input type="hidden" name="numPerPage" value="<s:property value='%{pageData.page.length}' />" />
	<!--【可选】每页显示多少条-->
	<input type="hidden" id="role_list_roleAppId" name="application.applicationId" value="${application.applicationId}" />
</form>