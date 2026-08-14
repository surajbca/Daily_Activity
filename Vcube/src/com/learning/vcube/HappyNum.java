package com.learning.vcube;

import java.util.Scanner;

public class HappyNum {
	
	static int sumOfSquare(int n) {
		
		int sum = 0;
		
		while (n > 0) {
			int digit = n % 10;
			sum = sum + digit * digit;
			n = n / 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		int temp = n;
		
		while(temp != 1 && temp !=4) {
			
			temp = sumOfSquare(temp);
		}
		if(temp==1) {
			System.out.println(n + "is a Happy number");
		}else {
			System.out.println(n + "is not Happy number");
		}
		sc.close();
	}
}
