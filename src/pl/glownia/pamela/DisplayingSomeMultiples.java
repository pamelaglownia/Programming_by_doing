package pl.glownia.pamela;

import java.util.Scanner;

public class DisplayingSomeMultiples {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number, I will multiply it by number from 1 to 12: ");
        int number = scan.nextInt();
        for (int count = 1; count <= 12; count++) {
            int result = number * count;
            System.out.println(number + " x " + count + " = " + result);
        }
    }
}

