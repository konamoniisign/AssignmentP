package com.SpringMVC.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@org.springframework.stereotype.Controller
public class TestController {
	
	@ResponseBody
	@RequestMapping("/test")
	public String Controller() {
		
		return "Hello Connections";
	}

}
