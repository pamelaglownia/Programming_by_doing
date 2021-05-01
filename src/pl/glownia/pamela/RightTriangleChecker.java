package pl.glownia.pamela;

import java.util.Scanner;

public class RightTriangleChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of triangle's three sides:");
        System.out.print("First side: ");
        int firstSide = scan.nextInt();
        while (firstSide <= 0) {
            System.out.print("First side can't be smaller than one. \nEnter again: ");
            firstSide = scan.nextInt();
        }
        System.out.print("Second side: ");
        int secondSide = scan.nextInt();
        while (secondSide < firstSide) {
            System.out.print("Second side can't be smaller than first side. \nEnter again: ");
            secondSide = scan.nextInt();
        }
        System.out.print("Third side: ");
        int thirdSide = scan.nextInt();
        while (thirdSide < firstSide || thirdSide < secondSide) {
            System.out.print("Third side side has to be greater than other sides. \nEnter again: ");
            thirdSide = scan.nextInt();
        }
        System.out.println("Your three sides are: " + firstSide + ", " + secondSide + ", " + thirdSide + ".");
        if (firstSide == secondSide || secondSide == thirdSide) {
            System.out.println("No, these sides don't make a right triangle.");
        }
        else {
            System.out.println("Yes, these sides make a right triangle.");
        }
    }
}
