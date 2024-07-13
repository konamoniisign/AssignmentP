package com.student.Response;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class StudentApiResponse {
	
	private StudentAddressRepsonses studentAddressRepsonse;
	private StudentDto studentResponse;

}
