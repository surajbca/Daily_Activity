package com.learning.vcube;

import java.util.Scanner;

public class GradeCalculator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		
		String grade = (marks >= 90) ? "A" :
			           (marks >= 75) ? "B" :
			           (marks >= 60) ? "C" :
			           (marks >= 50) ? "D" : "Fail";
		
		System.out.println("Grade: " + grade);
		
		sc.close();
	}
	

}
