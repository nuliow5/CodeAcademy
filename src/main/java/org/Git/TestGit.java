package org.Git;

import java.time.LocalDate;

public class TestGit {
    public static void main(String[] args) {
        System.out.println("Hello GIT");
        int year = 2022;
        int month = 02;
        int day = 14;
        LocalDate date = LocalDate.of(year, month, day);

        System.out.println(date);


    }
}
