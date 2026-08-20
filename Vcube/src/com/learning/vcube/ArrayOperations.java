package com.learning.vcube;

public class ArrayOperations {
	
	public static void main(String[] args) {
		
		// 1. read and print all elements of an array
		int[] array1 = {10, 20, 30, 40, 50};
		System.out.print("1. Array elements: "); 
		for(int num : array1) {
			System.out.print(num + " "); 
		}
		System.out.println();
		
		// 2. find the sum of all elements in an array
		int[] array2 = {1, 2, 3, 4, 5};
		int sum = 0;
		for(int num : array2) {
			sum += num;
		}
		System.out.println("2. sum of elements: " + sum);
		
		// 3. find the average of array elements
		int[] array3 = {10, 20, 30, 40};
		int totalForAvg = 0;
		for(int num : array3) {
			totalForAvg += num;
		}
		double average = (double) totalForAvg / array3.length;
		System.out.println("3. Average of elements: " + average); 
	}
}
