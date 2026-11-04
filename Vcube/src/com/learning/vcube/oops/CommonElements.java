package com.learning.vcube.oops;

import java.util.Set;
import java.util.TreeSet;

public class CommonElements {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1, 5, 10};
		int[] arr2 = {1, 4, 10};
		int[] arr3 = {1, 6, 10};
		
		
		Set<Integer> set = new TreeSet<>();
		
		for(int i = 0; i < arr1.length; i++) {
			
			for(int j = 0; j < arr2.length; j++) {
				
				for(int k = 0; k < arr3.length; k++) {
					
					if(arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
						
						set.add(arr1[i]);
					}
				}
			}
		}
		
		System.out.println("Common Elements: " + set);
	}

}
