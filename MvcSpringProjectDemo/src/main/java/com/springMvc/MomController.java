package com.springMvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MomController {
	
	@ResponseBody
	@RequestMapping("/rice")
	public String momRice() {
		return"Hrer is your rice";
	}

}
