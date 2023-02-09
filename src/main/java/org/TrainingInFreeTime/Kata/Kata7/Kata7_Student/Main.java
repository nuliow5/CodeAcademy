package org.TrainingInFreeTime.Kata.Kata7.Kata7_Student;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int randomArrayLength = random.nextInt(20);
        Student[] studentsArray = new Student[randomArrayLength];

        System.out.println("Count of created students " + randomArrayLength);
        for (int i = 0; i < randomArrayLength; i++) {
            studentsArray[i] = new Student();
        }

       // PRINT with - for i
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] != null){
                System.out.println("Student NR #" + i +" " + studentsArray[i].studentInfo());
            }

        }
        //PRINT with - foreach
        int tempValue = 0;
        for (Student stud: studentsArray) {
            System.out.println("Student NR #" + tempValue +" " + studentsArray[tempValue].studentInfo());
            tempValue++;
        }

        //PRINT with - while
        int tempValueForWhile = 0;
        while (studentsArray.length > tempValueForWhile){
            System.out.println("Student NR #" + tempValueForWhile +" " + studentsArray[tempValueForWhile].studentInfo());
            tempValueForWhile++;
        }

        //PRINT with - DO while
        int tempValueForDo = 0;
        do {
            System.out.println("Student NR #" + tempValueForDo +" " +
                    studentsArray[tempValueForDo].studentInfo());
            tempValueForDo++;

        }while(studentsArray.length > tempValueForDo);



    }
}
