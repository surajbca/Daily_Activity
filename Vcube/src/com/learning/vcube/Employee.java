package com.learning.vcube;

public class Employee {
	
	int empId;
	String empName;
	double salary;
	
	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	Employee(Employee e){
		this.empId = e.empId;
		this.empName = e.empName;
		this.salary = e.salary;
	}
	
	void incrementSalary(double amount) {
		salary += amount;
	}
	
	void display() {
		System.out.println("Employee Id :" + empId);
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee salary : " + salary);
	}
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(11, "Suraj", 50000);
		Employee emp2 = new Employee(emp1);
		
		emp2.incrementSalary(10000);
		
		System.out.println("Employee 1");
		emp1.display();
		System.out.println();
		System.out.println("Employee 2");
		emp2.display();
	}

}
