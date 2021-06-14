package pl.glownia.pamela;

public class Euler017 {
    static String[] ones = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    static String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    static String[] tens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static void main(String[] args) {
        System.out.println(countLetters(952));
    }

    static int countOnes(int n) {
        String word = "";
        int sum = 0;
        for (int i = 0; i < ones.length; i++) {
            if (i == n) {
                word = ones[i];
            }
        }
        for (int i = 0; i < word.length(); i++) {
            sum += 1;
        }
        return sum;
    }

    static int countTeens(int n) {
        String word = "";
        int sum = 0;
        for (int i = 0; i < teens.length; i++) {
            if (i == n) {
                word = teens[i];
            }
        }
        for (int i = 0; i < word.length(); i++) {
            sum += 1;
        }
        return sum;
    }

    static int countTens(int n) {
        String word = "";
        int sum = 0;
        for (int i = 0; i < tens.length; i++) {
            if (i == n) {
                word = tens[i];
            }
        }
        for (int i = 0; i < word.length(); i++) {
            sum += 1;
        }
        return sum;
    }

    static int countThousand() {
        String word = "thousand";
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            sum += 1;
        }
        return sum;
    }

    static int countHundred() {
        String word = "hundred";
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            sum += 1;
        }
        return sum;
    }

    static int countLetters(int n) {
        int sum = 0;
        if (n < 0 || n > 1000) {
            System.out.println("You number is not correct. Choose number from 0 to 1000.");
        }


        int hundredWord, tenWord, teenWord, oneWord;
        if (n == 1000) {
            sum += countThousand();
        }
        if (n >= 100 && n < 1000) {
            int temp = n / 100;
            hundredWord = countHundred() + countOnes(temp);
            n -= temp * 100;
            sum += hundredWord;
        }
        if (n >= 20 && n < 100) {
            int temp = n / 10;
            tenWord = countTens(temp);
            n -= temp * 10;
            sum += tenWord;
        }
        if (n >= 10 && n < 20) {
            teenWord = countTeens(n / 10);
            sum += teenWord;
        }
        if (n >= 0 && n < 10) {
            oneWord = countOnes(n);
            sum += oneWord;
        }

        return sum;
    }
}