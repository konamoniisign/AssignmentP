package com.student.Response;

import com.student.Model.Student;

import lombok.Data;

@Data


public class StudentDto {
	
	
	int studentId;
	String name;
	long mobile;
	
	private StudentAddressRepsonses studentAddressRepsonses;
	
	
	public StudentDto(int studentId, String name, long mobile) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.mobile = mobile;
	}
	
	public StudentDto(Student student) {
		super();
		this.studentId = student.getStudentId();
		this.name = student.getName();
		this.mobile = student.getMobile();
	}
	public StudentDto() {
		super();
		
	}

}
