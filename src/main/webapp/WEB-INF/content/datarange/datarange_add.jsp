<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../common/commonInclude.jsp"%>
<div class="pageContent">
<s:form action="%{actionName}" namespace="/datarange" cssClass="pageForm required-validate" onsubmit="return validateCallback(this, dialogAjaxDone);">
	<div class="pageFormContent" layoutH="58">
	<s:hidden name="navTabId" value="%{rel}"/>
	<s:hidden name="datarange.datarangeId"/>
	<input type="hidden" name="application.applicationId" value="${application.applicationId}" />
	<input type="hidden" name="datarange.applicationId" value="${datarange.applicationId}" />
	<!-- 	<s:token name="%{actionName}"/>  -->
	        <div class="unit">
				<label><s:text name="datarange.datarangeCode"/></label>
				<input name="datarange.datarangeCode" type="text" size="30" class="required" value="<s:property value='datarange.datarangeCode'/>"/>
			</div>
			<div class="unit">
				<label><s:text name="datarange.datarangeName"/></label>
				<input name="datarange.datarangeName" type="text" size="30" class="required" value="<s:property value='datarange.datarangeName'/>"/>
			</div>
			<div class="unit">
				<label><s:text name="datarange.datarangeValue"/></label>
				<textarea name="datarange.datarangeValue" rows="1" cols="30"><s:property value='datarange.datarangeValue'/></textarea>
			</div>			
			<div class="unit">
				<label><s:text name="datarange.datarangeDescription"/></label>
				<textarea name="datarange.datarangeDescription" rows="1" cols="50"><s:property value='datarange.datarangeDescription'/></textarea>
			</div>

			<c:if test="${datarange.datarangeId != null}">
			<div class="divider"></div>
			<div class="unit" style="height:28px">
				<label><s:text name="global.update.user"/></label>
				<input name="" type="text" size="15" value="${datarange.updateUserId}"  readonly="readonly" />
				<label><s:text name="global.update.time"/></label>
				<input name="" type="text" size="15" value="<s:date name="%{datarange.updateTime}" format="yyyy-MM-dd HH:mm" />"  readonly="readonly" />
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
