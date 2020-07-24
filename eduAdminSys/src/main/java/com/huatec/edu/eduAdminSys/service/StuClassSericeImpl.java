package com.huatec.edu.eduAdminSys.service;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.huatec.edu.eduAdminSys.dao.StuClassDao;
import com.huatec.edu.eduAdminSys.entity.StuClass;
import com.huatec.edu.eduAdminSys.util.Result;

@Service
public class StuClassSericeImpl implements StuClassService {
	@Resource
	private StuClassDao stuClassDao;
	
	public Result<List<StuClass>> findAllStuClasses() {
		List<StuClass> list = stuClassDao.findAll();
		Result<List<StuClass>> result = new Result<List<StuClass>>();
		if(list.size()==0) {
			result.setStatus(1);
			result.setMsg("student表没数据");
		}else {
			result.setStatus(0);
			result.setMsg("加载数据成功");
			for(StuClass s : list) {
				System.out.println(s);
			}
			result.setData(list);
		}
		return result;
	}
	
	@Override
	public Result<StuClass> register(String class_name,Integer creator_id) {
		Result<StuClass> result = new Result<StuClass>();
		
		StuClass stuClass = new StuClass();
		stuClass.setClass_name(class_name);
		stuClass.setCreator_id(creator_id);
		
		System.out.println("插入前："+stuClass);
		stuClassDao.save(stuClass);
		try {
			result.setStatus(0);
			result.setMsg("插入成功");
			result.setData(stuClass);	
		}catch(Exception e){
			result.setStatus(1);
			result.setMsg("插入失败");
		}
		System.out.println("插入后："+stuClass);
		return result;

		}

}