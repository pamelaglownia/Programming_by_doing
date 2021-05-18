package pl.glownia.pamela.lettertoyourself;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class LetterToYourself {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("letter.txt");
        PrintStream printStream = new PrintStream(file);
        System.setOut(printStream);
        printStream.println("+-----------------------------------------+");
        printStream.println("|                                   ####  |");
        printStream.println("|                                   ####  |");
        printStream.println("|                                   ####  |");
        printStream.println("|                                         |");
        printStream.println("|                   Pam Parampam          |");
        printStream.println("|                   DreamsComeTrue st.    |");
        printStream.println("|                   Cracow, Poland        |");
        printStream.println("|                                         |");
        printStream.println("+-----------------------------------------+");
        printStream.close();
    }
}