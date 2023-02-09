package org.TrainingInFreeTime.Kata.Kata02_08;

import java.util.Arrays;

public class KataMain {
    public static void main(String[] args) {
        char [] charArr = {
                'J',
                'C',
                'F',
                'E',
                'A',
                'M',
                'D',
                'Z',
                'H',
                'N',
                'Y',
                'G',
                'S',
                'O',
                'P',
                'I',
                'R',
                'K',
                'T',
                'U',
                'B',
                'L',
                'V',
        };

        sortCharArrayBuyFirstLetter(charArr, 'E');

    }

    public static void sortCharArrayBuyFirstLetter(char[] myArray, char charValue){

        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));

        //find letter index
        int unknownIndex = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (charValue == myArray[i]){
                unknownIndex = i;
                break;
            }
        }
        System.out.println("Our unknown letter index is -> " + unknownIndex);


        char[] tempCharArray = new char[unknownIndex];

        for (int i = 0; i < tempCharArray.length ; i++) {
            tempCharArray[i] = myArray[i];
            myArray[i] = 'Z';
        }
        System.out.println(Arrays.toString(tempCharArray));

        System.out.println(Arrays.toString(myArray));

        Arrays.sort(myArray);

        //input last element to first array
        for (int i = 0; i < unknownIndex; i++) {
                myArray[myArray.length-unknownIndex+i] = tempCharArray[i];
        }

        System.out.println(Arrays.toString(myArray));

    }


}
