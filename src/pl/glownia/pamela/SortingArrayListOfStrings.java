package pl.glownia.pamela;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayListOfStrings {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("cat");
        stringArrayList.add("mouse");
        stringArrayList.add("lion");
        stringArrayList.add("tiger");
        stringArrayList.add("elephant");
        stringArrayList.add("dog");
        stringArrayList.add("snake");
        stringArrayList.add("zebra");
        stringArrayList.add("monkey");
        stringArrayList.add("parrot");

        System.out.println("ArrayList before: " + stringArrayList);
        Collections.sort(stringArrayList);
        System.out.println("ArrayList after: " + stringArrayList);
    }
}