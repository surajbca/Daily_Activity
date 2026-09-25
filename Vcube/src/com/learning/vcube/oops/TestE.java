package com.learning.vcube.oops;
class Book{
	void bookDetails() {
		System.out.println("This is a book");
	}
}

class Magazine{
	void magazineDetails() {
		System.out.println("This is Magazine");
	}
}
public class TestE {
	
	public static void main(String[] args) {
		try {
			
			Object obj = new Magazine();
			
			Book b = (Book) obj;
		}
		catch (ClassCastException e) {
			System.out.println("ClassCastException occurred!");
			System.out.println("Cannot cast Magazine object to Book.");
		}
	}

}

