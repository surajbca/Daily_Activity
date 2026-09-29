package com.learning.vcube.oops;

import java.util.Scanner;

class InvalidPasswordException extends Exception{
	
	InvalidPasswordException(String message){
		super(message);
	}
}
public class CustomException {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter password:");
		String password = sc.nextLine();
		
		try {
			
			if(password.length() < 8) {
				
				throw new InvalidPasswordException("Password must contain at least 8 character");
			}
			System.out.println("Password Accepted");
		} catch (InvalidPasswordException e) {
			System.out.println("Invalid Password:" + e.getMessage());
		}
		sc.close();
	}

}
