package com.learning.vcube;

public class Product {

	private String productName;
	private int price;
	private int quantity;

	public Product() {
		this("Laptop");

	}

	public Product(String productName) {
		this(productName, 3000);
	}

	public Product(String productName, int price) {
		this(productName, price, 3);
	}

	public Product(String productName, int price, int quantity) {
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;

	}

	void show() {

		double totalPrice = price * quantity;
		System.out.println("Product Name :" + productName);
		System.out.println("Prices :" + price);
		System.out.println("Quantity : " + quantity);
		System.out.println("Total Price : " + totalPrice);
	}

	public static void main(String[] args) {

		Product p = new Product();
		p.show();

	}

}
