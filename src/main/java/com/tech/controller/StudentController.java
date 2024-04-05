package com.tech.controller;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tech.dto.Student;

@Controller
public class StudentController {

	public StudentController() {
	System.out.println("inside StudentController cons");
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public ModelAndView createStudent(@RequestParam("fname")String fname,
			@RequestParam("lname")String lname,
			@RequestParam("email")String email,
			@RequestParam("phone")String phone)
	{
		System.out.println("inside createStudent ");
		
		Student s1 = new  Student();
		s1.setFname(fname);
		s1.setLname(lname);
		s1.setEmail(email);
		s1.setPhone(phone);
		System.out.println(s1);
		
		ModelAndView mav = new ModelAndView("create-success");

		mav.addObject("STUDENT_DATA", s1);
		
		return mav;
	}
	
	
	@RequestMapping("/getAll")
	public ModelAndView getALlStudent()
	{
		System.out.println("inside getALlStudent ");
		
		// send all student data -- list of student 
		
		java.util.List<Student> stdList = new ArrayList<Student>();
		
		Student s1 = new Student("aaa", "aaaL", "aaa@gmail.com", "11111");
		Student s2 = new Student("bbb", "bbbL", "bbb@gmail.com", "22222");
		Student s3 = new Student("ccc", "cccL", "ccc@gmail.com", "33333");
		Student s4 = new Student("ddd", "dddL", "ddd@gmail.com", "44444");
		Student s5 = new Student("eee", "eeeL", "eee@gmail.com", "55555");
		
		stdList.add(s1);
		stdList.add(s2);
		stdList.add(s3);
		stdList.add(s4);stdList.add(s5);
		
		ModelAndView mav = new ModelAndView("get-All-Student");
		
		//STD_LIST
		mav.addObject("STD_LIST", stdList);
		
		return mav;
		
		
	}
	
	
	
	
	
	
	
	
	
}
