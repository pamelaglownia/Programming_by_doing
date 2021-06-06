package pl.glownia.pamela;

public class Euler002 {
    public static void main(String[] args) {
        int sum = countSumFromFibonacciSequence();
        System.out.println(sum);
    }

    public static int countSumFromFibonacciSequence() {
        int sum = 0;
        int morePreviousNumber = 0;
        int previousNumber = 1;
        for (int currentNumber = 2; currentNumber < 4000000; currentNumber++) {
            currentNumber = previousNumber + morePreviousNumber;
            if (currentNumber % 2 == 0) {
                sum += currentNumber;
            }
            morePreviousNumber = previousNumber;
            previousNumber = currentNumber;
        }
        return sum;
    }
}