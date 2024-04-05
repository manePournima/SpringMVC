package com.tech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tech.service.LoginService;

@Controller
public class LoginDBController {

	@Autowired
	LoginService loginService;

	public LoginDBController() {
		System.out.println("inside LoginDBController");
	}

	@RequestMapping("/login2")
	public ModelAndView logincheck(@RequestParam("uname") String uname, @RequestParam("pass") String pass) {
		System.out.println("inside LoginDBController.logincheck ");
		boolean user = loginService.validateUser(uname, pass);

		System.out.println("response from service --->" +user);
		if (user) {
			ModelAndView mav = new ModelAndView("login-success");
			return mav;
		} else {
			ModelAndView mav = new ModelAndView("login-failure");
			return mav;
		}

	}

	
}
