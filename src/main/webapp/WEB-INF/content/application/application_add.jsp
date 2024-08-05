<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../common/commonInclude.jsp"%>
<div class="pageContent">
<s:form action="%{actionName}" namespace="/application" cssClass="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone);">
	<div class="pageFormContent" layoutH="58">
	<s:hidden name="navTabId" value="%{rel}"/>
	<s:hidden name="application.applicationId"/>
	<s:hidden name="application.applicationSyncFields"/>
	<!-- 	<s:token name="%{actionName}"/>  --><!--
			<div class="unit">
					<label><s:text name="application.applicationName"/>	</label>
				<input name="application.applicationName" type="text" size="30" class="required" value="<s:property value='application.applicationName'/>"/>
	          	</div>
			<div class="unit">
				<label><s:text name="application.applicationContact"/>	</label>
			<input name="application.applicationContact" type="text" size="30" value="<s:property value='application.applicationContact'/>"/>
			</div>
			<div class="unit">
				<label><s:text name="application.applicationContactPhone"/>	</label>
				<input name="application.applicationContactPhone" type="text" size="30" value="<s:property value='application.applicationContactPhone'/>"/>

			</div>
			
			<div class="unit">
					<label><s:text name="application.applicationUrl"/>	</label>
				<textarea name="application.applicationUrl" rows="2" cols="30"><s:property value='application.applicationUrl'/></textarea>
			</div>
			<div class="unit">
					<label><s:text name="application.applicationRemark"/>	</label>
				<textarea name="application.applicationRemark" rows="2" cols="30"><s:property value='application.applicationRemark'/></textarea>
			</div>
			-->
			<dl>
				<dt><s:text name="application.applicationName"/></dt>
				<dd><input  type="text" name="application.applicationName" class="textInput required"   size="30" value="${application.applicationName}" /></dd>
			</dl>
			<dl>
					<dt><s:text name="application.applicationContact"/></dt>
					<dd><input  type="text" name="application.applicationContact" class="textInput"   size="30" value="${application.applicationContact}" /></dd>
			</dl>
			<dl>
					<dt><s:text name="application.applicationContactPhone"/></dt>
					<dd><input  type="text" name="application.applicationContactPhone" class="textInput"   size="30" value="${application.applicationContactPhone}" /></dd>
			</dl>
			<dl>
					<dt><s:text name="application.applicationUrl"/></dt>
					<dd><input  type="text" name="application.applicationUrl" class="textInput"   size="30" value="${application.applicationUrl}" /></dd>
			</dl>
			<dl>
					<dt><s:text name="application.applicationRemark"/></dt>
					<dd><input  type="text" name="application.applicationRemark" class="textInput"   size="30" value="${application.applicationRemark}" /></dd>
			</dl>
			<dl>
				<dt><s:text name="application.tag"/></dt>
				<dd><input type="text" name="application.tag" id="application_add_tag" class="textInput" size="20" value="<s:property value='application.tag'/>" data-seperator=","/></dd>
			</dl>
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

