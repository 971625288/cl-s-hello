package com.huatec.edu.eduAdminSys.service;

import java.util.List;

import com.huatec.edu.eduAdminSys.entity.Student;
import com.huatec.edu.eduAdminSys.util.Result;

public interface StudentService {
	public Result<List<Student>> findAllStudents();
	public Result<Student> findByName(String username);
}
