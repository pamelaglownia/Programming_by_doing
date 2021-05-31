package pl.glownia.pamela;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LocatingTheLargestValueInAnArrayList {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int element = 1 + random.nextInt(100);
            arrayList.add(element);
        }
        System.out.println("The ArrayList: " + arrayList);
        Integer max = Collections.max(arrayList);
        int indexOfMax = arrayList.indexOf(max);
        System.out.println("The largest value is " + max + ", which is in slot " + indexOfMax + ".");
    }
}