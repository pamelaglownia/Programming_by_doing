package pl.glownia.pamela;

import java.util.Scanner;

public class KeychainsForSale {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userChoice;
        displayWelcomeMessage();
        do {
            System.out.println("1. Add keychain to order \n2. Remove keychain from order \n3. View current order \n4. Checkout");
            System.out.print("Please, enter your choice: ");
            userChoice = scan.nextInt();
            System.out.println();
            if (userChoice == 1) {
                add_keychains();
            }
            else if (userChoice == 2) {
                remove_keychains();
            }
            else if (userChoice == 3) {
                view_order();
            }
        }
        while (userChoice != 4);
        checkout();
    }

    public static void displayWelcomeMessage() {
        System.out.println("Welcome to our keychains store.\nWhat would you like to do?\n");
    }

    public static void add_keychains() {
        System.out.println("*** Add keychain ***\n");
    }

    public static void remove_keychains() {
        System.out.println("*** Remove keychain ***\n");
    }

    public static void view_order() {
        System.out.println("*** View of your current order ***\n");
    }

    public static void checkout() {
        System.out.println("*** CHECKOUT ***\n");
    }
}