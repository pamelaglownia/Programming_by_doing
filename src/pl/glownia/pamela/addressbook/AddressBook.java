package pl.glownia.pamela.addressbook;

import java.util.Scanner;

class Address {
    String firstName;
    String lastName;
    String phoneNumber;
    String email;
}

public class AddressBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        displayMenu();
        int userInput;
        do {
            System.out.print("\nChoose what you would like to do with the databases:");
            userInput = scan.nextInt();
            chooseOption(userInput);
        } while (userInput != 8);
    }

    public static void displayMenu() {
        System.out.println("1) Load from file \n2) Save to file \n3) Add an entry \n4) Remove an entry \n5) Edit an existing entry \n6) Sort the address book \n7) Search for a specific entry \n8) Quit");
    }

    public static void chooseOption(int userInput) {
        if (userInput == 1) {
            System.out.println("Loading...");
        }
        else if (userInput == 2) {
            System.out.println("Saving...");
        }
        else if (userInput == 3) {
            System.out.println("Adding...");
        }
        else if (userInput == 4) {
            System.out.println("Removing...");
        }
        else if (userInput == 5) {
            System.out.println("Editing...");
        }
        else if (userInput == 6) {
            System.out.println("Sorting...");
        }
        else if (userInput == 7) {
            System.out.println("Searching...");
        }
        else if (userInput == 8) {
            System.out.println("Goodbye!");
        }
        else {
            System.out.println("Incorrect value. Enter a option from 1 to 8.");
        }
    }
}