package com.learning.vcube;

import java.util.*;

public class LeaderElements {
	
	public static void finderLeaders(int [] arr) {
		if(arr == null || arr.length == 0) {
			System.out.println("Array is Empty");
			return ;
		}
		
		int n = arr.length;
		List<Integer>leaders = new ArrayList<>();
		
		int maxFromRight =arr[n - 1];
		leaders.add(maxFromRight);
		
		for(int i = n - 2; i >= 0; i--) {
			if(arr[i] > maxFromRight) {
				maxFromRight = arr[i];
				leaders.add(maxFromRight);
			}
		}
		
		Collections.reverse(leaders);
		
		System.out.println("Leader Elements :");
		for(int leader : leaders) {
			System.out.println(leader + "");
			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int[] inputArr = {16, 17, 4, 3, 5, 2};
		finderLeaders(inputArr);
	}

}
