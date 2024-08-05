<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../common/commonInclude.jsp"%>
<div class="pageContent">
<s:form action="%{actionName}" namespace="/role" cssClass="pageForm required-validate" onsubmit="return validateCallback(this, dialogAjaxDone);">
	<div class="pageFormContent" layoutH="58">
	<s:hidden name="navTabId" value="%{rel}"/>
	<s:hidden name="role.roleId"/>
	<input type="hidden" name="application.applicationId" value="${application.applicationId}" />
	<input type="hidden" name="role.applicationId" value="${role.applicationId}" />
	<!-- 	<s:token name="%{actionName}"/>  -->
	        <div class="unit">
				<label><s:text name="role.roleName"/></label>
				<input name="role.roleName" type="text" size="30" class="required" value="<s:property value='role.roleName'/>"/>
			</div>
			<div class="unit">
				<label><s:text name="role.roleDisplayOrder"/></label>
				<input name="role.roleDisplayOrder" type="text" size="5"  value="<s:property value='role.roleDisplayOrder'/>"/>
			</div>
			<div class="unit">
				<label><s:text name="role.roleDescription"/></label>
				<textarea name="role.roleDescription" rows="1" cols="50"><s:property value='role.roleDescription'/></textarea>

			</div>
			<div class="unit">
				<label><s:text name="role.roleRemark"/></label>
				<textarea name="role.roleRemark" rows="1" cols="50"><s:property value='role.roleRemark'/></textarea>
			</div>
			<div class="divider"></div>
			<c:if test="${role.roleId!=null }">
			<div class="unit" style="height:28px">
				<label><s:text name="global.update.user"/></label>
				<input  type="text" size="15" value="${role.updateUserId}"  readonly="readonly" />
				<label><s:text name="global.update.time"/></label>
				<input  type="text" size="15" value="<s:date name="%{role.updateTime}" format="yyyy-MM-dd HH:mm" />"  readonly="readonly" />
			</div>
			</c:if>
		</div>
		<div class="formBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit"><s:text name="global.save" /></button></div></div></li>
				<li>
					<div class="button"><div class="buttonContent"><button type="button" class="close"><s:text name="global.close" /></button></div></div>
				</li>
			</ul>
		</div>
</s:form>
</div>
