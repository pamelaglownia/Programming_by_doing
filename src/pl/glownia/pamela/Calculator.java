package pl.glownia.pamela;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double a, b, c;
        String op;
        do {
            System.out.print("> ");
            a = keyboard.nextDouble();
            op = keyboard.next();
            b = keyboard.nextDouble();
            if (op.equals("+")) {
                c = add(a, b);
            }
            else if (op.equals("-")) {
                c = subtract(a, b);
            }
            else if (op.equals("*")) {
                c = multiply(a, b);
            }
            else if (op.equals("/")) {
                c = divide(a, b);
            }
            else if (op.equals("^")) {
                c = power(a, b);
            }
            else if (op.equals("%")) {
                c = modulus(a, b);
            }
            else {
                System.out.println("Undefined operator: '" + op + "'.");
                c = 0;
            }
            System.out.println(c);
        } while (a != 0);
        System.out.println("Bye, now.");
    }

    public static double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public static double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public static double divide(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public static double power(double firstNumber, double secondNumber) {
        return Math.pow(firstNumber, secondNumber);
    }

    public static double modulus(double firstNumber, double secondNumber) {
        return firstNumber % secondNumber;
    }
}