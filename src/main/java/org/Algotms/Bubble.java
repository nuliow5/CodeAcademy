package org.Algotms;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {

        //bubble pats lieciausias algoritamas
        int[] myArray = {1, -3, 5, 7, 9, -5};

        for (int i = 0; i < myArray.length ; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[i] <= myArray[j]){
                    int tempValue = myArray[j];
                    myArray[j] = myArray[i];
                    myArray[i] = tempValue;
                }
            }
        }

        System.out.println(Arrays.toString(myArray));
    }
}
