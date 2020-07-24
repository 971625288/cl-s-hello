package com.huatec.edu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.huatec.edu.entity.Account;
import com.huatec.edu.service.AccountService;


@Controller
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@RequestMapping(value="/findAll",method=RequestMethod.POST)
	@ResponseBody
	//currentPage当前页，pageSize每页个数
	public Object findAll(){
		//@RequestParam("page") Integer currentPage, @RequestParam("size") Integer pageSize
		//System.out.println(currentPage + "," + pageSize);
		System.out.println("表现层：查询所有账户");
		JSONObject resJson = new JSONObject();
		resJson.put("code", 0);
		List<Account> accountList = accountService.findAll();
		if(accountList != null) {
			resJson.put("data","查询成功");
		}else{
			resJson.put("data","查询失败");
		}
		resJson.put("count",accountList.size());
		resJson.put("limit", 5);
		resJson.put("data", accountList);
		System.out.println(resJson);
		return resJson;
	}
	
	@RequestMapping("/list")
	public String list(){
		return "account-list";
	}
	@RequestMapping("/save")
	public String saveAccount(Account account) {
		accountService.saveAccount(account);
		return "redirect:list";
	}
	
	@RequestMapping("/delete")
	public void deleteAccount(Integer id,HttpServletRequest request,HttpServletResponse reponse){
		accountService.deleteAccount(id);
	}
	
	@RequestMapping("/update")
	public String updateAccount(Account account){
		accountService.updateAccount(account);
		return "redirect:list";
	}
}
