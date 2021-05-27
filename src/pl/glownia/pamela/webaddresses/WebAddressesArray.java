package pl.glownia.pamela.webaddresses;

import java.io.File;
import java.util.Scanner;

class Addresses {
    String street;
    String city;
    String state;
    int zip;
}

public class WebAddressesArray {
    public static void main(String[] args) throws Exception {
//        URL addys = new URL("http://cs.leanderisd.org/txt/fake-addresses.txt");

        Addresses[] addybook = new Addresses[6];

        File file = new File("webAddresses.txt");
        Scanner fin = new Scanner(file);

        for (int i = 0; i < addybook.length; i++) {
            addybook[i] = new Addresses();
            addybook[i].street = fin.nextLine();
            addybook[i].city = fin.nextLine();
            addybook[i].state = fin.next();
            addybook[i].zip = fin.nextInt();
            fin.skip("\n");
        }
        fin.close();

        for (int i = 0; i < addybook.length; i++) {
            System.out.println((i + 1) + ". " + addybook[i].street + ", " + addybook[i].city + ", " + addybook[i].state + "  " + addybook[i].zip);
        }
    }
}