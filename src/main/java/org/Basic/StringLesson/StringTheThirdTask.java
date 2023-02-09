package org.Basic.StringLesson;

public class StringTheThirdTask {
    public static void main(String[] args) {
        //test with method - codePointAt(int)
        makeUnicode(1);
        makeUnicode(100);

    }

    public static void makeUnicode (int indexNumber){
        String originalString = "As labai myliu Java";

        if (originalString.length() >= indexNumber){
            System.out.println(originalString.codePointAt(indexNumber));
        } else System.out.println("Exception!");
    }
}
