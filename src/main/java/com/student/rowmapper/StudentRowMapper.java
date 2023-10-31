package com.student.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.student.entity.StudentDetails;

public class StudentRowMapper implements RowMapper<StudentDetails> {

	@Override
	public StudentDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		StudentDetails details = new StudentDetails();
		details.setId(rs.getInt("id"));
		details.setName(rs.getString("name"));
		details.setMobile(rs.getLong("mobile"));
		details.setCountry(rs.getString("country"));
		
		return details;
	}

}
