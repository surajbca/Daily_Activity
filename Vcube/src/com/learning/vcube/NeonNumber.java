package com.learning.vcube;

import java.util.Scanner;

public class NeonNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Enter a number :");
	    int OriginalNumber = sc.nextInt();
	    
	    int square = OriginalNumber * OriginalNumber;
	    
	    int sumOfDigits = 0;
	    
	    for(int tempSquare = square; tempSquare > 0; tempSquare /=10) {
	    	int digit = tempSquare % 10;
	    	sumOfDigits += digit;
	    }
	    
	    if(sumOfDigits == OriginalNumber) {
	    	System.out.println(sumOfDigits + "is a neon number");
	    }else {
	    	System.out.println(sumOfDigits + "is not neon num");
	    }
	    sc.close(); 
	    
	    
	}

}
