package org.TrainingInFreeTime;

import java.util.Arrays;

public class RotateArray90 {
    public static void main(String[] args) {
        int[][] myArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},

        };

        int[][] newArray = new int[myArray.length][myArray[0].length];

        //0 eilute
        //1 stulpelis


        /*
        0, 0       -> 0, last(2)
        0, 1       -> 1, last(2)
        0, 2       -> 2, last(2)

        1, 0       -> 0, 1
        1, 1       -> 1, 1
        1, last(2) -> 2, 1

        last(2), 0 -> 0, 0
        last(2), 1 -> 1, 0
  last(2), last(2) -> last(2), 0

         */

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j <myArray.length ; j++) {
                newArray[j][myArray.length-1-i] = myArray[i][j];
            }

        }

        System.out.println("------------------");
        System.out.println(Arrays.deepToString(newArray));


    }
}
