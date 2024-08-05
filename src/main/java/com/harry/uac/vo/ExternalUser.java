package com.harry.uac.vo;

import com.harry.uac.persistence.AbstractUser;

public class ExternalUser extends AbstractUser{
	//may attribute
	private String AppAuthsupporterCorpName;
	private String AppAuthsupporterDept;
	private String AppAuthsupporterCorpContact;
	private String AppAuthsuperviseDept;
	private String AppAuthsupervisor;
	
	public String getAppAuthsupporterCorpName() {
		return AppAuthsupporterCorpName;
	}
	
	public void setAppAuthsupporterCorpName(String appAuthsupporterCorpName) {
		AppAuthsupporterCorpName = appAuthsupporterCorpName;
	}
	
	public String getAppAuthsupporterDept() {
		return AppAuthsupporterDept;
	}
	
	public void setAppAuthsupporterDept(String appAuthsupporterDept) {
		AppAuthsupporterDept = appAuthsupporterDept;
	}
	
	public String getAppAuthsupporterCorpContact() {
		return AppAuthsupporterCorpContact;
	}
	
	public void setAppAuthsupporterCorpContact(String appAuthsupporterCorpContact) {
		AppAuthsupporterCorpContact = appAuthsupporterCorpContact;
	}
	
	public String getAppAuthsuperviseDept() {
		return AppAuthsuperviseDept;
	}
	
	public void setAppAuthsuperviseDept(String appAuthsuperviseDept) {
		AppAuthsuperviseDept = appAuthsuperviseDept;
	}
	
	public String getAppAuthsupervisor() {
		return AppAuthsupervisor;
	}
	
	public void setAppAuthsupervisor(String appAuthsupervisor) {
		AppAuthsupervisor = appAuthsupervisor;
	}

	public ExternalUser(){
		
	}
	
}
