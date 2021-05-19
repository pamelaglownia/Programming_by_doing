package pl.glownia.pamela.highscore;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HighScore {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.println("You got a high score!");
        System.out.print("Please enter your score: ");
        int score = scan.nextInt();
        System.out.print("Please enter your name: ");
        String name = scan.next();
        File file = new File("highscore.txt");
        PrintWriter writer = new PrintWriter(file);
        writer.println(score);
        writer.println(name);
        writer.close();
        System.out.println("Data stored into " + file);
    }
}