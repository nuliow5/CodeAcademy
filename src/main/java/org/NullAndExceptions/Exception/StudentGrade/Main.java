package org.NullAndExceptions.Exception.StudentGrade;

public class Main {
    public static void main(String[] args) {
        Student studentas = null;

        try {
            studentas = new Student("Vardas", 11);

        } catch (InvalidGradeException invalidGradeException) {
            System.out.println(invalidGradeException.getMessage());
        }

        try {
            studentas.print();
        } catch (NullPointerException nullPointerException) {
            System.out.println("Cannot print. Object not created!");
        }

        System.out.println("Finished!");
    }
}
