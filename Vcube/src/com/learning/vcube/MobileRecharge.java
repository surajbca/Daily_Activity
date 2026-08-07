package com.learning.vcube;

public class MobileRecharge {
	
	static void showPlanDetails() {
		System.out.println("Your current recharge plane" );
		System.out.println("planName:Unlimited");
		System.out.println("Validity: 28");
		System.out.println("data: 1.4kb");
		System.out.println("plan: unlimited");
		
	}
	
	void recharge(double amount) {
		System.out.println("Recharge successful!");
		System.out.println("Recharge Amount " + amount);
	}
	
	
	public static void main(String [] qargs) {
		
		MobileRecharge account = new MobileRecharge();
		account.showPlanDetails();
		account.recharge(299.0);
	}
	

}
