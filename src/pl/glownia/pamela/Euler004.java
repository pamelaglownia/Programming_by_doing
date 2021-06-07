package pl.glownia.pamela;

public class Euler004 {

    public static void main(String[] args) {

        int sixDigitNumber;
        int largestPalindromeNumber = 0;

        for (int i = 999; i >= 101; i--) {
            for (int j = i; j >= 101; j--) {
                sixDigitNumber = i * j;
                int numberToReverse = sixDigitNumber;
                int reversedNumber = 0;

                while (numberToReverse > 0) {
                    reversedNumber = reversedNumber * 10 + numberToReverse % 10;
                    numberToReverse /= 10;
                }
                if (sixDigitNumber == reversedNumber && sixDigitNumber > largestPalindromeNumber) {
                    largestPalindromeNumber = sixDigitNumber;
                }
            }
        }
        System.out.println(largestPalindromeNumber);
    }
}