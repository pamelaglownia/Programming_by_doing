package pl.glownia.pamela;

public class Euler014 {
    public static void main(String[] args) {
        System.out.println(createCollatzSequence());
    }

    static long createCollatzSequence() {
        int terms;
        int maxTerms = 0;
        long currentNumber;
        long largestStartingNumber = 1;
        for (int n = 1; n < 1000000; n++) {
            terms = 0;
            currentNumber = n;
            do {
                if (currentNumber % 2 == 0) {
                    currentNumber /= 2;
                } else {
                    currentNumber = (3 * currentNumber) + 1;
                }
                terms++;
            } while (currentNumber != 1);

            if (terms > maxTerms) {
                maxTerms = terms;
                largestStartingNumber = n;
            }
        }
        return largestStartingNumber;
    }
}