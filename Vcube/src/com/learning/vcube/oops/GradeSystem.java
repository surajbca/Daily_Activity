package com.learning.vcube.oops;

import java.util.Scanner;

class StudentA {

	public void calculateGrade(int marks) {
		System.out.println("Generate student grading logic");
	}
}

class EngineeringStudent extends StudentA {

	@Override
	public void calculateGrade(int marks) {
		System.out.println("Engineering Student Grade : ");
		if (marks >= 90)
			System.out.println("S (Excellent)");
		else if (marks >= 75)
			System.out.println("B (Very good)");
		else if (marks >= 50)
			System.out.println("C (good)");
		else
			System.out.println("F (Fail)");
	}
}

class MedicalStudent extends StudentA {

	@Override
	public void calculateGrade(int marks) {
		System.out.println("Medical Student Grade : ");
		if (marks >= 90)
			System.out.println("A+(Excellent)");
		else if (marks >= 75)
			System.out.println("B+ (very good)");
		else if (marks >= 50)
			System.out.println("C (goog)");
		else
			System.out.println("F (Fail)");
	}
}

class ManagementStudent extends StudentA {

	@Override
	public void calculateGrade(int marks) {
		System.out.println("Management student Grade : ");
		if (marks >= 90)
			System.out.println("A (Excellent)");
		else if (marks >= 75)
			System.out.println("B (Very good)");
		else if (marks >= 50)
			System.out.println("C (good)");
		else
			System.out.println("F (Fail)");
	}
}

public class GradeSystem {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("--Student Grading System ");
		System.out.println("Enter marks obtained (out of 100)");
		int inputMarks = sc.nextInt();

		StudentA studentRef;

		System.out.println("\n --- Demonstrating Runtime Polymorphism ---");

		System.out.println("press 1 for Medical \n press 2 for Engineering \n press 3 for management");
		int choice = sc.nextInt();

		switch (choice) {
		case 1: {
			studentRef = new MedicalStudent();
			studentRef.calculateGrade(inputMarks);
		}
			break;
		case 2: {
			studentRef = new EngineeringStudent();
			studentRef.calculateGrade(inputMarks);
		}
			break;

		case 3: {
			studentRef = new ManagementStudent();
			studentRef.calculateGrade(inputMarks);

		}
			break;
		default:
			System.out.println("invalixd choice");
		}

	}

}
