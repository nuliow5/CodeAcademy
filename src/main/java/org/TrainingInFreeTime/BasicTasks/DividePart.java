package org.TrainingInFreeTime.BasicTasks;

public class DividePart {
    public static void main(String[] args) {
        String startingStringValue = "abcdefghijklmnopqrstuvwxy";

        System.out.println(startingStringValue.length()); //25
        int lineLength = 0;

        for (int i = 2; i < 10; i++) {
            if (startingStringValue.length() % i == 0 && startingStringValue.length() != i){
                System.out.println(i);
                lineLength = i;
            }
        }

        for (int i = 0; i < startingStringValue.length(); i+=lineLength) {

            System.out.println(startingStringValue.substring(i, i+lineLength));

        }
    }
}
