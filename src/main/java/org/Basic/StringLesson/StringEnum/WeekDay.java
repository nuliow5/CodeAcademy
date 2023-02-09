package org.Basic.StringLesson.StringEnum;

public enum WeekDay {
    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2);

    private String dayNameValue;
    private int dayNumber;
    WeekDay(String dayName, int dayNumber){
        dayNameValue = dayName;
        this.dayNumber = dayNumber;
    }

    public String getDayNameValue(){
        return dayNameValue;
    }

    public int getDayNumber(){
        return dayNumber;
    }

}
