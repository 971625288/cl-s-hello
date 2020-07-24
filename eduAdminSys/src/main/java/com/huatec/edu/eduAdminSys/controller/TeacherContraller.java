package com.huatec.edu.eduAdminSys.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huatec.edu.eduAdminSys.entity.Teacher;
import com.huatec.edu.eduAdminSys.service.TeacherService;
import com.huatec.edu.eduAdminSys.util.Result;

@Controller
@RequestMapping("/teacher")
public class TeacherContraller {
	@Resource
	private TeacherService teacherService;
	//8080:eduAdminSys/teacher/findAll
	@RequestMapping(value="/findAll",method=RequestMethod.GET)
	@ResponseBody
	public Result<List<Teacher>> findAllTeachers() {
		Result<List<Teacher>> result = teacherService.findAllTeachers();
		return result;
	}
	
	//8080:eduAdminSys/teacher/findByName?username=rose
	@RequestMapping(value="/findByName",method=RequestMethod.GET)
	@ResponseBody
	public Result<Teacher> findByName(@RequestParam("username") String username){
		System.out.println("username="+username);
		Result<Teacher> result = teacherService.findByName(username);
		return result;
	}
	
	//8080:eduAdminSys/teacher/findById/1
		@RequestMapping(value="/{teacher_id}",method=RequestMethod.GET)
		@ResponseBody
		public Result<Teacher> findById(@PathVariable("teacher_id") Integer id){
			System.out.println("teacher_id="+id);
			Result<Teacher> result = teacherService.findById(id);
			return result;
		}
		
		//8080:eduAdminSys/teacher/deleteByName?username=rose
		@RequestMapping(value="/deleteByName",method=RequestMethod.GET)
		@ResponseBody
		public Result<Teacher> deleteById(@RequestParam("username") String username){
			System.out.println("username="+username);
			Result<Teacher> result = teacherService.deleteByName(username);
			return result;
		}
}