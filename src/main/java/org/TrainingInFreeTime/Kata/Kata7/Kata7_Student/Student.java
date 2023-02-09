package org.TrainingInFreeTime.Kata.Kata7.Kata7_Student;

import java.util.Random;

public class Student {
    private String name;

    private String studentIdString = "";

    public Student() {
        Random random = new Random();
        int minRange = 5;
        int maxRange = 15;

        int randomArrayLength = random.nextInt(maxRange - minRange) + minRange;
        int[] studentIdArray = new int[randomArrayLength];

        for (int i = 0; i < studentIdArray.length; i++){
            studentIdArray[i] = random.nextInt(10);
            studentIdString += studentIdArray[i];
        }
    }

    public String getStudentIdString() {
        return studentIdString;
    }

    public void printInfo(){
        System.out.println(studentInfo());
    }

    public String studentInfo(){
        String infoAboutStudent = "Name - " + name + ", ID - " + studentIdString;
        return infoAboutStudent;
    }
}
