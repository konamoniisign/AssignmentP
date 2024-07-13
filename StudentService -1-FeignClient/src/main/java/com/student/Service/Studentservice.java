package com.student.Service;

import java.util.List;

import com.student.Response.StudentDto;

public interface Studentservice {
	
	public StudentDto saveStudent(StudentDto student);
	
	public StudentDto getById(int studentId);

	public List<StudentDto> findAllStudents();
	
	public void deleteStudent(int studentId);

}
