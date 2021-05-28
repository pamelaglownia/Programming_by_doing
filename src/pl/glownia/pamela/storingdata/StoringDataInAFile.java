package pl.glownia.pamela.storingdata;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

class Car {
    String make;
    String model;
    int year;
    String license;
}

public class StoringDataInAFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);

        Car[] cars = new Car[5];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
            System.out.println("Car " + (i + 1));
            System.out.print("\tMake: ");
            cars[i].make = scan.next();
            System.out.print("\tModel: ");
            cars[i].model = scan.next();
            System.out.print("\tYear: ");
            cars[i].year = scan.nextInt();
            System.out.print("\tLicense: ");
            cars[i].license = scan.next();
        }

        System.out.print("To which file do you want to save this information? ");
        String fileName = scan.next();
        File file = new File(fileName);
        PrintWriter printWriter = new PrintWriter(file);
        for (int i = 0; i < cars.length; i++) {
            printWriter.print(cars[i].make + " ");
            printWriter.print(cars[i].model + " ");
            printWriter.print(cars[i].year + " ");
            printWriter.print(cars[i].license + " ");
            printWriter.println();
        }
        printWriter.close();
        System.out.println("Data saved.");
    }
}