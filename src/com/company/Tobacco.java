package com.company;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Tobacco {
    String [] cigarettes = {"Marlboro", "Winston", "LM", "Winchester", "John Silver"};
    int [] priceCigarettes = {65, 50, 55, 62, 57};
    ArrayList <String> shoppingCart = new ArrayList<String>();             //Creating a list to add products
    int totalSum;                           //A variable to store the total sum


    public void displayCigarettes() {           //Prints the list cigarettes and prices
        for (int i = 0; i < cigarettes.length; i++) {
            System.out.println((i+1) + ". " + cigarettes[i] + " - " + priceCigarettes[i] + " $ ");
        }
    }

    public void setShoppingCart (String productOnMenu) {
        shoppingCart.add(productOnMenu);
        System.out.println("You have added this to your cart: " +    //Prints the cart
        shoppingCart.toString().replace("[","").replace("]",""));    //Removes the brackets
    }

    public void setTotalSum(int menuChoice) {
        totalSum = totalSum + priceCigarettes[menuChoice];
        System.out.println("Total price: " + totalSum);
    }

}

