package com.studentAddress.studentResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentResponse {
	
	int studentId;
	String name;
	long mobile;
   private StudentResponse studentResponse;
}
