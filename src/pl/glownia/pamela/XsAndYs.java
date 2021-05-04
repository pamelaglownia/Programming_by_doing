package pl.glownia.pamela;

public class XsAndYs {
    public static void main(String[] args) {
        System.out.println("x\t\ty");
        System.out.println("------------------");
        for (double i = -10.00; i <= 10.00; i += 0.5) {
            double y = Math.pow(i, 2.0);
            System.out.println(i + "\t\t" + y);
        }
    }
}
