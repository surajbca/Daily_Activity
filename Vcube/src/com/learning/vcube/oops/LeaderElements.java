package com.learning.vcube.oops;

import java.util.Stack;

public class LeaderElements {
	
	public static void main(String[] args) {
		
		int[] arr = {16, 17, 4, 3, 5, 2};
		
		Stack<Integer> stack = new Stack<>();
		
		int max = arr[arr.length - 1];
		stack.push(max);
		
		for(int i=arr.length - 2; i>=0; i--) {
			if(arr[i] > max) {
				max = arr[i];
				stack.push(max);
			}
		}
		
		System.out.println("Leader elements are : ");
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}

}
