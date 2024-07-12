package com.login.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.login.Model.Register;

import jakarta.transaction.Transactional;

@Repository
public interface RepositoryRegister extends JpaRepository<Register, Integer> {

	

}
