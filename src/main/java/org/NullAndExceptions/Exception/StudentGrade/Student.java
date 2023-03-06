package org.NullAndExceptions.Exception.StudentGrade;

public class Student {
    String name;
    int grade;

    Student(String name, int grade) throws InvalidGradeException {
        this.name = name;

        if (grade > 10 || grade < 1) {
            throw new InvalidGradeException("Invalid grade!");
        } else {
            this.grade = grade;
        }

    }

    void print() {
        System.out.println(name + " (" + grade + ")");
    }
}
