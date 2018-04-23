package com.kodilla.zneref.patterns2.adapter.company;

import com.kodilla.zneref.patterns2.adapter.company.newhrsystem.CompanySalaryProcessor;
import com.kodilla.zneref.patterns2.adapter.company.newhrsystem.Employee;
import com.kodilla.zneref.patterns2.adapter.company.newhrsystem.SalaryProcessor;

import java.math.BigDecimal;
import java.util.List;

public class SalaryAdaptee implements SalaryProcessor {
    @Override
    public BigDecimal calculateSalaries(List<Employee> employees) {
        SalaryProcessor theProcessor = new CompanySalaryProcessor();
        return theProcessor.calculateSalaries(employees);
    }
}
