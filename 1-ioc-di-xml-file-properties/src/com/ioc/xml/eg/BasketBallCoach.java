package com.ioc.xml.eg;

public class BasketBallCoach implements Coach {
	
	FortuneService fortuneService;
	
	//constructor dependency injection
	public BasketBallCoach(FortuneService FortuneService) {
		fortuneService = FortuneService;
	}

	@Override
	public String GetCoachInfo() {
		// TODO Auto-generated method stub
		return "Welcome to hoop world!";
	}

	public String GetFortune() {
		return fortuneService.getFortune();
	}
}
