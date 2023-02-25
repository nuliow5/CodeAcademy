package org.OOP.ClassAndMethods.StudentList;

import java.util.Random;

public class Student {
    Random random = new Random();
    String studentName;
    int studentID;

    public Student(String studentName) {
        this.studentName = studentName;
        this.studentID = random.nextInt(1000);
    }

    public String studentInfo(){
        String info = "Student name - " + this.studentName + " | student id is = " + this.studentID;
        return info;
    }

    public void printInfo(){
        System.out.println(studentInfo());
    }
    public String getStudentName() {
        return studentName;
    }

    public int getStudentID() {
        return studentID;
    }
}
