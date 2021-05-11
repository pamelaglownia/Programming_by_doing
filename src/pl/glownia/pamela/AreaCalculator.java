package pl.glownia.pamela;

import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to area calculator. Choose one of the shape to calculate:");
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ");
        System.out.println("1. Square \n2. Rectangle \n3. Triangle \n4. Circle \n5. Quit");
        int option = scan.nextInt();
        while (option != 5) {
            if (option == 1) {
                System.out.print("Enter side length: ");
                int side = scan.nextInt();
                area_square(side);
                System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ");
                System.out.println("1. Square \n2. Rectangle \n3. Triangle \n4. Circle \n5. Quit");
                option = scan.nextInt();
            }
            if (option == 2) {
                System.out.print("Length: ");
                int length = scan.nextInt();
                System.out.print("Width: ");
                int width = scan.nextInt();
                area_rectangle(length, width);
                System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ");
                System.out.println("1. Square \n2. Rectangle \n3. Triangle \n4. Circle \n5. Quit");
                option = scan.nextInt();
            }
            if (option == 3) {
                System.out.print("Base: ");
                int base = scan.nextInt();
                System.out.print("Height: ");
                int height = scan.nextInt();
                area_triangle(base, height);
                System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ");
                System.out.println("1. Square \n2. Rectangle \n3. Triangle \n4. Circle \n5. Quit");
                option = scan.nextInt();
            }
            if (option == 4) {
                System.out.print("Radius: ");
                int radius = scan.nextInt();
                area_circle(radius);
                System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ");
                System.out.println("1. Square \n2. Rectangle \n3. Triangle \n4. Circle \n5. Quit");
                option = scan.nextInt();
            }
        }
        System.out.println("I hope you enjoyed. Goodbye!");
    }

    public static double area_circle(int radius) {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area is " + area);
        return area;
    }

    public static int area_rectangle(int length, int width) {
        int area = length * width;
        System.out.println("The area is " + area);
        return area;
    }

    public static int area_square(int side) {
        int area = (int) Math.pow(side, 2);
        System.out.println("The area is " + area);
        return area;
    }

    public static double area_triangle(int base, int height) {
        double area = (base * height) / 2;
        System.out.println("The area is " + area);
        return area;
    }
}