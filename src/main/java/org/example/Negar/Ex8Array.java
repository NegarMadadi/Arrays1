
package org.example.Negar;

import java.util.Arrays;

public class Ex8Array {
    public static void main(String[] args) {
        int array[] = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        System.out.println("Array: " + Arrays.toString(array));

        Arrays.sort(array);
        int length = array.length;
        int temp[] = new int[array.length];
        int j = 0;

        for (int i = 0; i < length-1; i++) {
            if (array[i] != array[i + 1]) {
                temp[j] = array[i];
                j++;
            }
        } System.out.println("Array without duplicate values: " + Arrays.toString(temp));
    }// Ask erik
}


