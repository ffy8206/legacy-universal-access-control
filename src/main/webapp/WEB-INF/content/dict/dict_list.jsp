<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<li>
				<a class="add" href="../dict/displayDict?optTable=<s:property value='optTable' />" target="navTab" title="<s:text name='global.add' /><s:text name='dict.table.%{optTable}' />" rel="add_dict">
			   	<span><s:text name="global.add" /></span>
			    </a>
			 </li>
			<li>
				<a class="delete" href="../dict/deleteDict?optTable=<s:property value='optTable' />&&did={sid_dict}" target="ajaxTodo" title="<s:text name='global.confirm.delete' />">
				<span><s:text name='global.delete' /></span>
				</a>
			</li>
			<li>
				<a class="edit" href="../dict/displayDict?optTable=<s:property value='optTable' />&&did={sid_dict}" target="navTab" title="<s:text name='global.update' /><s:text name='dict.table.%{optTable}' />"  rel="edit_dict">
				<span><s:text name='global.update' /></span>
				</a>
			</li>
		</ul>
	</div>
	
	<table class="table" width="100%" layoutH="138">
		<thead>
			<tr>
				<th><s:text name="dict.code" /></th>
				<th><s:text name="dict.value" /></th>
				<th><s:text name="dict.description" /></th>
			</tr>
		</thead>
		<tbody>
		<s:iterator value="dictList">
			<tr target="sid_dict" rel="<s:property value="code" />">
				<td><s:property value="code" /></td>
				<td><s:property value="value" /></td>
				<td><s:property value="description" /></td>
			</tr>
		</s:iterator>
		</tbody>
	</table>
</div>
