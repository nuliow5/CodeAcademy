package org.OOP.StrinBuilder;

public class StBuilder {
    public static void main(String[] args) {
        StringBuffer fistSb = new StringBuffer("Liepa");
        StringBuffer secondSb = new StringBuffer(fistSb +"Antradienis");

        print(secondSb);
        print(secondSb.reverse()); //sineidartnAapeiL
        print(secondSb.delete(0,5).delete(4,6).delete(5,7).delete(6,7));  //dartai
        print(secondSb.replace(3,6, "2018")); //dar2018
        print(secondSb.insert(3,"om")); //darom2018

        int x = secondSb.length()+1;
        System.out.println(x); //10

    }

    public static void print(StringBuffer stringBuffer){
        System.out.println(stringBuffer);
    }
}
