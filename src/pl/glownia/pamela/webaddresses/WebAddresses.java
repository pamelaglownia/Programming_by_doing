package pl.glownia.pamela.webaddresses;

import java.io.File;
import java.util.Scanner;

class Address {
    String street;
    String city;
    String state;
    int zip;
}

public class WebAddresses {
    public static void main(String[] args) throws Exception {
//        URL addys = new URL("http://cs.leanderisd.org/txt/fake-addresses.txt");

        File file = new File("webAddresses.txt");
        Scanner fin = new Scanner(file);

        Address uno = new Address();
        uno.street = fin.nextLine();
        uno.city = fin.nextLine();
        uno.state = fin.next();
        uno.zip = fin.nextInt();
        fin.skip("\n");

        Address dos = new Address();
        dos.street = fin.nextLine();
        dos.city = fin.nextLine();
        dos.state = fin.next();
        dos.zip = fin.nextInt();
        fin.skip("\n");

        Address tre = new Address();
        tre.street = fin.nextLine();
        tre.city = fin.nextLine();
        tre.state = fin.next();
        tre.zip = fin.nextInt();
        fin.skip("\n");

        Address quatro = new Address();
        quatro.street = fin.nextLine();
        quatro.city = fin.nextLine();
        quatro.state = fin.next();
        quatro.zip = fin.nextInt();
        fin.skip("\n");

        Address cinco = new Address();
        cinco.street = fin.nextLine();
        cinco.city = fin.nextLine();
        cinco.state = fin.next();
        cinco.zip = fin.nextInt();
        fin.skip("\n");

        fin.close();

        System.out.println(uno.street + ", " + uno.city + ", " + uno.state + "  " + uno.zip);
        System.out.println(dos.street + ", " + dos.city + ", " + dos.state + "  " + dos.zip);
        System.out.println(tre.street + ", " + tre.city + ", " + tre.state + "  " + tre.zip);
        System.out.println(quatro.street + ", " + quatro.city + ", " + quatro.state + " " + quatro.zip);
        System.out.println(cinco.street + ", " + cinco.city + ", " + cinco.state + " " + cinco.zip);
    }
}