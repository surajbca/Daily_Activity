package com.learning.vcube.oops;

public class VehicleA extends CarA{
	
	int speed = 50;
	
	void display(){
		System.out.println("Car speed : " + speed);
	}
	
	public static void main(String[] args) {
		CarA c = new CarA();
		c.display();
		VehicleA v = new VehicleA();
		v.display();
		
	}

}

class CarA{
	int speed = 100;
	
	void display() {
		System.out.println("Car speed : " + speed);
	}
}
