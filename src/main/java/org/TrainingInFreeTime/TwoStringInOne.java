package org.TrainingInFreeTime;

public class TwoStringInOne {
    public static void main(String[] args) {

        String firstStr = "Welcome";

        String secondStr = "home";

        String newString = "";
        int tempValue; //find from what index we need print longest String


        if (firstStr.length() > secondStr.length()){
            tempValue = firstStr.length() - secondStr.length();
            newString = firstStr.substring(tempValue) + secondStr;

        } else if (firstStr.length() < secondStr.length()) {
            tempValue = secondStr.length() - firstStr.length();
            newString = firstStr + secondStr.substring(tempValue);
        } else {
            newString = firstStr + secondStr;

        }

        System.out.println(newString);


    }
}
