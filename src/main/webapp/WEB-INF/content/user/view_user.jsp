<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../common/commonInclude.jsp"%>
<div class="pageContent">
	<div class="pageFormContent" layoutH="30">
	<fieldset>
		<legend><s:text name="userhelp.basic"/></legend>
			<dl>
				<dt><s:text name="user.uid"/></dt>
				<dd><input type="text" name="" class="textInput" readonly="true"  size="30" value="${user.userUid}" /></dd>
			</dl>
			<dl>
				<dt><s:text name="user.name"/></dt>
				<dd><input  type="text" name="" class="textInput" readonly="true"  size="30" value="${user.userName}" /></dd>
			</dl>
			<dl>
				<dt><s:text name="user.surname"/></dt>
				<dd><input  type="text" name="" class="textInput" readonly="true"  size="30" value="${user.userSurname}" /></dd>
			</dl>
			<dl>
				<dt><s:text name="user.description"/></dt>
				<dd><input  type="text" name="" class="textInput" readonly="true"  size="30" value="${user.userDescription}" /></dd>
			</dl>
			<dl>
				<dt><s:text name="user.email"/></dt>
				<dd><input  type="text" name="" class="textInput" readonly="true"  size="30" value="${user.userEmail}" /></dd>
			</dl>
			<%-- <dl>
				<dt><s:text name="user.nation"/></dt>
				<dd><input  type="text" name="" class="textInput" readonly="true"  size="30" value="${user.userNationDict}" /></dd>
			</dl> --%>
			<dl>
				<dt><s:text name="user.gender"/></dt>
				<dd><input  type="text" name="" class="textInput" readonly="true"  size="30" value="${user.userGender}" /></dd>
			</dl>
			<dl>
				<dt><s:text name="user.birthday"/></dt>
				<dd><input  type="text" name="" class="textInput" readonly="true"  size="30" value="<s:date name="user.userBirthday" format="yyyy-MM-dd" />" /></dd>
			</dl>
			<dl>
				<dt><s:text name="user.country"/></dt>
				<dd><input  type="text" name="" class="textInput" readonly="true"  size="30" value="${user.userNationality}" /></dd>
			</dl>
			<%-- <dl>
				<dt><s:text name="user.religion"/></dt>
				<dd><input  type="text" name="" class="textInput" readonly="true"  size="30" value="${user.userReligionDict}" /></dd>
			</dl> --%>
			<dl>
				<dt><s:text name="user.telephoneNumber"/></dt>
				<dd><input  type="text" name="" class="textInput" readonly="true"  size="30" value="${user.userTelephoneNumber}" /></dd>
			</dl>
			<dl>
				<dt><s:text name="user.mobile"/></dt>
				<dd><input  type="text" name="" class="textInput" readonly="true"  size="30" value="${user.userPreferredMobile}" /></dd>
			</dl>
			<dl>
				<dt><s:text name="user.postalAddress"/></dt>
				<dd><input  type="text" name="" class="textInput" readonly="true"  size="30" value="${user.userPostalAddress}" /></dd>
			</dl>
			<dl>
				<dt><s:text name="user.postalCode"/></dt>
				<dd><input  type="text" name="" class="textInput" readonly="true"  size="30" value="${user.userPostalCode}" /></dd>
			</dl>
			<dl>
				<dt><s:text name="user.fax"/></dt>
				<dd><input  type="text" name="" class="textInput" readonly="true"  size="30" value="${user.userFaxNumber}" /></dd>
			</dl>
			<dl>
				<dt><s:text name="user.startTime"/></dt>
				<dd><input  type="text" name="" class="textInput" readonly="true"  size="30" value="<s:date name="user.userStarttime" format="yyyy-MM-dd HH:mm:ss" />" /></dd>
			</dl>
			<dl>
				<dt><s:text name="user.endTime"/></dt>
				<dd><input  type="text" name="" class="textInput" readonly="true"  size="30" value="<s:date name="user.userEndtime" format="yyyy-MM-dd HH:mm:ss" />" /></dd>
			</dl>
			<dl>
				<dt><s:text name="user.status"/></dt>
				<dd><input  type="text" name="" class="textInput" readonly="true"  size="30" value="${user.userStatus}" /></dd>
			</dl>
			<dl>
				<dt><s:text name="user.passwordModifiedDate"/></dt>
				<dd><input  type="text" name="" class="textInput" readonly="true"  size="30" value="<s:date name="user.userPwdModifiedDate" format="yyyy-MM-dd HH:mm:ss" />" /></dd>
			</dl>
			<dl>
				<dt><s:text name="user.photo"/></dt>
				<dd><input  type="text" name="" class="textInput" readonly="true"  size="30" value="" /></dd>
			</dl>
			<dl>
				<dt><s:text name="user.idCardNumber"/></dt>
				<dd><input  type="text" name="" class="textInput" readonly="true"  size="30" value="${user.userIdCardNumber}" /></dd>
			</dl>
			<%-- <dl>
				<dt><s:text name="user.level"/></dt>
				<dd><input  type="text" name="" class="textInput" readonly="true"  size="30" value="${user.userLevelDict}" /></dd>
			</dl> --%>
			<dl>
				<dt><s:text name="user.entryTime"/></dt>
				<dd><input  type="text" name="" class="textInput" readonly="true"  size="30" value="<s:date name="user.userEntrytime" format="yyyy-MM-dd" />" /></dd>
			</dl>
			<%-- <dl>
				<dt><s:text name="user.positionLevel"/></dt>
				<dd><input  type="text" name="" class="textInput" readonly="true"  size="30" value="${user.userPositionLevelDict}" /></dd>
			</dl> --%>
			<dl>
				<dt><s:text name="user.location"/></dt>
				<dd><input  type="text" name="" class="textInput" readonly="true"  size="30" value="${user.userLocation}" /></dd>
			</dl>
			<dl>
				<dt><s:text name="user.remark"/></dt>
				<dd><input  type="text" name="" class="textInput" readonly="true"  size="30" value="${user.userRemark}" /></dd>
			</dl>
			<dl>
				<dt><s:text name="user.employeetype"/></dt>
				<dd><input  type="text" name="" class="textInput" readonly="true"  size="30" value="${user.userEmployeetype}" /></dd>
			</dl>
			<dl>
				<dt><s:text name="user.employeeNumber"/></dt>
				<dd><input  type="text" name="" class="textInput" readonly="true"  size="30" value="${user.userEmployeeNumber}" /></dd>
			</dl>
		</fieldset>

		<fieldset>
			<legend><s:text name="userhelp.orgs"/></legend>
			<table class="table">
				<thead>
					<tr>
						<th width="120"><s:text name="userhelp.org.code" /></th>
						<th width="120"><s:text name="userhelp.org.name" /></th>
					</tr>
				</thead>
				<tbody>
				<s:iterator value="user.orgUserList">
					<tr>
						<td><s:property value="orgInfo.orgCode" /></td>
						<td><s:property value="orgInfo.orgName" /></td>
					</tr>
				</s:iterator>
				</tbody>
			</table>
	</fieldset>
	<fieldset>
		<legend><s:text name="userhelp.groups"/></legend>
		<table class="table">
			<thead>
				<tr>
					<th width="120"><s:text name="userhelp.group.name" /></th>
					<th width="120"><s:text name="userhelp.group.type" /></th>
				</tr>
			</thead>
			<tbody>
			<s:iterator value="user.userGroupList">
				<tr>
					<td><s:property value="groupInfo.groupName" /></td>
					<td><s:property value="groupInfo.groupType" /></td>
				</tr>
			</s:iterator>
			</tbody>
		</table>
	</fieldset>
	<fieldset>
		<legend><s:text name="userhelp.roles"/></legend>
		<table class="table">
			<thead>
				<tr>
					<th width="120"><s:text name="userhelp.role.name" /></th>
					<th width="120"><s:text name="userhelp.role.order" /></th>
				</tr>
			</thead>
			<tbody>
			<s:iterator value="user.userRoleList">
				<tr>
					<td><s:property value="roleInfo.roleName" /></td>
					<td><s:property value="roleInfo.roleDisplayOrder" /></td>
				</tr>
			</s:iterator>
			</tbody>
		</table>
	</fieldset>
	</div>
	<div class="formBar">
		<ul>
			<li><div class="button"><div class="buttonContent"><button class="close" type="button"><s:text name="global.close" /></button></div></div></li>
		</ul>
	</div>
</div>