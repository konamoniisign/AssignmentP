package com.springMvcLcalculator.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springMvcCalculator.api.UserInfoDTO;

@Controller
public class LCalculatorController {

	@RequestMapping("/")
	public String homePage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {
             
		
		return "home-Page";
	}

	@RequestMapping("process-HomePage")
	public String calculatorPage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO,
			BindingResult bindingResult) {
		     
		userInfoDTO.isTermAndCondition();
		
		if(bindingResult.hasErrors()) {
			
			System.out.println("My form has Errors");
			
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			for(ObjectError temp:allErrors) {
				System.out.println(temp);
			
			
			}
			return "home-Page";
		}
			    
		
		return "result-Page";
	}
}
