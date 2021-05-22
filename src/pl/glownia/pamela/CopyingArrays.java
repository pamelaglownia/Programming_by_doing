package pl.glownia.pamela;

import java.util.Random;

public class CopyingArrays {
    public static void main(String[] args) {
        int[] arrayOne = new int[10];
        int[] arrayTwo = new int[arrayOne.length];
        Random random = new Random();

        for (int count = 0; count < arrayOne.length; count++) {
            arrayOne[count] = 1 + random.nextInt(100);
        }
        for (int count = 0; count < arrayTwo.length; count++) {
            arrayTwo[count] = arrayOne[count];
        }
        System.out.print("Array 1: ");
        for (int count = 0; count < arrayOne.length; count++) {
            arrayOne[arrayOne.length - 1] = -7;
            System.out.print(arrayOne[count] + " ");
        }
        System.out.print("\nArray 2: ");
        for (int count = 0; count < arrayTwo.length; count++) {
            System.out.print(arrayTwo[count] + " ");
        }
    }
}