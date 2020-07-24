package com.huatec.edu.eduAdminSys.service;

import java.util.List;

import com.huatec.edu.eduAdminSys.entity.StuClass;
import com.huatec.edu.eduAdminSys.util.Result;

public interface StuClassService {
	public Result<List<StuClass>> findAllStuClasses();
	public Result<StuClass> register(String class_name,Integer creator_id);

}
