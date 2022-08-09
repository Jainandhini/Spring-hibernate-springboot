package com.spring.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.models.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryOptions}") 
	Map<String,String> fileCountryOptions;

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		theModel.addAttribute("student", new Student());
		return "show-student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm3(@RequestParam("student")Student student, Model model) {
		
		String message = "Welcome to class -"+student.getFirstName()+" "+student.getLastName();
		
		model.addAttribute("student", student);
		model.addAttribute("message", message);
		return "helloCustomer";
	}
	
	@RequestMapping("/processForm2")
	public String processForm2(@ModelAttribute("student")Student student) {
		
		String message = "Welcome to class -"+student.getFirstName()+" "+student.getLastName();
		
		return "helloStudent";
	}
	@RequestMapping("/dropDownForm")
	public String dropDownForm(Model theModel) {
		theModel.addAttribute("student", new Student());
		return "dropdown-form";
	}
	@RequestMapping("/dropDownForm2")
	public String dropDownForm2(Model theModel) {
		theModel.addAttribute("student", new Student());
		return "dropdown-form2";
	}
	@RequestMapping("/dropDownForm3")
	public String dropDownForm3(Model theModel) {
		theModel.addAttribute("student", new Student());
		// add the country options to the model 
	    theModel.addAttribute("theCountryOptions", fileCountryOptions); 
	 
		return "dropdown-form3";
	}
	@RequestMapping("/radiobuttonForm")
	public String showRadioButtonForm(Model theModel) {
		theModel.addAttribute("student", new Student());
		return "radiobutton-form";
	}
	
	@RequestMapping("/checkboxForm")
	public String showCheckboxForm(Model theModel) {
		theModel.addAttribute("student", new Student());
		return "checkbox-form";
	}
	
	@RequestMapping("/dropDownSubmit")
	public String dropdownSubmit(@ModelAttribute("student")Student student) {
		
		String message = "Welcome to class -"+student.getFirstName()+" "+student.getLastName();
		
		return "dropdown-result";
	}
	@RequestMapping("/radiobuttonSubmit")
	public String radiobuttonSubmit(@ModelAttribute("student")Student student) {
		
		String message = "Welcome to class -"+student.getFirstName()+" "+student.getLastName();
		
		return "radiobutton-result";
	}
	
	@RequestMapping("/checkboxSubmit")
	public String checkboxSubmit(@ModelAttribute("student")Student student) {
		
		String message = "Welcome to class -"+student.getFirstName()+" "+student.getLastName();
		
		return "checkbox-result";
	}
}
