package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.Response.StudentDto;
import com.student.Service.Studentservice;

@RestController
public class StudentController {

	@Autowired
	private Studentservice studentService;
	
	@PostMapping("/student")
	public ResponseEntity<StudentDto> studentSave(@RequestBody StudentDto student){
		
		
		return new ResponseEntity<StudentDto>(studentService.saveStudent(student), HttpStatus.CREATED);
	}
	
	@GetMapping("/findById/{studentId}")
	public ResponseEntity<StudentDto> getByStudentById(@PathVariable ("studentId") int studentId){
		
		return new ResponseEntity<StudentDto>(studentService.getById(studentId),HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<StudentDto>> findAllStudents(){
		
		return new ResponseEntity<List<StudentDto>>(studentService.findAllStudents(), HttpStatus.OK);
	}
	
	@DeleteMapping("deleteStudent/{studentId}")
	public ResponseEntity<String> deleteById(@PathVariable ("studentId") int StudentId){
		studentService.deleteStudent(StudentId);
		return new ResponseEntity<String>("deleted success ",HttpStatus.OK);
	}
	
}
