package org.OOO.ClassAndMethods.StudentList;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class StudMain {
    public static void main(String[] args) {
        String[] studentListArray = new String[5];
        Student[] studentArray = new Student[5];

        Student firstStudent = new Student("Antanas");
        studentListArray[0] = firstStudent.studentInfo();
        studentArray[0] = firstStudent;

        Student secondStudent = new Student("Arnas");
        studentListArray[1] = secondStudent.studentInfo();
        studentArray[1] = secondStudent;

        Student therdStudent = new Student("Mantas");
        studentListArray[2] = therdStudent.studentInfo();
        studentArray[2] = secondStudent;

        //print from Array
        for (String stud: studentListArray) {
            System.out.println(stud);
        }

        System.out.println("---------------------------");

        secondStudent.printInfo();
        secondStudent.getStudentName();
        secondStudent.getStudentID();

        System.out.println("---------------------------");

        //print Student[] studentArray

        System.out.println(Arrays.deepToString(studentArray));

        for (int i = 0; i<studentArray.length; i++){
            if (studentArray[i] == null){
                break;
            }
            studentArray[i].printInfo();
        }







    }
}
