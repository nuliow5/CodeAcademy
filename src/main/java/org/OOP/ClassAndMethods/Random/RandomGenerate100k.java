package org.OOP.ClassAndMethods.Random;

import java.util.Random;

public class RandomGenerate100k {
    public static void main(String[] args) {

        randomProbabilityCalculation(100000);

    }
    public static void randomProbabilityCalculation(int randomQuantity){
        Random random = new Random();

        int[] countRandom = new int[10];

        int randomValue;

        for (int i=1; i <= randomQuantity; i++){
            randomValue = random.nextInt(10)+1;

            countRandom[randomValue-1]++;
        }

        for (int j = 0; j < countRandom.length; j++) {
            System.out.println((j+1) + " -> " + countRandom[j]);
        }

        System.out.println("-----------------TEST-------------------");
        // Did 100,000 random events really happen?

        int sum = 0;

        for (int i = 0; i < countRandom.length ; i++) {
            sum += countRandom[i];
        }

        if (sum == randomQuantity){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }

}
