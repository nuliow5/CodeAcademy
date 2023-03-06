package org.NullAndExceptions.Sort.FirstLesson.employee;

import java.util.List;

public class EmployeeHelper {

    private List<Employee> employees;

    public EmployeeHelper(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees (){
        return employees;
    }

    public void setEmployees(Employee employee) {
        employees.add(employee);
    }
}
