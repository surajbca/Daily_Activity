package com.learning.vcube;

import java.util.Scanner;

public class PositiveNegative {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = scanner.nextInt();
		
		String result = (num >= 0) ? "Positive":"Negative";
		
		System.out.println("The number is " + result);
		
		scanner.close();
	}

}
