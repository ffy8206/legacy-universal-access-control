<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="global.title" /></title>
<link href="/uac/themes/css/login.css" rel="stylesheet" type="text/css" />
<link href="/uac/themes/css/global.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="./js/jquery-1.4.4.js"></script>
<script type="text/javascript" src="./js/jquery.cookie.js"></script>
<script type="text/javascript" src="./js/login.js"></script>
</head>
<body>
<div id="login">
<div id="login_header">
<h1 class="login_logo"><a href="#"></a></h1>
<div class="login_headerContent">
<div class="navList">
<ul>
	<!--<li><a href="#">设为首页</a></li>
	<li><a href="#">反馈</a></li>
	<li><a href="#" target="_blank">帮助</a></li>
--></ul>
</div>
<h2 class="login_title"></h2>
</div>
</div>
<div id="login_content">
<div class="loginForm"><s:form action="login" namespace="/" >
<!--<s:textfield name="user.userUid" key="login.name"/>
<s:password name="user.userPassword" key="login.password"/>
<input type="checkbox" id="rememberMe"></input><s:text name="login.rememberme"></s:text>
<s:submit type="image" src="/uac/themes/default/images/login_sub.png" onclick="setCookie()"/>
<s:a href="forgetPassword"><s:text name="login.forgetpassword"></s:text></s:a>
-->
<table cellspacing="5">
	<tr>
		<td><s:textfield name="user.userUid" key="login.name" style="width:120px"/></td>
	</tr>
	<tr>
		<td><s:password name="user.userPassword" key="login.password"  style="width:120px"/></td>
	</tr>
	<br/>
	<tr>
		<td><input type="checkbox" id="rememberMe"></input><s:text name="login.rememberme"></s:text></td>
		<td align="right"><s:submit type="image" src="/uac/themes/default/images/login_sub.png" onclick="setCookie()"/></td>
	</tr>
	<tr>
		<td colspan="2">
			<s:a href="forgetPassword"><s:text name="login.forgetpassword"></s:text></s:a>
		</td>
	</tr>
</table>
</s:form></div>
<div class="login_banner"></div>
<div class="login_main">
<ul class="helpList">
	<li><a href="#"></a></li>
	<li><a href="#"></a></li>
	<li><a href="#"></a></li>
	<li><a href="#"></a></li>
</ul>
</div>
</div>
<div id="login_footer">Copyright &copy; 2012 XXX Inc. All Rights
Reserved.</div>
</div>
</body>
</html>