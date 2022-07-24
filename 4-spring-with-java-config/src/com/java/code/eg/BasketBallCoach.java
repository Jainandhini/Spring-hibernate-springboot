package com.java.code.eg;

import org.springframework.beans.factory.annotation.Value;

import com.dependencies.eg.IFortuneService;

public class BasketBallCoach implements Coach {
	IFortuneService fortuneService;
	
	public BasketBallCoach(IFortuneService FortuneService) {
		System.out.println("Inside BasketBallCoach constructor...");
		fortuneService = FortuneService;
	}
	
	@Value("${test.email}")
	String email;
	@Value("${test.name}")
	String name;
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String GetCoachInfo() {
		// TODO Auto-generated method stub
		return "Welcome to hoop world!";
	}
	
	@Override
	public String GetFortune() {
		return fortuneService.getFortune();
	}
}
