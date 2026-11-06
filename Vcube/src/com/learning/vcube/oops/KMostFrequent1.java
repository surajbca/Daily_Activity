package com.learning.vcube.oops;

import java.util.*;

public class KMostFrequent1 {
	
	public static void main(String[] args) {
		
		int[] nums = {1, 1, 1, 2, 2, 3};
		int k=2;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int num:nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(
				(a, b) -> map.get(b) - map.get(a)
		);
		
		pq.addAll(map.keySet());
		
		System.out.println("K Most Frequent Elements:");
		
		for(int i = 0; i < k; i++) {
			System.out.print(pq.poll() + " ");
		}
		
	}

}
