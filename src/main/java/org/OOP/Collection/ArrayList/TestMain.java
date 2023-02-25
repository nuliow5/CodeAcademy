package org.OOP.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        final String WHITE = "\u001B[37m";
        final String RED = "\u001B[31m";
        final String ORANGE = "\u001B[33m";

        Scanner scanner = new Scanner(System.in);
        String input;

        ArrayList<String> myArray = new ArrayList<>();

        boolean check = true;

        String maxValue = "";


        while (true) {
            System.out.println(WHITE + "Enter some word");
            input = scanner.next();

            if (check == myArray.contains(input)) {
                System.out.println(RED + "This word all ready in list");
            } else {
                myArray.add(input);
                System.out.println(ORANGE + myArray);
            }

            if (myArray.size() == 5) {
                myArray.clear();
                System.out.println(ORANGE + "Array is cleared!!!");
                maxValue = "";
            }

            if (maxValue.length() < input.length() && myArray.size()-1 !=0){
                maxValue = input;
                System.out.println(maxValue + " is Biggest");
            }
        }


    }
}
