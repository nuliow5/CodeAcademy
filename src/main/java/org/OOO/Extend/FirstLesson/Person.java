package org.OOO.Extend.FirstLesson;

public class Person {
    protected String name;
    protected String lastName;
    protected int personCode;

    public Person(String name, String lastName, int personCode) {
        this.name = name;
        this.lastName = lastName;
        this.personCode = personCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPersonCode() {
        return personCode;
    }

    public void setPersonCode(int personCode) {
        this.personCode = personCode;
    }

    public void print(){
        System.out.println("Hello from Person class");
    }
}
