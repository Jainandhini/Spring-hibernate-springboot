package com.annotations.eg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.dependencies.eg.IFortuneService;

@Component
public class SoccerCoach implements Coach {

	IFortuneService fortuneService;
	@Value(value = "${test.email}")
	String email;
	@Value(value = "${test.name}")
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

	@Autowired
	public void setFortuneService(@Qualifier("anotherRandomFortuneService")IFortuneService FortuneService) {
		System.out.println("Inside SoccerCoach Setter injection...");
		fortuneService = FortuneService;
	}
	
	@Override
	public String GetCoachInfo() {
		// TODO Auto-generated method stub
		return "Welcome to Kick world!";
	}
	
	public String GetFortune() {
		return fortuneService.getFortune();
	}
}
