package com.huatec.edu.eduAdminSys.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class StuClass implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer class_id;
	private String class_name;
	private Integer creator_id;
	private Timestamp creator_time;
	public Integer getClass_id() {
		return class_id;
	}
	public void setClass_id(Integer class_id) {
		this.class_id = class_id;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public Integer getCreator_id() {
		return creator_id;
	}
	public void setCreator_id(Integer creator_id) {
		this.creator_id = creator_id;
	}
	public Timestamp getCreator_time() {
		return creator_time;
	}
	public void setCreator_time(Timestamp creator_time) {
		this.creator_time = creator_time;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "StuClass [class_id=" + class_id + ", class_name=" + class_name + ", creator_id=" + creator_id
				+ ", creator_time=" + creator_time + "]";
	}

	
}