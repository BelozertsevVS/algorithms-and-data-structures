package com.ua.algorithmsanddatastructures.lesson3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        Static and Dynamic Data Arrays

         */

        var da = new DynamicArray(8);

        int value = 1;

        for (int i = 0; i < 8; i++) {
            da.add(value);
            value++;
        }

        for (int i = 0; i < da.size(); i++) {
            System.out.print(da.get(i) + "," + " ");
        }

        da.add(0, 99);

        System.out.println();

        for (int i = 0; i < da.size(); i++) {
            System.out.print(da.get(i) + "," + " ");
        }
    }
}
