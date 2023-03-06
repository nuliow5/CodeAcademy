package org.TrainingInFreeTime.Kata.Kata03_02;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            compareTwoNumber(50);
        }

    }

    public static void compareTwoNumber(int secondValue) {
        Random random = new Random();
        int difference;
        int firstValue = random.nextInt(secondValue * 2);

        if (firstValue > secondValue) {
            difference = firstValue - secondValue;
            System.out.println("First value " + firstValue + " is bigger that second " + secondValue + " by " + difference);

        } else if (firstValue < secondValue) {
            difference = secondValue - firstValue;
            System.out.println("Second value " + secondValue + " is bigger that first " + firstValue + " by " + difference);

        } else {
            System.out.println("Both variables are equal");
        }

    }
}
