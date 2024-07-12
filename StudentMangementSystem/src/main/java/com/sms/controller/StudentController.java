package com.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sms.Model.Student;
import com.sms.Service.StudentService;


@RestController
public class StudentController {
	
	@Autowired
	public StudentService  studentService;
	
	
	public ResponseEntity<Student> createStudent(@RequestBody Student student){
		
		return new ResponeEntity<Student>(studentService.f)
	}

}
