package pl.glownia.pamela;

import java.util.Scanner;

public class SafeSquareRoot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("SQUARE ROOT");
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        double result;
        while (number <= 0) {
            System.out.print("Your number has to be greater than zero. \nEnter a number again:");
            number = scan.nextInt();
        }
        result = Math.sqrt(number);
        System.out.println("The square root of " + number + " is " + result);
    }
}
