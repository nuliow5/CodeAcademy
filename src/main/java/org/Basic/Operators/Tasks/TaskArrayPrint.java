package org.Basic.Operators.Tasks;

public class TaskArrayPrint {
    public static void main(String[] args) {
        String[] myArray = {"vienas", "du", "trys"};

        for (int i=myArray.length-1; i >= 0; i--){
            System.out.println(myArray[i]);
        }
    }
}
