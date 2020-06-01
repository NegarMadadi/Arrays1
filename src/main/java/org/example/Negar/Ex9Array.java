package org.example.Negar;

import java.util.Arrays;

public class Ex9Array {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(expandArray()));
    }

    public static int[] expandArray() {
        int array[] = {1, 2, 3, 4, 5, 6, 7};
        int arrayExpand[] = Arrays.copyOf(array, array.length + 3);
        arrayExpand[7] = 8;
        arrayExpand[8] = 9;
        arrayExpand[9] = 10;
        return arrayExpand;
    }
}

