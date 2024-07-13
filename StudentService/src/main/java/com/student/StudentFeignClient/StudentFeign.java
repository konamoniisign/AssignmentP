package com.student.StudentFeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.student.Response.StudentAddressRepsonses;

@FeignClient(name="student-service" , url="http://localhost:8080/")
public interface StudentFeign {
	
	@GetMapping("/findById{id}")
	StudentAddressRepsonses getAddressesById(@PathVariable("id") int studentId);

}
