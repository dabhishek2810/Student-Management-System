package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.student.dao.StudentDaoImplementation;
import com.student.entity.AddStudent;
import com.student.entity.StudentDetails;

@Service
public class StudentService {
	
	@Autowired
	StudentDaoImplementation dao;

	public List<StudentDetails> loadStudents() {
		// TODO Auto-generated method stub
		List<StudentDetails> details = dao.loadStudents();
		return details;
	}

	public void saveStudent(AddStudent addStudent) {
		// TODO Auto-generated method stub
		System.out.println("save student calling");
		if(addStudent.getCountry().equals("India")) {
			System.out.println("Welcome.. We are happy to see you");
			
		}
		dao.saveStudent(addStudent);
		
	}

	public StudentDetails getStudentByObject(int id) {
		// TODO Auto-generated method stub
		StudentDetails details = dao.getStudents(id);
		
		return details;
		
	}

	public void updateStudent(AddStudent addStudent) {
		// TODO Auto-generated method stub
		System.out.println("Update student calling");
		dao.updateStudent(addStudent);
	}

	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		dao.deleteStudent(id);
		
	}
	
	

}
