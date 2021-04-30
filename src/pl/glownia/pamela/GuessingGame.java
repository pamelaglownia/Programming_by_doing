package pl.glownia.pamela;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int myNumber = 1 + random.nextInt(100);
        int userGuess;
        int count = 0;
        System.out.println("I'm thinking of a number between 1-100. You have 7 guesses.");
        do {
            System.out.print("Your guess: ");
            userGuess = scan.nextInt();
            count++;
            if (userGuess != myNumber) {
                if (userGuess < 1 || userGuess > 100) {
                    System.out.println("You can choose number from 1 to 100.");
                }
                else if (userGuess < myNumber) {
                    System.out.println("My number is greater than your guess.");
                }
                else if (userGuess > myNumber) {
                    System.out.println("My number is lower than your guess.");
                }
            }
        } while (userGuess != myNumber && count < 7);
        if (userGuess == myNumber) {
            if (count == 1) {
                System.out.println("Winner! You needed " + count + " try.");
            }
            else {
                System.out.println("Winner! You needed " + count + " tries.");
            }
        }
        else {
            System.out.println("\nYou lose :(");
        }
    }
}