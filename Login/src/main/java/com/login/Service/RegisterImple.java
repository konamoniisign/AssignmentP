package com.login.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.Model.Register;
import com.login.Repository.RepositoryRegister;

@Service
public class RegisterImple implements RegisterService {
	
	@Autowired
	private RepositoryRegister repository;

	

	@Override
	public Register registerDetails(Register service) {
		// TODO Auto-generated method stub
		return  repository.save(service);
	}



	@Override
	public Optional<Register> getDetailsById( int id  ) {
		
		return repository.findById(id);
	}



	@Override
	public List<Register> registerD(Register registerService) {
		
		return  repository.findAll();
	}



	

}
