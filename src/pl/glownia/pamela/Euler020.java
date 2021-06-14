package pl.glownia.pamela;

import java.math.BigInteger;

public class Euler020 {
    public static void main(String[] args) {
        System.out.println(calculateNumbers());
    }

    static BigInteger calculateFactorial() {
        BigInteger factorial = new BigInteger("1");
        for (int i = 1; i <= 100; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    static int calculateNumbers() {
        int sum = 0;
        BigInteger factorial = calculateFactorial();
        String wordOfNumbers = factorial.toString();
        for (int i = 0; i < wordOfNumbers.length(); i++) {
            sum += Integer.parseInt(wordOfNumbers.substring(i, i + 1));
        }
        return sum;
    }
}