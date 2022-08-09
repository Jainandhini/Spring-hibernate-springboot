package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "show-form";
	}
	
	@RequestMapping("/processForm3")
	public String processForm3(@RequestParam("name")String name, Model model) {
		String result = "Customer#"+name.toUpperCase();
		
		model.addAttribute("CustomerId", result);
		return "helloCustomer";
	}
}
