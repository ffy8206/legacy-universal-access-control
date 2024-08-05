$(document).ready(function() {
	var uumUid = $.cookie("uumUid");
	if(uumUid == null || uumUid == undefined) 
		return;
	$("input[name='user.userUid']").val(uumUid);
});

function setCookie() {
	if($('#rememberMe')[0].checked) {//default expiration time: 7 days
		$.cookie('uumUid',$("input[name='user.userUid']").val(), {expires: 7});
	}
//	$.pdialog.open("forceChangePassword", "change_password", "修改密码");
//	alert($.pdialog);
//	return false;
}
