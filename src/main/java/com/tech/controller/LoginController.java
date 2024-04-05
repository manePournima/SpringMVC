package com.tech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	
	public LoginController() {
	System.out.println("inside LoginController");
	}
	
	@RequestMapping("/login")
	public ModelAndView logincheck(@RequestParam("uname")
	String uname ,@RequestParam("pass") String pass )
	{
		System.out.println("inside LoginController.logincheck ");
		System.out.println(uname + "---" +pass);
		if(uname.equals("admin")&&pass.equals("admin123"))
		{
		ModelAndView mav = new ModelAndView("login-success");
		return mav;
		}else{
			ModelAndView mav = new ModelAndView("login-failure");
			return mav;
		}
	}
}
