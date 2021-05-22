package pl.glownia.pamela;

import java.util.Random;

public class BasicArrays2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        array[0] = 1 + random.nextInt(100);
        array[1] = 1 + random.nextInt(100);
        array[2] = 1 + random.nextInt(100);
        array[3] = 1 + random.nextInt(100);
        array[4] = 1 + random.nextInt(100);
        array[5] = 1 + random.nextInt(100);
        array[6] = 1 + random.nextInt(100);
        array[7] = 1 + random.nextInt(100);
        array[8] = 1 + random.nextInt(100);
        array[9] = 1 + random.nextInt(100);
        for (int count = 0; count < array.length; count++) {
            System.out.println("Slot " + count + " contains a " + array[count]);
        }
    }
}