package org.Algotms;

public class BinarySearch {
    public static void main(String[] args) {
        // ! Array mus be sorted !
        int[] numbers = {1, 5, 7, 8, 9, 10, 15, 17};

        System.out.println(binarySearch(numbers, 8));

    }

    public static int binarySearch(int[] myArray, int numberToFind) {
        int low = 0;
        int height = myArray.length - 1;

        while (low <= height) {
            int middlePosition = (low + height) / 2;
            int middleNumber = myArray[middlePosition];
            if (numberToFind == middleNumber){
                return middlePosition;
            }

            if (numberToFind < middleNumber){
                height = middlePosition -1;
            } else {
                low = middlePosition +1;

            }

        }
        return -1;
    }
}
