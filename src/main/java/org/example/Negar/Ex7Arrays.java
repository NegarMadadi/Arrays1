package org.example.Negar;

/*Write a program which will set up an array to hold 10 numbers and print
out only the uneven numbers.
Expected output: Array: 1 2 4 7 9 12
Odd Array: 1 7 9 */


import java.util.Arrays;

public class Ex7Arrays {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Odd array: ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i]);
            }
        }
    }
}
