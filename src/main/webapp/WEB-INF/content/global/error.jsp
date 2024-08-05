<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<head>
    <title>发生未知错误</title>
</head>

<body>
<h2>发生未知错误</h2>

<p>
    请和管理员联系或者和相关技术人员联系，谢谢
</p>

<hr/>
<h3>错误消息</h3>

<s:actionerror />

<p>
    <s:property value="%{exception.message}"/>
</p>

<hr/>

<h3>错误日志</h3>

<p>
    <s:property value="%{exceptionStack}"/>
</p>


</body>
