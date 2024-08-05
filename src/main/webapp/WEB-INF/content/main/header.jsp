<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../common/commonInclude.jsp"%>
			<div class="headerNav">
				<a class="logo" href="">标志</a>
				<ul class="nav">
					<li><p>欢迎您，&nbsp;&nbsp;<s:property value="@com.harry.uac.common.context.AppContextHolder@getContext().user.userUid"/></p>&nbsp;&nbsp;&nbsp;</li>
					<li><a href="../logout"><b>退出</b></a></li>
				</ul>
				<ul class="themeList" id="themeList">
					<li theme="default"><div class="selected">蓝色</div></li>
					<li theme="green"><div>绿色</div></li>
					<!--<li theme="red"><div>红色</div></li>-->
					<li theme="purple"><div>紫色</div></li>
					<li theme="silver"><div>银色</div></li>
					<li theme="azure"><div>天蓝</div></li>
				</ul>
			</div>
			<input type="hidden" id="forceChangePasswordFlag" value='<s:property value="ifChangePassword"/>'></input>