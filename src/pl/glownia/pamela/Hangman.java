package pl.glownia.pamela;

import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        String[] fruitWords = {"cranberry", "watermelon", "orange", "pineapple", "strawberry", "grapefruit"};
        String randomWord = getRandomWord(fruitWords);
        char[] charArray = randomWord.toCharArray();
        int chances = 7;
        char guess;
        char[] hiddenWord = hideWord(charArray);
        while (chances >= 0) {
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.print("Word: ");
            System.out.println(new String(hiddenWord));
            System.out.print("Misses: ");
            guess = userGuess();
            checkLetter(randomWord, hiddenWord, guess);
            chances -= 1;
        }
    }

    public static char[] hideWord(char[] charArray) {
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = '-';
        }
        return charArray;
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
        return scan.next().charAt(0);
    }

    public static void checkLetter(String randomWord, char[] hiddenWord, char guess) {
        for (int i = 0; i < randomWord.length(); i++) {
            if (randomWord.charAt(i) == guess) {
                hiddenWord[i] = guess;
            }
        }
    }
}