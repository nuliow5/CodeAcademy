package org.TrainingInFreeTime.Kata.Kata02_22;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] myArray = {
                {3, 6, 8, 7, 9},
                {9, 4, 6, 2, 6},
                {2, 5, 1, 9, 3},
                {6, 3, 8, 1, 5},
        };

        sortArray(myArray);

        printMatrix(myArray);

    }

    public static void sortArray(int[][] myArray){
        for (int i = 0; i < myArray.length; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < myArray[i].length; j++) {
                    for (int k = 0; k < myArray[i].length; k++) {
                        if (myArray[i][j] >= myArray[i][k]) {
                            int tempValue = myArray[i][k];
                            myArray[i][k] = myArray[i][j];
                            myArray[i][j] = tempValue;
                        }
                    }

                }

            } else {
                for (int j = 0; j < myArray[i].length; j++) {
                    for (int k = 0; k < myArray[i].length; k++){
                        if (myArray[i][j] <= myArray[i][k]) {
                            int tempValue = myArray[i][k];
                            myArray[i][k] = myArray[i][j];
                            myArray[i][j] = tempValue;
                        }
                    }
                }
            }
        }

        System.out.println(Arrays.deepToString(myArray));
    }

    public static void printMatrix(int[][] myArray){
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
