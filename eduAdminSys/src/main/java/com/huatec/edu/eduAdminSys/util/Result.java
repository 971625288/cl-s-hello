package com.huatec.edu.eduAdminSys.util;

import java.io.Serializable;

public class Result<T> implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int status;//0:success,1:failure
	private String msg;
	private T data;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Result [status=" + status + ", msg=" + msg + ", data=" + data + "]";
	}
	
	
}
