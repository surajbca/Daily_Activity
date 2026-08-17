package com.learning.vcube;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Random  random = new Random();
		
		int randomNumber = random.nextInt(10) + 1;
		boolean hasWon = false;
		
		System.out.println("Welcome! I have picked random number between 1 and 10.");
		System.out.println("you have 3 chances to guess  it.");
		
		for(int attempt = 1; attempt <= 3; attempt++) {
			System.out.println("Attempt " + attempt + "- Enter Yout guess: ");
			int userGuess = sc.nextInt();
			
			if(userGuess == randomNumber) {
				System.out.println("You Won!");
				hasWon = true;
				break;
			}
		}
		
		if(!hasWon) {
			System.out.println("you lost!");
			System.out.println("The correct random number was:" + randomNumber);
		}
		
		sc.close();
	}

}
