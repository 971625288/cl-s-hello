package com.huatec.edu.entity;

import java.io.Serializable;

public class Account implements Serializable {


	private static final long serialVersionUID = 1L;
	private Integer id;
	private String username;
	private Double money;
	private Integer status;
	private String statusStr;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getStatusStr() {
		return statusStr;
	}
	public void setStatusStr(String statusStr) {
		this.statusStr = statusStr;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", username=" + username + ", money=" + money + ", status=" + status
				+ ", statusStr=" + statusStr + "]";
	}
	
	
}
