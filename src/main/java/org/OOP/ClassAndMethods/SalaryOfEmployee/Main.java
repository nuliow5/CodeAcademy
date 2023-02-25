package org.OOP.ClassAndMethods.SalaryOfEmployee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(400, 0);
        employee.getInfo();

        employee.setSalary(500);
        employee.getInfo();

        employee.setWorkTime(8);
        employee.setWorkTime(8);
        employee.setWorkTime(8);
        employee.getInfo();
    }
}
