package pl.glownia.pamela;

public class Euler003 {
    public static void main(String[] args) {
        long currentDivisor = 2;
        long number = 600851475143L;
        long largestPrimeFactor = 0;

        while (currentDivisor < number) {
            if (number % currentDivisor != 0) {
                currentDivisor++;
            } else {
                number /= currentDivisor;
                largestPrimeFactor = number;
                currentDivisor = 2;
            }
        }
        System.out.println(largestPrimeFactor);
    }
}