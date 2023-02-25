package org.OOP.StaticAndFinal.Parodomoji;

import java.time.LocalDate;

public class Student {
    private final int studentId;
    private String name;
    private final LocalDate birthDay;

    public Student(int studentId, String name, LocalDate birthDay) {
        this.studentId = studentId;
        this.name = name;
        this.birthDay = birthDay;
    }
}
