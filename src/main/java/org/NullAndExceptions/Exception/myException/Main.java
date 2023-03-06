package org.NullAndExceptions.Exception.myException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            testScannerInput(scanner);
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }


    }

    public static void testScannerInput(Scanner sc){
        try{
            sc.nextInt();

        } catch (InputMismatchException e){
            throw new ScannerWrongInputException("Error, bad input");
        }
    }



    static class A{
        public void test(){

        }
    }
}
