package pl.glownia.pamela;

public class Euler009 {
    public static void main(String[] args) {
        int max = 1000;
        int numberA = 0;
        int numberB = 0;
        int numberC = 0;
        int sum = 0;
        while (sum <= 1000) {
            for (int a = 1; a < max; a++) {
                for (int b = a; b < max; b++) {
                    for (int c = b; c < max; c++) {
                        sum = a + b + c;
                        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) && sum == max) {
                            numberA = a;
                            numberB = b;
                            numberC = c;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("a: " + numberA + " b: " + numberB + " c:" + numberC);
    }
}