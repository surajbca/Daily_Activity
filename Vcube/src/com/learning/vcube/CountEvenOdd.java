package com.learning.vcube;

public class CountEvenOdd {
	
	public static void main(String[] args) {
		
		int[] arr = {2, 5, 8, 9, 12};
		int evenCount = 0;
		int oddCount = 0;
		
		for(int num : arr) {
			if(num % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("Event: " + evenCount + " Odd:" + oddCount);
		
	}

}
