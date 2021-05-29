package pl.glownia.pamela.storingdata;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Cars {
    String make;
    String model;
    int year;
    String license;
}

public class ReadingWhatYouWrote {
    public static void main(String[] args) throws FileNotFoundException {
        Cars[] cars = new Cars[5];
        Scanner scan = new Scanner(System.in);
        System.out.print("From which file do you want to load this information? ");
        String fileName = scan.next();
        File file = new File(fileName);
        Scanner reader = new Scanner(file);
        System.out.println("Data loaded.");

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Cars();
            cars[i].make = reader.next();
            cars[i].model = reader.next();
            cars[i].year = reader.nextInt();
            cars[i].license = reader.next();
        }
        reader.close();

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Car " + (i + 1));
            System.out.println("\t Make: " + cars[i].make);
            System.out.println("\t Model: " + cars[i].model);
            System.out.println("\t Year: " + cars[i].year);
            System.out.println("\t License: " + cars[i].license);
        }
    }
}