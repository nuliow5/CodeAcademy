package org.Basic.Tasks;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Number from 1 to 7 ");
        int inputValue = scanner.nextInt();

        if (inputValue <1 && inputValue> 7){
            System.out.println("Wrong number");
        } else
        if (inputValue == 1 ){
            System.out.println(DaysOfTaskFive.MONDAY.getDays());
        } else if (inputValue == 2 ) {
            System.out.println(DaysOfTaskFive.TUESDAY.getDays());
        }else if (inputValue == 3 ) {
            System.out.println(DaysOfTaskFive.WEDNESDAY.getDays());
        }else if (inputValue == 4 ) {
            System.out.println(DaysOfTaskFive.THURSDAY.getDays());
        }else if (inputValue == 5 ) {
            System.out.println(DaysOfTaskFive.FRIDAY.getDays());
        }else if (inputValue == 6 ) {
            System.out.println(DaysOfTaskFive.SATURDAY.getDays());
        }else if (inputValue == 7 ) {
            System.out.println(DaysOfTaskFive.SUNDAY.getDays());
        }



    }
}
