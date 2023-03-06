package org.TrainingInFreeTime.Kata.Kata_03_01.Figures.info;

public class ObjInfo {
     private static final String DOUBLE_FORMAT = "%,.2f";

    private static final String OUTPUT_FORMAT = "%50s | %s \n";

    public static String doubleFormat(){
        return DOUBLE_FORMAT;
    }

    public static String printFormat(){
        return OUTPUT_FORMAT;
    }
}
