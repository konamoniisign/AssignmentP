package com.springMVCRegistration.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springMVCRegistration.DTO.api.UserRegisterPageDTO;

@Controller
public class RegisterPageController {
	@Autowired
	JdbcUserDetailsManager jdbcUserDetailsManager;
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@RequestMapping("/hello")
	public String navigatePage() {
		return "security";
	}
	
	@RequestMapping("/helloworld")
	public String registerPage(@ModelAttribute ("userReg") UserRegisterPageDTO userRegisterPageDTO) {
		return"register-page";
	}
	
	
	
	@PostMapping("/register")
	public UserDetails userRegisterPageDTO(@RequestBody UserRegisterPageDTO registerPageDTO) {
		
		 UserDetails dto = User.withUsername(registerPageDTO.getUserName()).password(registerPageDTO.getPassword()).roles(registerPageDTO.getRoles()).build();
		 jdbcUserDetailsManager.createUser(dto);
		return dto;
	}

}
