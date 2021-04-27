package pl.glownia.pamela;

import java.util.Random;

public class Dices {
    public static void main(String[] args) {

        Random r = new Random();
        int firstRoll = 1 + r.nextInt(6);
        int secondRoll = 1 + r.nextInt(6);
        System.out.println("Welcome to dice roller. We will generate for you 2 numbers. ");
        System.out.println("Roll 1: " + firstRoll);
        System.out.println("Roll 2: " + secondRoll);
        System.out.println("The total is: " + (firstRoll + secondRoll));
        while (firstRoll != secondRoll) {
            firstRoll = 1 + r.nextInt(6);
            secondRoll = 1 + r.nextInt(6);
            System.out.println("\nRoll 1: " + firstRoll);
            System.out.println("Roll 2: " + secondRoll);
            System.out.println("The total is: " + (firstRoll + secondRoll));
        }
        System.out.println("You got doubles!");
    }
}

