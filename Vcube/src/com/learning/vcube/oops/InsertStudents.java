
package com.learning.vcube.oops;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertStudents {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "@SurajMYSQL123";

        try (
            Connection con = DriverManager.getConnection(url, username, password);
            Scanner sc = new Scanner(System.in)
        ) {

            System.out.println("1. Insert Student");
            System.out.println("2. Update Student");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                String query = "INSERT INTO students (name, course, marks) VALUES (?, ?, ?)";

                try (PreparedStatement ps = con.prepareStatement(query)) {

                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter marks: ");
                    double marks = sc.nextDouble();

                    ps.setString(1, name);
                    ps.setString(2, course);
                    ps.setDouble(3, marks);

                    int rows = ps.executeUpdate();

                    if (rows > 0) {
                        System.out.println("Student inserted successfully!");
                    }
                }

            } else if (choice == 2) {

                String query = "UPDATE students SET name = ?, marks = ? WHERE id = ?";

                try (PreparedStatement ps = con.prepareStatement(query)) {

                    System.out.print("Enter student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter new marks: ");
                    double marks = sc.nextDouble();

                    ps.setString(1, name);
                    ps.setDouble(2, marks);
                    ps.setInt(3, id);

                    int rows = ps.executeUpdate();

                    if (rows > 0) {
                        System.out.println("Student updated successfully!");
                    } else {
                        System.out.println("Student ID not found!");
                    }
                }

            } else {
                System.out.println("Invalid choice!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
