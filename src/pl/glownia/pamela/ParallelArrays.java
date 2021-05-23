package pl.glownia.pamela;

import java.util.Scanner;

public class ParallelArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String []lastNames = {"Kowalski", "Nowak", "Kwiatkowska", "Burak", "Brzozowski"};
        double [] score = {90.0, 75.1, 88.4, 94.2, 60.9 };
        int [] idNumber= {123, 458, 172, 982, 235};

        for(int i = 0; i<5; i++){
            System.out.println(lastNames[i] + " "+score[i] + " " +idNumber[i]);
        }
        System.out.print("\nID number to find: ");
        int number = scan.nextInt();
        for(int i = 0; i<idNumber.length; i++){
            if(number == idNumber[i]){
                System.out.println("Found in slot " + i);
                System.out.println("\tName: " + lastNames[i]);
                System.out.println("\tAverage: " + score[i]);
                System.out.println("\tID: " + idNumber[i]);
            }
        }
    }
}