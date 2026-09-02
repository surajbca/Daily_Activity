package com.learning.vcube.oops;

class Person {
	
	String name;
	int age;
	
	 Person(String name, int age){
		this.name = name;
		this.age = age;
	}

}

public class Student extends Person{
	String collegeName;
	
	Student(String name, int age, String collegeName){
		super(name, age);
		this.collegeName = collegeName;
	}
	
	void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("College Name : " + collegeName);
	}
	
	public static void main(String[] args) {
		
		Student s = new Student("Suraj", 21, "CINATH INTERNATION COLLEGE");
		s.display();
	}
}
