package com.learning.vcube;

public class BankAccount {
	
	private String accountHolder;
	private int  accountNumber;
	private double balance;
	
	public BankAccount() {
		this("Unknown");
	}
	
	public BankAccount(String accountHolder) {
		this(accountHolder, 0);
		
	}
	
	public BankAccount(String accountHolder,int  accountNumber) {
		this(accountHolder, accountNumber, 0.0);
	}
	public BankAccount(String accountHolder, int accountNumber, double balance) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	void show() {
		System.out.println("----------------------------------");
		System.out.println("Account Holder : " + accountHolder);
		System.out.println("Account Number : " +accountNumber);
		System.out.println("Account Balance : " + balance);
		System.out.println("-----------------------------------");
	}
	
	public static void main(String []args) {
		
		BankAccount obj = new BankAccount();
		obj.show();
		
		BankAccount obj2 = new BankAccount("Suraj");
		obj2.show();
		
		BankAccount obj3 = new BankAccount("Suraj", 42668552);
		obj3.show();
		
		BankAccount obj4 = new BankAccount("Suraj", 42668552, 432.00);
		obj3.show();
		
	
	}
	
	

}
