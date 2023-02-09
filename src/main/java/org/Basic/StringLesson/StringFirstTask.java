package org.Basic.StringLesson;

public class StringFirstTask {
    public static void main(String[] args) {

        //change first letter

        String name = "vadimas";

        String nameUpper = name.substring(0,1).toUpperCase() + name.substring(1);

        System.out.println(name + " to " + nameUpper);

        //du kintamieji, priskirtos reiksmes, sukeisti reikesmes vietom

        int a = 1, b = 2, c;

        System.out.println("pirminis " + a  +" "+ b);

        c = a;
        a = b;
        b = c;

        System.out.println("galutinis " + a + " " +b);


    }
}
