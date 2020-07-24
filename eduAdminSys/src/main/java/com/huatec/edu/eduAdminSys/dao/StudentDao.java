package com.huatec.edu.eduAdminSys.dao;

import java.util.List;

import com.huatec.edu.eduAdminSys.entity.Student;

public interface StudentDao {
	public List<Student> findAll();
	public Student findByName(String username);
}
