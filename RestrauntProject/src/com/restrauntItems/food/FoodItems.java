package com.restrauntItems.food;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FoodItems {

	@RequestMapping("/foodItems")
	public String Welcomepage(Model model) {

		String title = "Welcome to Royal Biryani Center ";

		model.addAttribute("titleName", title);

		String item1 = "chicken Biryani";
		String item2 = "MuttonBiryani";
		String item3 = "EggBiryani";
		String item4 = "ThumpsUp";

		// we also write below code also it will work;

	
		model.addAttribute("starters", "Chicken Suop");

		model.addAttribute("chicken Biryani", item1);
		model.addAttribute("MuttonBiryani", item2);
		model.addAttribute("EggBiryani", item3);
		model.addAttribute("ThumpsUp", item4);

		return "menuItems";

	}

	@RequestMapping("/Orderform")
	public String fetchItems(Model model) {
	
		model.addAttribute("OrderedPerson", "Mahesh Konamoni");
		model.addAttribute("id", "12");
		
		return"Orderform";
	}

}
