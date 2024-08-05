<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../common/commonInclude.jsp"%>
<script type="text/javascript">
var org_add = {
	addRootNode : function(checkbox){
		if ($(checkbox).is(":checked")) {
			$("#org_add_orgParentId").removeClass("required");
		} else {
			$("#org_add_orgParentId").addClass("required");
		}
	}	
};
$(function(){
	if($("#org_add_orgId").val() != "" && $("#org_add_orgParentId").val() == "") {
		$("#org_add_orgRootFlag").trigger("click");
		org_add.addRootNode($("#org_add_orgRootFlag")[0]);
	}
});
</script>
<div class="pageContent">
<!-- <form width="300px" action="../org/${actionName}" class="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone);"> -->
<s:form action="%{actionName}" namespace="/org" cssClass="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone);" >
	<div class="pageFormContent" layoutH="58">
	<s:hidden name="navTabId" value="%{rel}"/>
	<!--
	org.orgId for update action 
	 -->
	<s:hidden id="org_add_orgId" name="org.orgId" value="%{org.orgId}"/>
<!-- 	<s:token name="%{actionName}"/>  -->
			<dl>
				<dt><s:text name="org.orgCode"/></dt>
				<dd><input type="text" name="org.orgCode" class="textInput required" size="30"  value="<s:property value='org.orgCode'/>"/></dd>
			</dl>
			<dl>
				<dt><s:text name="org.displayName"/></dt>
				<dd><input type="text" name="org.orgName" class="textInput required" size="30"  value="<s:property value='org.orgName'/>"/></dd>
			</dl>
			<dl>
				<dt><s:text name="org.initials"/></dt>
				<dd><input type="text" name="org.orgInitials" class="textInput required" size="30" value="<s:property value='org.orgInitials'/>" /></dd>
			</dl>
			<dl>
				<dt><s:text name="org.addRootNode"/></dt>
				<dd><input type="checkbox" class="checkboxCtrl" id="org_add_orgRootFlag" onclick="org_add.addRootNode(this);" /></dd>
			</dl>
			<dl>
				<dt><s:text name="org.parent.id"/></dt>
				<dd>
				<!-- <input type="text" name="org.orgParentId" class="textInput digits required" size="30" value="<s:property value='org.orgParentId'/>" /> -->
				    <!-- <input name="org.orgParentId" value="<s:property value='org.orgParentId'/>" type="hidden"> -->
				    <input name="org.orgParentId" id="org_add_orgParentId" value="<s:property value='org.orgParentId'/>" readonly="readonly" class="textInput required" size="30"/>
				    <a class="btnLook" href="../common/showOrgTreeDialog" lookupGroup="org" lookupPk="orgParentId" width="800" height="400" title="组织树"></a>
				</dd>
			</dl>
			<dl>
				<dt><s:text name="org.style"/></dt>
				<dd>
				<select name="org.orgStyle" class="combox"> 
					<s:iterator value="orgStyleCombox" >
						<s:if test="org.orgStyle==key">
							<option value="<s:property value="key"/>" selected=true ><s:property value="value"/></option>
						</s:if>
						<s:else>
							<option value="<s:property value="key"/>" ><s:property value="value"/></option>
						</s:else>
					</s:iterator> 				
				</select>
				</dd>
			</dl>
			<dl>
				<dt><s:text name="org.status"/></dt>
				<dd>
				<select name="org.orgStatus" class="combox">
					<s:iterator value="orgStatusCombox" >
						<s:if test="org.orgStatus==key">
							<option value="<s:property value="key"/>" selected=true ><s:property value="value"/></option>
						</s:if>
						<s:else>
							<option value="<s:property value="key"/>" ><s:property value="value"/></option>
						</s:else>
					</s:iterator> 
				</select>
				</dd>
			</dl>
			<dl>
				<dt><s:text name="org.level"/></dt>
				<dd><input  type="text" name="org.orgLevelDict" class="textInput digits" size="30" value="<s:property value='org.orgLevelDict'/>" /></dd>
			</dl>
			<dl>
				<dt><s:text name="org.display.order"/></dt>
				<dd><input type="text" name="org.orgDisplayOrder" class="textInput digits" size="30" value="<s:property value='org.orgDisplayOrder'/>" /></dd>
			</dl>
			<dl>
				<dt><s:text name="org.supervisor"/></dt>
				<dd><input type="text" name="org.orgSupervisorUid" class="textInput" size="30" value="<s:property value='org.orgSupervisorUid'/>" /></dd>
			</dl>
			<dl>
				<dt><s:text name="org.manager"/></dt>
				<dd><input type="text" name="org.orgManagerUid" class="textInput required" size="30" value="<s:property value='org.orgManagerUid'/>" /></dd>
			</dl>
			<dl>
				<dt><s:text name="org.vicemanager"/></dt>
				<dd><input type="text" name="org.orgViceManagerUid" class="textInput" size="30" value="<s:property value='org.orgViceManagerUid'/>"  /></dd>
			</dl>
			<dl>
				<dt><s:text name="org.admin"/></dt>
				<dd><input type="text" name="org.orgAdminUid" class="textInput" size="30" value="<s:property value='org.orgAdminUid'/>" /></dd>
			</dl>
			<dl>
				<dt><s:text name="org.manage.org.id"/></dt>
				<dd><input type="text" name="org.orgManageOrgId" class="textInput"  size="30" value="<s:property value='org.orgManageOrgId'/>" /></dd>
			</dl>
			<dl>
				<dt><s:text name="org.address"/></dt>
				<dd><input type="text" name="org.orgPostalAddress" class="textInput" size="30" value="<s:property value='org.orgPostalAddress'/>" /></dd>
			</dl>
			<dl>
				<dt><s:text name="org.postcode"/></dt>
				<dd><input type="text" name="org.orgPostalCode" class="textInput" size="30" value="<s:property value='org.orgPostalCode'/>" /></dd>
			</dl>
			<dl>
				<dt><s:text name="org.phone"/></dt>
				<dd><input type="text" name="org.orgTelephoneNumber" class="textInput phone" size="30" value="<s:property value='org.orgTelephoneNumber'/>" /></dd>
			</dl>
			<dl>
				<dt><s:text name="org.fax"/></dt>
				<dd><input type="text" name="org.orgFaxNumber" class="textInput" size="30"  value="<s:property value='org.orgFaxNumber'/>" /></dd>
			</dl>
			<dl>
				<dt><s:text name="org.start.time"/></dt>
				<dd>
				<input type="text" name="org.orgStarttime" class="date" size="30" value="<s:date name="org.orgStarttime" format="yyyy-MM-dd" />" />
				<a class="inputDateButton" href="javascript:;">选择</a>
				</dd>
			</dl>
			<dl>
				<dt><s:text name="org.end.time"/></dt>
				<dd>
				<input type="text" name="org.orgEndtime" class="date" size="30" value="<s:date name="org.orgEndtime" format="yyyy-MM-dd" />" />
				<a class="inputDateButton" href="javascript:;">选择</a>
				</dd>
			</dl>
			<%-- <dl>
				<dt><s:text name="org.erphr.id"/></dt>
				<dd><input type="text" name="org.orgErpId" class="textInput required" size="30" value="<s:property value='org.orgErpId'/>" /></dd>
			</dl> --%>
			<dl>
				<dt><s:text name="org.city"/></dt>
				<dd><input type="text" name="org.orgLocation" class="textInput required" size="30" value="<s:property value='org.orgLocation'/>" /></dd>
			</dl>
			<dl>
				<dt><s:text name="org.tag"/></dt>
				<dd><input type="text" name="org.tag" id="tag" class="textInput" size="20" value="<s:property value='org.tag'/>" data-seperator=","/></dd>
			</dl>
			<dl>
				<dt><s:text name="org.description"/></dt>
				<dd><textarea name="org.orgDescription" cols= "30" rows="5"><s:property value='org.orgDescription'/></textarea></dd>
			</dl>
			<!-- 
			<dl>
				<dt>组织人员添加方案一：</dt>
				<input type="hidden" name="orgId" value=""/>
			 	<input type="text" class="textInput readOnly" name="dwz.orgName" size="30" value="" readonly="readonly" lookupGroup="" />
				<a class="btnLook" href="../org/queryMiniOrgInfo" lookupGroup="" lookupPk="orgId" maxable="false" resizable="false"><hi:text key="查找带回"/></a>
			</dl>
			 -->
		<!-- 
		<div class="divider"></div>
		<h3 class="contentTitle">组织人员添加方案二：</h3>
		<div class="tabs">
			<div class="tabsHeader">
				<div class="tabsHeaderContent">
					<ul>
						<li class="selected"><a href="javascript:void(0)"><span>组织人员添加</span></a></li>
					</ul>
				</div>
			</div>
			<div class="tabsContent" style="height: 150px;">
				<div>
					<table class="list nowrap itemDetail" addButton="组织人员新建" width="100%">
						<thead>
							<tr>

								<th type="date" name="userList[#index#].itemDate" size="12">从日期</th>
								<th type="date" format="yyyy-MM-dd HH:mm:ss" name="items[#index#].itemDataTime" size="16">从日期时间</th>
								<th type="lookup" name="dwz.items[#index#].org.orgName" lookupGroup="items[#index#].org" lookupUrl="demo/database/dwzOrgLookup.html" suggestUrl="demo/database/db_lookupSuggest.html" suggestFields="orgName" size="12">部门名称</th>
								<th type="enum" name="org.userList[#index#].itemEnum" enumUrl="demo/database/db_select.html" size="12">从枚举</th>
								<th type="del" width="60">操作</th>
							</tr>
						</thead>
						<tbody></tbody>
					</table>
				</div>
			</div>
			<div class="tabsFooter">
				<div class="tabsFooterContent"></div>
			</div>
		</div>
		 -->
		 <br/>
	</div>
	<div class="formBar">
		<ul>
			<li><div class="buttonActive"><div class="buttonContent"><button type="submit"><s:text name="global.save" /></button></div></div></li>
			<li><div class="button"><div class="buttonContent"><button class="close" type="button"><s:text name="global.close" /></button></div></div></li>
		</ul>
	</div>
</s:form>
</div>


