package pl.glownia.pamela;

import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Count from: ");
        double fromCount = scan.nextDouble();
        System.out.print("Count to: ");
        double toCount = scan.nextDouble();
        System.out.print("Count by: ");
        double byCount = scan.nextDouble();
        for (double i = fromCount; i <= toCount; i += byCount) {
            System.out.print(i + " ");
        }
    }
}
