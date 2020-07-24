package com.huatec.edu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.huatec.edu.dao.AccountDao;

import com.huatec.edu.entity.Account;
import com.huatec.edu.service.AccountService;

@Service("accountService")
public class AccountServiceImpl implements AccountService{

	@Resource
	private AccountDao accountDao;

	@Override
	public List<Account> findAll() {
		System.out.println("业务层：查询所有账户");
		return accountDao.findAll();
	}
	
	public void saveAccount(Account account) {
		System.out.println("业务层：保存所有账户");
		accountDao.saveAccount(account);
	}
	
	@Override
	public void deleteAccount(int id) {
		System.out.println("业务层：删除所有账户");
		accountDao.deleteAccount(id);
	}
	
	@Override
	public void updateAccount(Account account) {
		System.out.println("业务层：更新所有账户");
		accountDao.updateAccount(account);
	}

}
