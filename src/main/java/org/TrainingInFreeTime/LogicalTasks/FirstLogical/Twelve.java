package org.TrainingInFreeTime.LogicalTasks.FirstLogical;

public class Twelve {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        if (myArray.length % 3 == 0){
            for (int i = 0; i < myArray.length-1; i++) {
                for (int j = i; j < 3+i; j++) {

                    if (j == myArray.length){
                        System.out.println(myArray[0]);
                        break;
                    }
                    System.out.print(myArray[j] + "|");

                }
                System.out.println();
            }
        }
    }
}
