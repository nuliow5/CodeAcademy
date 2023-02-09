package org.Basic.Tasks;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            int inputValue = scanner.nextInt();

            if (inputValue > 0){
                System.out.println("teigiamas");
            } else if (inputValue < 0 ) {
                System.out.println("Neigiamas");
            } else System.out.println(" ivestas 0");
        }


    }
}
