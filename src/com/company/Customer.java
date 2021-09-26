package com.company;

import java.awt.*;
import java.util.Scanner;

public class Customer {
    int walletBalance;
    int age;
    String customerName;
    int menuChoice;             //Stores the int from the menu choice
    int currentWalletBalance;

    public Customer(int newWalletBalance, int newAge, String newCustomerName) {
        walletBalance = newWalletBalance;
        age = newAge;
        customerName = newCustomerName;
        currentWalletBalance = walletBalance;

    }

    public void menuChoiceInput() {
        Scanner menuInput = new Scanner(System.in);
        System.out.print("What will it be?: ");
        menuChoice = menuInput.nextInt();
    }

}
