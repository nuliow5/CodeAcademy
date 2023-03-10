package org.MyProjects.Bugdet.ForTest;

import org.MyProjects.Bugdet.information.Information;

import java.time.DateTimeException;
import java.time.LocalDate;

public class test01 {
    public static void main(String[] args) {
        System.out.println(setLocalDate(2023, 20, 15));

        System.out.println("program still working?");
    }

    private static LocalDate setLocalDate(int possibleYear, int possibleMonth, int possibleDay){
        /*
        [0] - year;
        [1] - month;
        [2] - day
         */
        int[] objLocalDate = new int[3];
        try {
            objLocalDate[0] = possibleYear;

            if (possibleMonth > 0 && possibleMonth <=12){
                objLocalDate[1] = possibleMonth;
            } else {
                Information.badInput();
            }

            if (possibleDay > 0 && possibleDay <=31){
                objLocalDate[2] = possibleDay;
            } else {
                Information.badInput();
            }

            return LocalDate.of(objLocalDate[0], objLocalDate[1], objLocalDate[2]);
        } catch (DateTimeException e){
            Information.badInput(String.valueOf(e));
        }

        return null;

    }


}
