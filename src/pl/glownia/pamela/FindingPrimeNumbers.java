package pl.glownia.pamela;

public class FindingPrimeNumbers {
    public static void main(String[] args) {
        for (int n = 2; n <= 20; n++) {
            System.out.print(n);
            if (isPrime(n)) {
                System.out.print(" <");
            }
            System.out.println();
        }
    }

    public static boolean isPrime(int n) {
        for (int count = 2; count < n; count++) {
            if (n % count == 0) {
                return false;
            }
        }
        return true;
    }
}