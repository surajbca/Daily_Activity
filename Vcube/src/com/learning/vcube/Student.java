package com.learning.vcube;

public class Student {
	
	int id;
	String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	Student(Student s){
		this.id = s.id;
		this.name = s.name;
	}

	void show() {
		System.out.println("ID : " + id + " Name : " + name);
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student(101, "Suraj");
		
		Student s2 =  new Student(s1);
		s1.show();
		s2.show();
	}

}
