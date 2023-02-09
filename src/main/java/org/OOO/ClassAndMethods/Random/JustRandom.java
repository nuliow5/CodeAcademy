package org.OOO.ClassAndMethods.Random;

import java.util.Random;

public class JustRandom {
    public static void main(String[] args) {

        Random random = new Random();

        int firstValue = random.nextInt(100)+1;
        int secondValue = random.nextInt(100)+1;
        int thirdValue = random.nextInt(100)+1;

        int[] myArray = new int[3];
        myArray[0] = firstValue;
        myArray[1] = secondValue;
        myArray[2] = thirdValue;

        int maxValue = myArray[0];

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(i + " -> " + myArray[i]);
            if (myArray[i] > maxValue){
                maxValue = myArray[i];
            }
        }
        System.out.println(maxValue);

        System.out.println();

    }
}
