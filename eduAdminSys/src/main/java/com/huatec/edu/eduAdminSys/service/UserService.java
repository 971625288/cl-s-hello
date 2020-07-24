package com.huatec.edu.eduAdminSys.service;

import com.huatec.edu.eduAdminSys.util.Result;

public interface UserService {
	public Result<Object> checkLogin(Integer sign,String username,String pwd);
}
