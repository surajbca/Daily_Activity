package com.learning.vcube;

public class StringConversion {
	
	public static void main(String [] args) {
		
		String intStr = "123";
		String floatStr = "14.0f";
		String doubleStr = "456.00";
		
		int parsedInt = Integer.parseInt(intStr);
		
		float parsedFloat = Float.parseFloat(floatStr);
		
		double parsedDouble  = Double.parseDouble(doubleStr);
		
		System.out.println(parsedInt);
		System.out.println(parsedFloat);
		System.out.println(parsedDouble);
	}

}
