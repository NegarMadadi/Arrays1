package org.example.Negar;

import java.util.Arrays;
import java.util.Scanner;

public class Ex11Array {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse()));
    }


    private static int[] reverse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        //ask Erik
        //  for (int i = size - 1; i >= 0; i--) {
        System.out.println("Enter values for array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Created array is: " + Arrays.toString(array));


        // reverse
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
            System.out.print("The reverse array is: ");
        }
        return array;
    }
}



