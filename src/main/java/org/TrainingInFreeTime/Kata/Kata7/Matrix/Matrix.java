package org.TrainingInFreeTime.Kata.Kata7.Matrix;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
    Susikuriame 2 skaičių matricas 5x5. Vienos reikšmės įvedamos vartotojo, kitos sugeneruojamos atsitiktiniu būdu.
    Sudauginę abiejų matricų reikšmes, surašome į naują matricą ir išspausdiname jų reikšmes.
 */
public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowColumn = 5;
        int [][] firstArray = new int[rowColumn][rowColumn];
        int [][] secondArray = new int[rowColumn][rowColumn];
        int [][] multiplicationFirstAndSecondArray = new int[rowColumn][rowColumn];

        for (int i = 0; i < firstArray.length; i++){
            for (int j = 0; j < firstArray[0].length; j++) {
                System.out.println("Enter array element: [" + i + "][" + j + "]");
                firstArray[i][j] = scanner.nextInt();
            }
        }

        System.out.println("First Array: " + Arrays.deepToString(firstArray));

        System.out.println("-----------Matrix with random elements--------------------------");

        Random random = new Random();

        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < secondArray[0].length; j++) {
                secondArray[i][j] = random.nextInt(20);
            }
        }

        System.out.println("Second Array: " + Arrays.deepToString(secondArray));

        System.out.println();

        System.out.println("---------Multiplication First And Second Array---------");

        for (int i = 0; i < multiplicationFirstAndSecondArray.length; i++){
            for (int j = 0; j < multiplicationFirstAndSecondArray[0].length; j++) {
                multiplicationFirstAndSecondArray[i][j] = firstArray[i][j] * secondArray[i][j];
            }
        }

        //print
        for (int i = 0; i < multiplicationFirstAndSecondArray.length; i++){
            for (int j = 0; j < multiplicationFirstAndSecondArray[0].length; j++) {
                System.out.println(multiplicationFirstAndSecondArray[i][j]);
            }
        }

        System.out.println(Arrays.deepToString(multiplicationFirstAndSecondArray));



    }
}
