package pl.glownia.pamela;

import java.util.Locale;
import java.util.Scanner;

public class KeychainsForSale {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userChoice;
        int currentNumbersOfKeychains = 0;
        double price = 10.00;
        double tax = 8.25;
        double shipping = 5.00;
        double additionalShippingCost = 1.00;
        displayWelcomeMessage();
        do {
            System.out.println("\n1. Add keychain to order \n2. Remove keychain from order \n3. View current order \n4. Checkout");
            System.out.print("Please, enter your choice: ");
            userChoice = scan.nextInt();
            while(!(userChoice==1 || userChoice ==2 || userChoice ==3 || userChoice ==4)){
                System.out.println("Your choice isn't correct.");
                System.out.println("1. Add keychain to order \n2. Remove keychain from order \n3. View current order \n4. Checkout");
                System.out.print("Please, enter your choice: ");
                userChoice = scan.nextInt();
            }            System.out.println();
            if (userChoice == 1) {
                currentNumbersOfKeychains = add_keychains(currentNumbersOfKeychains);
            } else if (userChoice == 2) {
                currentNumbersOfKeychains = remove_keychains(currentNumbersOfKeychains);
            } else if (userChoice == 3) {
                view_order(currentNumbersOfKeychains, price, tax, shipping, additionalShippingCost);
            }
        }
        while (userChoice != 4);
        checkout(currentNumbersOfKeychains, price, tax, shipping, additionalShippingCost);
    }

    public static void displayWelcomeMessage() {
        System.out.println("Welcome to our keychains store.\nWhat would you like to do?");
    }

    public static int add_keychains(int currentNumbersOfKeychains) {
        Scanner scan = new Scanner(System.in);
        System.out.print("You have " + currentNumbersOfKeychains + " keys. How many to add? ");
        int addKeychain = scan.nextInt();
        while (addKeychain < 0) {
            System.out.println("Number has to be positive. Try again: ");
            addKeychain = scan.nextInt();
        }
        currentNumbersOfKeychains += addKeychain;
        System.out.println("You have " + currentNumbersOfKeychains + " keys now.");
        return currentNumbersOfKeychains;
    }

    public static int remove_keychains(int currentNumbersOfKeychains) {
        Scanner scan = new Scanner(System.in);
        System.out.print("You have " + currentNumbersOfKeychains + " keys. How many to remove? ");
        int removeKeychain = scan.nextInt();
        while (removeKeychain < 0) {
            System.out.println("Number has to be positive. Try again: ");
            removeKeychain = scan.nextInt();
        }
        while(removeKeychain >currentNumbersOfKeychains){
            System.out.print("You can't remove more keychains than you have. Enter correct number: ");
            removeKeychain = scan.nextInt();
        }
        currentNumbersOfKeychains -= removeKeychain;
        System.out.println("You have " + currentNumbersOfKeychains + " keys now.");
        return currentNumbersOfKeychains;
    }

    public static void view_order(int currentNumbersOfKeychains, double price, double tax, double shipping, double additionalShippingCost) {
        System.out.println("You have " + currentNumbersOfKeychains + " keys now.");
        System.out.println("Keychains cost $" + price + " each.");
        additionalShippingCost = currentNumbersOfKeychains -1;
        shipping += additionalShippingCost;
        System.out.println("The shipping cost is $" + shipping);
        double total = currentNumbersOfKeychains * price + shipping;
        System.out.println("Subtotal cost (before tax) is $" + total + ".");
        tax = tax/100 * total;
        System.out.println("The tax on the order is $" + String.format(Locale.UK, "%.2f", tax));
        total += tax;
        System.out.println("Total cost is $" + String.format(Locale.UK, "%.2f", total) + ".");
    }

    public static void checkout(int currentNumbersOfKeychains, double price, double tax, double shipping, double additionalShippingCost) {
        Scanner scan = new Scanner(System.in);
        System.out.println("*** CHECKOUT ***\n");
        System.out.print("What is your name? ");
        String name = scan.next();
        view_order(currentNumbersOfKeychains, price, tax, shipping, additionalShippingCost);
        System.out.println("Thanks for your order, " + name + "!");
    }
}