package pl.glownia.pamela;

import java.util.Scanner;

class StudentData {
    String name;
    int grade;
    double average;
}

public class LilDatabaseLoop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentData[] students = new StudentData[3];

        for (int i = 0; i < students.length; i++) {
            students[i] = new StudentData();
            System.out.print("Enter student " + (i + 1) + "'s name: ");
            students[i].name = scan.next();
            System.out.print("Enter student " + (i + 1) + "'s grade: ");
            students[i].grade = scan.nextInt();
            System.out.print("Enter student " + (i + 1) + "'s average: ");
            students[i].average = scan.nextDouble();
            System.out.println();
        }
        System.out.println("The names are: " + students[0].name + " " + students[1].name + " " + students[2].name);
        System.out.println("The grades are: " + students[0].grade + " " + students[1].grade + " " + students[2].grade);
        System.out.println("The averages are: " + students[0].average + " " + students[1].average + " " + students[2].average);
    }
}