package org.TrainingInFreeTime.CodeWars.ConvertStringToCamelCase;
import java.lang.StringBuilder;
import java.util.Locale;

/*
    Complete the method/function so that it converts dash/underscore delimited words into camel casing.
    The first word within the output should be capitalized only if the original word was capitalized
    (known as Upper Camel Case, also often referred to as Pascal case).
    The next words should be always capitalized.
 */

public class Solution {
    public static void main(String[] args) {
        String firstTest = "the-stealth-warrior";
        String secondTest = "the_Stealth_Warrior";

        toCamelCase(secondTest);


    }

    static String toCamelCase(String s){
        String pattern = "[!@#$%&*()_+=|<>?{}\\[\\]~-]";
        String[] myString = s.split(pattern);
        String result = myString[0];
        for (int i = 1; i < myString.length; i++) {
            result += myString[i].substring(0,1).toUpperCase() + myString[i].substring(1);
        }
        System.out.println(result);
        return result;
    }
}
