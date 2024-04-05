package com.tech.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tech.dto.Student;

@Repository
public class StudentDao {
	
	public StudentDao()
	{
		System.out.println("inside StudentDao constr");
		
	}
	
	///get all student from DB
	
	public List<Student> getAllStudent()
	{
		System.out.println("inside StudentDao.getAllStudent()");
	java.util.List<Student> stdList = new ArrayList<Student>();
		
		Student s1 = new Student("aaa", "aaaL", "aaa@gmail.com", "11111");
		Student s2 = new Student("bbb", "bbbL", "bbb@gmail.com", "22222");
		Student s3 = new Student("ccc", "cccL", "ccc@gmail.com", "33333");
		Student s4 = new Student("ddd", "dddL", "ddd@gmail.com", "44444");
		Student s5 = new Student("eee", "eeeL", "eee@gmail.com", "55555");
		
		stdList.add(s1);
		stdList.add(s2);
		stdList.add(s3);
		stdList.add(s4);
		stdList.add(s5);
		return stdList;
	}
	

}
