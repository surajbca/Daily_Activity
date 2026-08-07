package com.learning.vcube;

import java.util.Scanner;

public class OddEven {
	
	public static void oddEven(int num) {
		
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a num : ");
		int num = sc.nextInt();
		
		oddEven(num);
	}

}
