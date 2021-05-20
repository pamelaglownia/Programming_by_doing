package pl.glownia.pamela;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DisplayingAFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Open which file: ");
        String fileName = scan.next();
        File file = new File(fileName);
        Scanner scannerReader = new Scanner(file);
        while (scannerReader.hasNext()) {
            String data = scannerReader.nextLine();
            System.out.println(data);
        }
        scannerReader.close();
    }
}