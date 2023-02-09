package org.Basic.Kata;

import java.util.Arrays;

public class KataForFun {
    public static void main(String[] args) {
        int[] digits = {1, -3, 5, 7, 9, -5};
        int result = 0;

        for (int i=0; i< digits.length; i++){
            result = result +digits[i];
        }

        System.out.println(result);

        int i=0;
        while (i< digits.length) {
            result = result +digits[i];
            i++;
        }

        System.out.println(result);

    }
}
