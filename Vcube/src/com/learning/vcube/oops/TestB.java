package com.learning.vcube.oops;

abstract class Shape{
	
	public void area() {
		System.out.println("Shape class");
	}
}

class Circle extends Shape{
	double radius = 5;
	public void area() {
		double result = Math.PI * radius * radius;
		System.out.println("Area of circle " + result);
	}
}

class Rectangle extends Shape{
	
	double length = 10;
	double width = 5;
	public void area() {
		double result = length * width;
		System.out.println("Area of Rectangle " + result);	
	}
}

class Triangle extends Shape{
	double base = 8;
	double height = 6;
	public void area() {
		double result = 0.5 * base * height;
		System.out.println("Area of Triangle = " + result);
	}
}


public class TestB {
    public static void main(String[] args) {
    	Circle c = new Circle();
    	Rectangle r = new Rectangle();
    	Triangle t = new Triangle();
    	
    	c.area();
    	r.area();
    	t.area();
    }
}
