package com.learning.vcube;

import java.util.Scanner;

public class SalarySlipGenerator {
	
	
	 void salarySlip(String employeeName, double basicSalary) {
		
		System.out.println("Employee name : " + employeeName);
		System.out.println("Basic Salary : " + basicSalary);
		
		double HRA = (basicSalary * 20 ) / 100;
		double DA = (basicSalary * 10) / 100;
		double GrossSalary = basicSalary + HRA + DA;
		
	
		System.out.println("Gross Salary : " + GrossSalary);
	}
	
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter employee name: ");
		String employeeName = scanner.nextLine();
		
		System.out.println("Enter employee salary: ");
		double basicSalary = scanner.nextDouble();
		
		
		SalarySlipGenerator emp = new SalarySlipGenerator();
		emp.salarySlip(employeeName, basicSalary);
	}

}
