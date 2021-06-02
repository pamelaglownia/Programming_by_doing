package pl.glownia.pamela.addressbook;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Address implements Serializable {
    String firstName;
    String lastName;
    String phoneNumber;
    String email;

    public Address(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return firstName +
                " " + lastName +
                " " + phoneNumber +
                " " + email;

    }
}

public class AddressBook implements Serializable {
    static ArrayList<Address> addressBookArrayList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String fileName = "addressbook.txt";


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        displayMenu();
        int userInput;
        do {
            System.out.print("\nChoose what you would like to do with the databases: ");
            userInput = scan.nextInt();
            chooseOption(userInput);
        } while (userInput != 8);
    }

    public static void displayMenu() {
        System.out.println("1) Load from file \n2) Save to file \n3) Add an entry \n4) Remove an entry \n" +
                "5) Edit an existing entry \n6) Sort the address book \n7) Search for a specific entry \n8) Quit");
    }

    public static void chooseOption(int userInput) throws IOException, ClassNotFoundException {

        if (userInput == 1) {
            loadFromFile();
            displayArrayList();
        } else if (userInput == 2) {
            saveToFile();
        } else if (userInput == 3) {
            addressBookArrayList = addEntry();
            displayArrayList();
        } else if (userInput == 4) {
            addressBookArrayList = removeEntry();
            displayArrayList();
        } else if (userInput == 5) {
            System.out.println("Editing...");
        } else if (userInput == 6) {
            System.out.println("Sorting...");
        } else if (userInput == 7) {
            System.out.println("Searching...");
        } else if (userInput == 8) {
            System.out.println("Goodbye!");
        } else {
            System.out.println("Incorrect value. Enter a option from 1 to 8.");
        }
    }

    public static void loadFromFile() throws IOException, ClassNotFoundException {
        ObjectInputStream load = new ObjectInputStream(new FileInputStream(fileName));
        addressBookArrayList = (ArrayList<Address>) load.readObject();
        load.close();
    }

    public static void saveToFile() throws IOException {
        FileOutputStream save = new FileOutputStream(fileName);
        ObjectOutputStream write = new ObjectOutputStream(save);
        write.writeObject(addressBookArrayList);
        write.close();
        System.out.println("Data are stored in " + fileName);
    }

    public static ArrayList<Address> addEntry() {
        System.out.print("Enter your first name:");
        String firstName = scan.next();
        System.out.print("Enter your last name:");
        String lastName = scan.next();
        System.out.print("Enter your phone number:");
        String phoneNumber = scan.next();
        System.out.print("Enter your email:");
        String email = scan.next();
        addressBookArrayList.add(new Address(firstName, lastName, phoneNumber, email));
        System.out.println("Your data are added.\n");
        return addressBookArrayList;
    }

    public static ArrayList<Address> removeEntry() throws IOException, ClassNotFoundException {
        System.out.println("Choose item to remove:");
        for (int i = 0; i < addressBookArrayList.size(); i++) {
            System.out.println(i + ") " + addressBookArrayList.get(i));
        }
        int numberOfIndex = scan.nextInt();
        while (numberOfIndex < 0 || numberOfIndex > addressBookArrayList.size()) {
            System.out.println("Incorrect input. Choose item to remove:");
            numberOfIndex = scan.nextInt();
        }
        if (fileName.length() != 0) {
            loadFromFile();
            for (int i = 0; i < addressBookArrayList.size(); i++) {
                if (i == numberOfIndex) {
                    addressBookArrayList.remove(i);
                }
            }
            saveToFile();
        } else {
            for (int i = 0; i < addressBookArrayList.size(); i++) {

                if (i == numberOfIndex) {
                    addressBookArrayList.remove(i);
                }
            }
        }
        System.out.println("Item was removed.");
        return addressBookArrayList;
    }

    public static void displayArrayList() {
        for (int i = 0; i < addressBookArrayList.size(); i++) {
            System.out.println(addressBookArrayList.get(i));
        }
    }
}