package org.Basic.Tasks;

public class Task6For {
    public static void main(String[] args) {

        String[] stringArray = {"one", "two", "three"};

        int intvalue=0;
        for (String arrayElements : stringArray  ){
            System.out.println(intvalue++ + " " + arrayElements);
            stringArray[intvalue] = "Naujas zodis;"; //keiciam masyvo nari
            intvalue++;
        }
    }
}
