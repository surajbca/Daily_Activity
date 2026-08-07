package com.learning.vcube;

import java.util.Scanner;

public class SimpleCalculator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number :");
		int A = sc.nextInt();
		
		System.out.println("Enter Second number :");
		int B = sc.nextInt();
		
		int add = A + B;
		int sub = A - B;
		int mul = A * B;
		int rem = A / B;
		
		System.out.println("A + B =" + add);
		System.out.println("A - B =" + sub);
		System.out.println("A * B =" + mul);
		System.out.println("A / B =" + rem);
		
		
	}

}
