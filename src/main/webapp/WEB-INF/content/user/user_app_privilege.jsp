<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../common/commonInclude.jsp"%>

<div class="pageHeader">

<%-- <s:form action="saveMessageTrigger" namespace="/user" cssClass="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone);" >
	<div class="pageFormContent">
		<dl>
			<dt><s:text name="userhelp.message.trigger"/></dt>
			<dd><input type="checkbox" name="messageTrigger" value="1" <c:if test="${msgTrigger == '1'}"> checked </c:if>	/></dd>
		</dl>
	</div>
	<div class="subBar">
		<ul>
			<li><div class="buttonActive"><div class="buttonContent"><button type="submit"><s:text name="global.save" /></button></div></div></li>
		</ul>
	</div>
</s:form>	
</div> --%>

<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar" />
	</div>
	<table class="table" width="50%" layoutH="138">
		<thead>
			<tr>
				<th><s:text name="userhelp.app.name" /></th>
				<th><s:text name="userhelp.app.privilege" /></th>
			</tr>
		</thead>
		<tbody>
		    <c:forEach items="${privilegeList}" var="item" varStatus="status">
			<tr>
				<td>${item.application.applicationName}</td>
				<td>${item.privilegeName}</td>
			</tr>
   			</c:forEach>
		</tbody>
	</table>

</div>
    