<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>  
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
    <head>
    	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
    	<title><tiles:getAsString name="title"/></title>
    </head>
	<body>
		<tiles:insertAttribute name="body"/>
	</body>
</html>
