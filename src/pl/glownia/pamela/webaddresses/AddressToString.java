package pl.glownia.pamela.webaddresses;

import java.io.File;
import java.util.Scanner;

class AddressData {
    String street;
    String city;
    String state;
    int zip;

    public String toString() {
        return (this.street + ", " + this.city + ",  " + this.state + " " + this.zip);
    }
}

public class AddressToString {
    public static void main(String[] args) throws Exception {
        File file = new File("webAddresses.txt");
        Scanner fin = new Scanner(file);

        AddressData[] addybook = new AddressData[6];

        for (int i = 0; i < addybook.length; i++) {
            addybook[i] = new AddressData();
            addybook[i].street = fin.nextLine();
            addybook[i].city = fin.nextLine();
            addybook[i].state = fin.next();
            addybook[i].zip = fin.nextInt();
            fin.skip("\n");
        }
        fin.close();

        for (int i = 0; i < addybook.length; i++) {
            System.out.println((i + 1) + ". " + addybook[i]);
        }
    }
}