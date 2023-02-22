package org.OOO.Extend.ExtendSecondTask;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Date() {

    }
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void set(int year, int month, int day) {
        this.year = year;
        if (month < 13 && month > 0){
            this.month = month;
        }

        if (day > 0 && day < 32){
            this.day = day;
        }

    }

    public void print() {
        System.out.println(getYear() + "-" + getMonth() + "-" + getDay());
    }
}
