package com.studentAddress.Service;

import java.util.List;

import com.studentAddress.studentResponse.StudentAddressRepsonses;


public interface StudentAddressService {
	
	public StudentAddressRepsonses saveAddress(StudentAddressRepsonses studentAddress);

	public StudentAddressRepsonses getAddressByStudentId(int id);

	public List<StudentAddressRepsonses> getAllStudentAddresses();
	


}
