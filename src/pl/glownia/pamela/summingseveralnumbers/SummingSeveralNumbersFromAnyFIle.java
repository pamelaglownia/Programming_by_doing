package pl.glownia.pamela.summingseveralnumbers;

import java.io.*;
import java.util.Scanner;

public class SummingSeveralNumbersFromAnyFIle {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Which file would you like to read numbers from: ");
        String fileName = scan.next();
        File file = new File(fileName);
        Scanner scannerReader = new Scanner(file);
        int sum = 0;
        while (scannerReader.hasNext()) {
            int number = scannerReader.nextInt();
            System.out.print(number + " ");
            sum += number;
        }
        scannerReader.close();
        System.out.println("\nTotal is: " + sum);
    }
}