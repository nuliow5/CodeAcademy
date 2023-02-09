package org.Basic.Tasks;

public enum DaysOfTaskFive {
    MONDAY("MONDAY", 1),
    TUESDAY("TUESDAY", 2),
    WEDNESDAY("WEDNESDAY", 3),
    THURSDAY("THURSDAY", 4),
    FRIDAY("FRIDAY", 5),
    SATURDAY("SATURDAY", 6),
    SUNDAY("SUNDAY", 7);

    private String days;
    private int dayIndex;

    DaysOfTaskFive(String days, int dayIndex) {
        this.days = days;
        this.dayIndex = dayIndex;
    }

    public String getDays() {
        return days;
    }

    public int getDayIndex() {
        return dayIndex;
    }
}
