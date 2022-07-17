package com.ioc.xml.eg;

public class FortuneService {

	String[] fortunes = new String[3];
	
	FortuneService() {
		System.out.println("Inside fortune service constructor...");
		fortunes[0] = "Today is your lucky day";
		fortunes[1] = "Keep it up; you are almost there!";
		fortunes[2] = "Be the best version of yourself, everything else will follow";
	}
	
	String getFortune() {
		int i = (int) (Math.random()*10);
		if(i<3) {
			return fortunes[0];
		}
		else if(i<7) {
			return fortunes[1];
		}
		else {
			return fortunes[2];
		}
	}
}
