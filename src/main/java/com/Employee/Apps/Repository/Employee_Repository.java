package com.Employee.Apps.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Employee.Apps.Entity.Employee_Entity;

public interface Employee_Repository extends JpaRepository<Employee_Entity, Long>{

    @Query(
    		value = "SELECT * FROM Employee_table where employee_class like :class_name ",
    		nativeQuery = true
    	    )
    List<Employee_Entity> ShowAll(@Param("class_name") String class_name);

    @Query(
    		value = "SELECT * FROM Employee_table where employee_age >30",
    		nativeQuery = true
    	    )
    List<Employee_Entity> Showclass();


	}

