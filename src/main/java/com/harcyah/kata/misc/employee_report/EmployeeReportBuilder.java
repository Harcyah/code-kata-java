package com.harcyah.kata.misc.employee_report;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class EmployeeReportBuilder {

    private static final List<Employee> employees = List.of(
        new Employee("Max", 17),
        new Employee("Sepp", 18),
        new Employee("Nina", 15),
        new Employee("Mike", 51)
    );

    public List<Employee> getEmployees() {
        return employees.stream()
            .filter(e -> e.getAge() >= 18)
            .sorted(Comparator.comparing(Employee::getName).reversed())
            .map(it -> new Employee(it.getName().toUpperCase(Locale.ROOT), it.getAge()))
            .toList();
    }

}
