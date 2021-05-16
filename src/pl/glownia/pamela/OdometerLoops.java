package pl.glownia.pamela;

import java.util.Scanner;

public class OdometerLoops {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Which base [2 to 10]: ");
        int base = scan.nextInt();
        for (int thous = 0; thous < base; thous++) {
            for (int hund = 0; hund < base; hund++) {
                for (int tens = 0; tens < base; tens++) {
                    for (int ones = 0; ones < base; ones++) {
                        System.out.print(" " + thous + "" + hund + "" + tens + "" + ones + "\r");
                        Thread.sleep(100);
                    }
                }
            }
        }
        System.out.println();
    }
}
