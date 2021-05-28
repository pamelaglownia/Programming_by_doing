package pl.glownia.pamela;

import java.util.Scanner;

class Student {
    String name;
    int grade;
    double average;
}

public class BasicRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Student first = new Student();
        System.out.print("Enter the first student's name: ");
        first.name = scan.next();
        System.out.print("Enter the first student's grade: ");
        first.grade = scan.nextInt();
        System.out.print("Enter the first student's average: ");
        first.average = scan.nextDouble();

        Student second = new Student();
        System.out.print("\nEnter the second student's name: ");
        second.name = scan.next();
        System.out.print("Enter the second student's grade: ");
        second.grade = scan.nextInt();
        System.out.print("Enter the second student's average: ");
        second.average = scan.nextDouble();

        Student third = new Student();
        System.out.print("\nEnter the third student's name: ");
        third.name = scan.next();
        System.out.print("Enter the third student's grade: ");
        third.grade = scan.nextInt();
        System.out.print("Enter the third student's average: ");
        third.average = scan.nextDouble();

        System.out.println("\nThe names are: " + first.name + " " +second.name + " " + third.name);
        System.out.println("The grades are: " + first.grade + " " + second.grade + " " + third.grade);
        System.out.println("The averages are: " + first.average + " " + second.average + " " + third.average);
        double averageForThreeStudents = (first.average + second.average + third.average)/3;
        System.out.println("\nThe average for three students is: " + averageForThreeStudents);
    }
}