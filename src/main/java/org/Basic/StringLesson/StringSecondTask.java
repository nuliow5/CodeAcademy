package org.Basic.StringLesson;

public class StringSecondTask {
    public static void main(String[] args) {
        String word = "Namas";
        String wordNamai = word.replace('s', 'i');
        String wordNAMAI = wordNamai.toUpperCase();
        String wordMA = wordNAMAI.substring(2,4);
        String wordMAma = wordMA + wordMA.toLowerCase();
        String wordMAna = wordMA + word.substring(0,2).toLowerCase();
        int a = wordMAna.indexOf('n');

        System.out.println(wordNamai);
        System.out.println(wordNAMAI);
        System.out.println(wordMA);
        System.out.println(wordMAma);
        System.out.println(wordMAna);
        System.out.println(a);


    }
}
