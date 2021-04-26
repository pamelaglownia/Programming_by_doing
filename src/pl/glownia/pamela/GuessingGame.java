package pl.glownia.pamela;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int myNumber = 1 + random.nextInt(10);
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess number from 1 to 10:");
        int userGuess = scan.nextInt();
        if (userGuess < 1 || userGuess > 10) {
            System.out.println("You can choose number from 0 to 10.");
        }
        while (userGuess != myNumber) {
            if (userGuess < myNumber) {
                System.out.println("My number is greater than your guess.");
            }
            if (userGuess > myNumber) {
                System.out.println("My number is lower than your guess.");
            }
            System.out.println("Try again: ");
            userGuess = scan.nextInt();
        }
        System.out.println("Winner!");
    }
}
