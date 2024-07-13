package com.studentAddress.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentAddress.Model.StudentAddress;

public interface StudentRepository extends JpaRepository<StudentAddress, Integer> {

}
