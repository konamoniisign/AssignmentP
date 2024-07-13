package com.SpringMvcProject;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Mom {
   
	
	@ResponseBody
	@RequestMapping("/home")
	public String giveH() {
		return"Ok >>> djfkdjfkjdklfjkldjf";
	}
}
