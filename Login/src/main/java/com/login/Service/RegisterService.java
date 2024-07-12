package com.login.Service;

import java.util.List;
import java.util.Optional;

import com.login.Model.Register;




public interface RegisterService {
	
	public Register  registerDetails(Register service);
	
  public Optional<Register> getDetailsById(int id);
  
  public List<Register> registerD(Register registerService);
	

}
