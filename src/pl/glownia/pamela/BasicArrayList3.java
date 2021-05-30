package pl.glownia.pamela;

import java.util.ArrayList;
import java.util.Random;

public class BasicArrayList3 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 999; i++) {
            int element = 10 + random.nextInt(89);
            numbers.add(element);
        }
        System.out.println("ArrayList: ");
        for (int i = 0; i < numbers.size(); i++) {
            if (i == 999) {
                System.out.print(numbers.get(i));
            }
            else if ((i + 1) % 20 == 0) {
                System.out.print(numbers.get(i) + ", ");
                System.out.println();
            }
            else {
                System.out.print(numbers.get(i) + ", ");
            }
        }
    }
}