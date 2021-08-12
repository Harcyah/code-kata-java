package com.harcyah.kata.misc.employee_report;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

// Source: https://codingdojo.org/kata/Employee-Report/
class EmployeeReportBuilderTest {

    private final EmployeeReportBuilder builder = new EmployeeReportBuilder();

    @Test
    public void testGetEmployees() {
        List<Employee> employees = builder.getEmployees();

        assertThat(employees)
            .extracting("name")
            .containsExactly("SEPP", "MIKE");
    }

}
