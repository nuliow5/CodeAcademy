package org.TrainingInFreeTime.Kata.Kata_03_01.GenerateRandom;

import java.util.Random;
import java.util.Scanner;

public class GenerateRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Information.inputPrint();
        generateRandomNumberFromUserRange(scanner.nextInt(), scanner.nextInt());
    }

    private static void generateRandomNumberFromUserRange(int firstValue, int secondValue) {
        Random random = new Random();
        int valueFromRange = random.nextInt(secondValue - firstValue) + firstValue;
        System.out.println(valueFromRange);

    }

}

class Information{
    public static void inputPrint(){
        System.out.println("input range min ir max values");
    }
}