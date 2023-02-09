package org.OOO.FirstLessonOOP.Tasks;

public enum Months {
    January("January", 31),
    February("February", 28),
    March("March", 31),
    April("April", 30),
    May("May", 31),
    June("June", 30),
    July("July", 31),
    August("August",31),
    September("September",30),
    October("October",31),
    November("November",30),
    December("December",31);

    private String months;
    private int days;

    Months(String months, int days) {
        this.months = months;
        this.days = days;
    }

    public String getMonths() {
        return months;
    }

    public int getDays() {
        return days;
    }
}
