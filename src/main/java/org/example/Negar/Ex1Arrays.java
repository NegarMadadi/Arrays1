package org.example.Negar;

/*
Write a program which will store elements in an array of
 type ‘int’ and print it out. Expected output:11 23 39 etc
 */

import java.util.Arrays;

public class Ex1Arrays {
    public static void main( String[] args )
    {
        int[] numbers = { 11, 23 , 39, 98};
        System.out.print(Arrays.toString(numbers));
    }
}
