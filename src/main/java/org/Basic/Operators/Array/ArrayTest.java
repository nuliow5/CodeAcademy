package org.Basic.Operators.Array;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter lenght of Array");
        int arrayLength = scanner.nextInt();

        int[] startMoneyArray = new int[arrayLength];

        System.out.println("Enter moneta value");

        for (int i=0; i< startMoneyArray.length; i++){
            int monetaValue = scanner.nextInt();
            startMoneyArray[i] = monetaValue;
        }

        //ciklo isvedimas testavimui

        System.out.println(Arrays.toString(startMoneyArray));

        //sum all array elementars
        int sum =0;

        for (int i=0; i<startMoneyArray.length; i++){
            sum += startMoneyArray[i];
        }

        System.out.println("sum is = " + sum);

        //preliminarus vienos kisenes pinigu turis turi buti ~ sum / 2

        int preliminaryMonneyWallet = sum / 2;

        //logika -- reikia 2 masyvu: kisene1 ir kisene2
    }
}
