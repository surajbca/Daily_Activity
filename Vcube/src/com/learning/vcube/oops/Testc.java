package com.learning.vcube.oops;

abstract class Payment{
	
	double amount;
	double transactionFee;
	
	abstract void pay(double amount);
	
	void display() {
		System.out.println("Amount  : ₹" + amount);
		System.out.println("Transaction Fee  : ₹" + transactionFee);
		System.out.println("Total Amount  : ₹" + (amount + transactionFee));
		System.out.println("Payment successful");
	}
}

class CreditCard extends Payment {
	void pay(double amount) {
		this.amount = amount;
		
		transactionFee = amount * 2 / 100;
		
		display();
	}
}

class UPI extends Payment{
	
	void pay(double amount) {
		this.amount = amount;
		
		transactionFee = 0;
		
		display();
	}
	
}

class NetBanking extends Payment{
	
	void pay(double amount) {
		this.amount = amount;
		
		transactionFee = 10;
		
		display();
	}
	
}

public class Testc {
	
	public static void main(String[] args) {
		System.out.println("----- Credit Card Payment -----");
		CreditCard c = new CreditCard();
		c.pay(100);
		
		System.out.println();
		
		System.out.println("----- UPI Payment -----");
		UPI u = new UPI();
		u.pay(100);
		
		System.out.println();
		
		System.out.println("----- Net Banking Payment -----");
		NetBanking n = new NetBanking();
		n.pay(1000);
	}

}
