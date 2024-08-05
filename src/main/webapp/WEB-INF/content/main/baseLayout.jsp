<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>  
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
    <head>
    	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
  		<link href="../themes/default/style.css" rel="stylesheet" type="text/css" />
        <link href="../themes/css/core.css" rel="stylesheet" type="text/css" />
        <link href="../themes/css/global.css" rel="stylesheet" type="text/css" />
        <link href="../themes/css/jquery.tag.css" rel="stylesheet" type="text/css" />
        <link href="../themes/css/zTreeStyle/zTreeStyle.css" rel="stylesheet" type="text/css" />
		<script src="../js/speedup.js" type="text/javascript"></script>
		<script src="../js/jquery-1.4.4.js" type="text/javascript"></script>
		<script src="../js/jquery.cookie.js" type="text/javascript"></script>
		<script src="../js/jquery.validate.js" type="text/javascript"></script>
		<script src="../js/jquery.bgiframe.js" type="text/javascript"></script>
		<script src="../js/jquery.tag.js" type="text/javascript"></script>
		<script src="../js/dwz.min.js" type="text/javascript"></script>
		<script src="../js/dwz.regional.zh.js" type="text/javascript"></script>
		<script src="../js/jquery.ztree.all-3.1.js" type="text/javascript"></script>
		<script src="../js/dwz.custompagination.js" type="text/javascript"></script>
		<script type="text/javascript">
		function openChangePassword()
		{
			if($('#forceChangePasswordFlag').val() == "true") {
			var url = "../user/forceChangePassword";
			var rel = "change_password";
			var title = "修改密码";
			var options = {height:313, width:600, total:20, max:false, close:false, mask:true, resizable:false, drawable:true, maxable:false,minable:false};
			$.pdialog.open(url, rel, title, options);
			}
		}
		$(function(){
			DWZ.init("../js/dwz.frag.xml", {
				loginUrl:"../showlogindialog", loginTitle:"登录",	// 弹出登录对话框
		//		loginUrl:"login.html",	// 跳到登录页面
				statusCode:{ok:200, error:300, timeout:301}, //【可选】
				pageInfo:{pageNum:"pageNum", numPerPage:"numPerPage", orderField:"orderField", orderDirection:"orderDirection"}, //【可选】
				debug:false,	// 调试模式 【true|false】
				callback:function(){
					initEnv();
					$("#themeList").theme({themeBase:"../themes"}); // themeBase 相对于index页面的主题base路径
					openChangePassword();
				}
			});
		});
		var OString = function(O){
			  var S = [];
			  for(var i in O){
			    O[i] = typeof O[i] == 'string'?'"'+O[i]+'"':(typeof O[i] == 'object'?OString(O[i]):O[i]);
			    S.push(i+':'+O[i]); 
			  }
			    return '{'+S.join(',')+'}';
		};
		</script>
    	<title><tiles:getAsString name="title"/></title>
    </head>
	<body scroll="no">
	<div id="layout">
		<div id="header">
			<tiles:insertAttribute name="header"/>
		</div>
		<div id="leftside">
			<tiles:insertAttribute name="tree"/>
		</div>
		<div id="container">
			 <tiles:insertAttribute name="body"/>
		</div>
		<div id="footer">
			<tiles:insertAttribute name="footer" />
		</div>
	</div>
	</body>	
</html>