package org.TrainingInFreeTime;

public class LoopForString {
    public static void main(String[] args) {
        String startingString = "Java";

        printLoopingString(startingString, 7);
    }
    private static void printLoopingString(String stringValue, int loopCount){
        for (int i = 0; i < loopCount; i++) {
            System.out.print(stringValue);
        }
    }
}
