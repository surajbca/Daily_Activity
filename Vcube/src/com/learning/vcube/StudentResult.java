package com.learning.vcube;

import java.util.Scanner;

public class StudentResult {
	
	public void displayStudent(String name) {
		System.out.println("Student result sheet");
		System.out.println("Student Name " + name);
	}
	
	public void calculateTotal(int m1, int m2, int m3) {
		int total = m1 + m2 + m3;
		System.out.println("Total Marks " + total);
	}
	
	public void calculateAverage(int m1, int m2, int m3) {
		double average = (m1+m2+m3) / 3.0;
		System.out.println("Average marks: " + average);
		
		if(m1 >= 40 && m2 >=40 && m3 >= 40) 
		{
			System.out.println("Final Status : Passed");
		}else {
			System.out.println("Final Status : Failed");
		}
	}
	
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		StudentResult student = new StudentResult();
		
		System.out.println("Enter Student Name: ");
		String name = scanner.nextLine();
		
		System.out.println("Enter marks for subject 1");
		int mark1 = scanner.nextInt();
		
		System.out.println("Enter marks for subject 2");
		int mark2 = scanner.nextInt();
		
		System.out.println("Enter marks for subject 3");
		int mark3 = scanner.nextInt();
		
		student.displayStudent(name);
		student.calculateTotal(mark1, mark2, mark3);
		student.calculateAverage(mark1, mark2, mark3);
		
		scanner.close();
		
	}

}


