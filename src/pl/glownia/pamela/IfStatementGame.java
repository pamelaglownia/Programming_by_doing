package pl.glownia.pamela;

import java.util.Scanner;

public class IfStatementGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Your gender [M/F]: \n> ");
        String gender = scan.next();
        System.out.print("Your age: \n> ");
        int age = scan.nextInt();
        System.out.print("Are you married? \n> ");
        String married = scan.next();
        checkAnswers(gender, age, married);
    }

    static void checkAnswers(String gender, int age, String married) {
        if (age >= 1 && age <= 100) {
            if (gender.equalsIgnoreCase("F")) {
                if (age >= 20) {
                    if (married.equalsIgnoreCase("yes")) {
                        System.out.println("You are " + age + " years old woman and you are married.");
                    } else {
                        System.out.println("You are " + age + " years old woman and you are not married.");
                    }
                } else {
                    System.out.println("You are " + age + " years old.");
                }
            } else {
                if (married.equalsIgnoreCase("yes")) {
                    System.out.println("You are " + age + " years old man and you are married.");
                } else {
                    System.out.println("You are " + age + " years old man and you are not married.");
                }
            }
        } else {
            System.out.println("Really? You are " + age + " years old?");
        }
    }
}
