package pl.glownia.pamela.gettingmoredata;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Person{
    String name;
    int age;
}
public class GettingMoreDataFromAFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Which file to open: ");
        String fileName = scan.nextLine();
        File file = new File(fileName);
        Scanner reader = new Scanner(file);

        Person[] person = new Person[5];

        for(int i = 0; i<person.length; i++){
            person[i] = new Person();
            person[i].name = reader.nextLine();
            person[i].age = reader.nextInt();
            System.out.println(person[i].name + " is " + person[i].age);
            reader.skip("\n");
        }
        reader.close();
    }
}