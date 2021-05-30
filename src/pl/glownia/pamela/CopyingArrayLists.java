package pl.glownia.pamela;

import java.util.ArrayList;
import java.util.Random;

public class CopyingArrayLists {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int element = 1 + random.nextInt(99);
            numbers.add(element);
        }

        ArrayList<Integer> copiedArrayList = new ArrayList<>();
        copiedArrayList.addAll(numbers);

        numbers.set((numbers.size() - 1), -7);

        System.out.println("ArrayList 1 : " + numbers);
        System.out.println("ArrayList 2 : " + copiedArrayList);
    }
}