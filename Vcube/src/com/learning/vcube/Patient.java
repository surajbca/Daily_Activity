package com.learning.vcube;

import java.util.Scanner;

public class Patient {
	
	String Patient_Name;
	int Age;
	double Room_Charge_per_day;
	int Number_of_Days_Admitted;
	
	Patient(String Patient_Name, int Age, double Room_Charge_per_day,int Number_of_Days_Admitted ){
		this.Patient_Name = Patient_Name;
		this.Age = Age;
		this.Room_Charge_per_day = Room_Charge_per_day;
		this.Number_of_Days_Admitted = Number_of_Days_Admitted;
	}
	
	void calculate() {
		
		double Total_Hospital_Bill = (Room_Charge_per_day * Number_of_Days_Admitted);
		
		System.out.println("Patient Name : " + Patient_Name);
		System.out.println("Age  :" + Age);
		System.out.println("Room Charge per day : " + Room_Charge_per_day);
		System.out.println("Number of Days Admitted : " + Number_of_Days_Admitted);
		System.out.println("Total Hospital Bill : " + Total_Hospital_Bill);
	}
	
	public static void main(String [] args) {
		
		System.out.println("Main method started");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Patient name : ");
		String name = sc.next();
		
		System.out.println("Enter patient Age : ");
		int age = sc.nextInt();
		
		System.out.println("Enter Room Charger per day : ");
		double room_charge = sc.nextDouble();
		
		System.out.println("Enter Number of days admitted : ");
		int day = sc.nextInt();
		
		Patient obj = new Patient(name, age, room_charge, day);
		obj.calculate();
	}

}
