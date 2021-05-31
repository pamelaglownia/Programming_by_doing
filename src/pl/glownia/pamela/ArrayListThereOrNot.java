package pl.glownia.pamela;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayListThereOrNot {
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
        int count = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.contains(userInput)) {
                count += 1;
            }
        }
        if (count > 0) {
            System.out.println(userInput + " is in the ArrayList.");
        }
        else {
            System.out.println(userInput + " is not in the ArrayList.");

        }
    }
}