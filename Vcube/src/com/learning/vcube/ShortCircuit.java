package com.learning.vcube;

public class ShortCircuit {
	
	public static void main(String []args) {
		
		int count = 10;
		boolean check = (count < 5 ) && (++count > 10);
		
		System.out.println("count: " + count + " check:" + check);
		
	}

}
