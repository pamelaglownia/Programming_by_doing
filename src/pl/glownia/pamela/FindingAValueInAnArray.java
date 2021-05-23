package pl.glownia.pamela;

import java.util.Random;
import java.util.Scanner;

public class FindingAValueInAnArray {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + random.nextInt(50);
            System.out.print(array[i] + " ");
        }
        System.out.print("\nValue to find: ");
        int value = scan.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                System.out.println(value + " is in the array.");
            }
        }
    }
}