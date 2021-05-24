package pl.glownia.pamela;

import java.util.Random;

public class Hangman {
    public static void main(String[] args) {
        String[] fruitWords = {"cranberry", "watermelon", "orange", "pineapple", "strawberry", "grapefruit"};
        String randomWord = getRandomWord(fruitWords);
        char[] charArray = randomWord.toCharArray();

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.print("Word: ");
        hideLetters(charArray);
        System.out.print("\nMisses: ");
    }

    public static void hideLetters(char[] charArray) {
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = '-';
            System.out.print(charArray[i]);
        }
    }

    public static String getRandomWord(String[] array) {
        Random random = new Random();
        int randomIndex = random.nextInt(6);
        String randomWord = array[randomIndex];
        //to check if hidden word has the same letters quantity
        System.out.println(randomWord);
        return randomWord;
    }
}