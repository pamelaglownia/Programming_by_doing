package pl.glownia.pamela.vowelcapitalisation;

import java.io.*;
import java.util.Scanner;

public class VowelCapitalisation {
    public static void main(String[] args) throws IOException {
        System.out.println("Open which file: ");
        Scanner scan = new Scanner(System.in);
        String fileName = scan.next();
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            for (int count = 0; count < line.length(); count++) {
                char character = line.charAt(count);
                if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                    character = Character.toUpperCase(character);
                }
                System.out.print(character);
            }
            System.out.println();
        }
        bufferedReader.close();
    }
}