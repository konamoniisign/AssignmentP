package com.student.Service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.student.Model.Student;
import com.student.Repository.StudentRepository;
import com.student.Response.StudentAddressRepsonses;
import com.student.Response.StudentDto;
import com.student.StudentFeignClient.StudentFeign;

@org.springframework.stereotype.Service
public class ServiceImpl implements Studentservice {

	@Autowired
	StudentRepository studentRepository;
	@Autowired
	ModelMapper modelMapper;
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	 private StudentFeign studentFeign ;

//	@Override
//	public StudentDto saveStudent(StudentDto studentResponse) {
//		
//		Student mapToStudent = AutoStudentMapper.Mapper.mapToStudent(studentResponse);
//		Student student = studerntRepository.save(mapToStudent);
//		return AutoStudentMapper.Mapper.mapToStudentDto(mapToStudent);
//	}

//	@Override
//	public StudentDto getById(int studentId) {
//
//		Student student = studentRepository.findById(studentId).get();
//
//		StudentDto studentDto = modelMapper.map(student, StudentDto.class);
//
//		StudentAddressRepsonses addressRepsonses = restTemplate.getForObject("http://localhost:8080/findById{id}",
//				StudentAddressRepsonses.class,studentId);
//
//		studentDto.setStudentAddressRepsonses(addressRepsonses);
//
//		return studentDto;
//
//	}
	
	
	@Override
	public StudentDto getById(int studentId) {
		
		Student student = studentRepository.findById(studentId).get();
		
		StudentDto studentDto = modelMapper.map(student, StudentDto.class);
		
		StudentAddressRepsonses addressRepsonses = studentFeign.getAddressesById(studentId);
		
		studentDto.setStudentAddressRepsonses(addressRepsonses);
		
		return studentDto;
	}
	
	
	

	@Override
	public List<StudentDto> findAllStudents() {
		// Fetch all student entities from the repository
		List<Student> students = studentRepository.findAll();

		// Initialize a list to hold the mapped StudentDto objects
		List<StudentDto> studentDtos = new ArrayList<>();

		// Map each student entity to a StudentDto
		for (Student student : students) {
			StudentDto studentDto = modelMapper.map(student, StudentDto.class);
			studentDtos.add(studentDto);
		}

		// Return the list of StudentDto objects
		return studentDtos;
	}

	@Override
	public StudentDto saveStudent(StudentDto studentDto) {
		// Map the StudentDto to a Student entity
		Student student = modelMapper.map(studentDto, Student.class);

		// Save the Student entity to the repository
		student = studentRepository.save(student);

		// Map the saved Student entity back to a StudentDto
		StudentDto savedStudentDto = modelMapper.map(student, StudentDto.class);

		// Return the saved StudentDto
		return savedStudentDto;
	}

	@Override
	public void deleteStudent(int studentId) {

		StudentDto student = modelMapper.map(studentId, StudentDto.class);

	}

	

}
