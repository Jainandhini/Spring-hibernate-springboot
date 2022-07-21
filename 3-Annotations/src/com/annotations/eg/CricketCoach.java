package com.annotations.eg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.dependencies.eg.IFortuneService;

@Component
public class CricketCoach implements Coach {

	IFortuneService fortuneService;
	
	@Autowired
	@Qualifier("fortuneService")
	public void customSetMethod(IFortuneService FortuneService) {
		System.out.println("Inside CricketCoach custom Setter inj...");
		fortuneService = FortuneService;
	}
	
	@Override
	public String GetCoachInfo() {
		// TODO Auto-generated method stub
		return "Welcome to Cricket world!";
	}
	
	public String GetFortune() {
		return fortuneService.getFortune();
	}
}
