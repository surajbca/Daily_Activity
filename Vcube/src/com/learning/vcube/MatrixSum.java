package com.learning.vcube;

import java.util.*;

public class MatrixSum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] [] matrix = new int[3][3];
		int sum =0;
		
		System.out.println("Enter 9 elements of the 3x3 matrix:");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matrix[i][j] = sc.nextInt();
				sum += matrix[i][j];
			}
		}
		
		System.out.println("sum of all elements " + sum);
		sc.next();
	}

}
