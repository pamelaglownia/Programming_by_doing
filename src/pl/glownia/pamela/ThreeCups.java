package pl.glownia.pamela;

import java.util.Random;
import java.util.Scanner;

public class ThreeCups {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ballOne = " 1 won";
        System.out.println("Let's play a game. \nI have 3 blue cups and one red ball. I will hide the ball inside one of the cups and shuffle all cups.");
        System.out.println("Guess, which cup has the ball?\n");
        System.out.println("   ###          ###          ### \n  #####        #####        ##### \n #######      #######      #######\n    1            2            3 \n");
        System.out.print("Your answer: ");
        int guess = scan.nextInt();
        playTheGame(guess);
    }

    static void playTheGame(int guess) {
        Random random = new Random();
        int number = 1+ random.nextInt(3);
        String ballOne = "   WIN          ###          ### \n   WIN         #####        ##### \n   WIN        #######      #######\n    1            2            3 ";
        String ballTwo = "   ###          WIN          ### \n  #####         WIN         ##### \n #######        WIN        #######\n    1            2            3 ";
        String ballThree = "   ###          ###          WIN \n  #####        #####         WIN  \n #######      #######        WIN  \n    1            2            3 ";
    if (number ==guess) {
        if (number == 1) {
            System.out.println(ballOne + "\n Good answer!");
        }
        if (number == 2) {
            System.out.println(ballTwo + "\n Good answer!");
        }
        if (number == 3) {
            System.out.println(ballThree + "\n Good answer!");
        }
    }
    if(number!= guess){
        if (number == 1) {
            System.out.println("Unfortunately, bad answer. \nThe correct answer is:");
            System.out.println(ballOne);
        }
        else if (number == 2) {
            System.out.println("Unfortunately, bad answer. \nThe correct answer is:");
            System.out.println(ballTwo);
        }
       else if (number == 3) {
            System.out.println("Unfortunately, bad answer. \nThe correct answer is:");
            System.out.println(ballThree);
        }
    }
    }

}

