package com.learning.vcube;

public class ProductDetails {
	
	int productID;
	String productName;
	double price;
	
	 ProductDetails(int productID, String productName, double price) {
		
		this.productID = productID;
		this.productName = productName;
		this.price = price;
	}
	
	 
	 void show() {
		 System.out.println("Product ID  " + productID);
			System.out.println("Product Name  " + productName);
			System.out.println("Product Name  " + price);
	 }
	public static void main(String [] args) {
		
		System.out.println("main method started");
		
		ProductDetails sc = new ProductDetails(1, "Suraj" , 38.00);
		
		sc.show();
		
		System.out.println("mainn method ended");
	}

}
