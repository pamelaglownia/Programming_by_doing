package pl.glownia.pamela.gettingdatafromafile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Dog {
    String breed;
    int age;
    double weight;
}

public class GettingDataFromAFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Which file to open: ");
        String fileName = scan.next();
        File file = new File(fileName);
        Scanner reader = new Scanner(file);
        System.out.println("Reading data from " + fileName);

        Dog first = new Dog();
        first.breed = reader.nextLine();
        first.age = reader.nextInt();
        first.weight = reader.nextDouble();
        reader.skip("\n");

        Dog second = new Dog();
        second.breed = reader.nextLine();
        second.age = reader.nextInt();
        second.weight = reader.nextDouble();
        reader.close();

        System.out.println("First dog: " + first.breed + ", " + first.age + ", " +first.weight);
        System.out.println("Second dog: " + second.breed + ", " + second.age + ", " +second.weight);
    }
}