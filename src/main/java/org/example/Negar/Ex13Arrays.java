package org.example.Negar;
/*13. Create two arrays with arbitrary size and fill one with random numbers.
        Then copy over the numbers from the array with random numbers so
        that the even numbers are located in the rear (the right side) part of the
        array and the odd numbers are located in the front part (the left side).*/

import sun.misc.FloatingDecimal;

import java.util.Arrays;

public class Ex13Arrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr));

        int left = 0, right = arr.length - 1;
        while (left < right) {
            /* Increment left index while we see 0 at left */
            while (arr[left] % 2 == 0 && left < right) ;
            while (left < right) {
                /* Increment left index while we see 0 at left */
                while (arr[left] % 2 == 0 && left < right)
                    left++;

                /* Decrement right index while we see 1 at right */
                while (arr[right] % 2 == 1 && left < right)
                    right--;

                if (left < right) {
                    /* Swap arr[left] and arr[right]*/
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
                left++;

                /* Decrement right index while we see 1 at right */
                while (arr[right] % 2 == 1 && left < right)
                    right--;

                if (left < right) {
                    /* Swap arr[left] and arr[right]*/
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
            }

            System.out.println(Arrays.toString(arr));
        }
    }}









