package com.huatec.edu.eduAdminSys.dao;

import java.util.List;

import com.huatec.edu.eduAdminSys.entity.StuClass;

public interface StuClassDao {
	public List<StuClass> findAll();
	public int save(StuClass stuClass);
}
