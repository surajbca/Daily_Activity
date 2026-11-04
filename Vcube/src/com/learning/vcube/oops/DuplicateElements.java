package com.learning.vcube.oops;

import java.util.Stack;

public class DuplicateElements {
	
	public static void main(String[] args) {
		
		int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
		
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> duplicates = new Stack<>();
		
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			
			for(int j=0; j< i; j++) {
				if(arr[i] == arr[j]) {
					count++;
					break;
				}
			}
			
			if(count == 0) {
				stack.push(arr[i]);
			}else {
				if(!duplicates.contains(arr[i])) {
					duplicates.push(arr[i]);
				}
			}
		}
		
		System.out.println("Duplicate elements are: ");
		
		while (!duplicates.isEmpty()) {
			System.out.print(duplicates.pop() + " ");
		}
	}

}
