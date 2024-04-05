package com.tech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.dao.LoginDao;

@Service
public class LoginService {
	@Autowired
	LoginDao loginDao;

	public LoginService()
	{
		System.out.println("inside LoginService constructor");
	}
	
	public boolean  validateUser(String uname, String pass)
	{
		System.out.println("inside LoginService.validateUser");
		
		boolean userPresent=loginDao.validate(uname, pass);
		
		return userPresent;
	}
}
