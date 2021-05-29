package pl.glownia.pamela.storingdata;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class CarData implements Comparable<CarData>{
    String make;
    String model;
    int year;
    String license;

    @Override
    public int compareTo(CarData car) {
        return this.year - car.year;
    }
}

public class SortingAnArrayOfRecords {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.print("From which file do you want to load this information? ");
        String fileName = scan.next();
        File file = new File(fileName);
        Scanner reader = new Scanner(file);

        CarData[] cars = new CarData[5];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new CarData();
            cars[i].make = reader.next();
            cars[i].model = reader.next();
            cars[i].year = reader.nextInt();
            cars[i].license = reader.next();
        }
        reader.close();

        Arrays.sort(cars);

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Car " + (i + 1));
            System.out.println("\t Make: " + cars[i].make);
            System.out.println("\t Model: " + cars[i].model);
            System.out.println("\t Year: " + cars[i].year);
            System.out.println("\t License: " + cars[i].license);
        }
    }
}