package pl.glownia.pamela;

import java.util.Random;

public class Hangman {
    public static void main(String[] args) {
        String[] fruitWords = {"cranberry", "watermelon", "orange", "pineapple", "strawberry", "grapefruit"};
        String randomWord = getRandomWord(fruitWords);
    }

    public static String getRandomWord(String[] array) {
        Random random = new Random();
        int randomIndex = random.nextInt(6);
        String randomWord = array[randomIndex];
        System.out.println(randomWord);
        return randomWord;
    }
}
