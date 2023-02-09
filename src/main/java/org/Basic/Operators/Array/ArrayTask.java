package org.Basic.Operators.Array;

import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array length");

        int arrayLength = scanner.nextInt();
        String[] userNamesArray = new String[arrayLength];

        System.out.println("Enter " + userNamesArray.length + " users names");

        String enterUserName;

        for (int i=0; i<userNamesArray.length; i++){
            enterUserName = scanner.next();
            userNamesArray[i] = enterUserName;
        }

        for (int i=0; i<userNamesArray.length; i++){
            System.out.println(userNamesArray[i] + "-"+ userNamesArray[i].length() + "-" +i);

        }


    }
}
