package pl.glownia.pamela;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Car implements Comparable<Car> {
    String make;
    String model;
    int year;
    String license;

    public Car(String make, String model, int year, String license) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.license = license;
    }


    @Override
    public int compareTo(Car car) {
        return year - car.year;
    }

    @Override
    public String toString() {
        return year + " " + make + " " + model + " (" + license + ")";
    }
}

public class SortingArrayListOfRecords {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        ArrayList<Car> arrayList = new ArrayList<>();
        System.out.println("From which file do you want to load this information? ");
        String fileName = scan.next();
        File file = new File(fileName);
        Scanner reader = new Scanner(file);
        for (int i = 0; i < 5; i++) {
            String make = reader.next();
            String model = reader.next();
            int year = reader.nextInt();
            String license = reader.next();
            arrayList.add(new Car(make, model, year, license));
        }
        reader.close();
        System.out.println("Data loaded.");
        Collections.sort(arrayList);
        System.out.println("Data sorted.");
        System.out.println("ArrayList: " + arrayList);
    }
}