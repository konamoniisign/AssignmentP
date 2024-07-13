package com.studentAddress.Service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.studentAddress.Model.StudentAddress;
import com.studentAddress.Repository.StudentRepository;
import com.studentAddress.studentResponse.StudentAddressRepsonses;
import com.studentAddress.studentResponse.StudentApiResponse;

@Service
public class StudentAddressImp implements StudentAddressService {

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	private StudentApiResponse studentApiResponse;

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public StudentAddressRepsonses saveAddress(StudentAddressRepsonses studentAddressRepsonses) {

		StudentAddress address = modelMapper.map(studentAddressRepsonses, StudentAddress.class);

		address = studentRepository.save(address);

		StudentAddressRepsonses studentAddressRepsonses2 = modelMapper.map(address, StudentAddressRepsonses.class);
		
		

		return studentAddressRepsonses2;
	}

	@Override
	public StudentAddressRepsonses getAddressByStudentId(int id) {
		
		StudentAddress studentAddress = modelMapper.map(id, StudentAddress.class);
		studentAddress = studentRepository.findById(id).get();
		StudentAddressRepsonses addressRepsonses = modelMapper.map(studentAddress, StudentAddressRepsonses.class);
		return addressRepsonses;
	}

	@Override
	public List<StudentAddressRepsonses> getAllStudentAddresses() {
	 List<StudentAddress> studentAddress = new ArrayList<>();
	 studentAddress = studentRepository.findAll();
	 List<StudentAddressRepsonses> addressRepsonses = new ArrayList<>();
	 
	 for(StudentAddress studentAdress : studentAddress) {
		 StudentAddressRepsonses studentAddressRepsonses1 =  modelMapper.map( studentAdress, StudentAddressRepsonses.class);
		 addressRepsonses.add(studentAddressRepsonses1);
	 }
		return addressRepsonses;
	}

}
