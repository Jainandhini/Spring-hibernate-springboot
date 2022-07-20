package com.bean.scope.xml;

public class BasketBallCoach implements Coach {
	

	@Override
	public String GetCoachInfo() {
		// TODO Auto-generated method stub
		return "Welcome to hoop world!";
	}
	
	public void InitMethod() {
		System.out.println("Within Init method - BasketBallCoach");
	}
	
	public void DestroyMethod() {
		System.out.println("Within Destroy method - BasketBallCoach");
	}
}
