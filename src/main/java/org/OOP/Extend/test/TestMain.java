package org.OOP.Extend.test;

public class TestMain {
    public static void main(String[] args) {

        Student student = new Student("Vardas",37, 81, 184, 123 );
        student.printInfo();
        System.out.println(student.getWeight());

        Person.thisIsStaticBabe();

        Teacher teacher = new Teacher("vardenis", 40, 79, 185, 654);
        teacher.thisIsStaticBabe();


    }
}
