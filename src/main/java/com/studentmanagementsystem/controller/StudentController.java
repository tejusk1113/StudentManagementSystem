package com.studentmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		return "redirect:/";
	}

	@PutMapping(value = "/updateStudent")
	public String updateStudent(@RequestParam("id") int id,
			@RequestParam("name") String name,
			@RequestParam("branch") String branch) {
		Student st = ss.getStudent(id);
		st.setName(name);
		st.setBranch(branch);
		String msg = ss.updateStudent(st);
		System.out.println(msg);
		return "redirect:/";
	}

	@DeleteMapping(value = "/deleteStudent")
	public String deleteStudent(@RequestParam("id") int id)
	{
		String msg = ss.deleteStudent(id);
		System.out.println(msg);
		return "redirect:/";
	}
	
	@GetMapping(value = "/getStudent")
	public String getStudent(@RequestParam("id") int id,Model model)
	{
		Student st = ss.getStudent(id);
		model.addAttribute("student", st);
		return "showInfo";
	}
	
	
}
