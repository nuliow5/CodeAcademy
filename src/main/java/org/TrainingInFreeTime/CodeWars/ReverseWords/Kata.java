package org.TrainingInFreeTime.CodeWars.ReverseWords;

import java.util.ArrayList;
import java.util.Arrays;

/*
   Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.

   "This is an example!" ==> "sihT si na !elpmaxe"
   "double  spaces"      ==> "elbuod  secaps"
    */
public class Kata {

    public static void main(String[] args) {

        String words = "The quick brown fox jumps over the lazy dog."; //==> "sihT si na !elpmaxe"
        String secondWord = "elbuod  decaps  sdrow";
        String allSpaces = " ";

        System.out.println(allSpaces);
        System.out.println(reverseWords(allSpaces));



        //test

        String hl = "Hello World ";
        System.out.println(hl);

        String hl2 = hl.substring(0, hl.length()-1);
        System.out.println(hl2);




    }


    public static String reverseWords(final String original) {
        String fullStringAfterReverse = "";
        String reverseWord = "";
        int spaceCounter = 0;


        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) != ' ' ){
                reverseWord += original.charAt(i);
                spaceCounter = 0;
                if (i == original.length()-1){
                    fullStringAfterReverse += new StringBuilder(reverseWord).reverse() + " ";
                }
            } else if (original.charAt(i) == ' '){

                fullStringAfterReverse += new StringBuilder(reverseWord).reverse() + " ";
                reverseWord = "";
                spaceCounter++;
            }

        }
        System.out.println("space count " + spaceCounter);

        if (spaceCounter == original.length()){
            return original;
        }

        if (fullStringAfterReverse != ""){
            String finaly = fullStringAfterReverse.substring(0, fullStringAfterReverse.length()-1);
            return finaly;
        } else {
            return fullStringAfterReverse;
        }





    }

}
