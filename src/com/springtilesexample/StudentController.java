package com.springtilesexample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	
	@RequestMapping(value="/addstudent")
	public String addStudent() {
		System.out.println("showing add student jsp");
		return "AddStudentDef";
	}
	
	@RequestMapping(value="/searchstudent")	
	public String searchStudent() {
		System.out.print("Showing Search Student jsp");
		return "SearchStudentDef"; 
	}

}
