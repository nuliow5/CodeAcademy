package org.OOP.ClassAndMethods.Human;

public class Person {

    private static final int SPEED_CONT = 3;
    private String firstName;
    private String secondName;
   private int age;

    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void joking(){
        System.out.println("ha ha ha, you want some joke?");
    }

    public void dailyActivity(){

        if (this.age < 7 && this.age > 0){
            System.out.println("Attends kindergarten");
        } else if (this.age > 7 && this.age <18) {
            System.out.println("going to school");
            joking();
        } else if (this.age >= 18 && this.age < 23 ) {
            System.out.println("Studying");
            joking();
        } else if (this.age >= 23) {
            System.out.println("work");
        }

        System.out.println("How fast you are -> " + walking());
    }

    private int walking(){
        int speed = 1;

        if (this.age > 14 && this.age < 26){
            speed = this.age * SPEED_CONT;
            return speed;
        }

        return speed;

    }




}
