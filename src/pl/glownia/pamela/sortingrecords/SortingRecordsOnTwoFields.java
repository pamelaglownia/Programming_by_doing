package pl.glownia.pamela.sortingrecords;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student> {
    int idNumber;
    int gradeNumber;
    double floatingGrade;
    String letterGrade;

    @Override
    public int compareTo(Student o) {
        int compare = Integer.compare(idNumber, o.idNumber);
        if (compare == 0) {
            compare = Integer.compare(gradeNumber, o.gradeNumber);
        }
        return compare;
    }
}

public class SortingRecordsOnTwoFields {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Open which file: ");
        String fileName = scan.next();
        File file = new File(fileName);
        Scanner reader = new Scanner(file);
        System.out.println("Data loaded.");

        Student[] studentsGrade = new Student[30];

        for (int i = 0; i < studentsGrade.length; i++) {
            studentsGrade[i] = new Student();
            studentsGrade[i].idNumber = reader.nextInt();
            studentsGrade[i].gradeNumber = reader.nextInt();
            studentsGrade[i].floatingGrade = reader.nextDouble();
            studentsGrade[i].letterGrade = reader.next();
        }

        Arrays.sort(studentsGrade);
        System.out.println("Data sorted");

        System.out.println("Here are the sorted grades:");
        for (int i = 0; i < studentsGrade.length; i++) {
            System.out.println(studentsGrade[i].idNumber + " " + studentsGrade[i].gradeNumber + " " + studentsGrade[i].floatingGrade + " " + studentsGrade[i].letterGrade);
        }
    }
}