package pl.glownia.pamela;

import java.util.Scanner;

public class KeychainsForSale {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userChoice;
        int currentNumbersOfKeychains = 0;
        int price = 10;
        displayWelcomeMessage();
        do {
            System.out.println("\n1. Add keychain to order \n2. Remove keychain from order \n3. View current order \n4. Checkout");
            System.out.print("Please, enter your choice: ");
            userChoice = scan.nextInt();
            System.out.println();
            if (userChoice == 1) {
                currentNumbersOfKeychains = add_keychains(currentNumbersOfKeychains);
            }
            else if (userChoice == 2) {
                currentNumbersOfKeychains = remove_keychains(currentNumbersOfKeychains);
            }
            else if (userChoice == 3) {
                view_order(currentNumbersOfKeychains, price);
            }
        }
        while (userChoice != 4);
        checkout(currentNumbersOfKeychains, price);
    }

    public static void displayWelcomeMessage() {
        System.out.println("Welcome to our keychains store.\nWhat would you like to do?");
    }

    public static int add_keychains(int currentNumbersOfKeychains) {
        Scanner scan = new Scanner(System.in);
        System.out.print("You have " + currentNumbersOfKeychains + " keys. How many to add? ");
        int addKeychain = scan.nextInt();
        currentNumbersOfKeychains += addKeychain;
        System.out.println("You have " + currentNumbersOfKeychains + " keys now.");
        return currentNumbersOfKeychains;
    }

    public static int remove_keychains(int currentNumbersOfKeychains) {
        Scanner scan = new Scanner(System.in);
        System.out.print("You have " + currentNumbersOfKeychains + " keys. How many to remove? ");
        int removeKeychain = scan.nextInt();
        currentNumbersOfKeychains -= removeKeychain;
        System.out.println("You have " + currentNumbersOfKeychains + " keys now.");
        return currentNumbersOfKeychains;
    }

    public static void view_order(int currentNumbersOfKeychains, int price) {
        System.out.println("You have " + currentNumbersOfKeychains + " keys now.");
        System.out.println("Keychains cost $" + price + " each.");
        int total = currentNumbersOfKeychains * price;
        System.out.println("Total cost is $" + total + ".");
    }

    public static void checkout(int currentNumbersOfKeychains, int price) {
        Scanner scan = new Scanner(System.in);
        System.out.println("*** CHECKOUT ***\n");
        System.out.print("What is your name? ");
        String name = scan.next();
        view_order(currentNumbersOfKeychains, price);
        System.out.println("Thanks for your order, " + name + "!");
    }
}