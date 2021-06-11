package pl.glownia.pamela;

public class Euler010 {
    public static void main(String[] args) {
        int number = 2000000;
        System.out.println(useSieveOfEratosthenes(number));
    }

    static long useSieveOfEratosthenes(int n) {
//        //use Sieve of Eratosthenes
        long sum = 0;
        boolean[] primes = new boolean[n];
        for (int i = 0; i < primes.length; i++) {
            primes[i] = true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (primes[i]) {
                for (int j = i * i; j < n; j += i) {
                    primes[j] = false;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (primes[i]) {
                sum += i;
            }
        }
        return sum;
    }
}