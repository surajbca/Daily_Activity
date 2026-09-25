package com.learning.vcube.oops;

public class ReverseArrayElements {
	
	public static void main(String[] args) {
		
		int arr[] = {11, 12, 13, 14, 15, 16};
		
		System.out.print("{");
		
		for(int i = 0; i < arr.length; i++) {
			
			int num = arr[i];
			int reverse = 0;
			
			while (num > 0) {
				int digit = num % 10;
				reverse = reverse * 10 + digit;
				num = num / 10;
			}
			System.out.print(reverse);
			
			if(i < arr.length - 1) {
				System.out.print(", ");
			}
		}
		
		System.out.println("}");
	}

}
