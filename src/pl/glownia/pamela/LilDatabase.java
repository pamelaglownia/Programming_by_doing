package pl.glownia.pamela;

import java.util.Scanner;

class Students {
    String name;
    int grade;
    double average;
}

public class LilDatabase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Students[] first = new Students[3];
        System.out.print("Enter the 1's student's name: ");
        first[0] = new Students();
        first[0].name = scan.next();
        System.out.print("Enter the 1's student's grade: ");
        first[1] = new Students();
        first[1].grade = scan.nextInt();
        System.out.print("Enter the 1's student's average: ");
        first[2] = new Students();
        first[2].average = scan.nextDouble();
        Students[] second = new Students[3];
        System.out.print("\nEnter the 2's student's name: ");
        second[0] = new Students();
        second[0].name = scan.next();
        System.out.print("Enter the 2's student's grade: ");
        second[1] = new Students();
        second[1].grade = scan.nextInt();
        System.out.print("Enter the 2's student's average: ");
        second[2] = new Students();
        second[2].average = scan.nextDouble();
        Students[] third = new Students[3];
        System.out.print("\nEnter the 3's student's name: ");
        third[0] = new Students();
        third[0].name = scan.next();
        System.out.print("Enter the 3's student's grade: ");
        third[1] = new Students();
        third[1].grade = scan.nextInt();
        System.out.print("Enter the 3's student's average: ");
        third[2] = new Students();
        third[2].average = scan.nextDouble();

        System.out.println("\nThe names are: " + first[0].name + " " + second[0].name + " " + third[0].name);
        System.out.println("The grades are: " + first[1].grade + " " + second[1].grade + " " + third[1].grade);
        System.out.println("The averages are: " + first[2].average + " " + second[2].average + " " + third[2].average);

    }
}


