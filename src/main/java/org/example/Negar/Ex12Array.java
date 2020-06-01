package org.example.Negar;

import java.util.Arrays;

public class Ex12Array {
    public static void main(String[] args) {
        int[][] integer = {{1, 2, 3}, {2, 4, 6}, {3, 6, 9}};
        System.out.println(Arrays.deepToString(integer));


        System.out.println("\nSquare matrix:");
        for (int i = 0; i < integer.length; i++) {
            for (int j = 0; j < integer[i].length; j++) {
                System.out.print(integer[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Left diagonal members:");
        for (int i = 0; i < integer.length; i++) {
            for (int j = 0; j < integer.length; j++) {
                if (i == j)
                    System.out.print(integer[i][j] + "\t");
            }
        }
    }
}

