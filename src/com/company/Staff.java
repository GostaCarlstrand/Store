package com.company;

import java.util.Scanner;

public class Staff {
    String name = "Annie";
    int cashierBalance;


    public void customerWelcomeMsg () {
        System.out.println("Hello, my name is " + name + " how can I help you?");

    }

    public void ifAllowedCigarettes (int customerAge) {         //Message from the staff if customer is 18 or older
        if (customerAge >= 18) {
            System.out.println("Here are your cigarettes");
        } else {
            System.out.println("You are under age, you can not buy cigarettes");
        }
    }


    public void noMoneyMessage (int priceCigarette, int currentWalletBalance) {
        System.out.println("Your missing " + (priceCigarette - currentWalletBalance) + " $ ");
        System.out.println("Your money is out, come back with more or remove other items ");
    }




}
