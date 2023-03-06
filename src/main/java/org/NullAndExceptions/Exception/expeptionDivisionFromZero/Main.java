package org.NullAndExceptions.Exception.expeptionDivisionFromZero;

import org.NullAndExceptions.Exception.myException.ScannerWrongInputException;


public class Main {
    public static void main(String[] args) {


            division(10, 0);





    }
    public static void division(int valueOne, int valueTwo){
       if (valueTwo == 0){
           throw new DivisionFromZero("you cant division from ZERO");
       } else {
           int result = valueOne / valueTwo;
           System.out.println(result);
       }
    }

}
