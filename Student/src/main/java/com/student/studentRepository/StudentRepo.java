package com.student.studentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.StudentModel.StudentEntity;

@Repository
public interface StudentRepo extends JpaRepository<StudentRepo, Integer> {

	StudentEntity save(StudentEntity studentEntity);
	
	

}
