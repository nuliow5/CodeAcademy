package org.Basic.StringLesson.EnumeFirstTask;

import java.util.Scanner;

public class UnitMain {
    public static void main(String[] args) {
//        int metrasImilimetrus = UnitOfLength.metras.getMatas();
//        int kilometrasImilimetrus = UnitOfLength.kilometras.getMatas();
//        int milimetrasImilimetra = UnitOfLength.milimetras.getMatas();
        Scanner scanner = new Scanner(System.in);
//
        System.out.println("Iveskite mata konvertavimui i milimetrus: ");
        int valueFromScan = scanner.nextInt();
//
//        System.out.println(n + " metrai yra - " + metrasImilimetrus * n + " milimetru");
//        System.out.println(n + " kilometru yra - " + kilometrasImilimetrus * n + " milimetru");
//        System.out.println(n + " milimetrai yra " + milimetrasImilimetra * n + " milimetru");


        int cmToMetras = UnitOfLength.resultMetras(valueFromScan);
        System.out.println(cmToMetras);
    }
}
