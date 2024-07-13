package com.student.studentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.StudentModel.StudentEntity;
import com.student.studentRepository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public StudentEntity createStudent(StudentEntity studentEntity) {
		
		return studentRepo.save(studentEntity);
	}
	
}