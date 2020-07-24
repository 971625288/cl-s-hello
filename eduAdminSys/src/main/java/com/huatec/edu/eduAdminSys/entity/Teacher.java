package com.huatec.edu.eduAdminSys.entity;

import java.io.Serializable;

public class Teacher implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer teacher_id;
	private String teacher_num;
	private String username;
	private String password;
	private String email;
	private String teacher_name;
	private String title;
	private String mobile_phone;
	private Integer experience;
	
	
	@Override
	public String toString() {
		return "Teacher [teacher_id=" + teacher_id + ", teacher_num=" + teacher_num + ", username=" + username
				+ ", password=" + password + ", email=" + email + ", teacher_name=" + teacher_name + ", title=" + title
				+ ", mobile_phone=" + mobile_phone + ", experience=" + experience + "]";
	}
	//get\set
	public Integer getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(Integer teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getTeacher_num() {
		return teacher_num;
	}
	public void setTeacher_num(String teacher_num) {
		this.teacher_num = teacher_num;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMobile_phone() {
		return mobile_phone;
	}
	public void setMobile_phone(String mobile_phone) {
		this.mobile_phone = mobile_phone;
	}
	public Integer getExperience() {
		return experience;
	}
	public void setExperience(Integer experience) {
		this.experience = experience;
	}
	
}
