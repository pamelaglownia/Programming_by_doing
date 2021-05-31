package pl.glownia.pamela;

import java.util.*;

public class SortingSentences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sentence: ");
        String sentence = scanner.nextLine();
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        Collections.sort(stringArrayList);
        System.out.println("Sorted: " + stringArrayList);
    }
}