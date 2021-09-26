package com.company;


public class Main {

    public static void main(String[] args) {

        var cigarette1 = new Tobacco(); //creating two objects from the Tobacco class
        var customer1 = new Customer(200, 20, "JohnDoe"); //creating an object/customer from the Customer class
        var staff1 = new Staff();


        staff1.customerWelcomeMsg(); //The staff greets the customer
        cigarette1.displayCigarettes();  //What cigarettes that are included in the list

        while (customer1.walletBalance > cigarette1.totalSum) {
            customer1.menuChoiceInput();
            if (cigarette1.priceCigarettes[customer1.menuChoice-1] > customer1.currentWalletBalance) {
                staff1.noMoneyMessage(cigarette1.priceCigarettes[customer1.menuChoice-1], customer1.currentWalletBalance);
                //This formula prints how much money is missing (price - current balance)
                break;
            }
            cigarette1.setTotalSum(customer1.menuChoice-1);     //Updates the total sum after price list
            cigarette1.setShoppingCart(cigarette1.cigarettes[customer1.menuChoice-1]); //Updates shopping list
            customer1.currentWalletBalance = (customer1.currentWalletBalance - cigarette1.priceCigarettes[customer1.menuChoice-1]); //Reduces the value of wallet
                }
        }
}
