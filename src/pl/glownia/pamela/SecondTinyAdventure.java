package pl.glownia.pamela;

import java.util.Scanner;

public class SecondTinyAdventure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option = 1;
        String answer;
        System.out.println("Welcome to another tiny adventure!");
        while (option != 0) {
            if (option == 1) {
                System.out.println("You are in the hall. Do you want to go to \"kitchen\", to \"office\" or to the \"garden\"? ");
                answer = scan.next();
                if (answer.equalsIgnoreCase("kitchen")) {
                    option = 2;
                }
                else if (answer.equalsIgnoreCase("office")) {
                    option = 3;
                }
                else if (answer.equalsIgnoreCase("garden")) {
                    option = 4;
                }
                else {
                    System.out.println("Your answer is not correct. Enter your answer again: ");
                }
            }
            if (option == 2) {
                System.out.println("You are in the kitchen. Do you want to look for some food in the \"fridge\" or go \"back\" to the hall?");
                answer = scan.next();
                if (answer.equalsIgnoreCase("fridge")) {
                    System.out.println("Look! There is some food. Not so fresh, but it looks edible... If you are hungry, you can eat something.");
                    option = 0;
                }
                else if (answer.equalsIgnoreCase("back")) {
                    option = 1;
                }
                else {
                    System.out.println("Your answer is not correct. Enter your answer again: ");
                }
            }
            if (option == 3) {
                System.out.println("You are in the office.Look around, there is a lot of books. Would you like to \"read\" one or \"back\" to the hall ?");
                answer = scan.next();
                if (answer.equalsIgnoreCase("read")) {
                    System.out.println("This one you picked is very interesting. Enjoy your time!");
                    option = 0;
                }
                else if (answer.equalsIgnoreCase("back")) {
                    option = 1;
                }
                else {
                    System.out.println("Your answer is not correct. Enter your answer again: ");
                }
            }
            if (option == 4) {
                System.out.println("You are in the garden. Would you like to \"swing\" or go \"back\" to house?");
                answer = scan.next();
                if (answer.equalsIgnoreCase("swing")) {
                    System.out.println("Ehh... This swing is broken. I think you should go back.");
                    option = 0;
                }
                else if (answer.equalsIgnoreCase("back")) {
                    option = 1;
                }
                else {
                    System.out.println("Your answer is not correct. Enter your answer again: ");
                }
            }
        }
        System.out.println("\n.....\nIt is the end of your tiny adventure. I hope you liked it.");
    }
}