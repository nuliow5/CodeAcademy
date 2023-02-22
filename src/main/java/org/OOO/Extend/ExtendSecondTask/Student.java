package org.OOO.Extend.ExtendSecondTask;

public class Student extends Person{
    protected int age;
    public Student(Date date, String personName, int age) {
        super(date, personName);
        this.age = age;
    }

    public Student(){
        setPersonName("Jurgis");
        setAge(15);


    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
