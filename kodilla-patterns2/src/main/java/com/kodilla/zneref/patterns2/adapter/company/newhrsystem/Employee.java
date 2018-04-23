package com.kodilla.zneref.patterns2.adapter.company.newhrsystem;

import java.math.BigDecimal;
import java.util.Objects;

public class Employee {
    private final String parseId;
    private final String firstname;
    private final String lastname;
    private final BigDecimal baseSalary;

    public Employee(String parseId, String firstname, String lastname, BigDecimal baseSalary) {
        this.parseId = parseId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.baseSalary = baseSalary;
    }

    public String getParseId() {
        return parseId;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(parseId, employee.parseId) &&
                Objects.equals(firstname, employee.firstname) &&
                Objects.equals(lastname, employee.lastname) &&
                Objects.equals(baseSalary, employee.baseSalary);
    }

    @Override
    public int hashCode() {

        return Objects.hash(parseId, firstname, lastname, baseSalary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "parseId='" + parseId + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
