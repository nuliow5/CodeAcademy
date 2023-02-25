package org.OOP.FirstLessonOOP.Tasks;


import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter month number 1-12");
            int month = scanner.nextInt();
            System.out.println("Enter years");

            int years = scanner.nextInt();
            String strMonths = "";
            int intDays = -1;


            if (month == 1){
                strMonths = Months.January.getMonths();
                intDays = Months.January.getDays();
            } else if (month == 2) {

                if ((years % 400 ==0) || ((years % 4 == 0) && (years % 100 !=0))){
                    intDays = 29;
                } else intDays = Months.February.getDays();
                strMonths = Months.February.getMonths();
            }else if (month == 3) {
                strMonths = Months.March.getMonths();
                intDays = Months.March.getDays();
            }else if (month == 4) {
                strMonths = Months.April.getMonths();
                intDays = Months.April.getDays();
            }else if (month == 5) {
                strMonths = Months.May.getMonths();
                intDays = Months.May.getDays();
            }else if (month == 6) {
                strMonths = Months.June.getMonths();
                intDays = Months.June.getDays();
            }else if (month == 7) {
                strMonths = Months.July.getMonths();
                intDays = Months.July.getDays();
            }else if (month == 8) {
                strMonths = Months.August.getMonths();
                intDays = Months.August.getDays();
            }else if (month == 9) {
                strMonths = Months.September.getMonths();
                intDays = Months.September.getDays();
            }else if (month == 10) {
                strMonths = Months.October.getMonths();
                intDays = Months.October.getDays();
            }else if (month == 11) {
                strMonths = Months.November.getMonths();
                intDays = Months.November.getDays();
            }else if (month == 12) {
                strMonths = Months.December.getMonths();
                intDays = Months.December.getDays();
            }

            System.out.println(strMonths + " " + years + " has " + intDays);
        }

    }
}
