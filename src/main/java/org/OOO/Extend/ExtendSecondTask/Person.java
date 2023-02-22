package org.OOO.Extend.ExtendSecondTask;

public class Person {
    Date date = new Date();

    private String personName;

    public Person(Date date, String personName) {
        date.set(1985,8,7);
        this.personName = personName;
        date.print();
    }

    public Person(){


    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Date getDate() {
        return date;
    }
}
