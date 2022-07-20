package com.bean.scope.xml;

public class SoccerCoach implements Coach {

	@Override
	public String GetCoachInfo() {
		// TODO Auto-generated method stub
		return "Welcome to Kick world!";
	}
	
	public void InitMethod() {
		System.out.println("Within Init method - SoccerCoach");
	}
	
	public void DestroyMethod() {
		System.out.println("Within Destroy method - SoccerCoach");
	}
}
