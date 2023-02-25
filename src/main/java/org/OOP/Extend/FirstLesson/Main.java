package org.OOP.Extend.FirstLesson;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Name", "LastName", 35554);

        Student student = new Student("StudentName", "StudentLastName", 11111, 9999999);

        person.print();

        student.print();

        System.out.println("------------------------");

        Person student2 = new Student("Vardenis", "Pavardenis", 123, 321);
        ((Student) student2).printInfo();
    }
}
