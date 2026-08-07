package com.learning.vcube;

import java.util.Scanner;

public class Marks {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your marks :");
		double marks = sc.nextDouble();
		
		char grade = (marks >= 90)? 'A' :
           			(marks >= 75)? 'B' :
           			(marks >= 60)? 'C':
           			(marks >= 40)? 'D':'F';
		
		System.out.println("marks:" + marks + "Grade:" + grade);
				
	}

}
