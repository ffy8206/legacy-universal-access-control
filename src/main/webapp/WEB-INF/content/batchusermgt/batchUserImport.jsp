<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../common/commonInclude.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<link href="../js/uploadify/css/uploadify.css" rel="stylesheet" type="text/css" />
<script src="../js/uploadify/scripts/swfobject.js" type="text/javascript"></script>
<script src="../js/uploadify/scripts/jquery.uploadify.v2.1.0.js" type="text/javascript"></script>
<script src="../js/fileUpload.js" type="text/javascript"></script>
</head>
<body>

<div class="pageFormContent" layoutH="97">
<!--<dl class="nowrap">
			<dt><s:text name="global.orgTree.label"/></dt>
			<dd>
				<input name="org.orgCode" value="" type="hidden">
				<input name="dwz.org.orgName" type="text" readonly="readonly"/>
				<a class="btnLook" href="../common/showOrgTreeDialog?parentOrgId=3" lookupGroup="org" lookupPk="orgCode" mask="true" width="800" height="400" title="<s:text name="global.orgTree.name" />"></a>
			</dd>
</div>
-->
<div style="height: 50px">
<s:form action="../batchusermgt/downloadFile">
	<s:hidden name="inputPath" value="template\batch_user_import_template.xls"></s:hidden>
	<s:hidden name="inputName" value="inputStream"></s:hidden>
	<s:hidden name="contentType" value="application/vnd.ms-excel"></s:hidden>
	<s:hidden name="contentDisposition" value="filename=batch_user_import_template.xls"></s:hidden>
	<s:hidden name="bufferSize" value="4096"></s:hidden>
	<div class="buttonActive"><div class="buttonContent"><button type="submit"><s:text name='button.text.download.template'/></button></div></div>
</s:form>
</div>
<div style="float: none; 20px">
<input id="batchUserImport_fileUpload" type="file" name="fileUpload"/>
<div id="batchUserImport_fileQueue" class="fileQueue"></div>
<div><p><s:property value="errorMsg" /></p></div>
<div class="button"><div class="buttonContent"><button type="button" onclick="uploadifyUpload()"><s:text name="button.text.beginupload" /></button></div></div>
<div class="button" style="margin-left: 20px;"><div class="buttonContent"><button type="button" onclick="cacelAllUpload()"><s:text name="button.text.cancelupload" /></button></div></div>
</div>
</body>
</html>