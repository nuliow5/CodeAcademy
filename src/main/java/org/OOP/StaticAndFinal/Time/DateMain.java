package org.OOP.StaticAndFinal.Time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateMain {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime);
        System.out.println(localDateTime.minusHours(3));
        System.out.println(localDateTime.plusDays(5));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd HH:mm");

        System.out.println("\n--------FORMATTING--------");
        System.out.println(localDateTime.format(formatter));




    }
}
