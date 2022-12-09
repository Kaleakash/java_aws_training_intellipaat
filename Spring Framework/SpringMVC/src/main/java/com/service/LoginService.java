package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.LoginDao;
import com.entity.Login;

@Service
public class LoginService {

	
	@Autowired
	LoginDao loginDao;
	
	public String checkLogin(Login login) {
		if(loginDao.checkLoginDetails(login)>0) {
			return "success";
		}else {
			return "failure";
		}
	}
}
