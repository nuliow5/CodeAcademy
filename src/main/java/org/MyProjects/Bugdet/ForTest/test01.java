package org.MyProjects.Bugdet.ForTest;

import org.MyProjects.Bugdet.information.Information;

import java.math.BigDecimal;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class test01 {
    static Scanner scanner = new Scanner(System.in);
    static String doubleFormat = "%.2f";
    public static void main(String[] args) {
//        inputDouble();
//        System.out.println(scanner.nextDouble());
        System.out.println("------------");
        double value = 20000;

        System.out.printf(doubleFormat, value);


//        Islaidos islaidos = new Islaidos(BigDecimal.valueOf(100.00));
//        System.out.println(islaidos.getMoney());
//
//        islaidos.setMoney(BigDecimal.valueOf(10.11));
//        System.out.println(islaidos.getMoney());

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

    public static void inputDouble(){
        try {
            double money = Double.parseDouble(scanner.next());
            System.out.printf(doubleFormat, money);
            double money2 = 2;
            System.out.printf(doubleFormat, (money * money2));

        } catch (NumberFormatException e){
            Information.badInput(String.valueOf(e));
        }

    }




}
