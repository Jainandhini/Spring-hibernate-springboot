package com.annotations.eg;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		 	
		System.out.println("\nExplicit component id examples....");
		Coach bCoach = context.getBean("basketCoach", Coach.class);
		System.out.println(bCoach.GetCoachInfo());		
		
		System.out.println("\nImplicit default component id examples....");
		Coach sCoach = context.getBean("soccerCoach", Coach.class);
		System.out.println(sCoach.GetCoachInfo());
		
		System.out.println("\nAnnotation + DI ...Constructor injection");
		System.out.println("Fortune 1: "+bCoach.GetFortune());
		
		System.out.println("\nAnnotation + DI ...Setter injection");
		System.out.println("Fortune 1: "+sCoach.GetFortune());
		
		Coach cCoach = context.getBean("cricketCoach", Coach.class);
		
		System.out.println("\nAnnotation + DI ...Method injection");
		System.out.println("Fortune 1: "+cCoach.GetFortune());
		
		Coach rCoach = context.getBean("rugbyCoach", Coach.class);
		
		System.out.println("\nAnnotation + DI ...Field injection");
		System.out.println("Fortune 1: "+rCoach.GetFortune());
		
		System.out.println("\nQualifier annotation examples");
		
		System.out.println("First implementation of IRandomFortuneServive... ");
		System.out.println(rCoach.GetFortune());
		
		Coach vCoach = context.getBean("volleyCoach", Coach.class);
		System.out.println("Second implementation of IRandomFortuneServive... ");
		System.out.println(vCoach.GetFortune());
		
		System.out.println("\nValue annotation examples + read properties from file");
		SoccerCoach soccerCoach = context.getBean("soccerCoach", SoccerCoach.class);
		System.out.println(soccerCoach.getEmail());
		System.out.println(soccerCoach.getName());
		
		System.out.println(sCoach.GetFortune());
		
		context.close();
	}

}
