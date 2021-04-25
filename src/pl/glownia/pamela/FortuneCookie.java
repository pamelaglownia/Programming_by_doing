package pl.glownia.pamela;

import java.util.Random;

public class FortuneCookie {
    //Cookie fortune quotes are from Cookie fortune generator.

    public static void main(String[] args) {
        tellFortune();
    }

    static void tellFortune() {
        Random r = new Random();
        int cookie = 1 + r.nextInt(6);
        int luckyNumberOne = 1 + r.nextInt(54);
        int luckyNumberTwo = 1 + r.nextInt(54);
        int luckyNumberThree = 1 + r.nextInt(54);
        int luckyNumberFour = 1 + r.nextInt(54);
        int luckyNumberFive = 1 + r.nextInt(54);
        int luckyNumberSix = 1 + r.nextInt(54);
        String setOfLuckyNumbers = String.valueOf(luckyNumberOne) + "-" + String.valueOf(luckyNumberTwo) + "-" + String.valueOf(luckyNumberThree)
                + "-" + String.valueOf(luckyNumberFour) + "-" + String.valueOf(luckyNumberFive) + "-" + String.valueOf(luckyNumberSix);

        System.out.println("Fortune cookie says:");
        if (cookie == 1) {
            System.out.println("~~~ A dream you have will come true. ~~~\n    " + setOfLuckyNumbers);
        }
        if (cookie == 2) {
            System.out.println("~~~ You learn from your mistakes... You will learn a lot today. ~~~\n    " + setOfLuckyNumbers);
        }
        if (cookie == 3) {
            System.out.println("~~~ If you have something good in your life, don't let it go! ~~~\n    " + setOfLuckyNumbers);
        }
        if (cookie == 4) {
            System.out.println("~~~ Hard work pays off in the future, laziness pays off now. ~~~\n    " + setOfLuckyNumbers);
        }
        if (cookie == 5) {
            System.out.println("~~~ A friend asks only for your time not your money. ~~~\n    " + setOfLuckyNumbers);
        }
        if (cookie == 6) {
            System.out.println("~~~ The possibility of a career change is near. ~~~\n    " + setOfLuckyNumbers);
        }
    }
}
