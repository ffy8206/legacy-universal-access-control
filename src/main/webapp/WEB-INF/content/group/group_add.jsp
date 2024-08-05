<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../common/commonInclude.jsp"%>
<script type="text/javascript">
<!--
var group_add = {
	submitForm : function() {
		var $form = $("#group_add_groupForm");
		if (!$form.valid()) {
			return false;
		}
		$.ajax({
			type:'POST',
			url:$form.attr("action"),
			data:$form.serializeArray(),
			dataType:"json",
			cache: false,
			success: function(json){
				alertMsg.correct('操作成功！');
				group_list.queryGroupInfo();
				$.pdialog.closeCurrent();
			},
			error: DWZ.ajaxError
		});
		return false;
	}
};
//-->
</script>
<div class="pageContent">
<s:form action="%{actionName}" id="group_add_groupForm" namespace="/group" cssClass="pageForm required-validate">
	<div class="pageFormContent" layoutH="56">
	<s:hidden name="navTabId" value="%{rel}"/>
	<s:hidden name="group.groupId"/>
	<input type="hidden" id="group_add_appId" name="application.applicationId" value="${application.applicationId}" />
	<input type="hidden" id="group_add_groupAppId" name="group.applicationId" value="${group.applicationId}" />
	<!-- 	<s:token name="%{actionName}"/>  -->
			 <div class="unit">
				<label><s:text name="group.groupName"/></label>
				<input name="group.groupName" type="text" size="30" class="required" value="<s:property value='group.groupName'/>"/>
			</div>
			<div class="unit">
				<label><s:text name="group.groupType"/></label>
				<textarea name="group.groupType" rows="1" cols="50"><s:property value='group.groupType'/></textarea>

			</div>
			<div class="unit">
				<label><s:text name="group.groupDescription"/></label>
				<textarea name="group.groupDescription" rows="1" cols="50"><s:property value='group.groupDescription'/></textarea>

			</div>
			<div class="unit">
				<label><s:text name="group.groupRule"/></label>
				<textarea name="group.groupRule" rows="1" cols="50"><s:property value='group.groupRule'/></textarea>

			</div>
			<div class="unit">
				<label><s:text name="group.groupRemark"/></label>
				<textarea name="group.groupRemark" rows="1" cols="50"><s:property value='group.groupRemark'/></textarea>
			</div>
			<div class="divider"></div>
			<c:if test="${group.groupId!=null}">
			<div class="unit" style="height:28px">
				<label><s:text name="global.update.user"/></label>
				<input type="text" size="15" value="${group.updateUserId}"  readonly="readonly" />
				<label><s:text name="global.update.time"/></label>
				<input type="text" size="15" value="<s:date name="%{group.updateTime}" format="yyyy-MM-dd HH:mm" />"  readonly="readonly" />
			</div>
			</c:if>
		</div>
		<div class="formBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="button" onclick="group_add.submitForm()"><s:text name="global.save" /></button></div></div></li>
				<li>
					<div class="button"><div class="buttonContent"><button type="button" class="close"><s:text name="global.close" /></button></div></div>
				</li>
			</ul>
		</div>
</s:form>
</div>

