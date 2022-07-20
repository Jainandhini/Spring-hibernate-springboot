package com.bean.scope.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Singleton bean scope 	
		System.out.println("Singleton bean scope examples....");
		BasketBallCoach bCoach1 = context.getBean("basketCoach", BasketBallCoach.class);
		BasketBallCoach bCoach2 = context.getBean("basketCoach", BasketBallCoach.class);
		
		System.out.println("bCoach1==bCoach2 : "+ (bCoach1==bCoach2));
		System.out.println("Addr of bCoach1: "+ bCoach1);
		System.out.println("Addr of bCoach2: "+ bCoach2);
		
		System.out.println("Prototype bean scope examples....");
		SoccerCoach sCoach1 = context.getBean("soccerCoach", SoccerCoach.class);
		SoccerCoach sCoach2 = context.getBean("soccerCoach", SoccerCoach.class);
		
		System.out.println("sCoach1==sCoach2 : "+ (sCoach1==sCoach2));
		System.out.println("Addr of sCoach1: "+ sCoach1);
		System.out.println("Addr of sCoach2: "+ sCoach2);
		
		context.close();
	}

}
