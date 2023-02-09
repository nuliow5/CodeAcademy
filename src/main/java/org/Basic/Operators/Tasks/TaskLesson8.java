package org.Basic.Operators.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class TaskLesson8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array length");
        System.out.println("If your input number > 7 array length be created is 8");

        int arrayLength;
        int defaultArrayLength = 8;
        int[] intArray;

        int inputValue = scanner.nextInt();

        if (inputValue <= 7 && inputValue > 0) {
            arrayLength = inputValue;
        } else if (inputValue > 7) {
            arrayLength = defaultArrayLength;
        } else arrayLength = -1; //exception

        intArray = new int[arrayLength];

        //first ant last array elements = array length
        intArray[0] = intArray.length;
        intArray[arrayLength - 1] = intArray.length;

        System.out.println("Array length is -" + intArray.length);

        System.out.println("First element of array is - " + intArray[0]);
        System.out.println("Last element of array is - " + intArray[arrayLength - 1]);

        //print array
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(" " + intArray[i]);
        }


    }
}
