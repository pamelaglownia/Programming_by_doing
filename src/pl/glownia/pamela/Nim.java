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
        while (!(firstPile <= 1 && secondPile <= 1 && thirdPile <= 1)) {
            sum = firstPile + secondPile + thirdPile;
            if (sum == 1) {
                winner = playerTwo;
                System.out.println("\nA: " + firstPile + "\tB: " + secondPile + "\tC: " + thirdPile);
                System.out.println(playerOne + ", you have to take last remaining match.");
            }
            if (sum > 1) {
                System.out.println("A: " + firstPile + "\tB: " + secondPile + "\tC: " + thirdPile);
                System.out.print(playerOne + ", choose the pile: ");
                userInput = scan.next();
                while (!(userInput.equalsIgnoreCase("A")) && !(userInput.equalsIgnoreCase("B")) && !(userInput.equalsIgnoreCase("C"))) {
                    System.out.print("Incorrect value. Choose one of the piles [A, B or C]: ");
                    userInput = scan.next();
                }
                while (firstPile == 0 && userInput.equalsIgnoreCase("A")) {
                    System.out.println("Nice try. Pile A is empty. Choose another: ");
                    userInput = scan.next();
                }
                while (secondPile == 0 && userInput.equalsIgnoreCase("B")) {
                    System.out.println("Nice try. Pile B is empty. Choose another: ");
                    userInput = scan.next();
                }
                while (thirdPile == 0 && userInput.equalsIgnoreCase("C")) {
                    System.out.println("Nice try. Pile C is empty. Choose another: ");
                    userInput = scan.next();
                }
                System.out.print("How many matches remove from pile " + userInput.toUpperCase() + ": ");
                number = scan.nextInt();
                if (userInput.equalsIgnoreCase("A")) {
                    while (number <= 0) {
                        System.out.print("You have to choose at least 1 match. Try again: ");
                        number = scan.nextInt();
                    }
                    while (number > firstPile) {
                        System.out.print("Pile A doesn't have that many. Try again: ");
                        number = scan.nextInt();
                    }
                    firstPile -= number;
                    sum -= number;
                }
                else if (userInput.equalsIgnoreCase("B")) {
                    while (number <= 0) {
                        System.out.print("You have to choose at least 1 match. Try again: ");
                        number = scan.nextInt();
                    }
                    while (number > secondPile) {
                        System.out.print("Pile B doesn't have that many. Try again: ");
                        number = scan.nextInt();
                    }
                    secondPile -= number;
                    sum -= number;
                }
                else if (userInput.equalsIgnoreCase("C")) {
                    while (number <= 0) {
                        System.out.print("You have to choose at least 1 match. Try again: ");
                        number = scan.nextInt();
                    }
                    while (number > thirdPile) {
                        System.out.print("Pile C doesn't have that many. Try again: ");
                        number = scan.nextInt();
                    }
                    thirdPile -= number;
                    sum -= number;
                }
            }
            if (sum == 1) {
                winner = playerOne;
                System.out.println("\nA: " + firstPile + "\tB: " + secondPile + "\tC: " + thirdPile);
                System.out.println(playerTwo + ", you have to take last remaining match.");
            }
            if (sum > 1) {
                System.out.println("A: " + firstPile + "\tB: " + secondPile + "\tC: " + thirdPile);
                System.out.print(playerTwo + ", choose the pile: ");
                userInput = scan.next();
                while (!(userInput.equalsIgnoreCase("A")) && !(userInput.equalsIgnoreCase("B")) && !(userInput.equalsIgnoreCase("C"))) {
                    System.out.print("Incorrect value. Choose one of the piles [A, B or C]: ");
                    userInput = scan.next();
                }
                while (firstPile == 0 && userInput.equalsIgnoreCase("A")) {
                    System.out.println("Nice try. Pile A is empty. Choose another: ");
                    userInput = scan.next();
                }
                while (secondPile == 0 && userInput.equalsIgnoreCase("B")) {
                    System.out.println("Nice try. Pile B is empty. Choose another: ");
                    userInput = scan.next();
                }
                while (thirdPile == 0 && userInput.equalsIgnoreCase("C")) {
                    System.out.println("Nice try. Pile C is empty. Choose another: ");
                    userInput = scan.next();
                }
                System.out.print("How many matches remove from pile " + userInput.toUpperCase() + ": ");
                number = scan.nextInt();
                if (userInput.equalsIgnoreCase("A")) {
                    while (number <= 0) {
                        System.out.print("You have to choose at least 1 match. Try again: ");
                        number = scan.nextInt();
                    }
                    while (number > firstPile) {
                        System.out.print("Pile A doesn't have that many. Try again: ");
                        number = scan.nextInt();
                    }
                    firstPile -= number;
                    sum -= number;
                }
                else if (userInput.equalsIgnoreCase("B")) {
                    while (number <= 0) {
                        System.out.print("You have to choose at least 1 match. Try again: ");
                        number = scan.nextInt();
                    }
                    while (number > secondPile) {
                        System.out.print("Pile B doesn't have that many. Try again: ");
                        number = scan.nextInt();
                    }
                    secondPile -= number;
                    sum -= number;
                }
                else if (userInput.equalsIgnoreCase("C")) {
                    while (number <= 0) {
                        System.out.print("You have to choose at least 1 match. Try again: ");
                        number = scan.nextInt();
                    }
                    while (number > thirdPile) {
                        System.out.print("Pile C doesn't have that many. Try again: ");
                        number = scan.nextInt();
                    }
                    thirdPile -= number;
                    sum -= number;
                }
            }
        }
        System.out.print("So, " + winner + " you are the winner!");
    }
}