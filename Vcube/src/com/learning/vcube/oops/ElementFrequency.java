package com.learning.vcube.oops;

import java.util.*;

public class ElementFrequency {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 2, 3, 1, 4, 3};
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		
		System.out.println("Element Frequery:");
		
		for(Map.Entry<Integer, Integer>entry : map.entrySet()) {
			
			System.out.println(entry.getKey() +" = " + entry.getValue());
		}
	}

}
