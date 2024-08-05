package com.harry.uac.vo;

public class Organization {

    private String o; // 组织编码
    private String displayName; // 组织名称
    private String initials; // 组织简称
    private String description; // 组织描述
    private String style; // 定义组织形态：公司、部门、处室
    private int status; // 状态
    private String parentOrgId; // 定义上级部门编码
    private String orgLevel; // 定义组织的级别
    private String displayOrder; // 定义组织的显示顺序
    private String function; // 业务的编码
    private String supervisor; // 主管用户
    private String viceManager; // 定义该组织的辅负责人
    private String admin; // 定义该组织的管理员
    private String orgManager; // 定义该组织的主负责人
    private String manageOrgID; // 定义和本组织平级的负责本组织管理功能的组织编码
    private String orgAddress;
    private String orgPostCode;
    private String orgPhone;
    private String orgFax;
    private String city;
    private String startTime; // 定义组织的开始生效时间
    private String endTime; // 定义组织的结束生效时间
    private String reserve1; // 预留扩展字段1
    private String reserve2; // 预留扩展字段2
    private String reserve3; // 预留扩展字段3
    private String reserve4; // 预留扩展字段4
    private String reserve5; // 预留扩展字段5
    private String erpid; // 此部门在ERP-HR中对应的组织编码
    private String tag; // 标签(供外部系统作标识用)

    // TODO: List User informations

    public String getO() {
	return o;
    }

    public void setO(String o) {
	this.o = o;
    }

    public String getDisplayName() {
	return displayName;
    }

    public void setDisplayName(String displayName) {
	this.displayName = displayName;
    }

    public String getInitials() {
	return initials;
    }

    public void setInitials(String initials) {
	this.initials = initials;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public String getStyle() {
	return style;
    }

    public void setStyle(String style) {
	this.style = style;
    }

    public int getStatus() {
	return status;
    }

    public void setStatus(int status) {
	this.status = status;
    }

    public String getParentOrgId() {
	return parentOrgId;
    }

    public void setParentOrgId(String parentOrgId) {
	this.parentOrgId = parentOrgId;
    }

    public String getOrgLevel() {
	return orgLevel;
    }

    public void setOrgLevel(String orgLevel) {
	this.orgLevel = orgLevel;
    }

    public String getDisplayOrder() {
	return displayOrder;
    }

    public void setDisplayOrder(String displayOrder) {
	this.displayOrder = displayOrder;
    }

    public String getFunction() {
	return function;
    }

    public void setFunction(String function) {
	this.function = function;
    }

    public String getSupervisor() {
	return supervisor;
    }

    public void setSupervisor(String supervisor) {
	this.supervisor = supervisor;
    }

    public String getViceManager() {
	return viceManager;
    }

    public void setViceManager(String viceManager) {
	this.viceManager = viceManager;
    }

    public String getAdmin() {
	return admin;
    }

    public void setAdmin(String admin) {
	this.admin = admin;
    }

    public String getOrgManager() {
	return orgManager;
    }

    public void setOrgManager(String orgManager) {
	this.orgManager = orgManager;
    }

    public String getManageOrgID() {
	return manageOrgID;
    }

    public void setManageOrgID(String manageOrgID) {
	this.manageOrgID = manageOrgID;
    }

    public String getOrgAddress() {
	return orgAddress;
    }

    public void setOrgAddress(String orgAddress) {
	this.orgAddress = orgAddress;
    }

    public String getOrgPostCode() {
	return orgPostCode;
    }

    public void setOrgPostCode(String orgPostCode) {
	this.orgPostCode = orgPostCode;
    }

    public String getOrgPhone() {
	return orgPhone;
    }

    public void setOrgPhone(String orgPhone) {
	this.orgPhone = orgPhone;
    }

    public String getOrgFax() {
	return orgFax;
    }

    public void setOrgFax(String orgFax) {
	this.orgFax = orgFax;
    }

    public String getCity() {
	return city;
    }

    public void setCity(String city) {
	this.city = city;
    }

    public String getStartTime() {
	return startTime;
    }

    public void setStartTime(String startTime) {
	this.startTime = startTime;
    }

    public String getEndTime() {
	return endTime;
    }

    public void setEndTime(String endTime) {
	this.endTime = endTime;
    }

    public String getReserve1() {
	return reserve1;
    }

    public void setReserve1(String reserve1) {
	this.reserve1 = reserve1;
    }

    public String getReserve2() {
	return reserve2;
    }

    public void setReserve2(String reserve2) {
	this.reserve2 = reserve2;
    }

    public String getReserve3() {
	return reserve3;
    }

    public void setReserve3(String reserve3) {
	this.reserve3 = reserve3;
    }

    public String getReserve4() {
	return reserve4;
    }

    public void setReserve4(String reserve4) {
	this.reserve4 = reserve4;
    }

    public String getReserve5() {
	return reserve5;
    }

    public void setReserve5(String reserve5) {
	this.reserve5 = reserve5;
    }

    public String getErpid() {
	return erpid;
    }

    public void setErpid(String erpid) {
	this.erpid = erpid;
    }

    public String getTag() {
	return tag;
    }

    public void setTag(String tag) {
	this.tag = tag;
    }

}
