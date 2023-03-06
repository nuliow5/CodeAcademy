package org.NullAndExceptions.Sort.FirstLesson;

import org.NullAndExceptions.Sort.FirstLesson.employee.Employee;
import org.NullAndExceptions.Sort.FirstLesson.employee.EmployeeHelper;
import org.NullAndExceptions.Sort.FirstLesson.print.ConsolePrinter;
import org.NullAndExceptions.Sort.FirstLesson.print.Printer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(10,
                "vadimas",
                5000,
                LocalDate.of(2023, 02, 27)));

        employees.add(new Employee(1,
                "Antanas",
                550,
                LocalDate.of(2023, 02, 27)));

        EmployeeHelper employeeHelper = new EmployeeHelper(employees);

        Printer printer = new ConsolePrinter();
        printer.print(employeeHelper.getEmployees());




    }
}
