package com.learning.vcube;

public class PerfectNum {
	
	public static void main(String[] args) {
		
		System.out.println("Perfect numbers between 1 and 100:");
		
		for(int num = 1; num <= 100; num++) {
			
			int sum = 0;
			
			for(int i = 1; i <= num; i++ ) {
				
				if(num % i == 0 ) {
					sum = sum + i;
				}
				if(sum == num) {
					System.out.println(num + " ");
				}
			}
		}
	}

}
