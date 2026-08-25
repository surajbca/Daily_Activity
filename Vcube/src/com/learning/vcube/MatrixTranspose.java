package com.learning.vcube;

import java.util.*;

public class MatrixTranspose {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] matrix = new int[3][3];
		int[][] transpose = new int[3][3];
		
		System.out.println("Enter elements for a 3 X 3 matrix :");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				transpose[i][j] = matrix[i][j];
			}
		}
		
		System.out.println("Original Matrix");
		printMatrix(matrix);
		
		System.out.println("Transpose Matrix");
		printMatrix(transpose);
		
		sc.close();
	}
	
	private static void printMatrix(int[][] matrix) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(matrix[i][j] +"");
			}
			System.out.println();
		}
	}

}
