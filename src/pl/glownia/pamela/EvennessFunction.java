package pl.glownia.pamela;

public class EvennessFunction {
    public static void main(String[] args) {
        for (int n = 1; n <= 20; n++) {
            System.out.println();
            System.out.print(n);
            if (isEven(n) && isDivisibleBy3(n)) {
                System.out.print(" <=");
            } else if (isEven(n)) {
                System.out.print(" <");
            } else if (isDivisibleBy3(n)) {
                System.out.print(" =");
            }
        }
    }

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isDivisibleBy3(int n) {
        if (n % 3 == 0) {
            return true;
        }
        return false;
    }
}