package com.springMvcLcalculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springMvcCalculator.api.UserRegisterForm;

@Controller
public class RegistrationPageController {

	
	@RequestMapping("/registerForm")
	public String registrationPage(@ModelAttribute ("userReg") UserRegisterForm userRegisterForm ) {
		userRegisterForm.setName("Mahesh");
		userRegisterForm.setUserName("maheshKonamoni");
		
		
		return "register-Page";
	}
	
	@RequestMapping("/register-details")
	public String registrationDetails(@ModelAttribute("userReg") UserRegisterForm userRegisterForm) {
		return "register-form-details";
	}
	
	
	
}
