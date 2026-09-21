package com.learning.vcube.oops;

import java.util.Scanner;

public class ATMProgram {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter Account balance: ");
			double balance = sc.nextDouble();
			
			System.out.println("Enter withdrawal amount");
			double withdraw = sc.nextDouble();
			
			if(withdraw <= 0) {
				throw new ArithmeticException("Withdrawal amount must be greater than 0");
			}
			
			if(withdraw > balance) {
				throw new ArithmeticException("Insufficient balance"); 
			}
			
			balance = balance - withdraw;
			
			System.out.println("Withdrawal successful");
			System.out.println("Remaining balance: " + balance);
		}catch(ArithmeticException e) {
			System.out.println("Withdrawal Error: " + e.getMessage());
		}
		
		try {
			System.out.println("\nEnter amount as String: ");
			String amountString = sc.next();
			
			double amount = Double.parseDouble(amountString);
			
			System.out.println("Converted amount: "+ amount);
		}catch(NumberFormatException e) {
			System.out.println("Conversion Error: Invalid amount entered");
		}
		
		try {
			String[] transactions = {
					"Deposit: 5000",
					"Withdraw: 1000",
					"Deposit: 2000",
					"Withdraw: 500"
			};
			
			System.out.println("\nEnter transaction index (0-3): ");
			int index = sc.nextInt();
			
			System.out.println("Transaction: " + transactions[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Transaction Error: Invalid transaction index");
		}
		
		try {
			String accountHolder = null;
			
			System.out.println("\nAccount Holder: " + accountHolder.toUpperCase());
		} catch(NullPointerException e) {
			System.out.println("Account Details Error: Account holder details are null");
		}
		
		System.out.println("\nATM transaction process completed.");
		
		sc.close();
	}

}
