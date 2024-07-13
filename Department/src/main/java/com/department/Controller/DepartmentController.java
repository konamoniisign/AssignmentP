package com.department.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.department.Model.DepartmentEntity;
import com.department.Service.DepartmentService;
import com.department.departmentDTO.DepartmentDto;


@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@PostMapping("/save")
	public ResponseEntity<DepartmentDto>save(@RequestBody DepartmentDto departmentDto){
		
		return new ResponseEntity<DepartmentDto>(departmentService.save(departmentDto), HttpStatus.CREATED);
	}
	
	
	@GetMapping("/findById{departmentId}")
	public ResponseEntity<DepartmentDto> findById(@PathVariable int departmentId){
		
		return new ResponseEntity<DepartmentDto>(departmentService.findById(departmentId), HttpStatus.OK);
	}
	
	@GetMapping("/findByDepartmentName/{departmentName}")
	public ResponseEntity<List<DepartmentEntity>> findBydepartmentName(@PathVariable String departmentName){
		
		return ResponseEntity.ok(departmentService.findByDepartmentName(departmentName));
	}

}
