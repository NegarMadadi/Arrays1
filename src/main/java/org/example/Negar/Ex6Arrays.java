package org.example.Negar;

/*Write a program which will set up an array to hold the next values in this
order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
Expected output: Average is: 17.3 */

import java.util.Arrays;

public class Ex6Arrays {
    public static void main(String[] args) {
        double total = 0;

        int[] intArray = {43, 5, 23, 17, 2, 14};
        for (int i = 0; i < intArray.length; i++) {
             total += intArray[i];
        }

        double average = total / intArray.length;
        System.out.println("Average is: " + Math.round(average * 10.0)/10.0);
    }
}
