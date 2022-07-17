package com.ioc.xml.eg;

public class SoccerCoach implements Coach {

	FortuneService fortuneService;
	String email;
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


	// setter dependency injection
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
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
