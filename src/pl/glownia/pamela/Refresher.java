package pl.glownia.pamela;

import java.util.Scanner;

public class Refresher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a name, I will print it 10 times (instead of \"Mitchell\"- this name I will print only 5 times): ");
        String name = scan.next();
        if (name.equalsIgnoreCase("Mitchell")) {
            for (int count = 1; count <= 5; count++) {
                System.out.println(name);
            }
        }
        else {
            for (int count = 1; count <= 10; count++) {
                System.out.println(name);
            }
        }
    }
}
