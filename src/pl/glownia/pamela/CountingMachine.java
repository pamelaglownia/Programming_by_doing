package pl.glownia.pamela;

import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Count from: ");
        int fromCount = scan.nextInt();
        System.out.print("Count to: ");
        int toCount = scan.nextInt();
        System.out.print("Count by: ");
        int byCount = scan.nextInt();
        for (int i = fromCount; i <= toCount; i += byCount) {
            System.out.print(i + " ");
        }
    }
}
