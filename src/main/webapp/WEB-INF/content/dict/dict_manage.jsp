<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<div>
    <s:iterator value="{'0','1','2','3','4','5', '6'}" id='number'>
		<dl class="nowrap">
		<dd>
			<a class="button" href="../dict/queryDict?optTable=<s:property value='#number'/>" target="navTab"rel="dict_list">
			<span><s:text name="dict.table.%{number}"/></span>	
			</a>
		</dd>
		</dl>
    </s:iterator>
</div>