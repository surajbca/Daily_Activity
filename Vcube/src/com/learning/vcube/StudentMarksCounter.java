package com.learning.vcube;

import java.util.Scanner;

public class StudentMarksCounter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] marks = new int[10];
		int passCount = 0;
		int failCount = 0;
		int highestMark = Integer.MIN_VALUE;
		
		System.out.println("Enter the marks of 10 students : ");
		for(int i = 0; i < 10; i++) {
			System.out.println("Student" + (i + 1) + ": ");
			marks[i] = sc.nextInt();
			
			if(marks[i] >= 40) {
				passCount++;
			}else {
				failCount++;
			}
			
			if(marks[i] > highestMark) {
				highestMark = marks[i];
			}
		}
		sc.close();
		
		System.out.println("\n--- Results ---");
		System.out.println("Scored 40 or above: " + passCount);
		System.out.println("Scored below 40: " + failCount);
		System.out.println("Highest mark: " + highestMark);

	}

}
