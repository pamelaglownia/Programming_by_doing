package pl.glownia.pamela;

import java.util.ArrayList;

public class BasicArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            numbers.add(i, -113);
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Slot " + i + " contains a " + numbers.get(i));
        }
    }
}