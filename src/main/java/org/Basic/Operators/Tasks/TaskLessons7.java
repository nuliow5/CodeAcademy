package org.Basic.Operators.Tasks;

import java.util.Arrays;

public class TaskLessons7 {
    public static void main(String[] args) {
        String javaValue = "Java";
        int arrayLength = javaValue.length(); //4

        String[] stringArray = new String[arrayLength]; //4

        for (int i=0; i < stringArray.length; i++){
            stringArray[i] = javaValue.substring(i,i+1).toUpperCase();
        }

        System.out.println(Arrays.toString(stringArray));



    }
}
