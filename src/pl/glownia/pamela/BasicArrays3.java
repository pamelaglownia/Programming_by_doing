package pl.glownia.pamela;

import java.util.Random;

public class BasicArrays3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[1000];
        for (int count = 0; count < array.length; count++) {
            array[count] = 10 + random.nextInt(90);
            System.out.print(array[count] + "  ");
            if ((count + 1) % 20 == 0) {
                System.out.println();
            }
        }
    }
}