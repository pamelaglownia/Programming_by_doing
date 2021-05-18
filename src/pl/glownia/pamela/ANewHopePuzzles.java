package pl.glownia.pamela;

public class ANewHopePuzzles {
    public static void main(String[] args) {
        for (int firstNumber = 1; firstNumber < 45; firstNumber++) {
            for (int secondNumber = 1; secondNumber < 45; secondNumber++) {
                for (int thirdNumber = 1; thirdNumber < 45; thirdNumber++) {
                    for (int fourthNumber = 1; fourthNumber < 45; fourthNumber++) {
                        int sum = firstNumber + secondNumber + thirdNumber + fourthNumber;
                        if (sum == 45 && (firstNumber + 2 == secondNumber - 2 && secondNumber - 2 == thirdNumber * 2 && thirdNumber * 2 == fourthNumber / 2)) {
                            System.out.println(firstNumber + " + " + secondNumber + " + " + thirdNumber + " + " + fourthNumber + " = " + sum);
                            System.out.println(firstNumber + " + 2 = " + secondNumber + " - 2 = " + thirdNumber + " x 2 = " + fourthNumber + " / 2");
                        }
                    }
                }
            }
        }
    }
}