package org.TrainingInFreeTime.Kata.Enigma;

import java.util.Arrays;

public class EnigmaMain {
    public static void main(String[] args) {
        char [] charArr = {
                'Ė','ė',
                'J','j',
                'Š','š',
                'Ū','ū',
                'C','c',
                'F','f',
                'E','e',
                'A','a',
                'M','m',
                'Ę','ę',
                'D','d',
                'Z','z',
                'H','h',
                'Į','į',
                'Ž','ž',
                'N','n',
                'Y','y',
                'Č','č',
                'G','g',
                'S','s',
                'O','o',
                'P','p',
                'I','i',
                'R','r',
                'Ą','ą',
                'K','k',
                'T','t',
                'U','u',
                'B','b',
                'Ų','ų',
                'L','l',
                'V','v'
        };

        encryptTheMessage(charArr, "ABba");

    }

    public static void encryptTheMessage(char[] myArray, String inputFromUser){

        StringBuilder stringBuilder = new StringBuilder(inputFromUser);

        StringBuilder encryptValue = new StringBuilder("");

        //3 method
        int[] encryptingIndex = new int[stringBuilder.length()];

        for (int i = 0; i < stringBuilder.length(); i++) {
            for (int j = 0; j < myArray.length ; j++) {
                if (stringBuilder.charAt(i) == myArray[j]){
                    encryptValue.append(j).append(" ");

                    //for test
                    for (int k = 0; k < encryptingIndex.length; k++) {
                        encryptingIndex[i] = j;
                    }
                }
            }

        }


        System.out.println(inputFromUser + " -> " + encryptValue);
        System.out.println("Values in Array: " + Arrays.toString(encryptingIndex));

        //test
        String test = "";
        for (int i = 0; i < encryptingIndex.length; i++) {
            test += myArray[encryptingIndex[i]];
        }

        System.out.println("test " + test);



    }




}
