package com.dependencies.eg;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FortuneService implements IFortuneService {

	String[] fortunes = new String[3];
	
	Random random = new Random();
	
	FortuneService() {
		System.out.println("Inside fortune service constructor...");
		fortunes[0] = "Today is your lucky day";
		fortunes[1] = "Keep it up; you are almost there!";
		fortunes[2] = "Be the best version of yourself, everything else will follow";
	}
	
	public String getFortune() {
		System.out.println("uses FortuneService implementation.....");
		int index = random.nextInt(fortunes.length);

		return fortunes[index];
	}
}
