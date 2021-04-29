package pl.glownia.pamela;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        System.out.println("I will add numbers you give me. If you enter zero, the program will finish.");
        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("The total so far is: " + number + ".");
        int result = number;
        while (number != 0) {
            System.out.print("Number: ");
            number = scan.nextInt();
            result += number;
            System.out.println("The total so far is: " + result + ".");
        }
    }
}
