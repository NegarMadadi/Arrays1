package org.example.Negar;

import java.util.Arrays;

public class Ex2Arrays {
    public static void main(String[] args) {
        indexOf();
    }


    public static void indexOf() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        int indexFound = Arrays.binarySearch(numbers, 7);

        if (indexFound < numbers.length && indexFound > 0) {
            System.out.println("Index position of chosen number is: " + indexFound);
        } else {
            System.out.println(-1);
        }
    }
}
