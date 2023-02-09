package org.Basic.StringLesson;

public class StringMethod {
    public static void main(String[] args) {
        String city = "Kaunas";

        System.out.println(city.substring(1)); //pagal diapazona arba nuo indexo reikmes isveda likusi stringa
        System.out.println(city.charAt(0)); //isveda inteksinio stringo chara
        System.out.println(city.replace('a', 'A')); //pakeicia a i A
        System.out.println(city.indexOf('n')); //isveda char 'n' indexo numeri
        System.out.println(city.equals("kaunas")); //lygina siuo atveju Kaunas ir kaunas
        System.out.println(city.compareTo("kaunas")); //atima Kaunas - kaunas, pagal chart kodo reiksmes
        System.out.println(city.trim()); //pasa
        // lina tarpus String pradzioje ir pabaigoje
        System.out.println(city.toLowerCase());  //konvertuoja i mazasias raides
        System.out.println(city.toUpperCase()); //konvertuoja i dydziasias


    }
}
