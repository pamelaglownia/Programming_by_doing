package pl.glownia.pamela;

import java.util.Scanner;

public class TwoQuestions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("TWO QUESTIONS\n" +
                "Think of an object, and I'll try to guess it.");
        System.out.print("Question 1) Is it animal, vegetable, or thing? [type one of the options]\n> ");
        String firstAnswer = scan.next();
        System.out.print("Question 2) Is it bigger than a breadbox? [yes/no]\n> ");
        String secondAnswer = scan.next();
        askQuestion(firstAnswer, secondAnswer);
    }


    static void askQuestion(String firstAnswer, String secondAnswer) {
        if (firstAnswer.equalsIgnoreCase("animal")) {
            if (secondAnswer.equalsIgnoreCase("no")) {
                System.out.println("I think it's a mouse.");
            } else {
                System.out.println("I think it's a tiger.");
            }
        } else if (firstAnswer.equalsIgnoreCase("vegetable")) {
            if (secondAnswer.equalsIgnoreCase("no")) {
                System.out.println("I think it's an onion.");
            } else {
                System.out.println("I think it's a pumpkin.");
            }
        } else if (firstAnswer.equalsIgnoreCase("thing")) {
            if (secondAnswer.equalsIgnoreCase("no")) {
                System.out.println("I think it's a pencil");
            } else {
                System.out.println("I think it's a printer.");
            }
        } else {
            System.out.println("You have provided invalid input. Try again.");
        }
    }
}

