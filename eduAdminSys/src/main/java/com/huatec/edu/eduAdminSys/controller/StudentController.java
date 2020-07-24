package com.huatec.edu.eduAdminSys.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huatec.edu.eduAdminSys.entity.Student;
import com.huatec.edu.eduAdminSys.service.StudentService;
import com.huatec.edu.eduAdminSys.util.Result;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Resource
	private StudentService studentService;
	//8080:eduAdminSys/student/findAll
	@RequestMapping(value="/findAll",method=RequestMethod.GET)
	@ResponseBody
	public Result<List<Student>> findAllStudents() {
		Result<List<Student>> result = studentService.findAllStudents();
		return result;
	}
	
	//8080:eduAdminSys/student/findByName?username=ddz
	@RequestMapping(value="/findByName",method=RequestMethod.GET)
	@ResponseBody
	public Result<Student> findByName(@RequestParam("username") String username){
		System.out.println("username="+username);
		Result<Student> result = studentService.findByName(username);
		return result;
	}

}
