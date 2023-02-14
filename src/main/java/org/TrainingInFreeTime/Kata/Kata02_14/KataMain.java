package org.TrainingInFreeTime.Kata.Kata02_14;

import java.util.Arrays;

public class KataMain {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 1, 5, 2};

        whatHappenToMyArray(numbers, 4);

    }

    public static void whatHappenToMyArray(int[] myArray, int inputValue){
        if (inputValue % 2 == 0){
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = 0;
            }
        } else {
            Arrays.sort(myArray);
        }
        //print
        System.out.println(Arrays.toString(myArray));
    }
}
