package pl.glownia.pamela.summingthreenumbers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SummingThreeNumbersFromAFile {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("3nums.txt");
        BufferedReader reader = new BufferedReader(fileReader);
        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());
        int thirdNumber = Integer.parseInt(reader.readLine());
        int sum = firstNumber + secondNumber + thirdNumber;
        reader.close();
        System.out.println("Reading numbers from file \"3nums.txt\"... done.");
        System.out.print(firstNumber + " + " + secondNumber + " + " + thirdNumber + " = " + sum);
    }
}