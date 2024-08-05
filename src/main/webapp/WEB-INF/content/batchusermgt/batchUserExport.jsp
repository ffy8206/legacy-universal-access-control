<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../common/commonInclude.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div style="margin-left: 30px; margin-top: 10px;">
<s:form action="../batchusermgt/downloadFile">
	<s:hidden name="inputPath" value="template\temp4export\export_user_list.xls"></s:hidden>
	<s:hidden name="inputName" value="inputStream"></s:hidden>
	<s:hidden name="contentType" value="application/vnd.ms-excel"></s:hidden>
	<s:hidden name="contentDisposition" value="filename=export_user_list.xls"></s:hidden>
	<s:hidden name="bufferSize" value="4096"></s:hidden>
	<div class="buttonActive"><div class="buttonContent"><button type="submit"><s:text name='button.text.export.user'/></button></div></div>
</s:form>
</div>
</body>
</html>