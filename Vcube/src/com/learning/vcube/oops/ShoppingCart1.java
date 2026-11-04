package com.learning.vcube.oops;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ShoppingCart1 {
	
	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> cart = new CopyOnWriteArrayList<>();
		
		cart.add("Laptop");
		cart.add("Mouse");
		cart.add("Keyboard");
		cart.add("Monitor");
		
		Iterator<String> oldIterator = cart.iterator();
		
		cart.add("Headphones");
		cart.add("Mouse");
		
		System.out.println("Old Iterator Output :");
		while(oldIterator.hasNext()) {
			System.out.println(oldIterator.next());
		}
		
		Iterator<String> newIterator = cart.iterator();
		
		System.out.println("\nNew Iterator Output:");
		while(newIterator.hasNext()) {
			System.out.println(newIterator.next());
		}
	}

}
