package pl.glownia.pamela;

public class Euler005 {
    public static void main(String[] args) {

        int number;
        boolean isDivisible = true;
        for (number = 20; number < 300000000; number++) {
            for (int divisor = 1; divisor <= 20; divisor++) {
                if (number % divisor == 0) {
                    isDivisible = true;
                } else {
                    isDivisible = false;
                    break;
                }
            }
            if (isDivisible) {
                break;
            }
        }
        if (isDivisible) {
            System.out.println(number);
        }
    }
}