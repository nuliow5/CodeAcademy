package org.OOP.Extend.ExtendSecondTask;

public class Student extends Person{
    private String studentId;

    public Student(Date date, String personName, String studentId) {
        super(date, personName);
        this.studentId = studentId;
    }

    public Student(){

    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String playingVideoGame(){
        return studentId + " " + " joined to server...";
    }

    @Override
    public String toString() {
        return super.toString() + " " + playingVideoGame();

    }
}
