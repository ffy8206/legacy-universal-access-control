<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<s:form action="%{actionName}" namespace="/dict" cssClass="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone);">

<div class="pageContent" layoutH="240">
<h3><s:text name="dict.table.%{optTable}"/></h3>
	<div class="pageFormContent">
	<s:hidden name="navTabId" value="%{rel}"/>
	<s:hidden name="optTable" value="%{optTable}"/>
			<dl class="nowrap">
				<dt><s:text name="dict.code"/></dt>
				<dd><input type="text" name="dict.code" class="textInput required"  <s:if test="dict.code!=null">readonly="true"</s:if> size="30" value="<s:property value='dict.code'/>"/></dd>
			</dl>
			<dl class="nowrap">
				<dt><s:text name="dict.value"/></dt>
				<dd><input type="text" name="dict.value" class="textInput required" size="30"  value="<s:property value='dict.value'/>"/></dd>
			</dl>
			<dl class="nowrap">
				<dt><s:text name="dict.description"/></dt>
				<dd><input type="text" name="dict.description" class="textInput" size="30" value="<s:property value='dict.description'/>" /></dd>
			</dl>
	</div>
	<div class="formBar">
		<ul>
			<li><div class="buttonActive"><div class="buttonContent"><button type="submit"><s:text name="global.save" /></button></div></div></li>
			<li><div class="button"><div class="buttonContent"><button class="close" type="button"><s:text name="global.close" /></button></div></div></li>
		</ul>
	</div>
</div>
</s:form>

