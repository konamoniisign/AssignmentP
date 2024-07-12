package com.sms.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.sms.Model.Student;
import com.sms.Repository.StudentRepository;

public class StudentServiceImp implements StudentService {
	
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student createStudent(Student student) {
		
		return studentRepository.save(student);
	}

}
