package com.student.controller;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.dao.StudentDaoImplementation;
import com.student.entity.AddStudent;
import com.student.entity.StudentDetails;
import com.student.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@GetMapping("/getStudents")
	public String getStudentDetails(Model model) {
		
		List<StudentDetails> list = service.loadStudents();
		
		model.addAttribute("students", list);
		
		return "student-list";
	}
	
	
	@GetMapping("/addStudent")
	public String addStudents(Model model) {
		AddStudent add = new AddStudent();
		model.addAttribute("add", add);
		return "add-student";
	}
	
	@PostMapping("/save-student")
	public String saveStudents(AddStudent addStudent) {
		System.out.println(addStudent);
		if(addStudent.getId() == null) {
			//if id is present then do an insert operation
			service.saveStudent(addStudent);
			
		}
		else {
			service.updateStudent(addStudent);
			
		}
		
		return "redirect:/getStudents";
	}
	
	@GetMapping("/updateStudent")
	public String updateStudents(@RequestParam("userId")int id,Model model) {
		StudentDetails Mydetails=service.getStudentByObject(id);
		System.out.println(Mydetails);
		model.addAttribute("add", Mydetails);
		return "add-student";
	}
	
	@GetMapping("/deleteStudent")
	public String deleteStudents(@RequestParam("userId")int id,Model model) {
		service.deleteStudent(id);
		return "redirect:/getStudents";
	}

}
