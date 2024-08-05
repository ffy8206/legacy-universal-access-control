<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../common/commonInclude.jsp"%>
<link href="../js/uploadify/css/uploadify.css" rel="stylesheet" type="text/css" />
<script src="../js/uploadify/scripts/swfobject.js" type="text/javascript"></script>
<script src="../js/uploadify/scripts/jquery.uploadify.v2.1.0.js" type="text/javascript"></script>
<script type="text/javascript">
var user_add = {
	uploadPhoto : function(){
		alert("Please upload your photo");
	},
	showMenu : function() {
		var orgTextObj = $("#orgTreeText");
		var orgTextOffset = $("#orgTreeText").offset();
		$("#orgTreeContent").css({left: "130px", top:"26px"}).slideDown("fast");
		$("body").bind("mousedown", user_add.onBodyDown);
	},
	onBodyDown : function(event) {
		if (!(event.target.id == "orgTreeSel" || event.target.id == "orgTreeContent" || $(event.target).parents("#orgTreeContent").length>0)) {
			user_add.hideMenu();
		}
	},
	hideMenu: function() {
		$("#orgTreeContent").fadeOut("fast");
		$("body").unbind("mousedown", user_add.onBodyDown);
	}
};

function f_uploadPhoto() {
	var uploadParam = {"user.userId" : '${user.userId}'};				
	$('#user_add_photoUpload').uploadifySettings('scriptData', uploadParam);
	$('#user_add_photoUpload').uploadifyUpload();
} 

var user_add_ztree = {
	zUserMgrTreeNodes : {},
	userMgrTreeSetting : {
		view: {
			dblClickExpand: false
		},
		data: {
			simpleData: {
				enable: true
			}
		}
	},
	bindTree : function() {
		$.ajax({
			type:'GET',
			url:'../common/getOrgZTreeJsonData',
			data:{"parentOrgId":$("input[name='parentOrgId']").val()},
			dataType:'json',
			timeout: 50000,
			cache: false,
			async: false,
			success: function(json){
				user_add_ztree.zUserMgrTreeNodes = eval("[" + json.orgTreeData + "]");
				$.each(user_add_ztree.zUserMgrTreeNodes, function(k,v){
					v.click = "user_add_ztree." + v.click;
				});
			}
		});
	},
	orgTreeNodeSel: function(oId,oName,oLayerCode) {
		$("#orgTreeText").val(oName);
		$("#orgTreeId").val(oId);
	}
};

