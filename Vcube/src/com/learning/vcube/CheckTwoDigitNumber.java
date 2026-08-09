package com.learning.vcube;

import java.util.Scanner;

public class CheckTwoDigitNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your number :");
		int number = sc.nextInt();
		
		
		int num =Math.abs(number);
		if(num >= 10 && num <= 99)
		{
			System.out.println("Two-digit number ");
		}
		else if(num >=100 && num <= 999)
		{
			System.out.println("Three-digit number :");
		}
		else if(num > 999)
		{
			System.out.println("This is More Than Three-digit" );
		} else {
			System.out.println("Less Then Two-digit");
		}
		
		sc.close();
	}

}
