<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<script type="text/javascript">
		$(function(){
			$('#test').datagrid({
				title:'Test DataGrid',
				iconCls:'icon-save',
				width:1000,
				height:350,
				nowrap: false,
				striped: false,
				collapsible:false,
				url:'datagrid_data.json',
				sortName: 'uid',
				sortOrder: 'desc',
				remoteSort: false,
				idField:'uid',
				columns:[[
                    {title:'UID',field:'uid',width:80,sortable:true},
					{field:'name',title:'Name',width:120,sortable:true},
					{field:'status',title:'Status',width:220,rowspan:2,sortable:true,
						sorter:function(a,b){
							return (a>b?1:-1);
						}
					},
					{field:'tel',title:'Telphone',width:120,sortable:true}
				]],
				pagination:true,
				rownumbers:true,
				toolbar:[{
					id:'btnadd',
					text:'Add',
					iconCls:'icon-add',
					handler:function(){
						$('#btnsave').linkbutton('enable');
					}
				},{
					id:'btncut',
					text:'Cut',
					iconCls:'icon-cut',
					handler:function(){
						$('#btnsave').linkbutton('enable');
					}
				}]
			});
		});		
</script>
	<table>	
	  <tr>
		<td>省公司: </td>
		<td>
		<select id="cc" class="easyui-combobox" name="state" style="width:200px;" required="true">
			<option value="AL">Alabama</option>
			<option value="AK">Alaska</option>
			<option value="AZ">Arizona</option>
			<option value="AR">Arkansas</option>
			<option value="CA">California</option>
			<option value="CO">Colorado</option>
		</select>
		</td>
		<td style="width:200px;"></td>
		<td><input id="ss" type="submit"	value="高级搜索"></input></td>
	 </tr>
	</table>
<table id="test"></table>
