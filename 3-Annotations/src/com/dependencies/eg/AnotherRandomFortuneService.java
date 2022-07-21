package com.dependencies.eg;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AnotherRandomFortuneService implements IFortuneService {


	
	@Value(value = "${test.fortunes}")
	private String fortunes;
	
	Random random = new Random();
	
	AnotherRandomFortuneService() {
		System.out.println("Inside another random fortune service constructor...");
	}
	
	public String getFortune() {
		
		String[] fortuneList = fortunes.split(";",-1);
		int index = random.nextInt(fortuneList.length);

		return fortuneList[index];
	}
}
