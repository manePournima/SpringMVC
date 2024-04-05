package com.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tech.dto.Student;
import com.tech.service.StudentService;

@Controller
public class StudentDBController {

	@Autowired
	StudentService studentService;

	public StudentDBController() {
		System.out.println("inside StudentDBController cons");
	}

	@RequestMapping("/getAll2")
	public ModelAndView getALL2() {
		System.out.println("inside StudentDBController.getAll2 ");

		List<Student> stdlist = studentService.getAll2();
		System.out.println("response from service ");
		System.out.println(stdlist);

		 ModelAndView mav = new ModelAndView("get-All-Student");
		
		 //STD_LIST
		 mav.addObject("STD_LIST", stdlist);
		
		 return mav;

	}

}
