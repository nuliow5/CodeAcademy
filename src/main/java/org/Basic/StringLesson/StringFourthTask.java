package org.Basic.StringLesson;

public class StringFourthTask {
    public static void main(String[] args) {
        String stringOne = "abcR";
        String stringTwo = "aBeR";

        System.out.println(stringOne.compareTo(stringTwo));

        for (int i=0; i<stringOne.length(); i++){
            if (stringOne.charAt(i) == stringTwo.charAt(i)){
                System.out.println(i + " nariai vienodi");
            } else System.out.println(i + " nariai skirtingi");
        }

        //2 task
        String firstString = "PHP Exercises and";
        String secondString = "Python Exercises";

        System.out.println(firstString + " " + secondString);
        System.out.println(firstString += " " + secondString);

        //3 task String buffer

        StringBuffer firstStringBufferValue = new StringBuffer("abcd");
        StringBuffer secondStringBufferValue = new StringBuffer("abcd");

        StringBuffer str = new StringBuffer(firstString);


        System.out.println(firstStringBufferValue.equals(secondStringBufferValue));

        //4 task

        String simpleText = "example.com";
        System.out.println("The string length of " + simpleText + " is " + simpleText.length());

        //5 task

        String oneMoreString = " Java Exercises ";
        System.out.println(oneMoreString.trim());

        //6 task

        String tttString = "The Quick BroWn Fox!";

        System.out.println(tttString.toUpperCase());


    }


}
