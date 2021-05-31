package pl.glownia.pamela;

import java.util.*;

public class GettingTheLargestValueInTheArrayList {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int element = 1 + random.nextInt(100);
            arrayList.add(element);
        }
        System.out.println("ArrayList: " + arrayList);
        Integer max = Collections.max(arrayList);
        System.out.println("\nThe largest value is: " + max);
    }
}