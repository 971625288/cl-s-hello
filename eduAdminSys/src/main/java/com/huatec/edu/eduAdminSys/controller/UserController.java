package com.huatec.edu.eduAdminSys.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huatec.edu.eduAdminSys.service.UserService;
import com.huatec.edu.eduAdminSys.util.Result;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService uerService;
	
	//8080:eduAdminSys/user/login
	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody
	public Result<Object> checkLogin(Integer sign,String username,String password){
		System.out.println("sign="+sign);
		System.out.println("username="+username);
		System.out.println("password="+password);
		Result<Object> result = uerService.checkLogin(sign,username,password);
		return result;
	}

}
