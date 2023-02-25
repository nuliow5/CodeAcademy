package org.OOP.ClassAndMethods.Random;

import java.util.Random;
import java.util.Scanner;

public class RandomRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter random number generating");
        System.out.println("Enter range from: (min) ");

        int min = scanner.nextInt();

        System.out.println("Enter range to: (max) ");
        int max = scanner.nextInt();

        randomGenerateInRange(min, max);

    }

    public static void randomGenerateInRange(int min, int max){
        Random random = new Random();
        int randomValue = random.nextInt(max-min) + min;
        System.out.println(randomValue);
    }

}
