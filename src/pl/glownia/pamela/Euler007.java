package pl.glownia.pamela;

public class Euler007 {

    public static void main(String[] args) {
        int value = findPrimeNumber();
        System.out.println(value);
    }

    static int findPrimeNumber() {
        int i;
        int primeNumber = 104740;
        int counter = 0;
        while (counter < 10001) {
            primeNumber += 1;
            for (i = 2; i < primeNumber; i++) {
                if (primeNumber % i == 0) {
                    break;
                }
            }
            if (primeNumber == i) {
                counter += 1;
            }
        }
        return primeNumber;
    }
}