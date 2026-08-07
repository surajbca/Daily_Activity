package com.learning.vcube;

import java.util.Scanner;

public class Tickets {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("Select Ticket Type:");
			System.out.print("1. Silver - Rs.200");
			System.out.print("2. Gold - Rs.300");
			System.out.print("3. Platinum - Rs.500");
			System.out.print("4. Exist");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter your age :");
				int age1 = sc.nextInt();
				double price1 = 200;
				if(age1 >= 60) {
					price1 = price1 - (price1 * 0.10);
				}
				System.out.println("Silver ticket price: Rs." + price1);
				break;
				
			case 2:
				System.out.println("Enter your age :");
				int age2 = sc.nextInt();
				double price2 = 300;
				if(age2 >= 60) {
					price2 = price2 - (price2 * price2);
				}
				System.out.println("Gold ticket price: Rs. " + price2);
				break;
				
				
			case 3:
				System.out.println("Enter you age : ");
				int age3 = sc.nextInt();
				double price3 = 500;
				if(age3 >= 60) {
					price3 = price3 -(price3 - price3);
				}
				System.out.println("Platinum ticket price: Rs."+ price3);
				break;
				
			case 4:
				System.out.println("Thanku you! Visit Again");
				break;
				
			default:
				System.out.println("Invalid choice! please try agen");
				
			}
			
		}	while (choice != 4);
		sc.close();
	}
}
