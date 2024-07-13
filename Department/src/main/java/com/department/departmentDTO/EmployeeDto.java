package com.department.departmentDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
	int employeeId;	
	String firstName;
	String lastName;
	String address;
	String mobileNo;
	String departmentName;
	
	

	

}
