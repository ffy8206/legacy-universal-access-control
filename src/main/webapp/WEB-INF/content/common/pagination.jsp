<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="panelBar">
	<div class="pages">
		<span>显示</span>
		<select class="combox" name="numPerPage" onchange="navTabPageBreak({numPerPage:this.value})">
			<s:iterator value="perPageCombox" >
				<s:if test="pageData.page.length==value">
					<option value="<s:property value="value"/>" selected=true ><s:property value="key"/></option>
				</s:if>
				<s:else>
					<option value="<s:property value="value"/>" ><s:property value="key"/></option>
				</s:else>
			</s:iterator> 
		</select>
		<span>条，共<s:property value='%{pageData.page.count}' />条</span>
	</div>
	<div class="pagination" targetType="navTab" totalCount="<s:property value='%{pageData.page.count}' />" numPerPage="<s:property value='%{pageData.page.length}' />" pageNumShown="10" currentPage="<s:property value='%{pageData.page.current}' />">
</div>