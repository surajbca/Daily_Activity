package com.learning.vcube;


public class Products {
	
	Integer product_ID;
	String product_Name;
	Double product_Prices;
	Double product_Rating;
	Boolean Available_Status;
	Integer Stock_Quality;
	Double Disscount_Parcentage;
	Character product_code;
	
	public static void main(String [] args) {
		
		Products pro = new Products();
		
		pro.product_ID = 22;
		pro.product_Name = "Apple";
		pro.product_Prices = 100.0;
		pro.product_Rating =4.3;
		pro.Available_Status = true;
		pro.Stock_Quality = 50;
		pro.Disscount_Parcentage=10.0;
		pro.product_code = 'A';
		
		System.out.println(pro.product_ID );
		System.out.println(pro.product_Name );
		System.out.println(pro.product_Prices );
		System.out.println(pro.product_Rating );
		System.out.println(pro.Available_Status );
		System.out.println(pro.Stock_Quality );
		System.out.println(pro.Disscount_Parcentage );
		System.out.println(pro.product_code );
		
	}
	
	

}
