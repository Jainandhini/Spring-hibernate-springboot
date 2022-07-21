package com.annotations.eg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.dependencies.eg.IFortuneService;

@Component
public class VolleyCoach implements Coach {

	@Autowired
	@Qualifier("anotherRandomFortuneService")
	IFortuneService fortuneService;	
	
	public VolleyCoach() {
		System.out.println("Inside VolleyCoach constructor...");
	}
	
	@Override
	public String GetCoachInfo() {
		// TODO Auto-generated method stub
		return "Welcome to Cricket world!";
	}
	
	public String GetFortune() {
		System.out.println("uses AnotherRandomFortuneService implementation.....");
		return fortuneService.getFortune();
	}
}
