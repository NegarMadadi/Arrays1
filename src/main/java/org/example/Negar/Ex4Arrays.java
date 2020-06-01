package org.example.Negar;

import java.util.Arrays;

public class Ex4Arrays {
    public static void main(String[] args) {

        int[] originalArray = { 1, 15, 20};
        int[] copyArray = Arrays.copyOf( originalArray, 3);

        System.out.println(Arrays.toString(copyArray));
    }
}
