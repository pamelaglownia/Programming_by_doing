package pl.glownia.pamela;

import java.util.Scanner;

public class Nim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstPile = 3;
        int secondPile = 4;
        int thirdPile = 5;
        int number;
        int sum;
        String userInput;
        String winner = "";
        System.out.println("Welcome to Nim game.There are 3 piles with matches.");
        System.out.print("Player 1, enter your name: ");
        String playerOne = scan.next();
        System.out.print("Player 2, enter your name: ");
        String playerTwo = scan.next();
        while (!(firstPile == 0 && secondPile == 0 && thirdPile == 0)) {
            sum = firstPile + secondPile + thirdPile;
            if (sum == 1) {
                winner = playerTwo;
            }
            if (sum > 0) {
                System.out.println("A: " + firstPile + "\tB: " + secondPile + "\tC: " + thirdPile);
                System.out.print(playerOne + ", choose the pile: ");
                userInput = scan.next();
                while (!(userInput.equalsIgnoreCase("A")) && !(userInput.equalsIgnoreCase("B")) && !(userInput.equalsIgnoreCase("C"))) {
                    System.out.print("Incorrect value. Choose one of the piles [A, B or C]: ");
                    userInput = scan.next();
                }
                System.out.print("How many matches remove from pile " + userInput.toUpperCase() + ": ");
                number = scan.nextInt();
                if (userInput.equalsIgnoreCase("A")) {
                    firstPile -= number;
                    sum -= number;
                }
                else if (userInput.equalsIgnoreCase("B")) {
                    secondPile -= number;
                    sum -= number;
                }
                else if (userInput.equalsIgnoreCase("C")) {
                    thirdPile -= number;
                    sum -= number;
                }
            }
            if (sum == 1) {
                winner = playerOne;
            }
            if (sum > 0) {
                System.out.println("A: " + firstPile + "\tB: " + secondPile + "\tC: " + thirdPile);
                System.out.print(playerTwo + ", choose the pile: ");
                userInput = scan.next();
                while (!(userInput.equalsIgnoreCase("A")) && !(userInput.equalsIgnoreCase("B")) && !(userInput.equalsIgnoreCase("C"))) {
                    System.out.print("Incorrect value. Choose one of the piles [A, B or C]: ");
                    userInput = scan.next();
                }
                System.out.print("How many matches remove from pile " + userInput.toUpperCase() + ": ");
                number = scan.nextInt();
                if (userInput.equalsIgnoreCase("A")) {
                    firstPile -= number;
                    sum -= number;
                }
                else if (userInput.equalsIgnoreCase("B")) {
                    secondPile -= number;
                    sum -= number;
                }
                else if (userInput.equalsIgnoreCase("C")) {
                    thirdPile -= number;
                    sum -= number;
                }
            }
        }
        System.out.println("\nA: " + firstPile + "\tB: " + secondPile + "\tC: " + thirdPile);
        System.out.println(winner + " you are the winner!");
    }
}