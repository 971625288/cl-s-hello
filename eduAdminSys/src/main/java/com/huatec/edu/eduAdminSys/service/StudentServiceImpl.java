package com.huatec.edu.eduAdminSys.service;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.huatec.edu.eduAdminSys.dao.StudentDao;
import com.huatec.edu.eduAdminSys.entity.Student;
import com.huatec.edu.eduAdminSys.util.Result;

@Service
public class StudentServiceImpl implements StudentService {
	@Resource
	private StudentDao studentDao;
	
	public Result<List<Student>> findAllStudents() {
		List<Student> list = studentDao.findAll();
		Result<List<Student>> result = new Result<List<Student>>();
		if(list.size()==0) {
			result.setStatus(1);
			result.setMsg("student表没数据");
		}else {
			result.setStatus(0);
			result.setMsg("加载数据成功");
			for(Student s : list) {
				System.out.println(s);
			}
			result.setData(list);
		}
		return result;
	}

	@Override
	public Result<Student> findByName(String username) {
		Student student = studentDao.findByName(username);
		Result<Student> result = new Result<Student>();
		if(student == null){
			result.setStatus(1);
			result.setMsg("学生不存在");
		}
		else{
			result.setStatus(0);
			result.setMsg("学生存在");
			result.setData(student);
		}
		return result;

	}
}