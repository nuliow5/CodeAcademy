package org.Basic.Operators.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class TaskLesson6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intValueScanner;
        int[] inputIntArray = new int[3];
        
        System.out.println(" enter 3 inv values");

        for (int i=0; i<inputIntArray.length; i++){
            intValueScanner = scanner.nextInt();
            inputIntArray[i] = intValueScanner;
        }
        System.out.println(Arrays.toString(inputIntArray));

        //NR - 1 | max array member;
        int max=0;
        for (int i=0; i<inputIntArray.length; i++){
            if (inputIntArray[i] > max){
                max = inputIntArray[i];
            }
        }
        System.out.println("max is " + max);

        //NR - 2 | Average
        double averageValue = 0d;
        int sum =0;
        for (int i=0; i<inputIntArray.length; i++){
            sum += inputIntArray[i];
        }
        averageValue = (sum / inputIntArray.length);

        System.out.println("Average is " + averageValue );

        //NR - 3 | sum of square
        int result =0;
        int sumResult = 0;
        for (int i=0; i<inputIntArray.length; i++){
            result = inputIntArray[i] * inputIntArray[i];
            sumResult += result;

        }

        System.out.println("Sum of square = " + sumResult);
    }
}
