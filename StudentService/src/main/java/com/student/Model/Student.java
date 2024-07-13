package com.student.Model;

import com.student.Response.StudentAddressRepsonses;
import com.student.Response.StudentDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Student {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int studentId;
	String name;
	long mobile;
	
	
	

	
	
	
	
	
}
