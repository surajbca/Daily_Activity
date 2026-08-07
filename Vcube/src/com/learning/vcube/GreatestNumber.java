package com.learning.vcube;

import java.util.Scanner;

public class GreatestNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number :");
		int A = sc.nextInt();
		
		System.out.println("Enter second number :");
		int B = sc.nextInt();
		
		System.out.println("Enter third number :");
		int C = sc.nextInt();
		
		int Greater = (A > B) ?  ((A >C ) ? A : C) : ((B > C)? B:C);
		
		System.out.println("Greater num :" + Greater);
		
	}

}
