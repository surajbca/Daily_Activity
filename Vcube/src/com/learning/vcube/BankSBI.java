package com.learning.vcube;

import java.util.Scanner;

public class BankSBI {

    private long accountNum;
    private String ifscCode;
    private String accountHolderName;
    private double balance;
 
    // Constructor
    BankSBI(long accountNum, String ifscCode, String accountHolderName, double balance) {
        this.accountNum = accountNum;
        this.ifscCode = ifscCode;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Display Method
    void show() {
        System.out.println("\n----- Account Details -----");
        System.out.println("Account Number : " + accountNum);
        System.out.println("IFSC Code      : " + ifscCode);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance        : " + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        long account = sc.nextLong();

        sc.nextLine(); // Consume leftover newline

        System.out.print("Enter IFSC Code: ");
        String ifsc = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = sc.nextLine();

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        BankSBI obj = new BankSBI(account, ifsc, accountHolderName, balance);

        obj.show();

        sc.close();
    }
}