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
}
