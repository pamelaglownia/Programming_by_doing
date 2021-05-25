package pl.glownia.pamela;

import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        String[] fruitWords = {"cranberry", "watermelon", "orange", "pineapple", "strawberry", "grapefruit"};
        String randomWord = getRandomWord(fruitWords);
        char[] charArrayToHide = randomWord.toCharArray();
        int tries = 0;
        int remainingLetters = randomWord.length();
        char guess;
        char[] hiddenWord = hideWord(charArrayToHide);
        char[] supportArray = new char[randomWord.length()];
        char[] misses = hideMissedLetters(supportArray);
        while (remainingLetters > 0 && tries < randomWord.length()) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.print("Word: ");
            System.out.println(new String(hiddenWord));
            System.out.print("Misses: ");
            System.out.println(new String(misses));
            guess = userGuess();
            remainingLetters = checkLetter(randomWord, hiddenWord, guess, remainingLetters);
            tries = addMissingLetter(randomWord, guess, misses, tries);
        }
        if (remainingLetters == 0) {
            System.out.println(randomWord);
            System.out.println("You WIN!");
        } else {
            System.out.println("You loose. The correct word was " + randomWord + ".");
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
        return array[randomIndex];
    }

    public static char userGuess() {
        System.out.print("Guess: ");
        Scanner scan = new Scanner(System.in);
        return scan.next().charAt(0);
    }

    public static int checkLetter(String randomWord, char[] hiddenWord, char guess, int remainingLetters) {
        for (int i = 0; i < randomWord.length(); i++) {
            if (randomWord.charAt(i) == guess) {
                hiddenWord[i] = guess;
                remainingLetters -= 1;
            }
        }
        return remainingLetters;
    }

    public static int addMissingLetter(String randomWord, char guess, char[] misses, int tries) {
        if (!(randomWord.contains(String.valueOf(guess)))) {
            misses[tries] = guess;
            tries += 1;
        }
        return tries;
    }
}