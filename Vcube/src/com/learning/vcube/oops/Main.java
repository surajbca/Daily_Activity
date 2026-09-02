package com.learning.vcube.oops;

public class Main {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee(101, "Suraj", 75000.0, "securePass123");
		
		System.out.println("---Initial Employee Details ---");
		System.out.println("ID:"+ emp.getId());
		System.out.println("Name:"+ emp.getName());
		System.out.println("Salary:"+ emp.getSalary());
		System.out.println("Password:"+ emp.getPassword());
		
		emp.setName("Niraj");
		emp.setSalary(82000.0);
		emp.setPassword("newValidPass987");
		
		System.out.println("\n--- Updated Employee Details ---");
		System.out.println("Name:" + emp.getName());
		System.out.println("Salary:" + emp.getSalary());
		System.out.println("Password:" + emp.getPassword());
	}

}
