package com.huatec.edu.eduAdminSys.controller;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huatec.edu.eduAdminSys.entity.StuClass;
import com.huatec.edu.eduAdminSys.service.StuClassService;
import com.huatec.edu.eduAdminSys.util.Result;

@Controller
@RequestMapping("/stuClass")
public class StuClassController {
	@Resource
	private StuClassService stuClassService;
	
	//8080:eduAdminSys/stuClass/findAll
	@RequestMapping(value="/findAll",method=RequestMethod.POST)
	@ResponseBody
	public Result<List<StuClass>> findAllStuClasses() {
		Result<List<StuClass>> result = stuClassService.findAllStuClasses();
		return result;
	}
	
	//8080:eduAdminSys/stuClass
	@RequestMapping(value="",method=RequestMethod.POST)
	@ResponseBody
	public Result<StuClass> register(String class_name, Integer creator_id) {
		System.out.println("class_name:" +class_name);
		Result<StuClass> result =stuClassService.register(class_name,creator_id);
		return result;
	}
}