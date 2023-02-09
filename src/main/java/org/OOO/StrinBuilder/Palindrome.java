package org.OOO.StrinBuilder;

public class Palindrome {
    public static void main(String[] args) {
        String inputFromUser = "abcRcba";

        StringBuffer stringBuffer = new StringBuffer(inputFromUser.toLowerCase());

        int halfOfWord = stringBuffer.length()/2;

        int countEquals = 0;
        System.out.println("half word is " + halfOfWord);
        for (int i = 0; i < halfOfWord; i++) {
            if (stringBuffer.charAt(i) == stringBuffer.charAt(stringBuffer.length()-1-i)){
                countEquals++;
            }
        }

        if (countEquals == halfOfWord){
            System.out.println("IS palindrome");
        } else {
            System.out.println("NOT palindrome");
        }
    }
}
