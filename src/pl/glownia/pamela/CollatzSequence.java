package pl.glownia.pamela;

import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive natural number: ");
        int number = scan.nextInt();
        while(number <1){
            System.out.print("The number has to be greater than zero. \nEnter number: ");
            number = scan.nextInt();
        }
        System.out.print(number + "\t");
        int step = 0;
        int max = 1;
        while (number != 1) {
            if (number % 2 == 0) {
                number /= 2;
            }
            else {
                number = number * 3 + 1;
            }
            if (number > max) {
                max = number;
            }
            step++;
            System.out.print(number + "\t");
        }
        System.out.println("\nTerminated after " + step + " steps.");
        System.out.println("The largest value was " + max + ".");
    }
}
