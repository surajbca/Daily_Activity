package com.learning.vcube;

import java.util.Scanner;

public class Magicnum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		int temp = n;
		
		while(temp > 9) {
			int sum = 0;
			
			while(temp > 0 ) {
				int digit = temp % 10;
				sum = sum + digit;
				temp = temp / 10;
			}
			temp = sum;
			}
		if(temp == 1)
			System.out.println(n + "is a magic Number");
		else
			System.out.println(n + "is not a magic Number");
		
		sc.close();
	}

}
