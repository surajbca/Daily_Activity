package com.learning.vcube;

import java.util.Scanner;

public class Multiplication {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your number :");
		int num = sc.nextInt();
		
		System.out.println("\nMultiplication Table of " + num);
		
		for(int i = 1; i <= num; i++) {
			
			System.out.println(num + "x" + i + "=" + (num*i));
		}
		
	 sc.close();
	}

}
