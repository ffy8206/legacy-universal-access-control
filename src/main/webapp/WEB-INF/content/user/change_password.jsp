<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../common/commonInclude.jsp"%>
<script type="text/javascript">
<!--
var change_password = {
	submitForm : function() {
		var $form = $("#change_password_form");
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
				if (json.statusCode == 200) {
					alertMsg.correct('操作成功！');
					$.pdialog.closeCurrent();
				} else {
					alertMsg.info(json.message);
				}
			},
			error: DWZ.ajaxError
		});
		return false;
	}
};
//--> 
</script>

<s:form action="savePassword" id="change_password_form" namespace="/user" cssClass="pageForm required-validate" >
	<div class="pageContent" layoutH="58">
		<div class="pageFormContent">
		<s:hidden name="navTabId" value="%{rel}"/>
				<dl class="nowrap">
					<dt><s:text name="userhelp.old.password"/></dt>
					<dd><input type="password" name="user.userPassword" class="required alphanumeric" size="30" /></dd>
				</dl>
				<dl class="nowrap">
					<dt><s:text name="userhelp.new.password"/></dt>
					<dd><input id="user_new_password" type="password" name="user.newPassword" class="required alphanumeric" minlength="6" maxlength="20" size="30"  /></dd>
				</dl>
				<dl class="nowrap">
					<dt><s:text name="userhelp.confirm.password"/></dt>
					<dd><input type="password" name="user_confirm_password" class="required alphanumeric" equalto="#user_new_password" minlength="6" maxlength="20"  size="30" value="" /></dd>
				</dl>
		</div>
		<div class="formBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="button" onclick="change_password.submitForm()"><s:text name="global.save" /></button></div></div></li>
				<c:if test="${rel} == 'change_password' }">
				<li><div class="button"><div class="buttonContent"><button class="close" type="button"><s:text name="global.close" /></button></div></div></li>
				</c:if>
			</ul>
		</div>
	</div>
</s:form>