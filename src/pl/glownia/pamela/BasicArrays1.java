package pl.glownia.pamela;

public class BasicArrays1 {
    public static void main(String[] args) {
        int[] array = {-113, -113, -113, -113, -113, -113, -113, -113, -113, -113};
        for (int count = 0; count < array.length; count++) {
            System.out.println("Slot " + count + " contains a " + array[count]);
        }
    }
}