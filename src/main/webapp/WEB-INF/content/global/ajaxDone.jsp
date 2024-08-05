<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
{
	"statusCode":"<s:property value='%{ajaxDone.statusCode}' />",
	"message":"<s:property value='%{ajaxDone.message}' />",
	"forwardUrl":"<s:property value='%{ajaxDone.forwardUrl}' />",
	"navTabId":"<s:property value='%{ajaxDone.navTabId}' />",
	"callbackType":"<s:property value='%{ajaxDone.callbackType}' />"
} 