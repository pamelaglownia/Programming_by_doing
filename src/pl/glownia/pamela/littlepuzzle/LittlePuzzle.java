package pl.glownia.pamela.littlepuzzle;

import java.io.*;
import java.util.Scanner;

public class LittlePuzzle {
    public static void main(String[] args) throws IOException {
        System.out.println("Open which file: ");
        Scanner scan = new Scanner(System.in);
        String fileName = scan.next();
        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            for (int count = 0; count < line.length(); count++) {
                if ((count + 1) % 3 == 0) {
                    char character = line.charAt(count);
                    System.out.print(character);
                }
            }
        }
        bufferedReader.close();
    }
}