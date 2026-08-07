package com.learning.vcube;

import java.util.Scanner;

public class LoanInterest {
	
	public static double calculateInterest(double principal, double rate, int time) {
		 return (principal * rate * time ) / 100;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter principal amount: ");
		double principal = sc.nextDouble();		
		
		System.out.println("Enter interest of amount");
		double rate = sc.nextDouble();
		
		System.out.println("Enter time");
		int time = sc.nextInt();
		
		double interest = calculateInterest(principal, rate,time );
		
		System.out.println("The simple intrest is : %.2f\n " + interest);
		
		sc.close();
				
	}

}
