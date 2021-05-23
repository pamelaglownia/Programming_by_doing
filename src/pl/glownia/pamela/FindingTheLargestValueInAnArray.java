package pl.glownia.pamela;

import java.util.Random;

public class FindingTheLargestValueInAnArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + random.nextInt(50);
            System.out.print(array[i] + " ");
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("\nThe largest value is " + max);
    }
}
