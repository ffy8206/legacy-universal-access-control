<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../common/commonInclude.jsp"%>
<div class="pageContent">
<s:form action="%{actionName}" namespace="/privilege" cssClass="pageForm required-validate" onsubmit="return validateCallback(this, dialogAjaxDone);">
	<div class="pageFormContent" layoutH="58">
	<s:hidden name="navTabId" value="%{rel}"/>
	<s:hidden name="privilege.privilegeId"/>
	<input type="hidden" name="application.applicationId" value="${application.applicationId}" />
	<input type="hidden" name="privilege.applicationId" value="${privilege.applicationId}" />
	<!-- 	<s:token name="%{actionName}"/>  -->
	        <div class="unit">
				<label><s:text name="privilege.privilegeCode"/></label>
				<input name="privilege.privilegeCode" type="text" size="30" class="required" value="<s:property value='privilege.privilegeCode'/>"/>
			</div>
			<div class="unit">
				<label><s:text name="privilege.privilegeName"/></label>
				<input name="privilege.privilegeName" type="text" size="30" class="required" value="<s:property value='privilege.privilegeName'/>"/>
			</div>
			<div class="unit">
				<label><s:text name="privilege.privilegeDescription"/></label>
				<textarea name="privilege.privilegeDescription" rows="1" cols="50"><s:property value='privilege.privilegeDescription'/></textarea>

			</div>
			<div class="unit">
				<label><s:text name="privilege.privilegeRemark"/></label>
				<textarea name="privilege.privilegeRemark" rows="1" cols="50"><s:property value='privilege.privilegeRemark'/></textarea>
			</div>
			
			<c:if test="${privilege.privilegeId != null}">
			<div class="divider"></div>						
			<div class="unit" style="height:28px">
				<label><s:text name="global.update.user"/></label>
				<input name="" type="text" size="15" value="${privilege.updateUserId}"  readonly="readonly" />
				<label><s:text name="global.update.time"/></label>
				<input  name="" type="text" size="15" value="<s:date name="%{privilege.updateTime}" format="yyyy-MM-dd HH:mm" />" readonly="readonly" />
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
