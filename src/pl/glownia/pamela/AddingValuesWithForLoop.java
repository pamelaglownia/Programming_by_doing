package pl.glownia.pamela;

import java.util.Scanner;

public class AddingValuesWithForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number. I will add numbers from 1 to your number:");
        int number = scanner.nextInt();
        int result =0;
        for (int i =1; i<=number; i++){
            System.out.print(i + "\t");
            result +=i;
        }
        System.out.println("\nThe sum is " + result + ".");
    }
}
