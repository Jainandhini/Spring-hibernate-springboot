package com.dependencies.eg;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements IFortuneService {

	String[] fortunes = new String[3];
	
	Random random = new Random();
	
	RandomFortuneService() {
		System.out.println("Inside random fortune service constructor...");
		fortunes[0] = "Today is your lucky day";
		fortunes[1] = "Keep it up; you are almost there!";
		fortunes[2] = "Be the best version of yourself, everything else will follow";
	}
	
	public String getFortune() {
		int index = random.nextInt(fortunes.length);

		return fortunes[index];
	}
}
