package com.studentmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.studentmanagementsystem.entity.Student;
import com.studentmanagementsystem.services.StudentServices;

@Controller
@RequestMapping(value = "/api")
public class StudentController {

	@Autowired
	StudentServices ss;
	
	@PostMapping(value = "/addStudent")
	public String addStudent(@RequestParam("id") int id,
								@RequestParam("name") String name,
									@RequestParam("branch") String branch) {
		Student st=new Student(id, name, branch);
		String msg = ss.addStudent(st);
		System.out.println(msg);
		return "index";
	}
}
