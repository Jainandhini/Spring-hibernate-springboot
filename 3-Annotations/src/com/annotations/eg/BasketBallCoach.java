package com.annotations.eg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.dependencies.eg.IFortuneService;

@Component("basketCoach")
public class BasketBallCoach implements Coach {
	IFortuneService fortuneService;
	
	@Autowired
	public BasketBallCoach(@Qualifier("fortuneService")IFortuneService FortuneService) {
		System.out.println("Inside BasketBallCoach constructor...");
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
