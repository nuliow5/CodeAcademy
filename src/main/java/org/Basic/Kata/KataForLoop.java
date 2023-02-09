package org.Basic.Kata;

import java.util.Arrays;

/**
 * For loop kata:
 * <br/>
 * <p>Simple:
 * <p>1. Calculate text words
 * <p>2. Put each text into array
 * <p>3. Print only those words where word length more than 10 (iterate through array)
 * <p>
 * <br/>
 * Medium:
 * <p>1. From array return only capital letter words (iterate through array)
 * <p>2. From array return only words where are date (iterate through array)
 * <p>
 * <br/>
 * High:
 * <p>1. Put each text into array of arrays (String[][] words). Split the words of the text parallel into column and row.
 * <p>  - use printf with format: %20s
 * <p>
 * <br/>
 * Very High:
 * <p>1. Do copy to new array of arrays by according to the condition:
 * <p> Eliminate words that are not 4 to 7 in length and show in matrix table.
 * <p>2. When have result by 1st point above, return in each line symbols count
 * <br/>
 * !Good luck!
 */
public class KataForLoop {
    private final static String TEXT = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
            "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer " +
            "took a galley of type and scrambled it to make a type specimen book. It has survived not only five " +
            "centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was " +
            "popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more " +
            "recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

    public static void main(String[] args) {

        String[] splitTextArray = new String[TEXT.split(" ").length];

        for (int i=0; i<TEXT.split(" ").length; i++){
            splitTextArray[i] = TEXT.split(" ")[i];

            if (splitTextArray[i].length() > 10){
                System.out.println("more that 10 -> " + splitTextArray[i]);

            }
            if (Character.isUpperCase(splitTextArray[i].charAt(0))){
                System.out.println("With Capital letter -> " + splitTextArray[i]);

            }
            //isDigit method -> determines whether a specified character is a digit or not
//            if (splitTextArray[i].charAt(0) >= 0 || splitTextArray[i].charAt(0) <= 9){
            if (Character.isDigit(splitTextArray[i].charAt(0))){
                System.out.println("DATA --> " + splitTextArray[i]);
            }

        }
        System.out.println("Count word:  " + splitTextArray.length);
        System.out.println("-------------High | [][]---------------------------");
//        System.out.println(Arrays.toString(splitTextArray));

        // Put each text into array of arrays (String[][] words). Split the words of the text parallel into column and row.
        //- use printf with format: %20s

        int row = (int) Math.sqrt(splitTextArray.length);
        int collumn = (int) Math.sqrt(splitTextArray.length);



        String[][] words = new String[row][collumn];

        for (int i=0; i<words.length; i++){
            for (int j = 0; j < words[i].length; j++) {
                //need do j*j
                words[i][j] = splitTextArray[(i+1)*(j+1)];
                System.out.printf("%20s", words[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n-------------Very High | copy to new [][]---------------------------\n");

        String[][] newWordsArray = new String[row][collumn];

        for (int i=0; i<newWordsArray.length; i++){
            for (int j = 0; j < newWordsArray[i].length; j++) {
                if (splitTextArray[j].length() > 4 && splitTextArray[j].length() < 7){
                    newWordsArray[i][j] = splitTextArray[j];
                    System.out.printf("%20s", newWordsArray[i][j]);
                }
            }
            System.out.println();
        }

        //atspausdinti vidu simboliu suma  is paskutiniai gauto masyvo.

    }
}
