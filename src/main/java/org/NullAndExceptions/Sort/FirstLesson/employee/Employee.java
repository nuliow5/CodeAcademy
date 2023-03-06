package org.NullAndExceptions.Sort.FirstLesson.employee;

import java.time.LocalDate;

public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private double salary;
    private LocalDate joiningTime;

    public Employee(int id, String name, double salary, LocalDate joiningTime) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.joiningTime = joiningTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getJoiningTime() {
        return joiningTime;
    }

    public void setJoiningTime(LocalDate joiningTime) {
        this.joiningTime = joiningTime;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", joiningTime=" + joiningTime +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}
