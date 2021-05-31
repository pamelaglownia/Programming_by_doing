package pl.glownia.pamela;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SortingAnArrayList {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int element = 10 + random.nextInt(90);
            arrayList.add(element);
        }

        System.out.println("ArrayList before: " + arrayList);
        Collections.sort(arrayList);
        System.out.println("ArrayList after: " + arrayList);
    }
}