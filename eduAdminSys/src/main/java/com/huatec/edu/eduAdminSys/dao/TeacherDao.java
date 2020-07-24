package com.huatec.edu.eduAdminSys.dao;

import java.util.List;

import com.huatec.edu.eduAdminSys.entity.Teacher;

public interface TeacherDao {
	public List<Teacher> findAll();
	public Teacher findByName(String username);
	public Teacher findById(Integer teacher_id);
	public Teacher deleteByName(String username);
}
