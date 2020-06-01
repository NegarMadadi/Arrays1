package org.example.Negar;

/*
Write a program which will sort string array.
Expected output: String array: [Paris, London, New York, Stockholm]
Sort string array: [London, New York, Paris, Stockholm]
 */

import java.util.Arrays;

public class Ex3Arrays {
    public static void main(String[] args) {
        String[] metropolis = {"Paris", "London", "New york", "Stockholm"};

      Arrays.sort(metropolis);
        System.out.print(Arrays.toString(metropolis));

     // how can we write to upper lines in one?
    }
}
