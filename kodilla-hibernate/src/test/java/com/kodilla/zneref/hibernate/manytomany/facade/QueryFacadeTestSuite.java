package com.kodilla.zneref.hibernate.manytomany.facade;

import com.kodilla.zneref.hibernate.manytomany.Company;
import com.kodilla.zneref.hibernate.manytomany.Employee;
import com.kodilla.zneref.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.zneref.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QueryFacadeTestSuite {
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    QueryFacade queryFacade;

    @Test
    public void testRetrieveEmployeesWithNameLike() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);

        //When
        List<Employee> result = queryFacade.retrieveEmployeesWithNameLike("%mith%");

        //Then
        Assert.assertEquals(1, result.size());

        //Cleanup
        employeeDao.deleteAll();
    }

    @Test
    public void testRetrieveCompaniesWithNameLike() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        //When
        List<Company> result = queryFacade.retrieveCompaniesWithNameLike("%ma%");

        //Then
        Assert.assertEquals(3, result.size());

        //Cleanup
        companyDao.deleteAll();
    }
}