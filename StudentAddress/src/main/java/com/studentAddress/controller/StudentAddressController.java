package com.studentAddress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentAddress.Service.StudentAddressService;
import com.studentAddress.studentResponse.StudentAddressRepsonses;

@RestController
public class StudentAddressController {
	
	@Autowired
	private StudentAddressService addressService;
	
	@PostMapping("/saveAddress")
	public ResponseEntity<StudentAddressRepsonses> saveAddress(@RequestBody StudentAddressRepsonses studentAddress){
		
		return new ResponseEntity<StudentAddressRepsonses>(addressService.saveAddress(studentAddress), HttpStatus.CREATED);
	}
	
	@GetMapping("/findById{id}")
	public ResponseEntity<StudentAddressRepsonses> getAddressById(@PathVariable("id") int id){
		
		return new ResponseEntity<StudentAddressRepsonses>(addressService.getAddressByStudentId(id), HttpStatus.OK);
		
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<StudentAddressRepsonses>>getAllStudentAddresses(){
		return new ResponseEntity<List<StudentAddressRepsonses>>(addressService.getAllStudentAddresses(), HttpStatus.OK);
	}



}
