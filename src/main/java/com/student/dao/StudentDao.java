package com.student.dao;

import java.util.List;

import com.student.entity.AddStudent;
import com.student.entity.StudentDetails;

public interface StudentDao {
	
	public List<StudentDetails> loadStudents();
	
	void saveStudent(AddStudent addStudent);

	StudentDetails getStudents(int id);

}
