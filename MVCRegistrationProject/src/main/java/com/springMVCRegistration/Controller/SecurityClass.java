package com.springMVCRegistration.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SecurityClass {
	
	@ResponseBody
	@GetMapping("/")
	public String helloWorld() {
		return "hello Goood Morning...";
	}

}
