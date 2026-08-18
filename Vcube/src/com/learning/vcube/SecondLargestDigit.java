package com.learning.vcube;

public class SecondLargestDigit {
	
	public static int findSecondLargest(int num) {
		
		int max = -1;
		int secondMax = -1;
		
		num = Math.abs(num);
		
		if(num == 0) {
			return -1;
		}
		
		while (num > 0) {
			int digit = num % 10;
			
			if(digit > max) {
				secondMax = max;
				max = digit;
			} else if(digit > secondMax && digit != max) {
				secondMax = digit;
			}
			num /= 10;
		}
		return secondMax;
	}
	
	public static void main(String[] args) {
		
		int input = 987654;
		int result = findSecondLargest(input);
		
		if(result != -1) {
			
			System.out.println("Second largest digit: " + result);
		} else {
			System.out.println("No distinct second largest digit found.");
		}
		
	}

}
