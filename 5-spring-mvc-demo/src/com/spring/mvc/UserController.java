package com.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "show-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloUser";
	}
	
	@RequestMapping("/processForm2")
	public String processForm2(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		String result = "User#"+name.toUpperCase();
		
		model.addAttribute("UserId", result);
		return "helloUser";
	}
	
	@RequestMapping("/processForm3")
	public String processForm3(@RequestParam("name")String name, Model model) {
		String result = "User#"+name.toUpperCase();
		
		model.addAttribute("UserId", result);
		return "helloUser";
	}
}
