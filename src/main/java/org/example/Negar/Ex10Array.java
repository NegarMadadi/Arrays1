package org.example.Negar;

/*Write a program which will represent multiplication table stored in
        multidimensional array.
        Hint: You have two-dimensional array with values
        [[1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]]*/

//Ask erik

public class Ex10Array {
    public static void main(String[] args) {
        int numbers[][] = new int[10][10];

        System.out.println("Square matrix:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }


        System.out.println("Multiplication table:");

        int row;
        int column = 0;

        for (int i = 0; i < numbers.length; i++) {
            row = 1;
            column++;

            for (int j = 0; j < numbers.length; j++) {
                numbers[i][j] = row++ * column;

                System.out.print(numbers[i][j] + "\t");
                if (j == numbers[i].length - 1) {
                    System.out.println();

                }
            }
        }
    }
}