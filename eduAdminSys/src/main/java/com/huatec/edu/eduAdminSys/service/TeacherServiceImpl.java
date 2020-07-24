package com.huatec.edu.eduAdminSys.service;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.huatec.edu.eduAdminSys.dao.TeacherDao;
import com.huatec.edu.eduAdminSys.entity.Teacher;
import com.huatec.edu.eduAdminSys.util.Result;

@Service
public class TeacherServiceImpl implements TeacherService {
	@Resource
	private TeacherDao teacherDao;
	
	public Result<List<Teacher>> findAllTeachers() {
		List<Teacher> list = teacherDao.findAll();
		Result<List<Teacher>> result = new Result<List<Teacher>>();
		if(list.size()==0) {
			result.setStatus(1);
			result.setMsg("教师表没数据");
		}else {
			result.setStatus(0);
			result.setMsg("加载数据成功");
			for(Teacher s : list) {
				System.out.println(s);
			}
			result.setData(list);
		}
		return result;
	}

	@Override
	public Result<Teacher> findByName(String username) {
		Teacher teacher = teacherDao.findByName(username);
		Result<Teacher> result = new Result<Teacher>();
		if(teacher == null){
			result.setStatus(1);
			result.setMsg("教师不存在");
		}
		else{
			result.setStatus(0);
			result.setMsg("教师存在");
			result.setData(teacher);
		}
		return result;

	}
	
	@Override
	public Result<Teacher> findById(Integer teacher_id) {
		Teacher teacher = teacherDao.findById(teacher_id);
		Result<Teacher> result = new Result<Teacher>();
		if(teacher == null){
			result.setStatus(1);
			result.setMsg("教师不存在");
		}
		else{
			result.setStatus(0);
			result.setMsg("教师存在");
			result.setData(teacher);
		}
		return result;

	}
	
	@Override
	public Result<Teacher> deleteByName(String username) {
		Teacher teacher = teacherDao.deleteByName(username);
		Result<Teacher> result = new Result<Teacher>();
		if(teacher == null){
			result.setStatus(1);
			result.setMsg("教师不存在");
		}
		else{
			result.setStatus(0);
			result.setMsg("教师存在");
			result.setData(teacher);
		}
		return result;

	}
}