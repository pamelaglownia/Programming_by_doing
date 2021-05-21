package pl.glownia.pamela;

import java.net.URL;
import java.util.Scanner;

public class SimpleWebInput {

    public static void main(String[] args) throws Exception {
        URL oracleWebpage = new URL("https://docs.oracle.com/");
        Scanner webReader = new Scanner(oracleWebpage.openStream());
        while (webReader.hasNext()) {
            String oneLine = webReader.nextLine();
            System.out.println(oneLine);
        }
        webReader.close();
    }
}