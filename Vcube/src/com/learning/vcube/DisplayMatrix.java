package com.learning.vcube;

import java.util.*;

public class DisplayMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] matrix = new int[3][3];

		System.out.println("Enetr 9 elements for 3 x 3 matrix");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("The 3 x 3  matrix is:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
