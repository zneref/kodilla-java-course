package com.kodilla.zneref.hibernate.manytomany.dao;


import com.kodilla.zneref.hibernate.manytomany.Company;
import com.kodilla.zneref.hibernate.task.Task;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {
    @Query(nativeQuery = true)
    List<Company> retrieveCompaniesStartsWith(@Param("SUBSTRING") String substring);
}