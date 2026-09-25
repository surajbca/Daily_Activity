package com.learning.vcube.oops;

import java.util.Scanner;

public class PassengerBooking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String passengerId = "ABC123";
        String age = "25";

        String seatNumber = "12A";

        int numberOfPassengers = 3;

        String[] passengers = {"Rahul", "Suraj", "Anil"};

        Object[] passengerData = {"Suraj", 25, "12A", 5000.0};

        System.out.println("----- PASSENGER BOOKING SYSTEM -----");

        try {
            int id = Integer.parseInt(passengerId);
            int passengerAge = Integer.parseInt(age);

            System.out.println("Passenger ID: " + id);
            System.out.println("Passenger Age: " + passengerAge);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid Passenger ID or Age.");
        }

        try {
            double totalBaggage = 60.0;

            double averageBaggage = totalBaggage / numberOfPassengers;

            System.out.println("Average Baggage: " + averageBaggage + " kg");

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero.");
        }

        try {
            int index = 5;

            System.out.println("Passenger: " + passengers[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Invalid passenger index.");
        }

        try {
            char seat = seatNumber.charAt(10);

            System.out.println("Seat Character: " + seat);

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: Invalid seat index.");
        }

        try {
            String passengerName = (String) passengerData[1];

            System.out.println("Passenger Name: " + passengerName);

        } catch (ClassCastException e) {
            System.out.println("ClassCastException: Object cannot be converted to String.");
        }

        try {
            String passengerAddress = null;

            System.out.println("Address Length: "
                    + passengerAddress.length());

        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Passenger data is null.");
        }

        try {
            double totalAmount = 15000.0;
            int numberOfSeats = 0;

            double bookingAverage = totalAmount / numberOfSeats;

            System.out.println("Booking Average: " + bookingAverage);

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Number of seats cannot be zero.");
        }

        System.out.println();
        System.out.println("Passenger booking processing completed.");
        System.out.println("Program continues successfully.");

        sc.close();
    }
}