package org.OOP.ClassAndMethods.Random;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Guess a two dice sum ");
        int inputValue = scanner.nextInt();

        int firstDice = random.nextInt(6)+1;
        int secondDice = random.nextInt(6)+1;

        int diceSum = firstDice + secondDice;

        int difference = inputValue - diceSum;

        System.out.println("First dice is - " + firstDice +
                "\nSecond dice is - " + secondDice);

        if (inputValue == diceSum){
            System.out.println("Congratulation!!!");
        } else if (difference < 0) {
            System.out.println("It was necessary to choose " + difference + " bigger");
        }else if (difference > 0) {
            System.out.println("It was necessary to choose " + difference + " smaller");
        }
    }
}
