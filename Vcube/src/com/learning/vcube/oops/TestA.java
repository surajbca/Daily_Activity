package com.learning.vcube.oops;

abstract class Account{
	
	public static void displayBankRules() {
		System.out.println("Static method: Banks must maintain secure transaction.");
	}
	
	public void welcomeMessage() {
		System.out.println("Concrete Method: Welcome to your account dashboard.");
	}
	
	public abstract void calculateInterest();
}

class SavingsAccount extends Account {
	
	public void calculateInterest() {
		System.out.println("Abstract Method Implemented: Savings Account interest calculated at 4% per annum.");
	}
}

class CurrentAccount extends Account {
	
	public void calculateInterest() {
		System.out.println("Abstract Method Implemented: Current Account interest is 0% (Maintenance fee applies).");
	}
}

public class TestA {
	
	public static void main(String[] args) {
		
		System.out.println("=== Accessing via Class Name ===");
		
		Account.displayBankRules();
		SavingsAccount.displayBankRules();
		
		System.out.println("\\n=== Accessing via Objects ===");
		
		Account savings = new SavingsAccount();
		Account current = new CurrentAccount();
		
		savings.welcomeMessage();
		
		savings.calculateInterest();
		current.calculateInterest();
	}

}
