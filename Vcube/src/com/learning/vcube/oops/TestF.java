package com.learning.vcube.oops;

import java.util.Scanner;

class DuplicateUsernameException extends Exception{
	
	DuplicateUsernameException(String message){
		super(message);
	}
	
}

public class TestF {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] usernames = {"suraj", "admin", "John"};
		
		System.out.println("Enter username: ");
		String username = sc.nextLine();
		
		try {
			
			boolean exists = false;
			
			for(int i = 0; i < usernames.length; i++) {
				
				if(username.equals(usernames[i])) {
					exists = true;
					break;
				}
			}
			if(exists) {
				throw new DuplicateUsernameException("username already exits. Please choice another username.");
			}
			System.out.println("Account created successfully.");
			
		}catch (DuplicateUsernameException e) {
			
			 System.out.println(e.getMessage());
		}
		
		sc.close();
		
	}

}
