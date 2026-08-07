package com.learning.vcube;

public class BankDetails {
	
	public static void main(String [] args) {
		System.out.println("Main method started");
		displayAccount();
		
		System.out.println("Main method ended");
	}
	
	static void displayAccount(){
		
		Long Account_no = 1332212233221l;
	    String Account_holader_name = "Suraj";
	    String type = "Saving Account";
	    double balance = 20000;
	    
	    System.out.println(Account_no);
	    System.out.println(Account_holader_name);
	    System.out.println(type);
	    System.out.println(balance);
	    
		
	}

}
