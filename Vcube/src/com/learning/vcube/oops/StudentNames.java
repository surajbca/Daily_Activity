package com.learning.vcube.oops;

import java.util.ArrayList;

public class StudentNames {
	
	public static void main(String [] args) {
		
		ArrayList<String> students = new ArrayList<>();
		
		students.add("Suraj");
		students.add("Dheeraj");
		students.add("Rocky");
		students.add("Mohammad");
		students.add("Rakesh");
		
		System.out.println("Student name.");
		
		for(String name:students) {
			System.out.println(name);
		}
	}

}
