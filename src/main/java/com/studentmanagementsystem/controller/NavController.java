package com.studentmanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@Controller
@RequestMapping(value = "/api/nav")
public class NavController {

	@GetMapping(value = "/addStudent")
	public String mapAddStudent() {
		return "addStudent";
	}
	
	@GetMapping(value = "/viewInfo")
	public String mapViewInfo() {
		return "viewInfo";
	}
	
	@GetMapping(value="/index")
	public String mapIndex() {
		return "index";
	}
	
	@GetMapping(value="/updateStudent")
	public String mapupdateStudent() {
		return "updateStudent";
	}
	
	@GetMapping(value="/deleteStudent")
	public String mapdeleteStudent() {
		return "deleteStudent";
	}
}
