package pl.glownia.pamela;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        for (int hundreds = 1; hundreds <= 9; hundreds++) {
            for (int tens = 0; tens <= 9; tens++) {
                for (int ones = 0; ones <= 9; ones++) {
                    int number = hundreds * 100 + tens * 10 + ones;
                    int firstNumber = (int) Math.pow(hundreds, 3);
                    int secondNumber = (int) Math.pow(tens, 3);
                    int thirdNumber = (int) Math.pow(ones, 3);
                    if (number == (firstNumber + secondNumber + thirdNumber)) {
                        System.out.println(number + " is the armstrong number.");
                    }
                }
            }
        }
    }
}