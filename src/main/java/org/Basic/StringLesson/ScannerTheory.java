package org.Basic.StringLesson;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class ScannerTheory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mokausi programuoti \"Java\"");
//
//        System.out.println("Enter int number");
//        int firstEnterValue = scanner.nextInt();
//        System.out.println("Cia " + firstEnterValue + " - vartotojo ivestas skaicius");
//
//        System.out.println("Enter first number for math method: ");
//        int a = scanner.nextInt();
//
//        System.out.println("Enter first number for math method: ");
//        int b = scanner.nextInt();
//
//        int s = a + b;
//
//        System.out.println("suma = " + s);
//
//        //vidurkis
//        System.out.println("iveskite pirma reiskme dalybos procesui");
//        float firstFloatValue = scanner.nextFloat();
//
//        System.out.println("iveskite antraji reiskme dalybos procesui");
//        float secondFloatValue = scanner.nextFloat();
//
//        float result = (firstFloatValue + secondFloatValue)/2;
//
//        System.out.println("vidurkis yra" + result);
//
//        //Keiciam vietom
//
//        System.out.println("iveskite int a reiksme:");
//        int aValue = scanner.nextInt();
//        System.out.println("iveskite int b reiksme:");
//        int bValue = scanner.nextInt();
//
//        System.out.println("sukeiciame a su b vietomis: ");
//        int c;
//
//        c = aValue;
//        aValue = bValue;
//        bValue = c;
//
//        System.out.println("a: " + aValue);
//        System.out.println("b: " + bValue);

        //7 task
        System.out.println("iveskite keturzenkli skaiciu");
        int keturZenklisSkaicius = scanner.nextInt();

//        dar viemas budas rasti int kintamojo ilgi
//        int testLength = String.valueOf(keturZenklisSkaicius).length();
//        System.out.println("length is " + length);

        String testValue = "" + keturZenklisSkaicius;

        if (testValue.length() == 4){
                for (int i=0; i<testValue.length(); i++){
                    System.out.println(testValue.charAt(i));
                }
        }else System.out.println("Ivestas skaicius nera keturzenklis");



    }
}
