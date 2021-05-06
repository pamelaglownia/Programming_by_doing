package pl.glownia.pamela;

import java.util.Random;
import java.util.Scanner;

public class Blackjack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-+-+-+-+-+-+-+-+-+-+-");
        System.out.println("Welcome to Blackjack!");
        System.out.println("-+-+-+-+-+-+-+-+-+-+-\n");
        Random random = new Random();
        int userCardOne = 2 + random.nextInt(10);
        int userCardTwo = 2 + random.nextInt(10);
        int userNextCard;
        System.out.println("I have two cards for you: " + userCardOne + " and " + userCardTwo + ".");
        int userSum = userCardOne + userCardTwo;
        System.out.println("Your sum is " + userSum + ".");
        if (userSum > 21) {
            System.out.println("Dealer WINS.");
        }
        else if (userSum == 21) {
            System.out.println("You WIN.");
        }
        else {
            int dealerCardOne = 2 + random.nextInt(10);
            int dealerCardTwo = 2 + random.nextInt(10);
            int dealerSum = dealerCardOne + dealerCardTwo;
            int dealerNextCard;
            System.out.println("\nOne of the dealer's cards is: " + dealerCardOne + ". Second card is hidden.");
            System.out.println("\nWould you like to [hit] or [stay]?");
            String userTakesCard = scanner.next();
            while (!(userTakesCard.equalsIgnoreCase("hit") || userTakesCard.equalsIgnoreCase("stay"))) {
                System.out.println("Incorrect input. Choose one option: [hit] or [stay]");
                userTakesCard = scanner.next();
            }
            while (userTakesCard.equalsIgnoreCase("hit") && userSum <= 21) {
                userNextCard = 2 + random.nextInt(10);
                userSum += userNextCard;
                System.out.println("Your next card: " + userNextCard);
                System.out.println("Your sum is: " + userSum);
                if (userSum > 21) {
                    System.out.println("Dealer WINS.");
                }
                else if (userSum == 21) {
                    System.out.println("You WIN");
                }
                else {
                    System.out.println("\nWould you like to take next card [hit] or [stay]?");
                    userTakesCard = scanner.next();
                    while (!(userTakesCard.equalsIgnoreCase("hit") || userTakesCard.equalsIgnoreCase("stay"))) {
                        System.out.println("Incorrect input. Choose one option: [hit] or [stay]");
                        userTakesCard = scanner.next();
                    }
                }
            }
            if (userTakesCard.equalsIgnoreCase("stay")) {
                System.out.println("\nSo, dealer's turn.");
                System.out.println("\nHidden card was: " + dealerCardTwo);
                System.out.println("The dealer's sum is: " + dealerSum);
                while (dealerSum <= 16) {
                    dealerNextCard = 2 + random.nextInt(10);
                    System.out.println("\nThe dealer's next card is: " + dealerNextCard);
                    dealerSum += dealerNextCard;
                    System.out.println("The dealer's sum is: " + dealerSum);
                }
                if (dealerSum > 21) {
                    System.out.println("You WIN.");
                }
                if (dealerSum <= 21) {
                    System.out.println("\nDealer stays.");
                    System.out.println("\nDealer's sum is: " + dealerSum);
                    System.out.println("Your sum is: " + userSum);
                    if (dealerSum > userSum) {
                        System.out.println("Dealer WINS.");
                    }
                    else if (dealerSum < userSum) {
                        System.out.println("You WIN.");
                    }
                    else {
                        System.out.println("Draw.");
                    }
                }
            }
        }
    }
}
