package com.huatec.edu.eduAdminSys.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.huatec.edu.eduAdminSys.dao.StudentDao;
import com.huatec.edu.eduAdminSys.dao.TeacherDao;
import com.huatec.edu.eduAdminSys.entity.Student;
import com.huatec.edu.eduAdminSys.entity.Teacher;
import com.huatec.edu.eduAdminSys.util.Result;

@Service
public class UserServiceImpl implements UserService {
	@Resource
	private TeacherDao teacherDao;
	@Resource
	private StudentDao studentDao;

	@Override
	public Result<Object> checkLogin(Integer sign,String username,String pwd) {
		Result<Object> result = new Result<Object>();
		if (sign == 0) { //教师登录
			Teacher teacher = teacherDao.findByName(username);
			if(teacher == null){
				result.setStatus(1);
				result.setMsg("此用户不存在");
				return result;
			}
			//判断密码是否正确
			if(!pwd.equals(teacher.getPassword())) {
				result.setStatus(1);
				result.setMsg("密码错误");
				return result;
			}
			
			result.setStatus(0);
			result.setMsg("用户名和密码正确");
			result.setData(teacher);
			return result;
		} else {//学生登录
			System.out.println("学生登录");
			System.out.println(username);
			Student student = studentDao.findByName(username);
			
			if(student == null){
				result.setStatus(1);
				result.setMsg("此用户不存在");
				return result;
			}
			//判断密码是否正确
			if(!pwd.equals(student.getPassword())) {
				result.setStatus(1);
				result.setMsg("密码错误");
				return result;
			}
			
			result.setStatus(0);
			result.setMsg("用户名和密码正确");
			result.setData(student);
			return result;
		}
	}

}