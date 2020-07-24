package com.huatec.edu.eduAdminSys.service;

import java.util.List;

import com.huatec.edu.eduAdminSys.entity.Teacher;
import com.huatec.edu.eduAdminSys.util.Result;

public interface TeacherService {
	public Result<List<Teacher>> findAllTeachers();
	public Result<Teacher> findByName(String username);
	public Result<Teacher> findById(Integer teacher_id);
	public Result<Teacher> deleteByName(String username);
}
