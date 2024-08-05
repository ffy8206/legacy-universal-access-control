<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
			<div id="sidebar_s">
				<div class="collapse">
					<div class="toggleCollapse"><div></div></div>
				</div>
			</div>
			<div id="sidebar">
				<div class="toggleCollapse"><h2>UAC</h2><div>收缩</div></div>

				<div class="accordion" fillSpace="sidebar">
				    <div class="accordionHeader">
						<h2><span>Folder</span>基础数据管理</h2>
					</div>
					<div class="accordionContent">
						<ul class="tree treeFolder">
						    <li><a href="../user/initUserPageInfo" target="navTab" rel="user_list" >用户管理</a></li>
						    <li><a href="../group/queryGroupInfo" target="navTab" rel="group_list" >用户组管理</a></li>
						    <li><a href="../org/queryOrgInfo" target="navTab" rel="org_list" >组织管理</a></li>
						    <li><a href="../application/queryApplicationInfo" target="navTab" rel="application_list" >应用管理</a></li>
						    <li><a href="../privilege/queryPrivilegeInfo" target="navTab" rel="privilege_list" >权限管理</a></li>
						    <li><a href="../role/queryRoleInfo" target="navTab" rel="role_list" >角色管理</a></li>
						    <li><a href="../datarange/queryDatarangeInfo" target="navTab" rel="datarange_list" >数据范围管理</a></li>						    
						    <li><a href="../dict/manageDict" target="navTab" rel="dict_manage">数据字典管理</a></li>
							<li><a href="../user/viewUser" target="navTab" rel="view_user">信息查看</a></li>
							<li><a href="../user/changePassword" target="navTab" rel="change_password">修改密码</a></li>
							<li><a href="../user/appPrivilege" target="navTab" rel="app_privilege">应用权限</a></li>
							<li><a>批量用户导入/导出</a>
								<ul>
									<li><a href="../batchusermgt/userBatchImport" target="navTab" rel="userImport">用户导入</a></li>
									<li><a href="../batchusermgt/userBatchExport" target="navTab" rel="userExport">用户导出</a></li>
								</ul>
							</li>
						</ul>
					</div>
					
					<%-- 
					<div class="accordionHeader">
						<h2><span>Folder</span>数据同步管理</h2>
					</div>
					<div class="accordionContent">
						<ul class="tree treeFolder">
							<li><a>EHR系统同步</a>
								<ul>
									<li><a href="../sync/querySyncUserInfo" target="navTab" rel="sync_user_list">全量同步</a></li>
								</ul>
							</li>
						</ul>
					</div>
					 
					<div class="accordionHeader">
						<h2><span>Folder</span>统计报表</h2>
					</div>
					<div class="accordionContent">
						<ul class="tree treeFolder">
							
							<li><a href="../statistics/disPlayStatisticsReport?flag=0" target="navTab" rel="import_export_report">导入导出数据展示</a></li>
							<li><a href="../statistics/disPlayStatisticsReport?flag=1" target="navTab" rel="app_sync_report">应用系统同步展示</a></li>
							<li><a href="../statistics/disPlayStatisticsReport?flag=2" target="navTab" rel="basedata_update_report">用户基础数据变更展示</a></li>
						</ul>
					</div>
					--%>
					
						<div class="accordionHeader">
						<h2><span>Folder</span>系统管理</h2>
					</div>
					<div class="accordionContent">
						<ul class="tree treeFolder">
							<li><a href="../systemmgt/queryAuditLogs" target="navTab" rel="securityAudit">安全审计</a></li>
						</ul>
					</div>
				</div>
			</div>