package pl.glownia.pamela;

public class GettingIndividualDigits {
    public static void main(String[] args) {
        int result = 0;
        int tens = 1;
        int ones = 0;
        for (int i = 10; i <= 99; i++) {
            System.out.print(i + ", ");
            for (int j = 0; j <= i % 10; j++) {
                tens = i / 10;
                ones = i%10;
                result = tens + j;
            }
            System.out.println(tens + " + " + ones + " = " + result);
        }
    }
}