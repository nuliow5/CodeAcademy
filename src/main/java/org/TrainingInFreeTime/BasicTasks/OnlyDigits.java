package org.TrainingInFreeTime.BasicTasks;

public class OnlyDigits {
    public static void main(String[] args) {
        String startingString = "1235487891278";

        System.out.println(isOnlyDigit(startingString));

    }

    private static boolean isOnlyDigit(String testingString) {

        char[] charArray = testingString.toCharArray();
        boolean isDigit = false;
        int countTrue = 0;

        for (int i = 0; i < charArray.length ; i++) {
            if (Character.isDigit(charArray[i])){
                countTrue++;
            }
        }
        if (countTrue == charArray.length){
            isDigit = true;
        }

        return isDigit;
    }
}
