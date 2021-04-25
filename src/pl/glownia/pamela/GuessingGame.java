package pl.glownia.pamela;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess number from 1 to 10:");
        int userGuess = scan.nextInt();
        guessing(userGuess);
    }

    static void guessing(int guess) {
        Random random = new Random();
        int myNumber = 1 + random.nextInt(10);
        if(guess <0 || guess > 10){
            System.out.println("Invalid input. You can choose number from 1 to 10.");
        }
        else {
            if (guess == myNumber) {
                System.out.println("WINNER!");
            } else {
                System.out.println("Oh no! The correct number was " + myNumber + ".");
            }
        }
    }
}
