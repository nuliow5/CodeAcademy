package org.Basic.Operators;

import java.util.Scanner;

public class OperatorLesson {
    public static void main(String[] args) {

        System.out.println("Menu");
        final String SAUSIS = ("Sausis");
        final String VASARIS = ("Vasaris");
        final String KOVAS = ("Kovas");
        final String BALANDIS = ("Balandis");
        final String GEGUZE = ("Geguze");
        final String BIRZELIS = ("Birzelis");
        final String LIEPA = ("Liepa");
        final String RUGPJUTIS = ("Rugpjutis");
        final String RUGSEJIS = ("Rugsejis");
        final String SPALIS = ("Spalis");
        final String LAPKRITIS = ("Lapkritis");
        final String GRUODIS = ("Gruodis");

        int[] monthNumberArray = new int[12];

        for (int i = 0; i < monthNumberArray.length; i++) {
            monthNumberArray[i] = i;
        }

        String[] monthArray = new String[12];
        monthArray[0] = SAUSIS;
        monthArray[1] = VASARIS;
        monthArray[2] = KOVAS;
        monthArray[3] = BALANDIS;
        monthArray[4] = GEGUZE;
        monthArray[5] = LIEPA;
        monthArray[6] = BIRZELIS;
        monthArray[7] = RUGPJUTIS;
        monthArray[8] = RUGSEJIS;
        monthArray[9] = SPALIS;
        monthArray[10] = LAPKRITIS;
        monthArray[11] = GRUODIS;

        for (int i = 0; i < monthArray.length; i++) {
            System.out.println(i + " " + monthArray[i]);
        }

        System.out.println("---------------------------------");

        System.out.println("Pasirinkite meniu punkta");

        Scanner scanner = new Scanner(System.in);
        int menuValue = scanner.nextInt();


        for (int i = 0; i <= monthArray.length; i++) {
            if (menuValue == i) {
                System.out.println(monthNumberArray[i] + " " + monthArray[i]);
            }
        }

        if (menuValue > monthArray.length) {
            System.out.println("Wrong menu");
        }


    }
}
