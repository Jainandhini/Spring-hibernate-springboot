package com.java.code.eg;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		 	
		System.out.println("\nJava config examples....");
		BasketBallCoach bCoach = context.getBean("coachImpl", BasketBallCoach.class);
		System.out.println(bCoach.GetCoachInfo());		
		System.out.println("Fortune: "+bCoach.GetFortune());
		
		System.out.println("\nValue annotation examples + read properties from file");
		System.out.println(bCoach.getEmail());
		System.out.println(bCoach.getName());
		
			
		context.close();
	}

}
