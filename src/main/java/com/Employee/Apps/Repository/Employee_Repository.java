package com.Employee.Apps.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Employee.Apps.Entity.Employee_Entity;

public interface Employee_Repository extends JpaRepository<Employee_Entity, Long>{

    @Query(value = "SELECT o FROM Employee_Entity o WHERE employee_class LIKE :class_name ")
    List<Employee_Entity> ShowAll(@Param("class_name") String class_name);


    List<String> GetDistinct();

	}

