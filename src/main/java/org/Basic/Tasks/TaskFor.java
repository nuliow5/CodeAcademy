package org.Basic.Tasks;

import java.util.Scanner;

public class TaskFor {
    public static void main(String[] args) {
        int rows = 5;
        String star = "* ";

        for (int i=0; i< rows; i++){
            for (int j = 0; j < i; j++) {
                System.out.print(star);
            }
            System.out.println();
        }

        for (int i = rows; i>0 ; i--){
            for (int j = i; j>0; j--){
                System.out.print(star);
            }
            System.out.println();
        }

        System.out.println("--------------------");



        for (int i=0; i< rows; i++) {
            for (int j = 0; j < (rows * 2) - 2; j++) {
                System.out.print(" ");

            }
            System.out.print(star);

        }
    }
}
