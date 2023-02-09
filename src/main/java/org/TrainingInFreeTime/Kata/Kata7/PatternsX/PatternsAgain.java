package org.TrainingInFreeTime.Kata.Kata7.PatternsX;

public class PatternsAgain {
    public static void main(String[] args) {
        String star = "*";
        String space = " ";
        int row = 5;

        for (int i = 1; i <= row; i++) {
            for (int j = i; j < row; j++) {
                System.out.print(space);
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print(star);
            }
            System.out.println();

        }



    }
}
