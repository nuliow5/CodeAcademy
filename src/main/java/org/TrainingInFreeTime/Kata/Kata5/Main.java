package org.TrainingInFreeTime.Kata.Kata5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputNumbers = new int[5];

        int inputFromUser;

        int badInput = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number from 1 to 5");
            inputFromUser = scanner.nextInt();
            System.out.println("=== Your input is  " + inputFromUser + " ====");

            if (inputFromUser >0 && inputFromUser <=5){
                inputNumbers[inputFromUser-1]++;
            } else if (inputFromUser < 0) {
                System.out.println("Your input is too short");
                badInput++;
            } else if (inputFromUser > 0) {
                System.out.println("Your input is too big");
                badInput++;
            }

        }

        //print
        for (int i = 0; i < inputNumbers.length; i++) {
            System.out.println((i+1) + " your input count is - > " + inputNumbers[i]);
        }

        System.out.println(Arrays.toString(inputNumbers));

        System.out.println("Wrong input count is => " + badInput + " time");

        //sort
        for (int i = 0; i < inputNumbers.length; i++) {
            for (int j = i; j < inputNumbers.length; j++) {
                if (inputNumbers[i] < inputNumbers[j]){
                    int tempValue = inputNumbers[j];
                    inputNumbers[j] = inputNumbers[i];
                    inputNumbers[i] = tempValue;
                }
            }

        }
        System.out.println("-----------------");
        System.out.println(Arrays.toString(inputNumbers));



    }
}
