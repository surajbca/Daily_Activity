package com.learning.vcube;

public class MissingNumber {
	
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 4, 5, 6};
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != i + 1) {
				System.out.println("Missing Number" +( i + 1));
				return;
			}
		}
		System.out.println("Missing Number"+(arr.length + 1));
	}

}
