<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <script type="text/javascript">  
 $(function(){
 $('#ff').hide();
 $('#tt').datagrid({
    title:'User Datagrid',
    iconCls:'icon-save',
    width:500,
    height:350,
    //pageSize:5,
    pageList:[5,10,15,20],
    nowrap:false,
    striped: true,
    collapsible:true,
    url:'queryAllUsers.action',
    loadMsg:'数据装载中......',
    sortName:'id',
    sortOrder:'desc',
    remoteSort:false,
    frozenColumns:[[
     {field:'ck',checkbox:true}
    ]],
    columns:[[
     {title:'ID',field:'id',width:'50',rowspan:2,align:'center'},
     {title:'NAME',field:'name',width:'60',rowspan:2,align:'center'}
    ]],
    pagination:true,
    rownumbers:true,
    toolbar:[{
      text:'全部',
      iconCls:'icon-ok',
      handler:function(){
      $('#tt').datagrid({url:'queryAllUsers.action'});
      }
     },'-',{
      text:'添加',
      iconCls:'icon-add',
      handler:function(){$('#add').window('open');
      $('#ff').show();
      $('#ff').form('clear');
       $('#ff').appendTo('#aa');}
     },'-',{
       text:'修改',
       iconCls:'icon-edit',
       handler:getSelect
     },'-',{
       text:'删除',
       iconCls:'icon-remove',
       handler:del
     },'-',{
       text:'查询',
       iconCls:'icon-search',
       handler:function(){
        $('#query').window('open');
        
       }
     }
    ]
   });
   displayMsg();
  });
  function displayMsg(){
   $('#tt').datagrid('getPager').pagination({displayMsg:'当前显示从{from}到{to}共{total}记录'});
  }
  function close1(){
   $('#add').window('close');
  }
  function close2(){
   $('#edit').window('close');
  }
  function add(){
    $('#ff').form('submit',{
   url: 'addUser.action',
    onSubmit:function(){ return $('#ff').form('validate');},
       success:function(){
         close1();
        }
   });
   $.messager.alert('add','添加信息成功!!!','info',function(){
    $('#tt').datagrid({
    url:'queryAllUsers.action',
     loadMsg:'更新数据中......'
    });
    displayMsg();
   });
  }
  var id;
  function getSelect(){
   var select = $('#tt').datagrid('getSelected');
   if(select){
    $('#edit').window('open');
    $('#ff').show();
    $('#ff').appendTo('#ee');
    $('#name').val(select.name);
    $('#className').val(select.className);
    id = select.id;
   }else{
    $.messager.alert('warning','请选择一行数据','warning');
   }
  }
  function edit(){
    $('#ff').form('submit',{
    url: 'updateUser.action?id='+id,
    onSubmit:function(){ return $('#ff').form('validate');},
       success:function(){
         $.messager.alert('edit','修改信息成功!!!','info');
         close2();
        }
   });
   $('#tt').datagrid({
    url:'queryAllUsers.action',
    loadMsg:'更新数据......'
   });
   
  }
  function del(){
   var selected = $('#tt').datagrid('getSelected');
   if(selected){
    $.messager.confirm('warning','确认删除么?',function(id){
    if(id){
     id = selected.id;
     $.ajax({
             type:"POST",
            url:"deleteUser.action",
             data:"id="+id,
            dataType:"xml",
            success:function callback(){}
          });
     $('#tt').datagrid('reload');
    }
   });
   }else{
    $.messager.alert('warning','请选择一行数据','warning');
   }
  }
  function query(){
  var queryParams = $('#tt').datagrid('options').queryParams;
  queryParams.queryWord = $('#qq').val();
  $('#tt').datagrid({
   url:'queryAllUsers.action'
  });
  displayMsg();
  $('#query').window('close');
  }
	</script>
   <table id="tt">
    </table>
    <form id="ff" method="post">
           <div>
           ID:<input class="easyui-numberbox" type="text" id="id" name="id" required="true"></input>
           </div>
           <div>
           NAME:<input class="easyui-validatebox" type="text" id="name" name="name" required="true"></input>
         </div>
  </form>
    <div id="add" class="easyui-window" title="添加" style="padding: 10px;width: 300;height:200;"
    iconCls="icon-add" closed="true" maximizable="false" minimizable="false" collapsible="false">
     <div id="aa">
     </div>
     <a class="easyui-linkbutton" iconCls="icon-ok" href="javascript:void(0)" onclick="add()">添加</a>
     <a class="easyui-linkbutton" iconCls="icon-cancel" href="javascript:void(0)" onclick="close1()">取消</a>
    </div>
    <div id="edit" class="easyui-window" title="修改" style="padding: 10px;width: 300;height: 200;"
    iconCls="icon-edit" closed="true" maximizable="false" minimizable="false" collapsible="false">
     <div id="ee">
     </div>
     <a class="easyui-linkbutton" iconCls="icon-ok" href="javascript:void(0)" onclick="edit()">修改</a>
     <a class="easyui-linkbutton" iconCls="icon-cancel" href="javascript:void(0)" onclick="close2()">取消</a>
    </div>
    <div id="query" class="easyui-window" title="查询" style="padding: 10px;width: 360px;height:100;"
    iconCls="icon-search" closed="true" maximizable="false" minimizable="false" collapsible="false">
     <div>
      <table>
       <tr>
        <td>ID:</td>
        <td><input type="text" name="id" id="qq" class="easyui-numberbox" required="true"></td>
        <td><a class="easyui-linkbutton" iconCls="icon-search" href="javascript:void(0);" onclick="query()">查询</a></td>
       </tr>
      </table>
     </div>
    </div>
 