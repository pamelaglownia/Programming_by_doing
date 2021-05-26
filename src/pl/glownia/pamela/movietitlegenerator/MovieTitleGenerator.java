package pl.glownia.pamela.movietitlegenerator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MovieTitleGenerator {
    //random nouns and adjectives come from https://studentsandwriters.com/

    public static void main(String[] args) throws IOException {

        String[] adjectives = arrayFromFile("randomAdjectives.txt");
        String[] nouns = arrayFromFile("randomNouns.txt");
        int randomIndexOfAdjectives = (int) (Math.random() * adjectives.length);
        int randomIndexOfNouns = (int) (Math.random() * nouns.length);
        String randomNoun = nouns[randomIndexOfNouns];
        String randomAdjective = adjectives[randomIndexOfAdjectives];

        System.out.println("Mitchell's Random Movie Title Generator\n");
        System.out.print("Choosing randomly from " + adjectives.length + " adjectives ");
        System.out.println("and " + nouns.length + " nouns (" + (adjectives.length * nouns.length) + " combinations).");
        System.out.printf("Your movie title is: %S %S.", randomAdjective, randomNoun);
    }

    /**
     * @return An array of words, initialized from the given URL
     */
    public static String[] arrayFromFile(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String[] words = new String[520];
        int count = 0;
        while ((line = bufferedReader.readLine()) != null) {
            words[count] = line;
            count++;
        }
        bufferedReader.close();
        return words;
    }
}