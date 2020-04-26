package org.example.Negar;

/* Write a program which will copy the elements of one array into another
array.Expected output: Elements from first array: 1 15 20
Elements from second array: 1 15 20
 */

import java.util.Arrays;

public class Ex4Arrays {
    public static void main(String[] args) {

        int[] originalArray = { 1, 15, 20};
        int[] copyArray = Arrays.copyOf( originalArray, 3);

        System.out.println(Arrays.toString(copyArray));
    }
}
