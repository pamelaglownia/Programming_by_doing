package pl.glownia.pamela.simplefileinput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SimpleFileInput {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("name.txt"));
        String text= reader.readLine();
        System.out.println("Using my psychic powers (aided by reading data from the file),\nI have determined that your name is " + text + ".");
        reader.close();
    }
}