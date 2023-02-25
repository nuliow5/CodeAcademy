package org.OOP.Extend.ExtendSecondTask;

public class Person {
    private Date date;

    private String personName;

    public Person(Date date, String personName) {
        this.date = date;
        this.personName = personName;
    }

    public Person(){
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Person{" +
                "date=" + date.printDate() +
                ", personName='" + personName + '\'' +
                '}';


    }
}
