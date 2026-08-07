package com.learning.vcube;

import java.util.Scanner;

public class Factorial {
	
	public static void factory(int num) { 
		for(int i = 1; i <= num/2; i++) {
			if(num %i == 0) {
				System.out.print( i+ "");
			}
		}

	}
	
	
	public static void main(String[] args) {
		
		Scanner sc =new  Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		factory(num);
	}

}
