package com.student.StudentModel;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class StudentEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int studentId;
	String firstName;
	String lastName;
	long mobileNo;
	
	
	

}
