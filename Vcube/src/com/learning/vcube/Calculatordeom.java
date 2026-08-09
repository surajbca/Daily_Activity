package com.learning.vcube;

import java.util.Scanner;

public class Calculatordeom {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter num2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("Choice case :");
		int chose = sc.nextInt();
		
		switch(chose) {
		case 1:
			System.out.println("Add num :" + (num1 + num2));
			break;
		case 2:
			System.out.println("Sum num : " + (num1 - num2));
			break;
		case 3:
			System.out.println("mul num :" + (num1 * num2));
			break;
		case 4:
			System.out.println("samt num :" + (num1 / num2));
		default:
			System.out.println("Error");
			
		}
		sc.close();
		
		}
	}
	




//write a java program using scanner and switch case to create a simple calculator