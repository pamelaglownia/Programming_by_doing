package pl.glownia.pamela;

import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        String[] fruitWords = {"cranberry", "watermelon", "orange", "pineapple", "strawberry", "grapefruit"};
        String randomWord = getRandomWord(fruitWords);
        char[] charArray = randomWord.toCharArray();
        int tries = 0;
        char guess;
        char[] hiddenWord = hideWord(charArray);
        char[] supportArray = new char[randomWord.length()];
        char[] misses = hideMissedLetters(supportArray);

        while (tries < randomWord.length()) {
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.print("Word: ");
            System.out.println(new String(hiddenWord));
            System.out.print("Misses: ");
            System.out.println(new String(misses));
            guess = userGuess();
            checkLetter(randomWord, hiddenWord, guess);
            tries = addMissingLetter(randomWord, guess, misses, tries);
        }
    }

    public static char[] hideWord(char[] charArray) {
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = '-';
        }
        return charArray;
    }

    public static char[] hideMissedLetters(char[] supportArray) {
        for (int i = 0; i < supportArray.length; i++) {
            supportArray[i] = ' ';
        }
        return supportArray;
    }

    public static String getRandomWord(String[] array) {
        Random random = new Random();
        int randomIndex = random.nextInt(6);
        String randomWord = array[randomIndex];
        System.out.println(randomWord);
        return randomWord;
    }

    public static char userGuess() {
        System.out.print("Guess: ");
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

    public static int addMissingLetter(String randomWord, char guess, char[] misses, int tries) {
        if (!(randomWord.contains(String.valueOf(guess)))) {
            misses[tries] = guess;
            tries += 1;
        }
        return tries;
    }
}