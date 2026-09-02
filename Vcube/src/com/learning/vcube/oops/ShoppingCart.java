package com.learning.vcube.oops;

import java.util.ArrayList;

public class ShoppingCart {
	
	private ArrayList<String> cartItems;
	private double totalAmount;
	
	public ShoppingCart() {
		cartItems = new ArrayList<>();
		totalAmount = 0.0;
	}

	public void addItem(String item, double price) {
		cartItems.add(item);
		totalAmount += price;
	}
	
	public void removeItem(String item, double price) {
		if(cartItems.remove(item)) {
			totalAmount -= price;
		}
	}
	
	public double getTotal() {
		return totalAmount;
	}
	
	public static void main(String[] args) {
		
		ShoppingCart cart = new ShoppingCart();
		
		cart.addItem("Laptop", 500000);
		cart.addItem("Mouse", 1000);
		cart.addItem("keyboard", 2000);
		
		cart.removeItem("Mouse", 1000);
		
		System.out.println("Total Amount: $" + cart.getTotal());
	}
}
