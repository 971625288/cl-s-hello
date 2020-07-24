package com.huatec.edu.eduAdminSys.entity;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer student_id;
	private String student_num;
	private String student_name;
	private String username;
	private String password;
	private Integer student_sex;
	private String mobile_phone;
	private String email;
	private Integer class_id;
	
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_num=" + student_num + ", student_name=" + student_name
				+ ", username=" + username + ", password=" + password + ", student_sex=" + student_sex
				+ ", mobile_phone=" + mobile_phone + ", email=" + email + ", class_id=" + class_id + "]";
	}
	//get\set
	public Integer getStudent_id() {
		return student_id;
	}
	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}
	public String getStudent_num() {
		return student_num;
	}
	public void setStudent_num(String student_num) {
		this.student_num = student_num;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getStudent_sex() {
		return student_sex;
	}
	public void setStudent_sex(Integer student_sex) {
		this.student_sex = student_sex;
	}
	public String getMobile_phone() {
		return mobile_phone;
	}
	public void setMobile_phone(String mobile_phone) {
		this.mobile_phone = mobile_phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getClass_id() {
		return class_id;
	}
	public void setClass_id(Integer class_id) {
		this.class_id = class_id;
	}

}
