package org.OOP.Extend.FirstLesson;

public class Student extends Person{

    protected int socialIdNumber;
    public Student(String name, String lastName, int personCode, int socialIdNumber) {
        super(name, lastName, personCode);

        this.socialIdNumber = socialIdNumber;
    }

    public int getSocialIdNumber() {
        return socialIdNumber;
    }

    public void setSocialIdNumber(int socialIdNumber) {
        this.socialIdNumber = socialIdNumber;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("hello from Student class");
    }

    public void printInfo(){
        System.out.printf(getName(), getLastName(), getPersonCode(), getSocialIdNumber());
    }
}
