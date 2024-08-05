<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../common/commonInclude.jsp"%>
<script type="text/javascript">
var groupDatarangeSet_list = {
	queryGroupRoleDatarangeInfo : function(a_id,g_id,r_id) {
		$.ajax({
			type:'GET',
			url:'../group/queryGroupRoleDatarangeInfo',
			data:{"application.applicationId":a_id,"group.groupId":g_id,"role.roleId":r_id,"drSetStatus":$("#groupDatarangeSet_list_drSetStatus").val()},
			dataType:'json',
			timeout: 50000,
			cache: false,
			async: false,
			success: function(json){
				groupDatarangeSet_list.clearDatarangeSetTable();
				var json = eval("(" + json.jsonResult + ")");
				var listNumber = 0;
				$.each(json.existingDrsList,function(k1,v1){								
					var aRow = "<tr target='sid_role' rel='"+v1.datarangeId+"'><td>"+(++listNumber)+"</td><td>"+
					"<input name='drSelStatus' type='checkbox' checked='true' value="+v1.datarangeId+">"
					+"</td><td>"+v1.datarangeName+"</td><td>"+v1.datarangeCode+"</td><td nowrap='nowrap'>"+v1.datarangeValue+"</td></tr>";
					$("#groupDatarangeSet_list_datarangeSetTable").append(aRow);
				});
				$.each(json.remainingDrsList,function(k1,v1){								
					var aRow = "<tr target='sid_role' rel='"+v1.datarangeId+"'><td>"+(++listNumber)+"</td><td>"+
					"<input name='drSelStatus' type='checkbox' value="+v1.datarangeId+">"
					+"</td><td>"+v1.datarangeName+"</td><td>"+v1.datarangeCode+"</td><td nowrap='nowrap'>"+v1.datarangeValue+"</td></tr>";
					$("#groupDatarangeSet_list_datarangeSetTable").append(aRow);
				});
				$("#groupDatarangeSet_list_datarangeSetTable").cssTable();
			}
		});
	},
	clearDatarangeSetTable : function() {
		$("#groupDatarangeSet_list_datarangeSetTable tr").each(function(i){
			if(i>0)$(this).remove();
		});
	},
	saveGroupRoleDatarangeInfo : function(a_id,g_id,r_id) {
		var drs_sel = "";
		var drs_del = "";
		 $("#groupDatarangeSet_list_datarangeSetTable input:checkbox[name=drSelStatus]").each(function(index){                        
	        if(this.checked)
	        {
	        	drs_sel += this.value+",";
	        }
	        else
	        {
	        	drs_del += this.value+",";
	        }
	     });
		 drs_sel = drs_sel.length>0?drs_sel.substring(0,drs_sel.length-1):"";
		 drs_del = drs_del.length>0?drs_del.substring(0,drs_del.length-1):"";
		 $.ajax({
				type:'GET',
				url:'../group/saveGroupRoleDatarangeInfo',
				data:{"application.applicationId":a_id,"group.groupId":g_id,"role.roleId":r_id,"drs_sel":drs_sel,"drs_del":drs_del},
				dataType:'json',
				timeout: 50000,
				cache: false,
				async: false,
				success: function(json){
					alertMsg.correct('保存成功！');
					group_list.queryGroupRoleInfo('${group.groupId}');
				}
		});
		groupDatarangeSet_list.queryGroupRoleDatarangeInfo(a_id,g_id,r_id);
	},
	closeDialog : function() {
		$.pdialog.close("datarangeSet");
	}
};
$(function(){
	groupDatarangeSet_list.queryGroupRoleDatarangeInfo('${application.applicationId}','${group.groupId}','${role.roleId}');
});
</script>
  <div class="tabs">
  		<input type="hidden" id="groupDatarangeSet_list_groupAppId" name="application.applicationId" value="${application.applicationId}" />
  		<input type="hidden" id="groupDatarangeSet_list_groupId" name="group.groupId" value="${group.groupId}" />
  		<input type="hidden" id="groupDatarangeSet_list_roleId" name="role.roleId" value="${role.roleId}" />
		<div class="tabsHeader">
			<div class="tabsHeaderContent">
				<ul>
					<li><a href="javascript:;"><span>数据范围信息</span></a></li>
				</ul>
			</div>
		</div>
		<div class="tabsContent">
			<div>
				<div layoutH="80" style="float:left; display:block; overflow:auto; height:100%; width:100%; border:solid 1px #CCC; line-height:21px; background:#fff">
				<!-- role start -->
				<div class="unitBox" id="jbsxBox">
					<div class="pageHeader">
						<div class="searchBar">
							<table class="searchContent">
								<tbody><tr>
									<td>
										设置状态：
										<select id="groupDatarangeSet_list_drSetStatus" name="drSetStatus" style="width:80px;">
										<option value="dr-all">全部</option>
										<option value="dr-existing">已选择</option>
										<option value="dr-noset">未选择</option>
										</select>
									</td>
									<td><div class="buttonActive"><div class="buttonContent">
									<button onclick="groupDatarangeSet_list.queryGroupRoleDatarangeInfo('${application.applicationId}','${group.groupId}','${role.roleId}')"><s:text name="global.search" /></button></div></div>
									</td>
								</tr>
							</tbody></table>
						</div>
					</div>
					<table id="groupDatarangeSet_list_datarangeSetTable" width="100%" class="list">
						<thead>
							<tr>
								<th width="40"><s:text name="global.list.number" />
								</th>
								<th width="40" nowrap="nowrap"><s:text name="global.select" />
								</th>
								<th><s:text name="datarange.datarangeName" />
								</th>
								<th><s:text name="datarange.datarangeCode" />
								</th>
								<th><s:text name="datarange.datarangeValue" />
								</th>
							</tr>
						</thead>
						<tbody></tbody>
					</table>
				</div>
				<!-- role end -->
				</div>
	
			</div>
		</div>
		<div class="tabsFooter">
			<div class="tabsFooterContent"></div>
		</div>
		<div style="float: right;">
		<div class="buttonActive"><div class="buttonContent">
		<button onclick="groupDatarangeSet_list.saveGroupRoleDatarangeInfo('${application.applicationId}','${group.groupId}','${role.roleId}')"><s:text name="global.save" /></button></div></div>
		<div class="buttonActive"><div class="buttonContent">
		<button onclick="groupDatarangeSet_list.closeDialog()"><s:text name="global.close" /></button></div></div>
		</div>
	</div>