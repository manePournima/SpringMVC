package com.tech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.dao.StudentDao;
import com.tech.dto.Student;
@Service
public class StudentService {

	@Autowired
	StudentDao studentDao;

	public StudentService() {
		System.out.println("inside StudentService constructor ");
	}

	public List<Student> getAll2() {
		System.out.println("inside StudentService.getALL2");
		List<Student> stdlist = studentDao.getAllStudent();
		return stdlist;
	}
}
