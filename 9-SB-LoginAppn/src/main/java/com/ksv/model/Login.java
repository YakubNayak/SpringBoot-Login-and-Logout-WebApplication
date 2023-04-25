package com.ksv.model;

public class Login {
	private String cname;
	private String password;
	public Login() 
	{
	}
	public Login(String cname, String password) {
		super();
		this.cname = cname;
		this.password = password;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
