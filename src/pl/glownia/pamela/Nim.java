package pl.glownia.pamela;

import java.util.Scanner;

public class Nim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstPile = 3;
        int secondPile = 3;
        int thirdPile = 3;
        System.out.println("Welcome to Nim game.There are 3 piles with matches.");
        while (!(firstPile <= 0 && secondPile <= 0 && thirdPile <= 0)) {
            System.out.println("A: " + firstPile + "\tB: " + secondPile + "\tC: " + thirdPile);
            System.out.print("Choose the pile: ");
            String userInput = scan.next();
            while (!(userInput.equalsIgnoreCase("A")) && !(userInput.equalsIgnoreCase("B")) && !(userInput.equalsIgnoreCase("C"))) {
                System.out.print("Incorrect value. Choose one of the piles [A, B or C]: ");
                userInput = scan.next();
            }
            System.out.print("How many matches remove from pile " + userInput.toUpperCase() + ": ");
            int number = scan.nextInt();
            if (userInput.equalsIgnoreCase("A")) {
                firstPile -= number;
            }
            else if (userInput.equalsIgnoreCase("B")) {
                secondPile -= number;
            }
            else if (userInput.equalsIgnoreCase("C")) {
                thirdPile -= number;
            }
        }
        System.out.println("A: " + firstPile + "\tB: " + secondPile + "\tC: " + thirdPile);
        System.out.println("All piles are empty. Good job!");
    }
}
