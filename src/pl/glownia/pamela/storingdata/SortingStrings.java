package pl.glownia.pamela.storingdata;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class CarsData {
    String make;
    String model;
    int year;
    String license;

    public static Comparator<CarsData> CarsMakeComparator = new Comparator<>() {
        @Override
        public int compare(CarsData carOne, CarsData carTwo) {
            return carOne.make.compareTo(carTwo.make);
        }
    };
}

public class SortingStrings {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.print("From which file do you want to load this information? ");
        String fileName = scan.next();
        File file = new File(fileName);
        Scanner reader = new Scanner(file);

        CarsData[] cars = new CarsData[5];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new CarsData();
            cars[i].make = reader.next();
            cars[i].model = reader.next();
            cars[i].year = reader.nextInt();
            cars[i].license = reader.next();
        }
        reader.close();

        Arrays.sort(cars, CarsData.CarsMakeComparator);

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Car " + (i + 1));
            System.out.println("\t Make: " + cars[i].make);
            System.out.println("\t Model: " + cars[i].model);
            System.out.println("\t Year: " + cars[i].year);
            System.out.println("\t License: " + cars[i].license);
        }
    }
}