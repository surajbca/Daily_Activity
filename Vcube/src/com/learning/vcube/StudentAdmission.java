package com.learning.vcube;

public class StudentAdmission {
	
	private int id;
	private String name;
	private String course;
	
	public StudentAdmission(){
		this(0);
	}
	
	public StudentAdmission(int id) {
		this(id , "Unknown");
	}
	public StudentAdmission(int id, String name) {
		this(id, name, "Unassigned");
	}
	public StudentAdmission(int id, String name, String course) {
		this.id = id;
		this.name = name;
		this.course = course;
		
		
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.course);
		System.out.println();
		
	}
	

	
	public static void main(String [] args) {
		
		StudentAdmission s1 = new StudentAdmission(1);
		StudentAdmission s2 = new StudentAdmission(1, "Suraj");
		StudentAdmission s3 = new StudentAdmission(1, "Suraj", "BCA");
		StudentAdmission s4 = new StudentAdmission();
	}

}
