package org.example.Negar;

/*
 Create a program and create a method with name ‘indexOf’ which will
find and return the index of an element in the array. If the element
does not exist your method should return -1 as value.
Expected output: Index position of number 5 is: 2.
*/

import java.util.Arrays;

public class Ex2Arrays {
    public static void main(String[] args) {
        indexOf();
    }


    public static void indexOf() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        int indexFound = Arrays.binarySearch(numbers, 6);
        int indexNotFound = Arrays.binarySearch(numbers, 8);

        System.out.println("Index position of number 6 is: " + indexFound);
        System.out.println(-1);

    }
}