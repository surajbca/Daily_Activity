package com.learning.vcube;

import java.util.Scanner;

public class LargestDigit {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		
		int largest = 0;
		
		while(num > 0) {
			
			int digit = num % 10;
			
			if(digit > largest) {
				
				largest = digit;
			}
			
			num = num / 10;
		}
		
		System.out.println("Larget digit = " + largest);
		
		sc.close();
	}

}
