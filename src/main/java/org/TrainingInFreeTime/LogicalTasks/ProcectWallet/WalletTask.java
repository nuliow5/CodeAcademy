package org.TrainingInFreeTime.LogicalTasks.ProcectWallet;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
public class WalletTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls input length of Array");
        int inputArrayLength = scanner.nextInt();
        int inputNumber;

        LinkedList<Integer> startMoneyArray = new LinkedList<>();

        System.out.println("Enter coin values");

        for (int i=0; i<inputArrayLength; i++){
            inputNumber= scanner.nextInt();
            startMoneyArray.add(inputNumber);
        }
        System.out.println(startMoneyArray);
        Collections.sort(startMoneyArray);
        System.out.println("Sorted -> " + startMoneyArray);

        //1. Sum all money what we have
        int inputMoneySum = 0;

        for (int i = 0; i < startMoneyArray.size(); i++) {
            inputMoneySum += startMoneyArray.get(i);

        }
        System.out.println("Input money sum is -> " + inputMoneySum);
        System.out.println("So FirstWallet and SecondWallet must got about at -> " + inputMoneySum / 2 + " +- money");

        //2. Logic how split money to both wallet
        LinkedList<Integer> firstWallet = new LinkedList<>();
        LinkedList<Integer> secondWallet = new LinkedList<>();

        //what index element we take from int[] startMoneyArray
        LinkedList<Integer> tempArrayForTakenMembersIndex = new LinkedList<>();

        int preliminaryWalletBalance = inputMoneySum / 2;

        int tempVariable;

        System.out.println("--------------------------------------------");

        //FIRST WALLET

        int sumForTest = 0;
        for (int i = startMoneyArray.size() - 1; i >= 0; i-=2) {
            System.out.println("to Second Wallet " + i + " -> " + startMoneyArray.get(i));

            if (sumForTest < preliminaryWalletBalance) {
                tempVariable = startMoneyArray.get(i);
                firstWallet.add(tempVariable);
                sumForTest += tempVariable;
                tempArrayForTakenMembersIndex.add(i);
            }
        }


        System.out.println("# First wallet array " + firstWallet);
        int firstWalletSum = 0;

        for (int i = 0; i < firstWallet.size(); i++) {
//            System.out.println(firstWallet.get(i));
            firstWalletSum += firstWallet.get(i);
        }

        System.out.println("$ First wallet balance(sum) is : " + firstWalletSum);
        System.out.println("--------------------------------------------");

        //SECOND WALLET
        sumForTest = 0;
        for (int i = startMoneyArray.size() - 2; i >= 0; i-=2) {
            System.out.println("to Second Wallet " + i + " -> " + startMoneyArray.get(i));

            tempVariable = startMoneyArray.get(i);
            secondWallet.add(tempVariable);
            sumForTest += tempVariable;
            tempArrayForTakenMembersIndex.add(i);
        }
//        System.out.println("__________Testinis masyvas indeksasm  " + tempArrayForTakenMembersIndex );

        //INSPECTION!
        //Find what index from "startMoneyArray" doesn't taken!
        boolean booleanTestValue = false;
        int lostElementIndex = 0;
        if (startMoneyArray.size() != tempArrayForTakenMembersIndex.size()+1){
            //CREATE NEW ARRAY FOR COMPARISON
            for (int i = 0; i<tempArrayForTakenMembersIndex.size(); i++){
                for (int j = 0; j < tempArrayForTakenMembersIndex.size(); j++){
                    if (i == tempArrayForTakenMembersIndex.get(j)){
                        lostElementIndex = i;
                        break;
                    }
                }
            }

        }

//        System.out.println("!!!!!!!! lost element INDEX is " + lostElementIndex);

        int lostElement = startMoneyArray.get(lostElementIndex);
//        System.out.println("!!!!!!!! lost element VALUE is " + lostElement);

        secondWallet.add(startMoneyArray.get(lostElementIndex));

        System.out.println("# Second wallet array " + secondWallet);

        int secondWalletSum = 0;

        for (int i = 0; i < secondWallet.size(); i++) {
            secondWalletSum += secondWallet.get(i);
        }
        System.out.println("$ Second wallet balance(sum) is : " + secondWalletSum);


        //3
        System.out.println("--------------------------------------------");
        System.out.println("# Checking whether the sum of two arrays matches \n# the sum of the elements of the original array");

        //INSPECTION!
        if (inputMoneySum == firstWalletSum + secondWalletSum){
            System.out.println("    Sum is correct");
        } else System.out.println("    !!!Does not match!!!");

        scanner.close();

    }
}
