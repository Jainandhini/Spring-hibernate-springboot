package com.annotations.eg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.dependencies.eg.IFortuneService;

@Component
public class RugbyCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	IFortuneService fortuneService;	
	
	public RugbyCoach() {
		System.out.println("Inside RugbyCoach constructor...");
	}
	
	@Override
	public String GetCoachInfo() {
		// TODO Auto-generated method stub
		return "Welcome to Cricket world!";
	}
	
	public String GetFortune() {
		System.out.println("uses RandomFortuneService implementation.....");
		return fortuneService.getFortune();
	}
}
