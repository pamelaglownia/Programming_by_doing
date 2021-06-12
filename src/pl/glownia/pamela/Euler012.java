package pl.glownia.pamela;

public class Euler012 {
    public static void main(String[] args) {
        int numberOfDivisors = 0;
        int triangleNumber = 0;
        int ordinalNumber = 0;
        while (numberOfDivisors <= 500) {
            numberOfDivisors = 0;
            ordinalNumber++;
            triangleNumber = calculateTriangleNumber(ordinalNumber);
            for (int i = 1; i <= Math.sqrt(triangleNumber); i++) {
                if (triangleNumber % i == 0) {
                    numberOfDivisors += 1;
                }
            }
            numberOfDivisors *= 2;
        }
        System.out.println(triangleNumber);
    }

    static int calculateTriangleNumber(int n) {
        int triangleNumber = 0;
        for (int i = 0; i <= n; i++) {
            triangleNumber += i;
        }
        return triangleNumber;
    }
}