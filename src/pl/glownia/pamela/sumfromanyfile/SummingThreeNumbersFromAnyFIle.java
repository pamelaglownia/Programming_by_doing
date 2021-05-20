package pl.glownia.pamela.sumfromanyfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SummingThreeNumbersFromAnyFIle {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Which file would you like to read numbers from: ");
        String nameOfFile = scan.next();
        FileReader fileReader = new FileReader(nameOfFile);
        BufferedReader reader = new BufferedReader(fileReader);
        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());
        int thirdNumber = Integer.parseInt(reader.readLine());
        int sum = firstNumber + secondNumber + thirdNumber;
        reader.close();
        System.out.println("Reading numbers from file " + nameOfFile + "... done.");
        System.out.print(firstNumber + " + " + secondNumber + " + " + thirdNumber + " = " + sum);
    }
}
