package com.tech.dao;

import org.springframework.stereotype.Repository;

@Repository
public class LoginDao {

	public LoginDao() {
		System.out.println("inside loginDao constuctor");
	}

	public boolean validate(String uname, String password) {
		if (uname.equals("admin") && password.equals("admin123")) {
			System.out.println("-----user validate----");
			return true;
		} else {
			System.out.println("-----user invalidate----");
			return false;
		}
	}
}
