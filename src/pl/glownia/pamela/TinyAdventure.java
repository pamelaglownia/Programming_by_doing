package pl.glownia.pamela;

import java.util.Scanner;

public class TinyAdventure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Tiny Adventure Game.");
        System.out.println("Would you like to play [\"yes\" or \"no\"]?");
        String answer = scan.next();
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("You are standing in the front of huge wrought iron gate. Do you want to go into \"house\" or \"garden\"?");
            String gateAnswer = scan.next();
            if (gateAnswer.equalsIgnoreCase("house")) {
                System.out.println("You are in the hall. Do you want to go to \"kitchen\" or to \"office\"? ");
                String hallAnswer = scan.next();
                if (hallAnswer.equalsIgnoreCase("kitchen")) {
                    System.out.println("Look! Something is cooking... It smells really nice. Do you want to try ?[\"yes\" or \"no\"]");
                    String kitchenAnswer = scan.next();
                    if (kitchenAnswer.equalsIgnoreCase("yes")) {
                        System.out.println("Oh, it was really spicy soup... Someone added too much chilli pepper. I think you should look for some water.");
                    }
                    else {
                        System.out.println("Ok. Maybe next time.");
                    }
                }
                if (hallAnswer.equalsIgnoreCase("office")) {
                    System.out.println("You are in the office.Look around, there is a lot of books. Would you like to pick interesting one [\"yes\" or \"no\"]?");
                    String officeAnswer = scan.next();
                    if (officeAnswer.equalsIgnoreCase("yes")) {
                        System.out.println("Pick number of book [1, 2 or 3]: \n1. \"Gone with the wind\"\n2. \"ALice in Wonderland\"\n3. \"The Da Vinci code\"");
                        int bookAnswer = scan.nextInt();
                        System.out.println("Sit on the couch and have a nice time!");
                    }
                    else {
                        System.out.println("Ok. Maybe next time.");
                    }
                }
            }
            else {
                System.out.println("You are in the garden.");
                System.out.println("Look at this big Willow. There is a swing. Do you want to \"sit\" or \"go\" on? ");
                String gardenAnswer = scan.next();
                if (gardenAnswer.equalsIgnoreCase("sit")) {
                    System.out.println("Do you want to \"swing\" or \"admire\" the view?");
                    String swingAnswer = scan.next();
                    if (swingAnswer.equalsIgnoreCase("swing")) {
                        System.out.println("So, you can relax. Have a nice time!");
                    }
                    else {
                        System.out.println("It's a good time to see sunset. Amazing!");
                    }
                }
                if (gardenAnswer.equalsIgnoreCase("go")) {
                    System.out.println("Do you see this strange shade on the tree? Do you want to \"check\" what is this or \"stay\" here?");
                    String treeAnswer = scan.next();
                    if (treeAnswer.equalsIgnoreCase("check")) {
                        System.out.println("There is a secret door... Would you like to \"open\" or \"stay\" here?");
                        String secretDoorAnswer = scan.next();
                        if (secretDoorAnswer.equalsIgnoreCase("open")) {
                            System.out.println("Be careful. The entrance is really narrow....\n.......\n.......\nDo you see this wonderful view? \nLook! Someone prepared a picnic for you. Sit and enjoy! ");
                        }
                        else {
                            System.out.println("Ok, so you can take a blanket which is hanging on the swing. Sit and enjoy!");
                        }
                    }
                    else {
                        System.out.println("Ok, so you can take a blanket which is hanging on the swing. Sit and enjoy!");
                    }
                }

            }
        }
        else {
            System.out.println("See you next time!");
        }
    }
}