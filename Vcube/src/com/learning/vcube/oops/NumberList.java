package com.learning.vcube.oops;

import java.util.ArrayList;

public class NumberList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(70);
		numbers.add(30);
		numbers.add(60);
		numbers.add(50);
		
		System.out.println("ArrayList elements.");
		
		for(int num : numbers) {
			System.out.println(num);
		}
	}

}
