package org.example.Negar;

/*
Write a program which will sort string array.
Expected output: String array: [Paris, London, New York, Stockholm]
Sort string array: [London, New York, Paris, Stockholm]
 */

import java.util.Arrays;

public class Ex3Arrays {
    public static void main(String[] args) {

        String[] metropolis = {"London", "New york", "Paris", "Stockholm"};

        Arrays.sort(metropolis);
        System.out.print(Arrays.toString(metropolis));

    }
}
