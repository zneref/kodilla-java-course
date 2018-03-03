package com.kodilla.zneref.hibernate.manytomany.dao;

import com.kodilla.zneref.hibernate.manytomany.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {
    @Query
    List<Employee> retrieveEmployeeWithLastnameEqualTo(@Param("LASTNAME") String lastname);
}
