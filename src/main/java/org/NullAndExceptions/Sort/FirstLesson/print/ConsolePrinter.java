package org.NullAndExceptions.Sort.FirstLesson.print;

import org.NullAndExceptions.Sort.FirstLesson.employee.Employee;

import java.util.List;

public class ConsolePrinter implements Printer{
    @Override
    public void print(List<Employee> employees) {
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }
}
