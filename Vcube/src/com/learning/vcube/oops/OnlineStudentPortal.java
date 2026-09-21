package com.learning.vcube.oops;

import java.util.*;
import java.util.Scanner;

public class OnlineStudentPortal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
			String studentName = null;
			
			System.out.println("Student Name Length: " + studentName.length());
		}catch (NullPointerException e) {
			System.out.println("Error: Student is null.");
		}
		
		try {
			System.out.println("\n Enter student age: ");
			int age = sc.nextInt();
			
			System.out.println("Student Age: " + age);
		}catch (InputMismatchException  e) {
			System.out.println("Error: Please enter age as a number.");
			sc.nextLine();
		}
		
		try {
			System.out.println("\nEnter total marks: ");
			int totalMarks = sc.nextInt();
			
			System.out.println("Enter number of subjects: ");
			int subject = sc.hashCode();
			
			double average = totalMarks / subject;
			
			System.out.println("Average marks:" + average);
		} catch(ArithmeticException e) {
			System.out.println("Error:Cannot divide by zero");
		}
		try {
		
		int[] marks = {80, 75, 90, 85, 95};
		
		System.out.println("\nEnter marks index (0-4):");
		int index = sc.nextInt();
		
		System.out.println("Marks" + index);
	} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Error: Invalid array index.");
	}
	
	finally {
		System.out.println("\nFinally block executed.");
		System.out.println("Online Student Portal operation completed.");
	}
		sc.close();
	}

}
