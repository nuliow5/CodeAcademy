package org.Basic.Tasks;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputValue;
        int[] myArray = new int[3];


        System.out.println("Enter 3 int values");
         for (int i=0; i<3; i++){
             inputValue = scanner.nextInt();

             myArray[i] = inputValue;
         }
            System.out.println(Arrays.toString(myArray));

        int max = myArray[0];
        for (int i=0; i< myArray.length; i++){

            if (myArray[i] > max){
                max = myArray[i];
            }
        }
        System.out.println("Max value is " + max);




    }
}
