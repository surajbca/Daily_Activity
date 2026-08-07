package com.learning.vcube;

public class UnaryTest {
	public static void main(String []args) {
		int x = 5;
		int y = x++ + ++x *2;
		
		System.out.println("X: " + x  +",Y : " + y);
	}

}
