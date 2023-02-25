package org.OOP.PersonalCode;

public class PersonalCodeInLithuania {
    public static void main(String[] args) {

        int bornYear = 1985; //20 a

        System.out.println(setPersonalCode(bornYear));
    }

    public static int setPersonalCode(int year){
        int age = Integer.parseInt(String.valueOf(year).substring(0,2) + 1);
        return age;
    }
}
