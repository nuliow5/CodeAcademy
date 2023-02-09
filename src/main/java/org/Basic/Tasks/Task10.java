package org.Basic.Tasks;

import java.util.LinkedList;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite savo saskaitos dydi");
        double deposit = scanner.nextDouble();

        double inputMoneyBack;

        LinkedList<Double> transactionHistory = new LinkedList<>(); //show how your deposit decreases after withdrawal

        boolean start = true;
        int badInputCount = 0;

        while (start){
            System.out.println("Jusu saskaitoje: " + deposit + " $");
            transactionHistory.add(deposit);
            System.out.println("Q: Kiek norite issiimti pinigu?");

            inputMoneyBack = scanner.nextDouble();

            if (inputMoneyBack == 0){
                System.out.println("#### Jus paspaudete " + inputMoneyBack + " programos pabaiga!");
                start = false;
            }
            if (deposit > inputMoneyBack){
                badInputCount = 0;
                deposit = deposit - inputMoneyBack;
            } else if (deposit == inputMoneyBack) {
                badInputCount = 0;
                deposit = deposit - inputMoneyBack;
                System.out.println("Jusu saskaita tuscia!: " + deposit + " $");
                start = false;
            } else if (deposit < inputMoneyBack) {
                System.out.println("---------> Jusu ivesta suma yra per didele !!!!!");
                badInputCount++;
                if (badInputCount == 2){
                    System.out.println("Q: Atsargiai jus jau suklydote " + badInputCount + " kartus. Dar kartas " +
                            "ivesite bloga reiksme ir programa nustos veikti");
                }else if (badInputCount == 3){
                    System.out.println("ERROR -> Kritine klaida, 3 kartus vedete netinkama suma");
                    start = false;

                }
            }
        }
        scanner.close();

        System.out.println("Your deposit balance history " + transactionHistory);

    }
}
