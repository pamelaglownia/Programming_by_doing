package pl.glownia.pamela.addressbook;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + phoneNumber + " " + email;
    }

    public static Comparator<Address> COMPARE_BY_FIRSTNAME = new Comparator<Address>() {
        @Override
        public int compare(Address one, Address next) {
            return one.firstName.compareToIgnoreCase(next.firstName);
        }
    };
    public static Comparator<Address> COMPARE_BY_LASTNAME = new Comparator<Address>() {
        @Override
        public int compare(Address one, Address next) {
            return one.lastName.compareToIgnoreCase(next.lastName);
        }
    };
    public static Comparator<Address> COMPARE_BY_PHONENUMBER = new Comparator<Address>() {
        @Override
        public int compare(Address one, Address next) {
            return one.phoneNumber.compareToIgnoreCase(next.phoneNumber);
        }
    };
    public static Comparator<Address> COMPARE_BY_EMAIL = new Comparator<Address>() {
        @Override
        public int compare(Address one, Address next) {
            return one.email.compareToIgnoreCase(next.email);
        }
    };
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
        } else if (userInput == 4) {
            addressBookArrayList = removeEntry();
        } else if (userInput == 5) {
            addressBookArrayList = editItem();
        } else if (userInput == 6) {
            addressBookArrayList = sortAddressBook();
        } else if (userInput == 7) {
            searchInAddressBook();
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
        System.out.print("Enter your first name: ");
        String firstName = scan.next();
        System.out.print("Enter your last name: ");
        String lastName = scan.next();
        System.out.print("Enter your phone number: ");
        String phoneNumber = scan.next();
        while (!(phoneNumber.matches("[0-9]+"))) {
            System.out.print("Phone number can contain only numbers. Enter your phone number: ");
            phoneNumber = scan.next();
        }
        System.out.print("Enter your email: ");
        String email = scan.next();
        while (!(email.matches("^(.+)@(.+)$"))) {
            System.out.print("Incorrect email address. Enter your email: ");
            email = scan.next();
        }
        addressBookArrayList.add(new Address(firstName, lastName, phoneNumber, email));
        System.out.println("Your data are added.\n");
        displayArrayList();
        return addressBookArrayList;
    }

    public static ArrayList<Address> removeEntry() throws IOException, ClassNotFoundException {
        System.out.print("Choose item to remove: ");
        for (int i = 0; i < addressBookArrayList.size(); i++) {
            System.out.println(i + ") " + addressBookArrayList.get(i));
        }
        int numberOfIndex = scan.nextInt();
        while (numberOfIndex < 0 || numberOfIndex > addressBookArrayList.size()) {
            System.out.print("Incorrect input. Choose item to remove: ");
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
        displayArrayList();
        return addressBookArrayList;
    }

    public static ArrayList<Address> editItem() throws IOException {
        displayArrayList();
        String newInput;
        System.out.print("Choose which data you would like to change (from 0 to " + (addressBookArrayList.size() - 1) + "): ");
        int indexToChange = scan.nextInt();
        while (indexToChange < 0 || indexToChange >= addressBookArrayList.size()) {
            System.out.print("Incorrect value. Choose number from 0 to " + (addressBookArrayList.size() - 1) + "): ");
            indexToChange = scan.nextInt();
        }
        System.out.println("1) First name, \n2) Last name, \n3) Phone number, \n4) Email");
        System.out.print("Choose one of fields above to edit: ");
        int fieldChoice = scan.nextInt();
        while (!(fieldChoice == 1 || fieldChoice == 2 || fieldChoice == 3 || fieldChoice == 4)) {
            System.out.println("Incorrect value. Choose number from 1 to 4: ");
            fieldChoice = scan.nextInt();
        }
        if (fieldChoice == 1) {
            System.out.print("Type new first name: ");
            newInput = scan.next();
            addressBookArrayList.get(indexToChange).setFirstName(newInput);
            System.out.println("Data was changed.");
        } else if (fieldChoice == 2) {
            System.out.print("Type new last name : ");
            newInput = scan.next();
            addressBookArrayList.get(indexToChange).setLastName(newInput);
            System.out.println("Data was changed.");
        } else if (fieldChoice == 3) {
            System.out.print("Type new phone number : ");
            newInput = scan.next();
            while (!(newInput.matches("[0-9]+"))) {
                System.out.print("Phone number can contain only numbers. Enter your phone number: ");
                newInput = scan.next();
            }
            addressBookArrayList.get(indexToChange).setPhoneNumber(newInput);
            System.out.println("Data was changed.");
        } else {
            System.out.print("Type new email: ");
            newInput = scan.next();
            while (!(newInput.matches("^(.+)@(.+)$"))) {
                System.out.print("Incorrect email address. Enter your email: ");
                newInput = scan.next();
            }
            addressBookArrayList.get(indexToChange).setEmail(newInput);
            System.out.println("Data was changed.");
        }
        saveToFile();
        return addressBookArrayList;
    }

    public static ArrayList<Address> sortAddressBook() {
        System.out.println("1) First name, \n2) Last name, \n3) Phone number, \n4) Email");
        System.out.print("Choose one of fields above to sort by it: ");
        int userChoice = scan.nextInt();
        if (userChoice == 1) {
            Collections.sort(addressBookArrayList, Address.COMPARE_BY_FIRSTNAME);
        } else if (userChoice == 2) {
            Collections.sort(addressBookArrayList, Address.COMPARE_BY_LASTNAME);

        } else if (userChoice == 3) {
            Collections.sort(addressBookArrayList, Address.COMPARE_BY_PHONENUMBER);

        } else {
            Collections.sort(addressBookArrayList, Address.COMPARE_BY_EMAIL);
        }
        displayArrayList();
        return addressBookArrayList;
    }

    public static void searchInAddressBook() {
        int searchingResult = 0;
        String searchingWord;
        System.out.println("1) First name, \n2) Last name, \n3) Phone number, \n4) Email");
        System.out.print("Choose one of searching fields above: ");
        int userChoice = scan.nextInt();
        while (!(userChoice == 1 || userChoice == 2 || userChoice == 3 || userChoice == 4)) {
            System.out.println("Incorrect value. Choose number from 1 to 4: ");
            userChoice = scan.nextInt();
        }
        if (userChoice == 1) {
            System.out.print("Type first name to search: ");
            searchingWord = scan.next();
            for (Address address : addressBookArrayList) {
                if (address.getFirstName().equalsIgnoreCase(searchingWord)) {
                    System.out.println("Data exists.");
                    System.out.println(address);
                    searchingResult += 1;
                }
            }
        } else if (userChoice == 2) {
            System.out.print("Type last name to search: ");
            searchingWord = scan.next();
            for (Address address : addressBookArrayList) {
                if (address.getLastName().equalsIgnoreCase(searchingWord)) {
                    System.out.println("Data exists.");
                    System.out.println(address);
                    searchingResult += 1;
                }
            }
        } else if (userChoice == 3) {
            System.out.print("Type phone number to search: ");
            searchingWord = scan.next();
            for (Address address : addressBookArrayList) {
                if (address.getPhoneNumber().equalsIgnoreCase(searchingWord)) {
                    System.out.println("Data exists.");
                    System.out.println(address);
                    searchingResult += 1;
                }
            }
        } else {
            System.out.print("Type email to search: ");
            searchingWord = scan.next();
            for (Address address : addressBookArrayList) {
                if (address.getEmail().equalsIgnoreCase(searchingWord)) {
                    System.out.println("Data exists.");
                    System.out.println(address);
                    searchingResult += 1;
                }
            }
        }
        if (searchingResult == 0) {
            System.out.println("Searching data doesn't exist.");
        }
    }


    public static void displayArrayList() {
        for (int i = 0; i < addressBookArrayList.size(); i++) {
            System.out.println(i + ") " + addressBookArrayList.get(i));
        }
    }
}