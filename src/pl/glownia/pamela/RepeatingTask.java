package pl.glownia.pamela;

import java.util.Scanner;

public class RepeatingTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a message, I will print this as many times as you need.");
        System.out.print("Message: ");
        String message = scan.nextLine();
        System.out.print("How many times print your message: ");
        int times = scan.nextInt();
        int count = 0;
        if (times >= 1) {
            while (count < times) {
                System.out.println(message);
                count++;
            }
        } else {
            System.out.println("Are you sure you want print this message ZERO times?");
        }
    }
}
