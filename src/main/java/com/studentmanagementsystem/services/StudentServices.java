package com.studentmanagementsystem.services;

import java.util.List;

import com.studentmanagementsystem.entity.Student;

public interface StudentServices {

	String addStudent(Student st);
	Student getStudent(int id);
	List<Student> getAllStudent();
	String updateStudent(Student st);
	String deleteStudent(int id);
	
	
}
