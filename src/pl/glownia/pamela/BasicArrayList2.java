package pl.glownia.pamela;

import java.util.ArrayList;
import java.util.Random;

public class BasicArrayList2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            int element = 1 + random.nextInt(99);
            numbers.add(element);
        }
        System.out.println("ArrayList: " + numbers);
    }
}