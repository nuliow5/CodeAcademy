package org.OOO.ClassAndMethods.SalaryOfEmployee;

public class Employee {

    private double salary;
    private  int  workTime;

    public Employee(){

    }
    public Employee(double salary, int workTime) {
        this.salary = salary;
        this.workTime = workTime;
    }

    public void setSalary(double salary) {
        this.salary = salary;
        if (salary < 500){
            this.salary += 10;
        }
    }

    public void setWorkTime(int workTime) {
        this.salary += 5;
        this.workTime += workTime;
    }

    public void getInfo(){
        System.out.println(salary + " " + workTime);
    }


}
