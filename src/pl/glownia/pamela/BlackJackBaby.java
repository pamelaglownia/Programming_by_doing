package pl.glownia.pamela;

import java.util.Random;

public class BlackJackBaby {
    public static void main(String[] args) {
        System.out.println("Welcome to Blackjack (version: baby)!");
        System.out.println("Both you and dealer have two cards. Cards with bigger sum will win.");
        Random random = new Random();
        int userCardOne = 1 + random.nextInt(10);
        int userCardTwo = 1 + random.nextInt(10);
        System.out.println("\nYour cards: " + userCardOne + " and " + userCardTwo + ".");
        int userSum = userCardOne + userCardTwo;
        System.out.println("Your sum is " + userSum + ".");
        int dealerCardOne = 1 + random.nextInt(10);
        int dealerCardTwo = 1 + random.nextInt(10);
        System.out.println("\nThe dealer's cards: " + dealerCardOne + " and " + dealerCardTwo + ".");
        int dealerSum = dealerCardOne + dealerCardTwo;
        System.out.println("The dealer's sum is " + dealerSum + ".");
        if (userSum > dealerSum) {
            System.out.println("\nYou WIN!");
        } else if (userSum < dealerSum) {
            System.out.println("\nYou lose...");
        } else {
            System.out.println("\nDraw.");
        }
    }
}

