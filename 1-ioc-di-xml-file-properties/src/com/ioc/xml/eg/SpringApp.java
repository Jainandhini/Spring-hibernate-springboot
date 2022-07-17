package com.ioc.xml.eg;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//IOC 	
		System.out.println("Inversion of Control examples....");
		Coach theCoach = context.getBean("basketCoach", Coach.class);
		System.out.println(theCoach.GetCoachInfo());
		
		theCoach = context.getBean("soccerCoach", Coach.class);
		System.out.println(theCoach.GetCoachInfo());
		
		//Constructor injection 
		System.out.println("\nConstructor dependency injection examples");
		BasketBallCoach bCoach = context.getBean("basketCoach", BasketBallCoach.class);
		System.out.println(bCoach.GetCoachInfo());
		System.out.println("Fortune 1: "+bCoach.GetFortune());
		System.out.println("Fortune 2 "+bCoach.GetFortune());
		System.out.println("Fortune 3: "+bCoach.GetFortune());
		
		System.out.println("\nSetter dependency injection examples");
		SoccerCoach sCoach = context.getBean("soccerCoach", SoccerCoach.class);
		System.out.println(sCoach.GetCoachInfo());
		System.out.println("Fortune 1: "+sCoach.GetFortune());
		System.out.println("Fortune 2 "+sCoach.GetFortune());
		System.out.println("Fortune 3: "+sCoach.GetFortune());
		
		System.out.println("\nSet property value from config examples");
		System.out.println("Name: "+sCoach.getName());
		System.out.println("\nSet property value from properties file examples");
		System.out.println("Email: "+sCoach.getEmail());
		
		context.close();
	}

}
