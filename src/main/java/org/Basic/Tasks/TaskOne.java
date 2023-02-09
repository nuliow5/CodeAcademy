package org.Basic.Tasks;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("# Enter Array length from 5 to 10");

        int inputArrayLength = scanner.nextInt();
        int[] myArray = new int[0];

        if (inputArrayLength >= 5 && inputArrayLength <10){
            myArray = new int[inputArrayLength];

            System.out.println("# Pls enter 3 \"int\" type array elements");

            for (int i=0; i<3; i++){
                myArray[i] = scanner.nextInt();
            }
            myArray[myArray.length-1] = myArray.length;

        } else System.out.println("!!! Error, wrong number !!!");

        //print array
        for (int i= 0; i< myArray.length; i++){
            System.out.print(" " + myArray[i]);
        }

        System.out.println("\nArray length is " + myArray.length);

    }
}
