package org.OOO.ClassAndMethods.Random;

import java.util.Random;
import java.util.Scanner;

public class ColdOrHot {
    public static void main(String[] args) {
        Random random = new Random();
        int randomValue = random.nextInt(100)+1;

        Scanner scanner = new Scanner(System.in);
        int inputNumber;
        int count = 10;

        for (int i=1; i<=10; i++){
            count = 10 - i;
//            System.out.println("random for test= " + randomValue);

            System.out.println("Guess random number");
            inputNumber = scanner.nextInt();

            if (inputNumber == randomValue){
                System.out.println("Congratulations");
            } else if (inputNumber < randomValue) {
                System.out.println("the number entered is too small, TRY AGAIN" );
                System.out.println("You have " + count + " attempts left" );


            }else if (inputNumber > randomValue){
                System.out.println("the number entered is too big, TRY AGAIN");
                System.out.println("You have " + count + " attempts left" );
            }


        }
    }
}
