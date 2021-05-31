package pl.glownia.pamela;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FindingValueInAnArrayList {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int element = 1 + random.nextInt(50);
            arrayList.add(element);
        }
        System.out.println("ArrayList: " + arrayList);
        System.out.print("Value to find: ");
        int userInput = scan.nextInt();

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == userInput) {
                System.out.println(arrayList.get(i) + " is in the ArrayList.");
            }
        }
    }
}