$(document).ready(function() {
    $("#user_add_photoUpload").uploadify({
        /*注意前面需要书写path的代码*/
        'uploader'       : '../js/uploadify/scripts/uploadify.swf',
        'script'         : '../user/uploadPhoto',
        'cancelImg'      : '../js/uploadify/cancel.png',
        'queueID'        : 'user_add_photoQueue', //和存放队列的DIV的id一致
        'fileDataName'   : 'fileUpload', //和以下input的name属性一致
        'auto'           : false, //是否自动开始
        'multi'          : true, //是否支持多文件上传
        'buttonText'     : 'Browse', //按钮上的文字
        'simUploadLimit' : 1, //一次同步上传的文件数目
        'sizeLimit'      : 19871202, //设置单个文件大小限制
        'queueSizeLimit' : 1, //队列中同时存在的文件个数限制
        'fileDesc'       : '*.jpg;', //如果配置了以下的'fileExt'属性，那么这个属性是必须的
        'fileExt'        : '*.jpg;',//允许的格式  
    onComplete: function (event, queueID, fileObj, response, data) {
    	$("#preview").attr("src", "..\\uploadPhotos\\" + response);
    	$("#photoPath").val("\\uploadPhotos\\" + response);
    },
    onError: function(event, queueID, fileObj) {
    	alertMsg.error('文件:' + fileObj.name + " 上传失败");
    }
//            onCancel: function(event, queueID, fileObj){
//            	alert("您取消了" + fileObj.name);
//            }
  });
    
    user_add_ztree.bindTree();
	$.fn.zTree.init($("#userAdd_OrgTree"), user_add_ztree.userMgrTreeSetting, user_add_ztree.zUserMgrTreeNodes);
	var treeObj = $.fn.zTree.getZTreeObj("userAdd_OrgTree");
	$("#orgTreeText").bind("click", function(){
		user_add.showMenu();
	});
}); 
</script>
<div class="pageContent">
<s:form action="%{actionName}" namespace="/user" cssClass="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone);" >
	<div class="pageFormContent" layoutH="58">
	<s:hidden name="navTabId" value="%{rel}"/>
	<s:hidden name="user.userId" />
	<s:hidden name="user.createUserId" />
	<s:hidden name="user.createTime" />
	<!--
	user.userId for update action 
	 -->
			 <div class="unit" style="height:28px"></div>
			 <fieldset>
			 <legend><s:text name="userhelp.basic"/></legend>
			 <dl>
				<dt><s:text name="user.firstname"/></dt>
				<dd><input  type="text" name="user.userFirstname" class="textInput required"   size="30" value="${user.userFirstname}" /></dd>
			 </dl>
			 <dl>
				<dt><s:text name="user.lastname"/></dt>
				<dd><input  type="text" name="user.userLastname" class="textInput required"   size="30" value="${user.userLastname}" /></dd>
			 </dl>
			<dl>
				<dt><s:text name="user.description"/></dt>
				<dd><input  type="text" name="user.userDescription" class="textInput"   size="30" value="${user.userDescription}" /></dd>
			</dl>
			<dl>
				<dt><s:text name="user.email"/></dt>
				<dd><input  type="text" name="user.userEmail" class="textInput"   size="30" value="${user.userEmail}" /></dd>
			</dl>
			<!-- 
			<dl>
				<dt><s:text name="user.nation"/></dt>
				<dd>				
					<select id="user_userNationDict" name="user.userNationDict" style="width: 150px" value="${user.userNationDict}" >
			    		<option ></option>
							<c:forEach items="${nationDictList}" var="item" varStatus="status">
								<option value="${item.code}" <c:if test="${item.code==user.userNationDict}">selected</c:if>>${item.value}</option>
							</c:forEach>
					</select>
				</dd>
			</dl>
			 -->
			<dl>
				<dt><s:text name="user.gender"/></dt>
				<dd>
					<select id="user_userGender" name="user.userGender" style="width: 80px" value="${user.userGender}" >
						<option ></option>
			      	    <option value="1"<c:if test="${user.userGender==1}">selected</c:if>><s:text name="user.userGender.male"/></option>
			      	    <option value="2"<c:if test="${user.userGender==2}">selected</c:if>><s:text name="user.userGender.female"/></option>
			      	    <option value="3"<c:if test="${user.userGender==3}">selected</c:if>><s:text name="user.userGender.unknown"/></option>
					</select>
				</dd>
			</dl>
			<!--<dl>
				<dt><s:text name="user.birthday"/></dt>
				<dd><input  type="text" name="user.userBirthday" class="textInput"   size="30" value="${user.userBirthday}" /></dd>
			</dl>
			-->
			<dl>			
				<dt><s:text name="user.birthday"/></dt>
				<dd>
				<input type="text" name="user.userBirthday" class="date" yearstart="-30" yearend="1" size="30" value="<s:date name="user.userBirthday" format="yyyy-MM-dd" />" />
				<a class="inputDateButton" href="javascript:;">选择</a>
				</dd>
			</dl>
			<dl>
				<dt><s:text name="user.country"/></dt>
				<dd><input  type="text" name="user.userNationality" class="textInput"   size="30" value="${user.userNationality}" /></dd>
			</dl>
			<!-- 
			<dl>
				<dt><s:text name="user.religion"/></dt>
				<dd>				
					<select id="user_userReligionDict" name="user.userReligionDict" style="width: 150px" value="${user.userReligionDict}" >
			    			<option ></option>
							<c:forEach items="${religionDictList}" var="item" varStatus="status">
								<option value="${item.code}" <c:if test="${item.code==user.userReligionDict}">selected</c:if>>${item.value}</option>
							</c:forEach>
					</select>
				</dd>
			</dl>
			-->
			<dl>
				<dt><s:text name="user.telephoneNumber"/></dt>
				<dd><input  type="text" name="user.userTelephoneNumber" class="textInput"   size="30" value="${user.userTelephoneNumber}" /></dd>
			</dl>
			<dl>
				<dt><s:text name="user.mobile"/></dt>
				<dd><input  type="text" name="user.userPreferredMobile" class="textInput"   size="30" value="${user.userPreferredMobile}" /></dd>
			</dl>
			<dl>
				<dt><s:text name="user.postalAddress"/></dt>
				<dd><input  type="text" name="user.userPostalAddress" class="textInput"   size="30" value="${user.userPostalAddress}" /></dd>
			</dl>
			<dl>
				<dt><s:text name="user.postalCode"/></dt>
				<dd><input  type="text" name="user.userPostalCode" class="textInput"   size="30" value="${user.userPostalCode}" /></dd>
			</dl>
			<dl>
				<dt><s:text name="user.fax"/></dt>
				<dd><input  type="text" name="user.userFaxNumber" class="textInput"   size="30" value="${user.userFaxNumber}" /></dd>
			</dl>
			<dl>
				<dt><s:text name="user.idCardNumber"/></dt>
				<dd><input  type="text" name="user.userIdCardNumber" class="textInput"   size="30" value="${user.userIdCardNumber}" /></dd>
			</dl>
			<!-- 
			<dl>
				<dt><s:text name="user.level"/></dt>
				<dd>				
					<select id="user_userLevelDict" name="user.userLevelDict" style="width: 220px" value="${user.userLevelDict}" >
			    		<option ></option>
							<c:forEach items="${levelDictList}" var="item" varStatus="status">
								<option value="${item.code}" <c:if test="${item.code==user.userLevelDict}">selected</c:if>>${item.value}</option>
							</c:forEach>
					</select>
				</dd>
			</dl>
			<dl>
				<dt><s:text name="user.category"/></dt>
				<dd><input  type="text" name="user.userCategory" class="textInput"   size="30" value="${user.userCategory}" /></dd>
			</dl>
				<dl>
				<dt><s:text name="user.type"/></dt>
				<dd>
					<select id="user_userUserype" name="user.userUsertype" style="width: 80px" value="${user.userUsertype}" >
											<option ></option>
								      	    <option value="0"<c:if test="${user.userUsertype==0}">selected</c:if>><s:text name="user.userUsertype.internal"/></option>
											<option value="1"<c:if test="${user.userUsertype==1}">selected</c:if>><s:text name="user.userUsertype.external"/></option>						      	    
					</select>
				</dd>
			</dl>
			-->
			<dl>
				<dt><s:text name="user.employeeNumber"/></dt>
				<dd><input  type="text" name="user.userEmployeeNumber" class="textInput"   size="30" value="${user.userEmployeeNumber}" /></dd>
			</dl>
			
			<dl>			
				<dt><s:text name="user.entryTime"/></dt>
				<dd>
				<input type="text" name="user.userEntrytime" class="date" yearstart="-30" yearend="1" size="30" value="<s:date name="user.userEntrytime" format="yyyy-MM-dd" />" />
				<a class="inputDateButton" href="javascript:;">选择</a>
				</dd>
			</dl>
			<dl>
				<dt><s:text name="user.positionLevel"/></dt>
				<dd>				
					<select id="user_userPositionLevelDict" name="user.userPositionLevelDict" style="width: 150px" value="${user.userPositionLevelDict}" >
			    		<option ></option>
							<c:forEach items="${positionLevelDictList}" var="item" varStatus="status">
								<option value="${item.code}" <c:if test="${item.code==user.userPositionLevelDict}">selected</c:if>>${item.value}</option>
							</c:forEach>
					</select>
				</dd>
			</dl>
			<dl>
				<dt><s:text name="user.location"/></dt>
				<dd><input  type="text" name="user.userLocation" class="textInput"   size="30" value="${user.userLocation}" /></dd>
			</dl>
			<dl>
				<dt><s:text name="user.remark"/></dt>
				<dd><input  type="text" name="user.userRemark" class="textInput"   size="30" value="${user.userRemark}" /></dd>
			</dl>
			<dl>
				<!--<dt><s:text name="user.employeetype"/></dt>
				<dd><input  type="text" name="user.userEmployeetype" class="textInput"   size="30" value="${user.userEmployeetype}" /></dd>
				-->
				<dt><s:text name="user.employeetype"/></dt>
				<dd>				
					<select id="user_userEmployeetypeDict" name="user.userEmployeetype" style="width: 200px" value="${user.userEmployeetype}" >
			    		<option ></option>
							<c:forEach items="${employeetypeDictList}" var="item" varStatus="status">
								<option value="${item.code}" <c:if test="${item.code==user.userEmployeetype}">selected</c:if>>${item.value}</option>
							</c:forEach>
					</select>
				</dd>
			</dl>			
			<dl>
				<dt><s:text name="user.tag"/></dt>
				<dd><input type="text" name="user.tag" id="tag" class="textInput" size="20" value="<s:property value='user.tag'/>" data-seperator=","/></dd>
			</dl>
			<c:if test="${user.userId!=null}">	</c:if>
			</fieldset>
			
			<c:if test="${user.userId!=null}">
				<div class="unit" style="height:20px"></div>
				<fieldset>
				<legend><s:text name="user.photo"/></legend>
				<div style="float:left;display:inline;margin-right:50px;">
					<input id="user_add_photoUpload" type="file" name="fileUpload"/>
					<div id="user_add_photoQueue" class="fileQueue" style="height:55px;"></div>
					<div class="button"><div class="buttonContent"><button type="button" onclick="f_uploadPhoto()">upload</button></div></div>
					<input type="hidden" value="${photoPath}" id="photoPath" name="photoPath" />
				</div>
				<div>
					<img id="preview" src="..${photoPath}" alt="Please Upload JPEG"/>
				</div>
				<!-- <input  type="text" name="userPhoto" class="textInput"   size="30" value="" onclick="user_add.uploadPhoto()"/> -->
				</fieldset>
			</c:if>	
			
			 <div class="unit" style="height:20px"></div>
			 <fieldset>
			 <legend><s:text name="user.account.basic"/></legend>
			<dl>
				<dt><s:text name="user.uid"/></dt>
				<dd><input type="text" name="user.userUid" class="textInput required"   size="30" value="${user.userUid}" /></dd>
			</dl>
			<dl>
				<dt><s:text name="user.password"/></dt>
				<dd><input type="text" name="user.userPassword" class="textInput"   size="30" value="${user.userPassword}" /></dd>
			</dl>
			
			<dl>			
				<dt><s:text name="user.startTime"/></dt>
				<dd>
				<input type="text" name="user.userStarttime" class="date" yearstart="-30" yearend="50" size="30" value="<s:date name="user.userStarttime" format="yyyy-MM-dd" />" />
				<a class="inputDateButton" href="javascript:;">选择</a>
				</dd>
			</dl>
			<dl>
				<dt><s:text name="user.endTime"/></dt>
				<dd>
				<input type="text" name="user.userEndtime" class="date" yearstart="-30" yearend="50" size="30" value="<s:date name="user.userEndtime" format="yyyy-MM-dd" />" />
				<a class="inputDateButton" href="javascript:;">选择</a>
				</dd>
			</dl>
			<dl>
				<dt><s:text name="user.status"/></dt>
				<dd>
					<select id="user_userStatus" name="user.userStatus" style="width: 80px" value="${user.userStatus}" >
				      	    <option value="0"<c:if test="${user.userStatus==0}">selected</c:if>><s:text name="user.userStatus.inUse"/></option>
				      	    <option value="1"<c:if test="${user.userStatus==1}">selected</c:if>><s:text name="user.userStatus.lock"/></option>								      	    
					</select>
				</dd>
			</dl>
			<dl>
				<dt><s:text name="user.passwordModifiedDate"/></dt>
				<dd><input  type="text" name="user.userPwdModifiedDate" class="textInput"   size="30" value="<s:date name="user.userPwdModifiedDate" format="yyyy-MM-dd HH:mm:ss" />" /></dd>
			</dl>
			
			<!--<dl>
				<dt><s:text name="user.usertype"/></dt>
				<dd><input  type="text" name="user.userUsertype" class="textInput"   size="30" value="${user.userUsertype}" /></dd>
			</dl>
			-->
			<dl>
				<dt><s:text name="global.update.user"/></dt>
				<dd><input  type="text"   size="30" value="${user.updateUserId}" readonly="readonly" /></dd>
			</dl>
			<dl>
				<dt><s:text name="global.update.time"/></dt>
				<dd><input  type="text"   size="30" value="<s:date name="%{user.updateTime}" format="yyyy-MM-dd HH:mm" />" readonly="readonly" /></dd>
			</dl>
			<c:if test="${user.userId!=null}">	</c:if>
			</fieldset>
			<div class="unit" style="height:28px"></div>
			<fieldset>
			<legend><s:text name="userhelp.orgs"/></legend>
			<s:hidden name="orgUser.userId" />
			<input type="hidden" name="orgUser.orgId" value="${orgUser.orgId}"/>
			<s:hidden name="orgUser.userOrgworkType" value="M" />
			<!--
			<dl>
				<dt><s:text name="orguser.orgid"/></dt>
				<dd><input  type="text" name="orgUser.orgId" class="textInput"   size="30" value="${orgUser.orgId}" /></dd>
			</dl>
			<dl>
				<dt><s:text name="orguser.userOrgworkType"/></dt>
				<dd>
					<select id="orgUser_userOrgworkType" name="orgUser.userOrgworkType" style="width: 80px" value="${orgUser.userOrgworkType}" >
							<option ></option>
				      	    <option value="M"<c:if test="${orgUser.userOrgworkType=='M'}">selected</c:if>>main org</option>
				      	    <option value="W"<c:if test="${orgUser.userOrgworkType=='W'}">selected</c:if>>work org</option>
					</select>
				</dd>
			</dl>
			-->
			 
			<dl>
				<dt>所属组织</dt>
				<dd><input  readonly type="text" id="orgTreeText" name="" class="textInput"   size="40" value="${orgUser.orgInfo.orgName}" />
				<input type="hidden" id="orgTreeId" name="orgUser.orgInfo.orgId" class="textInput" value="${orgUser.orgInfo.orgId}" /></dd>
				
				<div id="orgTreeContent" class="orgTreeContent" style="display:none; position: absolute;">
					<ul id="userAdd_OrgTree" class="ztree" style="margin-top:0; width:172px;"></ul>
				</div>
			</dl>
			<dl>
				<dt><s:text name="orguser.userDisplayOrder"/></dt>
				<dd><input  type="text" name="orgUser.userDisplayOrder" class="textInput"   size="30" value="${orgUser.userDisplayOrder}" /></dd>
			</dl>
			<dl>
				<dt><s:text name="orguser.userOrgdutyDict"/></dt>
				<dd><input  type="text" name="orgUser.userOrgdutyDict" class="textInput"   size="30" value="${orgUser.userOrgdutyDict}" /></dd>
			</dl>
			</fieldset>
			
	</div>

	<div class="formBar">
		<ul>
			<li><div class="buttonActive"><div class="buttonContent"><button type="submit"><s:text name="global.save" /></button></div></div></li>
			<li><div class="button"><div class="buttonContent"><button class="close" type="button"><s:text name="global.close" /></button></div></div></li>
		</ul>
	</div>
</s:form>
