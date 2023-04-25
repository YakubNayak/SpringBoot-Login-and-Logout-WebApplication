package com.ksv.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	private Integer cid;
	private String cname;
	private String password;
	public Customer() {
		super();
	}
	public Customer(Integer cid, String cname, String password) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.password = password;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
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
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", password=" + password + "]";
	}
	

}
