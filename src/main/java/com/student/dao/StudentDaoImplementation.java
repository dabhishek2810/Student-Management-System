package com.student.dao;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.student.entity.AddStudent;
import com.student.entity.StudentDetails;
import com.student.rowmapper.StudentRowMapper;

@Repository
public class StudentDaoImplementation implements StudentDao{
	
	@Autowired
	JdbcTemplate template;
	
	@Override
	public List<StudentDetails> loadStudents() {
		// TODO Auto-generated method stub
		
		String querry = "select * from students";
		List<StudentDetails> studentList=template.query(querry, new StudentRowMapper());
		return studentList;
	}

	@Override
	public void saveStudent(AddStudent addStudent) {
		// TODO Auto-generated method stub
		String sql = "insert into students values(STUDENT_SEQ.nextval,?,?,?)";
		Object [] data = {addStudent.getName(),addStudent.getMobile(),addStudent.getCountry()};
		template.update(sql, data);
		System.out.println("One Record inserted");
		
	}

	@Override
	public StudentDetails getStudents(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from students where id=?";
		StudentDetails deatils= template.queryForObject(sql, new StudentRowMapper(), id);
		return deatils;
	}

	public void updateStudent(AddStudent addStudent) {
		// TODO Auto-generated method stub
		String sql="UPDATE STUDENTS SET NAME=?,MOBILE=?,COUNTRY=? WHERE ID=?";
		template.update(sql, addStudent.getName(),addStudent.getMobile(),addStudent.getCountry(),addStudent.getId());
		
	}

	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		
		String sql="delete from students where id=?";
		template.update(sql, id);
		
	}

	
	
	

}
