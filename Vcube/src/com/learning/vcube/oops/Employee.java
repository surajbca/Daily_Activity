package com.learning.vcube.oops;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private String password;
	
	public Employee() {}
	
	public Employee(int id, String name, double salary, String password) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary >= 0) {
			this.salary = salary;
		} else {
			System.out.println("Salary cannot be negaative");
		}
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
