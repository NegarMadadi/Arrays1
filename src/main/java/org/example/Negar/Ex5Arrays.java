package org.example.Negar;

/*Create a two-dimensional string array [2][2]. Assign values to the 2d
  array containing any Country and City.
  Expected output: France Paris
                   Sweden Stockholm*/

public class Ex5Arrays {
    public static void main(String[] args) {

        String[][] countryAndCapitals = new String[2][2];
        countryAndCapitals[0][0] = "France ";
        countryAndCapitals[0][1] = "Sweden";
        countryAndCapitals[1][0] = "Paris ";
        countryAndCapitals[1][1] = "Stockholm";

// Can we put space between two array object?Ask Erik.
//        System.out.println(countryAndCapitals[0][0] + countryAndCapitals [0][1]);
//        System.out.println(countryAndCapitals[1][0] + countryAndCapitals [1][1]);

        // how can I put a space between two array object?Ask Erik.
        System.out.print(countryAndCapitals[0][0]);
        System.out.println(countryAndCapitals[0][1]);
        System.out.print(countryAndCapitals[1][0]);
        System.out.println(countryAndCapitals[1][1]);
    }
}
