package pl.glownia.pamela;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int myNumber = 1 + random.nextInt(100);
        Scanner scan = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1-100. You have 7 guesses.");
        System.out.print("First guess: ");
        int userGuess = scan.nextInt();
        int count = 1;
        if (userGuess < 1 || userGuess > 100) {
            System.out.println("You can choose number from 1 to 100. PLay again.");
        }
        while (userGuess != myNumber && count < 7) {
            if (userGuess < myNumber) {
                System.out.println("My number is greater than your guess.");
            }
            if (userGuess > myNumber) {
                System.out.println("My number is lower than your guess.");
            }
            count++;
            System.out.print("\nGuess #" + count + ": ");
            userGuess = scan.nextInt();
        }
        if (userGuess == myNumber) {
            System.out.println("Winner! You needed " + count + " tries.");
        } else {
            System.out.println("You lose :(");
        }
    }
}