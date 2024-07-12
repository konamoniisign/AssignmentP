package com.sms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.Model.Student;

public interface StudentRepository extends JpaRepository<Student , Integer> {

}
