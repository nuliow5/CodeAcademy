package org.NullAndExceptions.Exception.DivisionAgain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainDivision {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            try {
                divisionTwoNumbers();
            } catch (ArithmeticException | NumberFormatException e) {
                System.out.println(e);
            }

        }

    }


    private static void divisionTwoNumbers() {

        try {
            System.out.print("Enter the numerator: ");
            int firstValue = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter the denominator: ");
            int secondValue = Integer.parseInt(scanner.nextLine());

            if (secondValue == 0) {
                throw new ArithmeticException("You cant division from ZERO");
            } else {
                int result = firstValue / secondValue;
                System.out.println(firstValue + " / " + secondValue + " = " + result);
            }

        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException);
        } catch (NumberFormatException nuNumberFormatException){
            System.out.println("Bad input");
        }


    }
}

