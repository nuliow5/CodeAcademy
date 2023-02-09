package org.OOO.FirstLessonOOP;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        spausdink("Vadimas", "Gerasimovas", "Java", 2);


        String[] usersArray = {"Mantas", "Antanas", "Petras", "Julius"};

        System.out.println("enter array length");
        int inputInt = scanner.nextInt();
        if (inputInt <= usersArray.length){
            int arrayLength = inputInt;
            userRegistratiton(arrayLength, userName);
        }

    }

    private static String[] userRegistratiton(int arrayLength ,String users) {
        System.out.println("length");
        System.out.println("users");
        String[] usersArray = new String[arrayLength];
        for (int i= 0; i<arrayLength; i++ ){
            usersArray[i] = users;
        }
        return usersArray;
    }

    private static void spausdink(String vardas, String pavarde, String kalba, int savaiciuSkaicius) {
        System.out.println("As " + vardas + " " + pavarde +" , tikrai ismoksiu pragramuoti " + kalba + " kalba per " + savaiciuSkaicius + " savaites");
    }






}
