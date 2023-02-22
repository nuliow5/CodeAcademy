package org.OOO.Extend.ExtendSecondTask;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();

        Student newStudent = new Student(
                (new Date(1999, 05, 03)),
                "Vardas",
                15);

        System.out.println(person.getPersonName());

        System.out.println(student.getAge() + " " +
                student.getPersonName());


//        System.out.println(newStudent.getAge() + " " +
//                newStudent.getPersonName() + " " +
//                );
    }
}
