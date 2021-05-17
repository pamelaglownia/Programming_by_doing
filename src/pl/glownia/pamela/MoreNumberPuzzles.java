package pl.glownia.pamela;

import java.util.Scanner;

public class MoreNumberPuzzles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option;
        do {
            System.out.println("Choose one option: ");
            System.out.println("1) Find two digit numbers <= 56 with sums of digits > 10");
            System.out.println("2) Find two digit number minus number reversed which equals sum of digits");
            System.out.println("3) Exit");
            option = scan.nextInt();

            if (option == 1) {
                findSumOfDigitsGreaterThanTen();
            } else if (option == 2) {
                findNumberWhenResultOfReverseSubtractionIsEqualsSumOfDigit();
            }
        } while (option != 3);
    }

    public static void findSumOfDigitsGreaterThanTen() {
        for (int tens = 1; tens <= 5; tens++) {
            for (int ones = 0; ones <= 9; ones++) {
                int result = tens + ones;
                int number = tens * 10 + ones;
                if (result > 10) {
                    System.out.print(number + "\t");
                }
            }
        }
        System.out.println();
    }

    public static void findNumberWhenResultOfReverseSubtractionIsEqualsSumOfDigit() {
        for (int tens = 1; tens <= 9; tens++) {
            for (int ones = 0; ones <= 9; ones++) {
                int reverse = ones * 10 + tens;
                int number = tens * 10 + ones;
                int sumOfDigits = tens + ones;
                int resultOfSubtraction = number - reverse;
                if (resultOfSubtraction == sumOfDigits) {
                    System.out.println(number);
                }
            }
        }
    }
}