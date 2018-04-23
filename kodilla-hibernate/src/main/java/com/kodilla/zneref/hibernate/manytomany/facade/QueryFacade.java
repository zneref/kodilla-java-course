package com.kodilla.zneref.hibernate.manytomany.facade;

import com.kodilla.zneref.hibernate.manytomany.Company;
import com.kodilla.zneref.hibernate.manytomany.Employee;
import com.kodilla.zneref.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.zneref.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueryFacade {
    private final EmployeeDao employeeDao;
    private final CompanyDao companyDao;

    public QueryFacade(EmployeeDao employeeDao, CompanyDao companyDao) {
        this.employeeDao = employeeDao;
        this.companyDao = companyDao;
    }

    public List<Employee> retrieveEmployeesWithNameLike(String arg) {
        return employeeDao.retrieveEmployeesWithNameLike(arg);
    }

    public List<Company> retrieveCompaniesWithNameLike(String arg) {
        return companyDao.retrieveCompaniesWithNameLike(arg);
    }
}
