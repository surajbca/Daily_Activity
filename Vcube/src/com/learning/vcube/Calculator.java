package com.learning.vcube;

import java.util.Scanner;

public class Calculator {
	
	public static void add(int a, int b) {
		int total = a + b;
		System.out.println(total);
	}
	
	public static void sub(int a, int b) {
		int total = a - b;
		System.out.println(total);
	}
	public static void mul(int a, int b) {
		int total = a * b;
		System.out.println(total);
	}
	public static void div(int a, int b) {
		int total = a / b;
		System.out.println(total);
	}
	
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int a = sc.nextInt();
		
		System.out.println("Enter a number");
		int b = sc.nextInt();
		
		add(a, b);
		sub(a, b);
		mul(a, b);
		div(a, b);
	}
	
}
