package com.learning.vcube;

public class AutomorphicNumber {
	
	
	public static boolean isAutomorphic(int num) {
		
		long square = (long) num * num;
		
		while (num > 0) {
			
			if(num % 10 != square % 10) {
				return false;
			}
			num /= 10;
			square /= 10;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		int input = 25;
		if(isAutomorphic(input)) {
			System.out.println(input + "is an Automorphic Number");		
		} else {
			System.out.println(input + "is not an Automorphic Number");
		}
		
		
	}

}
