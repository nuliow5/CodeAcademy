package org.TrainingInFreeTime;

import java.util.Arrays;

public class StringDublicate {
    public static void main(String[] args) {
        String startingValue = "w3resource";
//        startingValue = startingValue.substring(0,1) + startingValue.substring(startingValue.length()-1);

        char[] myArray = startingValue.toCharArray();

        String target = "";
        for (char charValue : myArray){
            System.out.println(charValue + " - " + target.indexOf(charValue));
            if (target.indexOf(charValue) == -1){
                System.out.println(charValue + " - " + target.indexOf(charValue));
                target += charValue;
            }
        }
        System.out.println(target);






    }




}
