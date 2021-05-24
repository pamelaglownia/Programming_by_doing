package pl.glownia.pamela;

import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        String[] fruitWords = {"cranberry", "watermelon", "orange", "pineapple", "strawberry", "grapefruit"};
        String randomWord = getRandomWord(fruitWords);
        char[] charArray = randomWord.toCharArray();

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.print("Word: ");
        hideWord(charArray);
        System.out.print("\nMisses: ");
        char guess = userGuess();

    }


    public static void hideWord(char[] charArray) {
        for (int i = 0; i < charArray.length; i++) {

            charArray[i] = '-';
            System.out.print(charArray[i]);
        }
    }

    public static String getRandomWord(String[] array) {
        Random random = new Random();
        int randomIndex = random.nextInt(6);
        String randomWord = array[randomIndex];
        System.out.println(randomWord);
        return randomWord;
    }

    public static char userGuess() {
        System.out.print("\nGuess: ");
        Scanner scan = new Scanner(System.in);
        char guess = scan.next().charAt(0);
        System.out.println(guess);
        return guess;
    }
}