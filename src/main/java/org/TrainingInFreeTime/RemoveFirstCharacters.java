package org.TrainingInFreeTime;

public class RemoveFirstCharacters {
    public static void main(String[] args) {

        String startingString = "ghcd";

        char[] chartArray = startingString.toCharArray();

        if (chartArray[0] == 'g' && chartArray[1] == 'h') {
            System.out.println(startingString);

        } else if (chartArray[0] == 'g') {
            System.out.println(startingString.substring(0, 1) + startingString.substring(2));

        } else if (chartArray[1] == 'h') {
            System.out.println(startingString.substring(1));

        }else System.out.println(startingString.substring(2));


    }
}
