package com.learning.vcube.oops;

import java.util.Scanner;

class InvalidAgeException extends Exception {
	
	InvalidAgeException(String message){
		super(message);
	}
}

public class Registration {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		
		try {
			if(age < 18) {
				throw new InvalidAgeException("Age must be 18 or above.");
			}
			
			System.out.println("Registration successful");
		} catch (InvalidAgeException e) {
			System.out.println("Invalide Age: " + e.getMessage());
		}
		
		sc.close();
	}

}
