package pl.glownia.pamela;

public class Euler006 {
    public static void main(String[] args) {
        int result = sumSquareDifference();
        System.out.println(result);
    }

    static int sumSquareDifference() {
        int sumOfTheSquares = 0;
        int squareOfTheSum = 0;
        int result;
        for (int i = 0; i <= 100; i++) {
            sumOfTheSquares += (int) Math.pow(i, 2);
            squareOfTheSum += i;
        }
        squareOfTheSum = (int) Math.pow(squareOfTheSum, 2);
        result = squareOfTheSum - sumOfTheSquares;
        return result;
    }
}