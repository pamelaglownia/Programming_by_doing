package pl.glownia.pamela;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GradesInAnArrayAndAFile {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Name (first and last): ");
        String name = scan.nextLine();
        System.out.print("Filename: ");
        String fileName = scan.nextLine();
        System.out.println("Here are your randomly-selected grades (hope you pass): ");
        int[] array = new int[5];
        FileWriter fileWriter = new FileWriter(fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(name + "\n");
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + random.nextInt(100);
            bufferedWriter.write(Integer.toString(array[i]) + " ");
            System.out.println("Grade " + (i + 1) + ": " + array[i]);
        }
        bufferedWriter.close();
        System.out.println("Data saved in " + fileName);
    }
}