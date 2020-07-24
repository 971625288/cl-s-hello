package com.huatec.edu.service;



import java.util.List;

import com.huatec.edu.entity.Account;

public interface AccountService {
	//查询
	public List<Account> findAll();
	//保存
	public void saveAccount(Account account);
	//删除
	public void deleteAccount(int id);
	//更新
	public void updateAccount(Account account);

}
	

