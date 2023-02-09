package org.Basic.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter first value for multiply");
        int row = scanner.nextInt();
        System.out.println("Enter first value for multiply");
        int collumn = scanner.nextInt();

        int result = row * collumn;
        System.out.println("Result is " + result);

        int[] sumArray = new int[row];


        int[][] multiplicationArray = new int[row][collumn];
        for (int i = 0; i <multiplicationArray.length ; i++) {

            for (int j =0; j<multiplicationArray[i].length; j++){
                multiplicationArray[i][j] = (i+1)*(j+1);
                System.out.print(multiplicationArray[i][j] + " ");

                sumArray[i] += multiplicationArray[i][j];

                if (j == multiplicationArray.length-1){
                    System.out.println(" suma is = " + sumArray[i]);
                }
            }
            System.out.println();
        }

        System.out.println("---------------------------");
        System.out.println(Arrays.deepToString(multiplicationArray));


        System.out.println("Masyvo suma");
        System.out.println(Arrays.toString(sumArray));


    }


}
