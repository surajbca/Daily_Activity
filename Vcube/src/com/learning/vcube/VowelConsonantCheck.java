package com.learning.vcube;

import java.util.Scanner;

public class VowelConsonantCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character :");
		char ch =sc.next().charAt(0);
		
		char lowerCh = Character.toLowerCase(ch);
		
		if(Character.isLetter(lowerCh)) {
			String result = (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' ||lowerCh == 'o' || lowerCh=='u')
					? "vowel" : "Consonant";
			
			System.out.println(result);
		} else {
			System.out.println("Not a valid alphabet letter.");
		}
		
		sc.close();

	}

}
