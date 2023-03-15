package org.TrainingInFreeTime.CodeWars.SplitString;

import java.util.Arrays;

/*
Complete the solution so that it splits the string into pairs of two characters.
If the string contains an odd number of characters then it should replace the
missing second character of the final pair with an underscore ('_').

Examples:
abc =>  ['ab', 'c_']
abcdef => ['ab', 'cd', 'ef']
HelloWorld => [He, ll, oW, or, ld]
 */
public class StringSplit {
    public static void main(String[] args) {
        String valueOne = "HelloWorld";
        String valueTwo = "abc";

        String[] arr = valueOne.split("(?<=\\G.{3})");
        System.out.println("arr - " + Arrays.toString(arr));

        System.out.println(Arrays.toString(solution(valueOne)));

        System.out.println(Arrays.toString(solution2(valueTwo)));

    }

    public static String[] solution(String s) {
        int arrayLength = 0;

        if (s.length() % 2 == 0) {
            arrayLength = s.length() / 2;
        } else {
            arrayLength = (s.length() / 2) + 1;
        }

        String[] array = new String[arrayLength];
        String[] splitStringInArray = s.split("");

        for (int i = 0; i < array.length; i++) {
            if (i== arrayLength-1 && s.length() %2 !=0){
                array[array.length-1] = splitStringInArray[splitStringInArray.length-1] + "_";
                break;
            }
            if (i == 0) {
                array[0] = splitStringInArray[0] + splitStringInArray[1];
            } else {
                array[i] = splitStringInArray[i * 2] + splitStringInArray[i * 2 + 1];
            }

        }
        return array;
    }

    //another soliution

    public static String[] solution2(String s) {
        String[] arr = s.split("(?<=\\G.{2})");
        System.out.println("split " + Arrays.toString(arr));

        if(s.length()%2 == 1)
            arr[arr.length-1] += "_";

        return arr;
    }

}
