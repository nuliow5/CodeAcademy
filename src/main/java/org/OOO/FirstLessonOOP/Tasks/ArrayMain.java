package org.OOO.FirstLessonOOP.Tasks;

import java.util.Arrays;

public class ArrayMain {
    public static void main(String[] args) {

        int[][] myArray = {
                {3, 6, 8, 7, 9},
                {9, 4, 6, 2, 6},
                {2, 5, 1, 9, 3},
                {6, 3, 8, 1, 5},
        };

        //sort
        System.out.println("------------SORT----------");
        sortMyArray(myArray);
        System.out.println(Arrays.deepToString(myArray));

        //sum
        System.out.println("------------SUM----------");
        System.out.println(sumArray(myArray));


        System.out.println("------------Average----------");
        double averageValue = (double)sumArray(myArray) / myArray[0].length;
        System.out.println(averageValue);

        System.out.println("masyvo ilgis " + myArray[0].length);

        System.out.println("------------Delete one array element by index----------");
        //delete one element
        int [] secondArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        System.out.println(Arrays.toString(deletingOneArrayElement(secondArray,3))); //15

        //find Max
        System.out.println("------------MAX----------");
        System.out.println(findMin(secondArray));

        //find Min
        System.out.println("------------MIN----------");
        System.out.println(findMax(secondArray));

    }

    private static int findMin(int[] myArray){
        int min = myArray[0];
        for (int i=1; i<myArray.length; i++){
            if (myArray[i] < min){
                min = myArray[i];
            }
        }
        return min;
    }

    private static int findMax(int[] myArray){
        int max = myArray[0];
        for (int i=1; i<myArray.length; i++){
            if (myArray[i] > max){
                max = myArray[i];
            }
        }
        return max;
    }

    private static int[] deletingOneArrayElement(int[] myArray, int elementIndex) {

        for (int i=elementIndex; i< myArray.length; i++){
            for (int j = i+1; j< myArray.length; j++){
                int tempValue = myArray[i];
                myArray[i] = myArray[j];
                myArray[j] = tempValue;
            }
        }
        myArray[myArray.length-1] = myArray[myArray.length-2]; //rename last element

        int[] shorterArray = new int[myArray.length-1];

        for (int i =0; i<shorterArray.length; i++){
            shorterArray[i] = myArray[i];
        }
        return shorterArray;

//        return myArray;
    }

    public static void sortMyArray(int[][] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < myArray[i].length; j++) {
                    for (int k = 0; k < myArray[i].length; k++) {
                        if (myArray[i][j] <= myArray[i][k]) {
                            int tempValue = myArray[i][k];
                            myArray[i][k] = myArray[i][j];
                            myArray[i][j] = tempValue;
                        }
                    }

                }

            }
        }

    }

    public static int sumArray(int[][] myArray){
        int sum = 0;
        //sum first - 0 row
        for (int i=0; i< myArray[0].length; i++){
            sum += myArray[0][i];
//            System.out.println(myArray[0][i]);
        }
        return sum;
    }





}
