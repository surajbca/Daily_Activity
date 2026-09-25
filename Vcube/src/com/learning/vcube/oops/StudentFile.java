package com.learning.vcube.oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class StudentFile {
	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("student.txt");
			fos.close();
			
			FileInputStream fis = new FileInputStream("student.txt");
			
			System.out.println("student.txt file opened successfully.");
			
			fis.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found: student.txt");
		}
		catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
	}

}
