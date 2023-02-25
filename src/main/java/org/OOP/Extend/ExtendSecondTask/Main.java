package org.OOP.Extend.ExtendSecondTask;

public class Main {
    public static void main(String[] args) {

        Person personUnic = new Person(new Date(1985, 8, 7), "Mario");

        Student newStudent = new Student((new Date(1999, 05, 03)),
                "Destroyer3000", "qwe321");

        System.out.println(personUnic);
        System.out.println(newStudent);


        Person personDefault = new Person();
        personDefault.setDate(new Date(2000, 3, 5));
        personDefault.setPersonName("Homer");
        System.out.println(personDefault);

        Student studentDefault = new Student();
        studentDefault.setDate(new Date(1995, 6, 7));
        studentDefault.setPersonName("Marge");
        studentDefault.setStudentId("asd478521");
        System.out.println(studentDefault);


    }
}
