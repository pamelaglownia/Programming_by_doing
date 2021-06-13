package pl.glownia.pamela;

import java.math.BigInteger;

public class Euler016 {
    public static void main(String[] args) {
        BigInteger number = new BigInteger("2");
        int power = 1000;
        BigInteger result = number.pow(power);
        String wordFromNumber = result.toString();
        int sum = 0;
        for (int i = 0; i < wordFromNumber.length(); i++) {
            char element = wordFromNumber.charAt(i);
            sum += Character.getNumericValue(element);
        }
        System.out.println("Sum of digits is " + sum + ".");
    }
}