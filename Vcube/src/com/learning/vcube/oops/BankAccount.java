package com.learning.vcube.oops;

public class BankAccount {

	private String accountNumber;
	private String holderName;
	private double balance;
	
	public BankAccount(String accountNumber, String holderName) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = 5000.0;
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Successfully deposited: $"+ amount);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}
	
	public void withdraw(double amount) {
		if(amount <= 0) {
			System.out.println("Invalid Withdrawal amount");
		} else if(amount > balance) {
			System.out.println("Transaction Failed: Insufficient balance");
		} else {
			balance -= amount;
			System.out.println("Successfully withdrew: $" +  amount);
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getAccountNumber() {return accountNumber;}
	public String getHolderName() {return holderName;}
	
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount("7896542369", "Rahul sharma");
		
		System.out.println("Account Holder: " + account.getHolderName());
		System.out.println("Initial Balance: $" + account.getBalance());
		System.out.println("----------------------------------------");
		
		account.deposit(2500.0);
		System.out.println("Current Balance: $" + account.getBalance());
		System.out.println("----------------------------------------");
		
		account.deposit(4000.0);
		System.out.println("Current Balance: $" + account.getBalance());
		System.out.println("----------------------------------------");
		
		account.withdraw(5000.0);
		
		System.out.println("---------------------------------");
		System.out.println("Final Account Balance: $"+ account.getBalance());
	}
}
