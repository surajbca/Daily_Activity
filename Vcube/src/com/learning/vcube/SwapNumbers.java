package com.learning.vcube;

public class SwapNumbers {
	
	public static void main(String[] args) {
		
		int A = 10;
		int B = 20;
		
		System.out.println("Before Swapping :");
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		
		A = A + B;
		B = A - B;
		A = A - B;
		
		System.out.println("Afetr Swapping :");
		System.out.println("A = " + A);
		System.out.println("B = " + B);
	}

}
