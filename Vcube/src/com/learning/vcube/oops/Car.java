package com.learning.vcube.oops;

class Vehicle {
	
	void start() {
		System.out.println("vehicle is starting");
	}

}

public class Car extends Vehicle{
	 void drive() {
		System.out.println("car is driving");
	}
	
	public static void main(String[] args) {
		
		Car car = new Car();
		car.drive();
		car.start();
		
	}
}

