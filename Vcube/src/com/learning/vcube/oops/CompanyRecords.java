package com.learning.vcube.oops;

interface Attendance {
	void markAttendance();
}

class Developer implements Attendance{
	
	private String name;
	
	public Developer(String name) {
		this.name = name;
	}
	
	@Override
	public void markAttendance() {
		System.out.println("[Role : Developer]" + name + "has logged in and marked attendance");
	}
}

class Tester implements Attendance {
	private String name;
	
	public Tester(String name) {
		this.name = name;
	}
	
	@Override
	public void markAttendance() {
		System.out.println("[Role: Tester]" + name +"has logged in and marked attendance.");
	}
}

class Manager implements Attendance {
	private String name;
	
	public Manager(String name) {
		this.name = name;
	}
	
	@Override
	public void markAttendance() {
		System.out.println("[Role: Manager]" + name + "has logged in and marked attendance.");
	}
}

public class CompanyRecords {
	public static void main(String[] args) {
		
		Attendance[] employees = {
				new Developer("Suraj"),
				new Tester("Golu"),
				new Manager("Bipin")
		};
		
		System.out.println("--- Recording Company Attendance---");
		
		for(Attendance employee : employees) {
			employee.markAttendance();
		}
	}

}
