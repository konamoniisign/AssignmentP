package com.department.departmentDTO;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ApiResponseDto {

	private DepartmentDto departmentDto;
	
	private EmployeeDto employeeDto;
}
