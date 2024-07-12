package com.login.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.login.Model.Register;
import com.login.Service.RegisterService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ControllerRegister {

	@Autowired
	private RegisterService registerService;

	@PostMapping("/register")
	public ResponseEntity<Register> saveDetails(@RequestBody Register registerDetails) {
		Register savedDetails = registerService.registerDetails(registerDetails);
		return new ResponseEntity<>(savedDetails, HttpStatus.CREATED);
	}

	@GetMapping("/getDetials{id}")
	public ResponseEntity<Optional<Register>> getDetails(@PathVariable Integer id) {

		Optional<Register> details = registerService.getDetailsById(id);

		return new ResponseEntity<Optional<Register>>(details, HttpStatus.OK);
	}
	
	
	@PostMapping("/findDetails")
	public ResponseEntity<List<Register>>getAllDetails(@RequestBody Register registerD){
			
	return new ResponseEntity<List<Register>>(registerService.registerD(registerD), HttpStatus.OK);

}
}
